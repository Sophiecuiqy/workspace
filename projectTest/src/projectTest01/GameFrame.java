package projectTest01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * 游戏窗口类
 */
public class GameFrame extends Frame {
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
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(100, 100, 200, 200);
		g.drawRect(100, 100, 200, 200);
		g.drawOval(100, 100, 200, 200);
		
		/*
		 * 字体的设置
		 */
		Font f=new Font("宋体",Font.BOLD,50);
		g.setFont(f);
		g.drawString("你好呀我是小崔", 0, 200);
		
		/*
		 * 画笔
		 */
		Color c=g.getColor();
		g.setColor(Color.red);
		
		/*
		 * 图形及动画
		 */
		g.drawImage(im, (int)x, (int)y, null);
		x+=3;
		
		//g.fillOval(100, 100, 200, 200);填满
		g.setColor(c);//规范画笔颜色
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
		GameFrame gf=new GameFrame();
		gf.launchFrame();
		
	}

}
