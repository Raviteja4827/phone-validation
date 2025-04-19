package demo;

public class Phone
{
   protected String brand; 
   protected int batteryCapacity; 
   protected int storage; 
   protected int price;

	public Phone(String brand, int batteryCapacity, int storage, int price)
	{
	    if(PhoneValidation.androidbrandsValidation(brand)||(PhoneValidation.iosVersionNameValidation(brand))) {
	       this.brand = brand;
	    }
	    else {
	    	System.err.println("Invalid Brands");
	    }
	    if(PhoneValidation.batteryCapacityValidation(batteryCapacity)) {
	    this.batteryCapacity = batteryCapacity;
	    }
	    else {
	    	System.err.println("Invalid BatteryCapacity");
	    }
	    if(PhoneValidation.storageValidation(storage)) {
	    this.storage = storage;
	    }
	    else {
	    	System.err.println("Invalid Storage");
	    }
	    if(PhoneValidation.priceValidation(price)) {
	    this.price = price;
	    }
	    else {
	    	System.err.println("Invalid Price");
	    }
	}
   public void displayDetails()
   {
	   System.out.println("*****Mobile Phones Details*****");
	    System.out.println("Brand: " + brand);
	    System.out.println("Battery: " + batteryCapacity + "mAh");
	    System.out.println("Storage: " + storage + "GB");
	    System.out.println("Price: Rs." + price);
	}

	}


