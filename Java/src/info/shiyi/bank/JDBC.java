package info.shiyi.bank;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver ;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException ;
import java.sql.Statement;
import java.util.Properties;

public class JDBC {

 

   public static Properties getProperties() {

 
      Properties props = new Properties();
      InputStream is = null ;

      try {
         is = JDBC . class .getResourceAsStream( "./jdbc_mysql.properties" ); 
         // ���ղ���·����������ļ������ļ�������
         props.load(is); // ���������ж�ȡ���Ա�
 
      } catch (Exception e1) {
         e1.printStackTrace();
         return null ;
         }
      finally {

         if (is != null ) {
            try {
                is.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
         }

      }

      return props;
   }

 
   public static void main(String[] args) {

      Statement stmt = null ;
      ResultSet rs = null ;
      Connection con = null ;

      String sql = "SELECT * FROM  accounts" ; //SQL ��ѯ���

      String id;
      
      String firstName;

      String lastName;
      
      String balance;

      //String accountPassword;
 
      Properties props = getProperties ();

      if (props != null ) {
 
         String driver = props.getProperty( "driver" );

         System. out .println(driver);

         String url = props.getProperty( "url" );

         System. out .println(url);

         String username = props.getProperty( "user" );

         System. out .println(username);
 
         String password = props.getProperty( "password" );

         System. out .println(password);

         try {

            Class.forName (driver); // ע�����ݿ���������

            con = DriverManager.getConnection (url, username, password); // ���������ݿ�� url ����

            stmt = con.createStatement(); // ����һ�� Statement �������� SQL ��䷢�͵����ݿ�

            rs = stmt.executeQuery(sql); // ִ�����ݿ��ѯ������ѯ��������ݱ� rs

            System. out .println( "ID\tFirstName\t LastName\t Balance\t" );

            while (rs.next()) {
            	
            	id = rs.getString(1);
            	
            	firstName = rs.getString(2);

                lastName = rs.getString(3);

                balance = rs.getString(4);

                System. out .println(id + " \t" + firstName + " \t" + lastName 
                		+ " \t" + balance + " \t");
            }

         } catch (Exception e3) {
            e3.printStackTrace();
         }

         finally { // �ͷ�����

            try {
                if (rs != null )
                   rs.close();

                if (stmt != null )

                   stmt.close();

                if (con != null )

                   con.close();

            } catch (Exception e4) {

                e4.printStackTrace();

            }
         }

      }
   }
}