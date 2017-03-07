package projectTest01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * ��Ϸ������
 */
public class GameFrame extends Frame {
	Image im=GameUtil.getImages("images/car.png");
	/*
	 * ���ش���
	 */
	
	public void launchFrame(){
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
		
		new PaintThread().start();//�����߳�
		
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
		 * ���������
		 */
		Font f=new Font("����",Font.BOLD,50);
		g.setFont(f);
		g.drawString("���ѽ����С��", 0, 200);
		
		/*
		 * ����
		 */
		Color c=g.getColor();
		g.setColor(Color.red);
		
		/*
		 * ͼ�μ�����
		 */
		g.drawImage(im, (int)x, (int)y, null);
		x+=3;
		
		//g.fillOval(100, 100, 200, 200);����
		g.setColor(c);//�淶������ɫ
	}
	
	/**
	 * ����һ���ػ����ڵ��߳��࣬��һ���ڲ���
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
