package com.imooc;

import java.io.File;
import java.io.IOException;

public class FileUtilTest1 {
public static void main(String[] args) throws IOException {
	FileUtils.listDirectory(new File("F:\\test"));
}
}
