import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Statement st;
	     ResultSet rs;
    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/web";
		String username = "root";
		String password = "7230815Asd";
		Connection c = DriverManager.getConnection(url,username,password);
		st = c.createStatement();
//      rs = st.executeQuery("select * from p_web_access_log");
//      System.out.println(c);
//      while(rs.next()){
//          System.out.println(rs.getString("access_time")
//          + rs.getString("title") + rs.getString("url"));
//      }
      // 插入数据
//      String insert = "insert into stu_stu(name, sex) values('tom','男'), ('mary', '女')" ;
//      int result1 = st.executeUpdate(insert);
//      System.out.println(result1 + "行数据被插入");
      // 修改数据
//      String modify = "update stu_stu set id = 4 where name = 'tom'";
//      int result2 = st.executeUpdate(modify);
//      System.out.println(result2 + "行数据被修改");
      // 删除数据
//      String remove = "delete from stu_stu where name = 'mary'";
//      int result3 = st.executeUpdate(remove);
//      System.out.println(result3 + "行数据被删除");
//      System.out.println(insert);
		c.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch(SQLException e) {
		e.printStackTrace();
	}
	}

}
