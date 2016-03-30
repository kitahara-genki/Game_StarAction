package charas;

import static constants.MathConstants.*;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

import star_action.Model;

public abstract class AbstractChara extends JPanel {
	public double xPosition, yPosition; //位置
	double xSpeed, ySpeed; //スピード
	int width, height; //縦横サイズ
	Image image;  //画像
	boolean ground = false;  //設置判定

	AbstractChara(){}

	//x,yはマップ座標
	AbstractChara(int x, int y, int w, int h, String c) {
		xPosition = (x + 0.5) * BLOCK_SIZE;
		yPosition = (y + 0.5) * BLOCK_SIZE;
		xSpeed = 0;
		ySpeed = 0;
		width = w;
		height = h;
		image = getToolkit().createImage(c);
	}

	// 接触判定
	public boolean hit(AbstractChara c) {
		return Math.abs(c.xPosition + c.xSpeed - xPosition) < c.width / 2 + width / 2
				&& Math.abs(c.yPosition + c.ySpeed - yPosition) < c.height / 2 + height / 2;
	}

	// ジャンプ
	void jump() {
		if (ground)
			ySpeed -= 25 + Math.abs(xSpeed) / 5;
	}

	// 呼び出され用
	public void calcAcceleration() {
		calcYAcceleration();
		calcXAcceleration(0.7);
		int hit = isHitBlock();
		if(hit == 1 || hit == 11){
			changeXSpeed();
		}
		else if(hit == 10){
			changeYSpeed();
		}
		move();
	}

	// x方向の速度計算  減速、衝突 aは加速度相当
	public void calcXAcceleration(double a) {
		if (xSpeed > 0)xSpeed -= a;
		if (xSpeed < 0)xSpeed += a;
		//振動防止
		if (Math.abs(xSpeed) < a)xSpeed = 0;


	}

	// y方向の速度計算  空中の挙動
	public void calcYAcceleration() {
		if(!ground) ySpeed += 2;

		//ブロックに接触できていなければgroundをfalseに
	//	boolean g = true;
	//	for (Block b : Model.getBlockList())
	//		if (b.hity(this))
	//			g = false;
	//	if (g)
	//		ground = false;
	}

	public int isHitBlock(){
		int hitx = 0;
		int hity = 0;
		boolean onGround = false;
		for (Block b : Model.getBlockList()){
			if(b.hitx(this)){
				hitx = 1;
			}
			if(b.hity(this)){
				onGround = true;
				hity = 10;
			}
		}
		if(onGround){
			ground = true;
		}
		return hitx + hity;
	}

	// 速度変更
	public abstract void changeXSpeed();
	public abstract void changeYSpeed();

	// 移動処理
	public void move(){
		xPosition += xSpeed;
		yPosition += ySpeed;
	}

	//描画
	public void draw(Graphics g) {
		g.drawImage(image, (int) (xPosition - width / 2), (int) (yPosition - height / 2),
				(int) width, (int) height, this);
	}

}
