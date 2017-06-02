import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class javaconnectExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};" + 
                    "Dbq=C:\\Users\\User\\Desktop\\SeleniumData.xlsx;");

            PreparedStatement s = conn.prepareStatement(
                    "SELECT * FROM [Sheet1$] WHERE [RollNo] = 1");
          //  s.setString(1, "Jul-2013");
            s.execute();
            ResultSet rs = s.getResultSet();
            if (rs!=null) {
                while (rs.next()) {
                    System.out.println(rs.getInt("TestNo"));
                }
            }
            s.close();

            conn.close();
            
        } catch( Exception e ) {
            e.printStackTrace();
        }
	}

}
