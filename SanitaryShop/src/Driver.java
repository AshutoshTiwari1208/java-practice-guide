import java.util.*;


public class Driver {
	
	public static void main(String args[]) {
		
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Please Enter Length of Pipe : ");
		double length = cin.nextDouble();
		
		System.out.println("Please Enter Diameter of Pipe : ");
		int diameter = cin.nextInt();
		
		Pipe mypipe = new Pipe(length, diameter);
		
		System.out.println("No of Piece Required : ");
		int noOfPieces = cin.nextInt();
		
		Pipe arr[] = SanitoryShop.createPcs(mypipe, noOfPieces);
		
		int index=0;
		for(Pipe i : arr) {
			index++;
			System.out.println("Length of Piece "+index+" : "+ i.getLength() + " Length of Diameter : "+ i.getDiameter());
		}
	}

}
