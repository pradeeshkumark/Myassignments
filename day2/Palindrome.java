package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int input=123321;//Input
 
 String revinput = new StringBuilder(String.valueOf(input)).reverse().toString();//Reverse number using Stringbuilder
 int output = Integer.parseInt(revinput);// Convert reversed string back to integer
 
 if (input==output)// Check if the original number is equal to the reversed number
 {
	 System.out.println("It is Palindrome :"+output);
 }
 else
 {
	 System.out.println("It is not Palindrome :"+output);
 }

 }
	}
