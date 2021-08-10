import java.util.Scanner;

public class TCS_Coding1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int enter,iwall,ewall;
	        float irate = 18,erate = 12,total=0,temp;
	        enter = sc.nextInt();
	        if(enter == 0){
	            System.out.println("Bye");
	            return;
	        }
	        else {
	        	iwall = sc.nextInt();
	        	ewall = sc.nextInt();
	        }
	        for(int i=0; i<iwall;i++){
	            temp = sc.nextFloat();
	            total = total +(iwall*temp);
	        }
	        for(int i=0; i<ewall;i++){
	            temp = sc.nextFloat();
	            total = total +(ewall*temp);
	        }
	        System.out.printf("Total Cost %.1f",total);
	        sc.close();
	    }
}
