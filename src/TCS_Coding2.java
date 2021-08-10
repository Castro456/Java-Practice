import java.util.Scanner;

public class TCS_Coding2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	       int total_monkey,bananas_eaten,peanut_eaten,total_banana,total_peanut,remaining_monkey;
	       int temp1=0;
	       total_monkey=sc.nextInt();
	       bananas_eaten=sc.nextInt();
	       peanut_eaten=sc.nextInt();
	       total_banana=sc.nextInt();
	       total_peanut=sc.nextInt();
	       if(bananas_eaten ==0 || peanut_eaten == 0)
	       {
	           System.out.println("Bye");
	           return;
	       }
	       else{
	       temp1 = temp1 + ((total_banana*10/ bananas_eaten*10)/100);  //Online IDE wont accept direct division
	      temp1 = temp1 + ((total_peanut*10/ peanut_eaten*10)/100);
	    //   System.out.println("Temp:"+temp1); 
	       remaining_monkey = total_monkey -temp1;
	       System.out.println("Total:"+remaining_monkey); 
	       }
	     
	    }
}
