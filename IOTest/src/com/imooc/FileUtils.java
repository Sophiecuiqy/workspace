package com.imooc;

import java.io.File;
import java.io.IOException;

//File���һЩ�������� ���� ����
public class FileUtils {
	/*
	 * �г�ָ��Ŀ¼��������Ŀ¼���������ļ�
	 */
	public static void listDirectory(File dir) throws IOException  {
		// �ж��Ƿ��Ƿ����
		if (!dir.exists()) {
			throw new IllegalArgumentException("Ŀ¼��" + dir + "������");
		}
		// �ж��Ƿ�ΪĿ¼
		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "����Ŀ¼");
		}

		// list���������г���ǰĿ¼�µ���Ŀ¼���ļ������ص����ַ������飬��������Ŀ¼�µ��ļ�
		String[] filenames = dir.list();
		for (String string : filenames) {
			System.out.println(dir + "\\" + string);
		}
	}
}  
