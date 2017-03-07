package com.imooc;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Rafdemon {
	public static void main(String[] args)throws IOException {
		File demon=new File("demon");
		if(!demon.exists()){
			demon.mkdir();
			
			}
		File file=new File(demon,"raf.dat");
			if(!file.exists()){
				file.createNewFile();
				
		}
		RandomAccessFile raf=new RandomAccessFile ( file,"rw");	
		//÷∏’ÎµƒŒª÷√
		System.out.println(raf.getFilePointer());
		
		
		
	}

}
