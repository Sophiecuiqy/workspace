package baisc;
import java.sql.*;

public class Demon2 {
	public static void main(String[] args) {
		
	
	try{
        //����Class.forName()����������������
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("�ɹ�����MySQL������");
    }catch(ClassNotFoundException e1){
        System.out.println("�Ҳ���MySQL����!");
        e1.printStackTrace();
    }
    
    String url="jdbc:mysql://localhost:3306/mysql";    //JDBC��URL    
    //����DriverManager�����getConnection()���������һ��Connection����
    Connection conn;
    try {
        conn = DriverManager.getConnection(url,    "root","");
        //����һ��Statement����
        Statement stmt = conn.createStatement(); //����Statement����
        System.out.print("�ɹ����ӵ����ݿ⣡");
        stmt.close();
        conn.close();
    } catch (SQLException e){
        e.printStackTrace();
    }

}
}
