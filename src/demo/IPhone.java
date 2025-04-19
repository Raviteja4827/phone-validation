package demo;

public class IPhone extends Phone{
	   private String iosVersion;

	 public IPhone(String brand, int batteryCapacity, int storage, int price, String iosVersion) {
	     super(brand,batteryCapacity, storage, price);
	     if(PhoneValidation.iosVersionModelValidation(iosVersion)) {
	     this.iosVersion = iosVersion;
	     }
	     else {
	    	 System.err.println("Invalid iosVersion");
	     }
	 }
	 public void displayDetails() {
		 super.displayDetails();
	     System.out.println("iOS Version: " + iosVersion);
	 }

	 }


