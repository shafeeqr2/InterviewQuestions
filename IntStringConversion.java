import java.lang.Math; // headers MUST be above the first class
import java.lang.StringBuilder;

/*
Write a function to convert a stirng to integer. (int atoi (String input))
write a function to convert an interger to string. (String itoa (int input))


*/
public class IntStringConversion
{
 
 
  public static String itoa(int input) {
  	
    int size = 0;
    int cloneInput = input;
    while (cloneInput > 0) {
     
      size++;
      cloneInput /= 10;
      
    }
    
    char[] arr = new char[size];
		
    for (int i = 0; i < size; i++) {
      
      
          arr[size - 1 - i] = (char) (input%10 + '0');

          input = input/10;
      
      
    }
        
 

    
	String result = new String(arr);
    
    
    return result;
    
  }
  
  public static int atoi(String input) {
   
  	char[] array = input.toCharArray();
   
    int result = 0;
    

    for (int i = 0; i < input.length(); i++) {
      
      	
    	result += (array[i] - 48)  * Math.pow(10,(input.length() - 1 - i));

    }
    
    return result;
    
    
  }
 
  public static void main(String[] args)
  {


    String str = "12345";
    System.out.println(atoi(str));
    
    
   int num = 1245;
    System.out.println(itoa(num));


  }
  
  
}

