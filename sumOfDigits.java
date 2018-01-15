import java.lang.Math; // headers MUST be above the first class

public class sumOfDigits
{
 
  //add all digits
  public static int sum (int num) {
    int result = 0;
    while (num > 0) {
    	
      result += num%10;
      num = num / 10;
      	
    }
    return result;
  }
  
  public static int getSingleDigit(int num) {
     
    while (num > 9) {
    	num = sum(num); 
    }
    
    return num;
  }

  //Main funciton
  public static void main(String[] args)
  {
	
    //Test with 12345
    int num = 12345;
    System.out.println(getSingleDigit(num));

  }
}

