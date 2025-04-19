package demo;

public class PhoneValidation
{
		public static boolean batteryCapacityValidation(int batteryCapacity)
		{
			if(batteryCapacity>3000)
			{
				return true;
			}
			else {
				return false;
			}
		}
		public static boolean storageValidation(int storage)
		{
			if(storage==64||storage==128||storage==256)
			{
				return true;
			}
			else {
				return false;
			}
		}
		public static boolean priceValidation(int price)
		{
			if(price>=10000 && price<=150000) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		public static boolean androidbrandsValidation(String companyName)
		{
			String[] brandsNames = {"Samsung","Oneplus","Realme","Google pixel"};
			boolean isValid = false;
			for(int i=0;i<=brandsNames.length-1;i++)
			{
				if(companyName.equalsIgnoreCase(brandsNames[i]))
				{
					isValid =true;
					break;
				}
			}
			return isValid;
			
		}
		public static boolean androidVersionModelValidation(String androidVersion) 
		{
			String[] androidversion = {"12","13","14"};
			boolean isValid = false;
			for(int i=0;i<=androidversion.length-1;i++)
			{
				if(androidVersion.equalsIgnoreCase(androidversion[i]))
				{
					isValid =true;
					break;
				}
			}
			return isValid;
			
		}
		public static boolean iosVersionModelValidation(String iosVersion)
		{
			String[] iosversions = {"15","16","17"};
			boolean isValid = false;
			for(int i=0;i<=iosversions.length-1;i++)
			{
				if(iosVersion.equalsIgnoreCase(iosversions[i]))
				{
					isValid =true;
					break;
				}
			}
			return isValid;
			
		}
	public static boolean iosVersionNameValidation(String brand) {
		if(brand.equalsIgnoreCase("apple")) {
			return true;
		}
		else {
			return false;
		}
	}
	}
		/*public static boolean validate(Phone phone){
			if (phone.batteryCapacity < 3000)
				return false;
			if (phone.storage != 64 && phone.storage != 128 && phone.storage != 256) 
				return false; 
			if (phone.price < 10000 || phone.price > 150000) 
				return false; 
			if (phone instanceof AndroidPhone) {
				String[] allowedBrands = {"Samsung", "OnePlus", "Realme", "Google Pixel"}; 
				boolean validBrand = false; 
				for (String b : allowedBrands) { 
			if (phone.brand.equalsIgnoreCase(b)) {
				validBrand = true;
				break; 
			} 
			} 
			if (!validBrand) return false; 
			} 
			else if (phone instanceof IPhone){ 
				if (!phone.brand.equalsIgnoreCase("Apple"))
					return false; 
				} 
			return true;
				} 
		}

}*/
