package projectTest01;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * ��Ϸ�����г��õĹ����ࣨ�����ͼƬ
 * @author lenovo
 *
 */

public class GameUtil {
	public static  Image getImages(String path){
		URL u=GameUtil.class.getClassLoader().getResource(path);
		BufferedImage im=null;
		try {
			im=ImageIO.read(u);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return im;
	}

}
