package charas.enemies;

import static constants.MathConstants.*;
import static constants.SoundCnstants.*;

import java.io.IOException;
import java.util.Random;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import charas.AbstractChara;
import charas.PlayerChara;
import enums.HitPlayer;

/**
 * 敵の抽象的なクラス。すべての敵はこのクラスのサブクラス。敵は基本的にプレイヤーが上から踏むことで倒すことができる。
 *
 * @author kitahara
 *
 */
public abstract class AbstractEnemy extends AbstractChara {

	protected Random r;
	protected double initXSpeed;
	protected double initYSpeed;
	public AbstractEnemy(int x, int y, int w, int h) {
		r = new Random();
		xPosition = (x + 0.5) * BLOCK_SIZE;
		yPosition = (y + 0.5) * BLOCK_SIZE;
		initX = xPosition;
		initY = yPosition;
		xSpeed = (r.nextInt(5) - 2) * 2;
		ySpeed = 0;
		initXSpeed = xSpeed;
		initYSpeed = ySpeed;
		width = w;
		height = h;
		death = false;

	}

	/**
	 *
	 * @param x
	 *            x座標
	 * @param y
	 *            y座標
	 * @param w
	 *            横幅
	 * @param h
	 *            高さ
	 * @param c
	 *            画像
	 */
	public AbstractEnemy(int x, int y, int w, int h, int c) {
		r = new Random();
		xPosition = (x + 0.5) * BLOCK_SIZE;
		yPosition = (y + 0.5) * BLOCK_SIZE;
		initX = xPosition;
		initY = yPosition;
		xSpeed = (r.nextInt(5) - 2) * 2;
		ySpeed = 0;
		initXSpeed = xSpeed;
		initYSpeed = ySpeed;
		width = w;
		height = h;
		image = referenceItems.getEnemyImage(c);
		death = false;
	}
	
	public AbstractEnemy init(int x, int y){
		xPosition = (x + 0.5) * BLOCK_SIZE;
		yPosition = (y + 0.5) * BLOCK_SIZE;
		initX = xPosition;
		initY = yPosition;
		death = false;
		using = true;
		return this;
	}
	
	public AbstractEnemy init(int x, int y, int w, int h){
		xPosition = (x + 0.5) * BLOCK_SIZE;
		yPosition = (y + 0.5) * BLOCK_SIZE;
		initX = xPosition;
		initY = yPosition;
		xSpeed = (r.nextInt(5) - 2) * 2;
		ySpeed = 0;
		initXSpeed = xSpeed;
		initYSpeed = ySpeed;
		width = w;
		height = h;
		death = false;
		using = true;
		return this;
	}
	
	public void init() {
		xPosition = initX;
		yPosition = initY;
		xSpeed = initXSpeed;
		ySpeed = initYSpeed;
		death = false;
	}

	public void calcAcceleration() {

		calcYAcceleration();
		calcXAcceleration();
		isHitBlock();
		checkDeath();
		if (hitLeft || hitRight) {
			changeXSpeed();
		}
		if (hitHead || hitLeg) {
			changeYSpeed();
		}

	}

	// enemyからこのオブジェクトを除去
	public void death() {
		death = true;
		try {
			sound.soundSE(SOUND_SE_TREAD, 0.6);
		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
	}

	/**
	 * PlayerCharaと敵の当たり判定。上から当たったらTread,それ以外の角度から当たったらMiss,
	 * 当たっていなかったらNot
	 *
	 * @param c
	 * @return
	 */
	public HitPlayer isHitPlayerChara(PlayerChara c) {
		if (super.isHit(c)) {
			if (Math.sin((Math.atan2(c.getyPosition() - yPosition, c.getxPosition() - xPosition))) <= Math.sin(-40 * Math.PI/180)) {
				// ここから下を変える
				death();
				return HitPlayer.Tread;
			}
			return HitPlayer.Miss;
		}
		return HitPlayer.Not;
	}

	// 移動定義
	public void calcXAcceleration() {
		// 初期化時の乱数で速度0になったときに加速
		if (xSpeed == 0)
			xSpeed = 1;
	}

	@Override
	public void changeXSpeed() {
		xSpeed *= -1;
	}

	@Override
	public void changeYSpeed() {
		ySpeed = 0;
	}

	public void checkDeath() {
		// TODO 自動生成されたメソッド・スタブ
		if (yPosition > GAME_HEIGHT) {
			death();
		}
	}

}