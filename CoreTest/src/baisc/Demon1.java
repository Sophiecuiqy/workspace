package baisc;

import java.util.Scanner;

public class Demon1 {
	public static void main(String[] args) {
		int i;  
	      long arr[]=new long[36];   //�������ʱ��������ÿ�������ӵĶ���  
	      arr[0]=arr[1]=1;  
	      System.out.println("��1����������1��"+", "+"������"+2);  
	      System.out.println("��2����������1��"+", "+"������"+2);  
	      for(i=3;i<=35;i++){  
	         arr[i]=arr[i-1]+arr[i-2];  
	         System.out.println("��"+i+"����������"+arr[i]+"��"+", "+"������"+2*arr[i]);  
	             //������ ÿ�����ֶ���ǰ����������֮��  
	         
	         
	   }  	
	}

}


//cuo!!!!!!!!!!!!

