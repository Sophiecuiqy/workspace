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
 */
public class GameFrame02 extends Frame {
	Image im=GameUtil.getImages("images/car.png");
	/*
	 * 加载窗口
	 */
	
	public void launchFrame(){
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
		
		new PaintThread().start();//启动线程
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
			
		});
		
	}
	
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
	
	/**
	 * 定义一个重画窗口的线程类，是一个内部类
	 * @author lenovo
	 *
	 */
	class PaintThread extends Thread{
		public void run(){
			while(true){
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


	public static void main(String[] args) {
		GameFrame02 gf=new GameFrame02();
		gf.launchFrame();
		
	}


	

}
