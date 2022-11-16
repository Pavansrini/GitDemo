package percentage;
import java.util.Scanner;
import java.util.*;

public class stuent {
	public static void main(String[] args) {
		System.out.print(average(100,100,100));
	}

	public static int average(int sub1, int sub2, int sub3) {
		float total, avg;
        total = sub1 + sub2 + sub3;
        avg = (float) (total/3.0);
        System.out.println("percentage is :" + avg);
	
        System.out.println("The student Grade is:" );
        
           if(avg >= 90)
           {
        	return 'A';
           }
           else if (avg >=70 && avg < 90)
           {
            return 'B';
           } 
           else if (avg >= 50 && avg < 70)
           {
           return 'C';
           }
           else
           {
           return 'D';
           }
    }
}
