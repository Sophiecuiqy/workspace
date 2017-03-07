package repertory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.ArrayList;

public class FileTest {
	//File file=new File();
	File file=new File("e:/workspace"+"/"+"addFile.txt");
	
	/*
	 * �����ļ�
	 
	public void createFile(String path,String filename) throws IOException{
        if(!file.exists())
            file.createNewFile();
    }
	//file.createNewFile();
	*/
	
	/*
	 * ���ļ�
	 */
	
	 public String BufferedReaderDemo(String path) throws IOException{
         //File file=new File(path);
         if(!file.exists()||file.isDirectory())
             throw new FileNotFoundException();
         BufferedReader br=new BufferedReader(new FileReader(file));
         String temp=null;
         StringBuffer sb=new StringBuffer();
         temp=br.readLine();
         while(temp!=null){
             sb.append(temp+" ");
             temp=br.readLine();
         }
         return sb.toString();
     }
	 /*
	  *д�ļ�
	  
	 public void StringBufferDemo() throws IOException{
         //File file=new File("/root/sms.log");
         if(!file.exists())
             file.createNewFile();
         FileOutputStream out=new FileOutputStream(file,true);        
         for(int i=0;i<10000;i++){
             StringBuffer sb=new StringBuffer();
             sb.append("���ǵ�"+i+"��:ǰ����ܵĸ��ַ�����������,Ϊʲô������ֵ����� ");
             out.write(sb.toString().getBytes("utf-8"));
         }        
         out.close();
     }
     */
	 public void StringBufferDemo() throws IOException{
		 try {

	   String content = "This is the content to write into file";

	   //File file = new File("/users/mkyong/filename.txt");

	   // if file doesnt exists, then create it
	   if (!file.exists()) {
	    file.createNewFile();
	   }

	   FileWriter fw = new FileWriter(file.getAbsoluteFile());
	   BufferedWriter bw = new BufferedWriter(fw);
	  bw.write(content);
	   
	   bw.close();

	   System.out.println("Done");

	  } catch (IOException e) {
	   e.printStackTrace();
	  }
	 }


}

