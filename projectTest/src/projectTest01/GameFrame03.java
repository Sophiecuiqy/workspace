package projectTest01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * 游戏窗口类:测试物体移动
 */
public class GameFrame03 extends Frame {
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
	
	private boolean left;
	
	@Override
	public void paint(Graphics g) {
	
		g.drawImage(im, (int)x, (int)y, null);
		if(left){
			x-=3;
		}else{
			x+=3;
		}
		if(x>500-30){
			left=true;
		}
		if(x<0){
			left=false;
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
		GameFrame03 gf=new GameFrame03();
		gf.launchFrame();
		
	}

}
