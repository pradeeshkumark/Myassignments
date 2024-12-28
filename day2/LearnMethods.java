package week1.day2;

public class LearnMethods {
	
	//AccessModifier/Returntype/Methodname
	//Methodname-Camelcase
	public void applyBrake()
	{
		System.out.println("Apply Brake");	
	}
	
	public void applyAccelarator()
	{
		System.out.println("Apply Accelarator");	
	}

	public void applyGearchange()
	{
		System.out.println("Apply Gear Change");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("I am a Main method");
LearnMethods obj=new LearnMethods();//create an object
obj.applyBrake();//object calls method
obj.applyAccelarator();
obj.applyGearchange();

	}

}
