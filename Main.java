   import java.util.*;
    public class Main{
        public static void main(String[] args){
            //Scanner sc=new Scanner(System.in);
             Scanner sc = new Scanner(System.in);
            int flightId = sc.nextInt();
            
            String source = sc.nextLine();
            sc.nextLine();
            String destination =sc.nextLine();
            sc.nextLine();
            int noofseats = sc.nextInt();
            double flightfare = sc.nextDouble();
            
            
            Flight f1 = new Flight(flightId, source, destination,noofseats ,flightfare);
           //  Flight f1 = new Flight(43, "Raipur", "Kolkata", 2, 2354.0);
            FlightManagementSystem fms = new FlightManagementSystem();
            boolean Ans = fms.addFlight(f1);
            if(Ans)
            {
                System.out.println("Flight details added successfully");
            }
            else{
                System.out.println("Addition not done");
            }
            
        }
    }
