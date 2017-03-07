package com.imooc;

import java.io.File;
import java.io.IOException;

//File类的一些常见操作 过滤 遍历
public class FileUtils {
	/*
	 * 列出指定目录（包括子目录）的所有文件
	 */
	public static void listDirectory(File dir) throws IOException  {
		// 判断是否是否存在
		if (!dir.exists()) {
			throw new IllegalArgumentException("目录：" + dir + "不存在");
		}
		// 判断是否为目录
		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "不是目录");
		}

		// list方法用于列出当前目录下的子目录和文件，返回的是字符串数组，不包含子目录下的文件
		String[] filenames = dir.list();
		for (String string : filenames) {
			System.out.println(dir + "\\" + string);
		}
	}
}  
