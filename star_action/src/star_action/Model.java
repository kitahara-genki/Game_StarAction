package star_action;

import static constants.MathConstants.*;

import java.awt.Graphics;
import java.util.ArrayList;

import charas.AbstractChara;
import charas.Block;
import charas.Enemy;
import charas.GoalBlock;
import charas.Needle;
import charas.PlayerChara;
import slide.StageChangeSlide;
import stages.Stage;
import util.DebugShowText;

public class Model {
	public static ArrayList<Block> blockList = new ArrayList<Block>();
	public static ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
	public static ArrayList<Needle> needleList = new ArrayList<Needle>();
	public static int gameStatus = GAMESTATUS_STAGECHANGE;
	public static GoalBlock goalBlock = null;
	
	public static int stageNum = 1;
	public static Stage stage = new Stage(stageNum, blockList, enemyList, needleList);
	public static PlayerChara playerChara = new PlayerChara(40, 50);
	public static DebugShowText debugShowText = new DebugShowText();
	
	public static StageChangeSlide stageChangeSlide = new StageChangeSlide();
	
	public static ArrayList<Block> getBlockList() {return blockList;}
	public static ArrayList<Enemy> getEnemyList() {return enemyList;}
	public static ArrayList<Needle> getNeedleList() {return needleList;}
	public static int getGameStatus() {	return gameStatus;}	
	public static int getStageNum() {	return stageNum;}
	public static PlayerChara getPlayerChara() {	return playerChara;}
	public static StageChangeSlide getStageChangeSlide() {	return stageChangeSlide;}
	public static GoalBlock getGoalBlock() {return goalBlock;}

	public static void setStageNum(int i){
		stageNum = i;
	}
	
	/**
	 *  プレイヤーがやられた時のゲーム全体の処理
	 */
	public static void death(){
		setGameStatus(GAMESTATUS_DIE);
		playerChara.death();
	}

	public static void setGameStatus(int i){
		gameStatus = i;
	}
	
	/**
	 * プレイヤーの情報とステージの情報を初期化
	 */
	public static void init(){
		playerChara.init();
		for (Block b : blockList){
			b.init();
		}
		for (AbstractChara e : enemyList) {
			e.init();
		}
		for (Needle n : needleList){
			n.init();
		}
		goalBlock.init();
		setGameStatus(GAMESTATUS_PLAYING);
	}
	
	/**
	 * プレイヤーのx座標が一定以上になったときに右へ移動した場合に画面をスクロール
	 */
	private static void scroll(){
		if(stage.isScrollable()){//s.num=4(ボス戦)ではスクロールできない
			double xSpeed =  playerChara.getxSpeed();
			double xPosition = playerChara.getxPosition();
			if (xPosition + xSpeed + playerChara.getWidth() / 2 > GAME_WIDTH - 400) {
				playerChara.xPosition -= xSpeed;
				for (Block b : blockList){
					b.xPosition -= xSpeed;
				}
					
				for (Enemy e : enemyList) {
					if(!e.isDeath()){
						e.xPosition -= xSpeed;
					}
				//	if (e instanceof NPCshoot)
				//		for (Shot s : NPCshoot.bullet)
				//			s.xpos -= xSpeed;
				}
				for (Needle n : needleList){
					n.xPosition -= xSpeed;
				}
				goalBlock.xPosition -= xSpeed;
			}
		}
	}
	
	
	/**
	 * 1フレームごとのゲーム全体の処理
	 */
	public static void run(){
		if(!playerChara.isDeath()){
			playerChara.calcAcceleration();
		}
		
		for (Enemy e : enemyList) {
			if(!e.isDeath()){
				e.calcAcceleration();
				e.move();
			}
		}
		if(!playerChara.isDeath()){
			playerChara.move();
		}
		scroll();
		
		debugShowText.run(playerChara.xPosition, playerChara.yPosition);
	}
	
	public static void draw(Graphics g){
	}
	public static void nextStage() {
		// TODO 自動生成されたメソッド・スタブ	
		setStageNum(stageNum+1);
		stageChangeSlide.setText(stageNum);
		setGameStatus(GAMESTATUS_STAGECHANGE);
	}

}
