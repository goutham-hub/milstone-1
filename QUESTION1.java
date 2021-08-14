import java.util.*;
public class QUESTION1 {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    int i,a=25;
	    int Array[] = new int[a];
	    System.out.println("Enter 25 elements of array : ");
		for(i=0;i<a;i++){
			Array[i]=sc.nextInt();	
		}
	    int max = Array[0];
	    for (i = 1; i < a; i++){
	        if (Array[i] > max)
	            max = Array[i];
	       }
	    System.out.println(max);
	}
}

