package projectTest01;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * 游戏开发中常用的工具类（如加载图片
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
