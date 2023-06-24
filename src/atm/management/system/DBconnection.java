package atm.management.system;

/*To connect with an database server we've to follow 5 steps:
        i. Register the driver
        ii.Create connection
        iii.Create statement
        iv.Execute Query
        v.Close connection
*/
import java.sql.*;


public class DBconnection {
    //To connect with an external entity we have to create a global object of "Connection" class
    Connection conn;
    //For statement we need to create a global object of "Statement" class
    Statement stat;

    public DBconnection(){
        //As MySQL is an external entity it can produce run time error so we have to deal with that using exception handelling
        try{
            //step1:Register the driver(no need to register)
            //Class.forName(com.mysql.cj.jdbc.Driver);
            //step2:Create connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmmanagementsystem","root","MySQL@2002");
            //step3:Create statement
            stat = conn.createStatement();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
