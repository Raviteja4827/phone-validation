package demo;

public class AndroidPhone extends Phone
{
	 private String androidVersion;

	public AndroidPhone(String brand, int batteryCapacity, int storage, int price, String androidVersion)
	{
	    super(brand, batteryCapacity, storage, price);
	    if(PhoneValidation.androidVersionModelValidation(androidVersion)) 
	    {
	    this.androidVersion = androidVersion;
	    }
	    else    
	    {
	    	System.err.println("Invalid AndroidVersion");
	    }
	}
	public void displayDetails()
	{
		super.displayDetails();
	    System.out.println("Android Version: " + androidVersion);
	}

	}


