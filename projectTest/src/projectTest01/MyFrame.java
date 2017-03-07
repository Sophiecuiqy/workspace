package projectTest01;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import projectTest01.GameFrame.PaintThread;

public class MyFrame extends Frame{
	
	//public static final int GAME_WIDTH=500;
	//public static final int GAME_HEIGHT=500;  //也可以新建constant类，专放常量，然后访问constant.xx就行

	public void launchFrame(){
		setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
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


	private void addWindowListener(WindowAdapter windowAdapter) {
		// TODO Auto-generated method stub
		
	}

	
}
