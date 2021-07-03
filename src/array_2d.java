
public class array_2d {
	public static void main(String[] args) {
		
		String[][] phones = new String[2][3];  //consider this as rows and columns
		phones[0][0] = "oneplus";
		phones[0][1] = "samsung";
		phones[0][2] = "redmi";
		phones[1][0] = "hauwai";
		phones[1][1] = "apple";  //phones[1][2] is not there so it takes as null
		
		System.out.println(phones[0].length);
		for(int i=0; i<phones.length;i++) {        //phone.length will be 3, so as for phone[0].length
			System.out.println();                        //mentions phones[]
			for(int j=0;j<phones[i].length;j++) {
				System.out.print(phones[i][j]+"  ");   //mentions phones[][]
			}
		}
		
	}
}
