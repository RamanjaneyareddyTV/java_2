package ENDOFDAY;
import java.util.*;
 public class count_factor_number {
     public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.print("Input an integer: ");
      int x = in.nextInt(); 

		System.out.println(result(x));
	 } 		
	public static int result(int num) {	
		int ctr = 0;
        for(int i=1; i<=(int)Math.sqrt(num); i++) {
            if(num%i==0 && i*i!=num) {
                ctr+=2;
            } else if (i*i==num) {
                ctr++;
            }
        }
        return ctr;
	}
 }

