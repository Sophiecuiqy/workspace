package com.imooc;

import java.io.File;
import java.io.IOException;

public class Demon1 {
	public static void main(String[] args) throws IOException {
		File f1=new File("F:\\test");
		System.out.println(f1.exists());
		File f2=new File("F:\\test\\»’º«.txt");
		f2.createNewFile();
		System.out.println(f1);
		
	}
	
	
	

}
