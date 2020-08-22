import java.util.*;

class Rect{

	private int length, breadth;

	public void setParams(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}

	public long getArea(){
		return this.length*this.breadth;
	}

	public int getLength(){
		return this.length;
	}

	public int getBreadth(){
		return this.breadth;
	}

}

class Demo {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);

		while(true){
			
			System.out.println("================================");
			System.out.println("Enter 1 to have a new Rectangle");
			System.out.println("Enter 2 exit the Application");
			System.out.println("================================");

			short response = cin.nextShort();
			switch(response){
				case 1: 
					Rect rec1 = new Rect();
					int length, breadth;
					System.out.println("Enter Length of Rectangle : ");
					length = cin.nextInt();

					System.out.println("Enter Breadth of Rectangle : ");
					breadth = cin.nextInt();

					rec1.setParams(length, breadth);
					System.out.println("Rectangle with length "+rec1.getLength()+" and breadth "+ rec1.getBreadth()+ " created successfully");

					System.out.print("Area of Rectangle is : ");
					System.out.println(rec1.getArea());
					break;
				case 2:
					return ;
			}
		}
	}
}