package projectTest01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * 游戏窗口类:测试物体任意角度移动
 * 继承了自己的父类MyFrame
 */
public class CopyOfGameFrame02 extends MyFrame {
	Image im=GameUtil.getImages("images/car.png");
	
	private double x=100,y=100;
	
	//private boolean left;
	private double degree=3.14/3;//[0,2pi]
	private double speed=10;
	@Override
	public void paint(Graphics g) {
	
		g.drawImage(im, (int)x, (int)y, null);
		if(speed>0){
			speed-=0.05;
		}else{
			speed=0;
		}                //控制速度
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		
		if(y>500-30||y<30){
			degree=-degree;
			
		}
		
		if(x<0||x>500-30){
			degree=Math.PI-degree;
		}
		
	}
	
	
	public static void main(String[] args) {
		CopyOfGameFrame02 gf=new CopyOfGameFrame02();
		gf.launchFrame();
		
	}


}
