package smartCity.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CityDetails")
public class CityDetailsObj 
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Sno ;
	private String cityname = "NA";
	private String category = "NA";
	private String PorS     = "NA";
	private String PorS_Address = "NA";
	private String TravelType = "NA";
	private String AvailableVehicle = "NA";
	private String VehicleArrivingTime = "NA";
	private String Distance_KM = "NA";
	private String ShopContact = "NA";
	private String CodesOfCatogery = "NA";

	
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPorS() {
		return PorS;
	}
	public void setPorS(String porS) {
		PorS = porS;
	}
	public String getPorS_Address() {
		return PorS_Address;
	}
	public void setPorS_Address(String porS_Address) {
		PorS_Address = porS_Address;
	}
	public String getTravelType() {
		return TravelType;
	}
	public void setTravelType(String travelType) {
		TravelType = travelType;
	}
	public String getAvailableVehicle() {
		return AvailableVehicle;
	}
	public void setAvailableVehicle(String availableVehicle) {
		AvailableVehicle = availableVehicle;
	}
	public String getVehicleArrivingTime() {
		return VehicleArrivingTime;
	}
	public void setVehicleArrivingTime(String vehicleArrivingTime) {
		VehicleArrivingTime = vehicleArrivingTime;
	}
	public String getDistance_KM() {
		return Distance_KM;
	}
	public void setDistance_KM(String distance_KM) {
		Distance_KM = distance_KM;
	}
	public String getShopContact() {
		return ShopContact;
	}
	public void setShopContact(String shopContact) {
		ShopContact = shopContact;
	}
	public String getCodesOfCatogery() {
		return CodesOfCatogery;
	}
	public void setCodesOfCatogery(String codesOfCatogery) {
		CodesOfCatogery = codesOfCatogery;
	}

}
