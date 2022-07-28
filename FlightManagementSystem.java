    import java.util.*;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import java.sql.*;
    
    public class FlightManagementSystem
    {
        public  boolean addFlight(Flight flightObj)
        {
            try{
            DB db=new DB();
            Connection con = db.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO flight  VALUES(?,?,?,?,?);");
            pst.setInt(1,flightObj.getFlightId());
            pst.setString(2,flightObj.getSource());
            pst.setString(3,flightObj.getDestination());
            pst.setInt(4,flightObj.getNoOfSeats());
            pst.setDouble(5,flightObj.getFlightFare());
            
            int i = pst.executeUpdate();
            if(i>0)
                return true;
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            return false;
        }
        
    }
