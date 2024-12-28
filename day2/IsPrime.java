package week1.day2;

public class IsPrime {//class created

	public static void main(String[] args) {//main method created
		// TODO Auto-generated method stub
		
		int number=5;// value is declared
		for(int i=2;i<number;i++)//For loop
		{
            if(number%i==0)//If loop condition 
            {
            System.out.println("Not a Prime number");
            break;
            }
            else//else
            {
                System.out.println("Prime number");
                break;
                }
	}

}
}