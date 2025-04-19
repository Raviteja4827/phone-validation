package demo;

public class PhoneMainClass {

	public static void main(String[] args) {
		AndroidPhone a1=new AndroidPhone("Oneplus",4000,128,50000,"13");
		AndroidPhone a2=new AndroidPhone("Realme",5000,256,70000,"14");
		a1.displayDetails();
		System.out.println("");
		a2.displayDetails();
		System.out.println("");
		IPhone i1=new IPhone("apple",6000,128,100000,"15");
		IPhone i2=new IPhone("apple",10000,64,50000,"16");
		i1.displayDetails();
		System.out.println("");
		i2.displayDetails();
	}

}
