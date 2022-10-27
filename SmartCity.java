package smartCity.Resource;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import smartCity.Objects.CityDetailsObj;

public class SmartCity 
{

	public static void main(String[] args) throws Exception
	{
		
	    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
  		Session session = sessionFactory.openSession();
  		Transaction txn = session.beginTransaction();
  		
		 Scanner Scan = new Scanner(System.in); 
		 System.out.println("Are you Add Data to Smart_City, Give (A) OR"
		 		+ " You Visit Smart_City, Give (I) ");
		 String Check=Scan.nextLine();
		 
		 if(Check.toUpperCase().equals("A"))
		 {
			 CityDetailsObj obj= new CityDetailsObj();
			 String Name       ="";
			 String CityName   ="";
			 String Address    ="";
			 String Traveltype ="";
			 String AvailableVehicle =""; 
			 String VehicleArrivingTime ="";
			 String Distance ="";
			 String Contact ="";

			 System.out.println("What You ADD? Like Shop(S) or Places(P), Enter S or P :");
			 String SorP=Scan.nextLine();
			 
			 if(SorP.toUpperCase().equals("P"))
			 {
				 System.out.println("Enter The City Name:");
				 CityName=Scan.nextLine();
				 System.out.println("Enter Your place and Address:");
				 Address=Scan.nextLine();
				 System.out.println("Enter Your Contact_No:");
				 Contact=Scan.nextLine();
				 System.out.println("Enter What Kind of Transport Services in Your place ,Like(BUS,TRAIN,METRO):");
				 Traveltype = Scan.nextLine();
				 System.out.println("Enter Tranport Details or Vehicle_No:");
				 AvailableVehicle=Scan.nextLine();
				 System.out.println("Enter Transport Timing Shedule:");
				 VehicleArrivingTime=Scan.nextLine();
				 System.out.println("Enter Average kilometer of Your Place Distance(km):");
				 Distance=Scan.nextLine();
				 
				 
				 obj.setCityname(CityName);
				 obj.setCategory("Tourist Palce");
				 obj.setPorS(SorP);
				 obj.setPorS_Address(Address);
				 obj.setAvailableVehicle(AvailableVehicle);
				 obj.setShopContact(Contact);
				 obj.setDistance_KM(Distance);
				 obj.setTravelType(Traveltype);
				 obj.setVehicleArrivingTime(VehicleArrivingTime);
				 obj.setCodesOfCatogery("TP1");
				 
				 session.save(obj);
			 }else if(SorP.toUpperCase().equals("S"))
			 {
				 System.out.println("There are All Shops_Name and Code:");
				 System.out.println("MOBILE   : Code-M01");
				 System.out.println("HOSPITAL : Code-H01");
				 System.out.println("MALL     : Code-M11");
				 System.out.println("ATM      : Code-A01");
				 System.out.println("Enter The Following Above ShopName Or Code");
				 Name=Scan.nextLine();
				 
				 System.out.println("Enter The City Name:");
				 CityName=Scan.nextLine();
				 System.out.println("Enter the Place Address:");
				 Address=Scan.nextLine();
				 System.out.println("Enter Your Contact_No:");
				 Contact=Scan.nextLine();
				 System.out.println("Enter What Kind of Transport Services in Your place ,Like(BUS,TRAIN,METRO):");
				 Traveltype = Scan.nextLine();
				 System.out.println("Enter Tranport Details or Vehicle_No:");
				 AvailableVehicle=Scan.nextLine();
				 System.out.println("Enter Transport Teming Shedule:");
				 VehicleArrivingTime=Scan.nextLine();
				 System.out.println("Enter Average kilometer of Your Place Distance(km):");
				 Distance=Scan.nextLine();
				 
				 obj.setCityname(CityName);
				 obj.setCategory(Name);
				 obj.setPorS(SorP);
				 obj.setPorS_Address(Address);
				 obj.setAvailableVehicle(AvailableVehicle);
				 obj.setShopContact(Contact);
				 obj.setDistance_KM(Distance);
				 obj.setTravelType(Traveltype);
				 obj.setVehicleArrivingTime(VehicleArrivingTime);
				 obj.setCodesOfCatogery(SmartCity.Shopcode(Name));
				 
				 session.save(obj);
				 
			 }else
			 {
				 System.out.println("This Is Invalied DATA");
				 
			 }
			 
		 }else if(Check.toUpperCase().equals("I"))
		 {
			 
			 System.out.println("Shop(S) or Places(P), Enter S or P :");
			 String SorP=Scan.nextLine();
			 if(SorP.toUpperCase().equals("P"))
			 {
				 String PlaceQry="from CityDetailsObj where PorS='"+SorP+"'";
				 List<CityDetailsObj> Shoplist=session.createQuery(PlaceQry).list();
				 
				 System.out.println("Sno|City_Name|Address|Travel_Type|Vehicles|Arriving_Time|Contact|Distance");
				 int sno=0;
				 for(CityDetailsObj obj:Shoplist)
		  		 {
					 sno++;
		  			 System.out.println( sno+"|"+obj.getCityname()+"|"+obj.getPorS_Address()+"|"+obj.getTravelType()+"|"+
		  					obj.getAvailableVehicle()+"|"+obj.getVehicleArrivingTime()+"|"+obj.getShopContact()+"|"+obj.getDistance_KM());
		  		 }
				 
			 }else if(SorP.toUpperCase().equals("S"))
			 {
				 System.out.println("There All Are Available Shops:");
				 System.out.println("MOBILE   : Code-M01");
				 System.out.println("HOSPITAL : Code-H01");
				 System.out.println("MALL     : Code-M11");
				 System.out.println("ATM      : Code-A01");
				 
				 System.out.println("You Want ALL Shops   : Code-A00");
				 System.out.println("Please Give Any One Code: ");
				 String TypeOfShop =Scan.nextLine();
 
				 if(TypeOfShop.toUpperCase().equals("M01") || TypeOfShop.toUpperCase().equals("H01")
						|| TypeOfShop.toUpperCase().equals("M11") ||TypeOfShop.toUpperCase().equals("A01"))
				 {
					  String PlaceQry="from CityDetailsObj where PorS='"+SorP+"' and CodesOfCatogery='"+SorP+"'";
						 List<CityDetailsObj> Shoplist=session.createQuery(PlaceQry).list();
						 
						 System.out.println("Sno|City_Name|Address|Travel_Type|Vehicles|Arriving_Time|Contact|Distance");
						 int sno=0;
						 for(CityDetailsObj obj:Shoplist)
				  		 {
							 sno++;
				  			 System.out.println( sno+"|"+obj.getCityname()+"|"+obj.getPorS_Address()+"|"+obj.getTravelType()+"|"+
				  					obj.getAvailableVehicle()+"|"+obj.getVehicleArrivingTime()+"|"+obj.getShopContact()+"|"+obj.getDistance_KM());
				  		 }
						
				 }else if(TypeOfShop.toUpperCase().equals("A00"))
				 {
					  String PlaceQry="from CityDetailsObj where PorS='"+SorP+"'";
						 List<CityDetailsObj> Shoplist=session.createQuery(PlaceQry).list();
						 
						 System.out.println("Sno|City_Name|Address|Travel_Type|Vehicles|Arriving_Time|Contact|Distance");
						 int sno=0;
						 for(CityDetailsObj obj:Shoplist)
				  		 {
							 sno++;
				  			 System.out.println( sno+"|"+obj.getCityname()+"|"+obj.getPorS_Address()+"|"+obj.getTravelType()+"|"+
				  					obj.getAvailableVehicle()+"|"+obj.getVehicleArrivingTime()+"|"+obj.getShopContact()+"|"+obj.getDistance_KM());
				  		 }
				 } else
				 {
					 System.out.println("This Is Invalied Input");
				 }
  
			 }else
			 {
				 System.out.println("This Is Invalied Input");
			 }
		 }else
		 {
			 System.out.println("This Is Invalied Input");
		 }

 
  		txn.commit();
  		session.flush();
  		session.close();
  		sessionFactory.close();
  		
  		System.out.println("****THANK YOU TO VISIT SMART_CITY****");

	
	}
	
	public static String Shopcode(String Shop)
	{
		String Code;
		if(Shop.toUpperCase().contains("MEDICAL"))
		{
			Code="M01";
		}else if(Shop.toUpperCase().contains("MALL"))
		{
			Code="M11";
		}else if(Shop.toUpperCase().contains("ATM"))
		{
			Code="A01";
		}else if(Shop.toUpperCase().contains("HOSPITAL"))
		{
			Code="H01";
		}else
		{
			Code="NA";
		}
		return Code;
	}
	
}
