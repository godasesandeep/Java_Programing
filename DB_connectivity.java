import java.sql.*; //JDBC functions import
class DB_connectivity
{
    public static void main(String arg[]) throws Exception
    {
        //try
        //{
            
        //Class.forName("com.mysql.jdbc.Driver");
        //Driver driver = new oracle.jdbc.OracleDriver();
        //DriverManager.registerDriver(driver);
        
        //String url="jdbc:mysql://localhost:3306/ppa50";
        Connection cobj =DriverManager.getConnection("jdbc:mysql://localhost:3306/ppa50","root",""); //JDBC Func
        Statement sobj =cobj.createStatement();
        ResultSet robj =sobj.executeQuery("select * from student");
        while(robj.next())
        {
        System.out.println("Rno : "+robj.getInt("Rno"));
        System.out.println("Name : "+robj.getString("Name"));
        System.out.println("City : "+robj.getString("City"));
        }
       // }
    //catch(Exception obj)
    //    {
    //        System.out.println("Hi");
    //    }
        
    }
}