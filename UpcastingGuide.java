import java.util.*;

class Car{

	void start(){
		System.out.println("==> Manual Starting ....");
	}

	void experience(){
		System.out.println("# I can't drive this Car !");
	}
}

class Skoda extends Car {

	void start(){
		System.out.println("==> Starting Automatic ....");
	}

	void experience(){
		System.out.println("+++ Rick Look - 3 Star");
	}
}

class Benz extends Car {
	void start() {
		System.out.println("==> Starting using Finger Print");
	}

	void experience(){
		System.out.println("++++ Great Security Features - 4 Star");
	}
}

class Swift extends Car{
	void experience(){
		System.out.println("+ Good Mileage - 1 Star");
	}
}


class Car24 {
	public Car getACar(){

		System.out.println("Enter Car of Your Choice :");
		System.out.println("Type 1 for Skoda ...");
		System.out.println("Type 2 for Benz ...");
		System.out.println("Type 3 for Swift ...");

		Scanner cin = new Scanner(System.in);
		int choice = cin.nextInt();

		switch(choice){
			case 1:
				return new Skoda();
			case 2:
				return new Benz();
			case 3: 
				return new Swift();
			default:
				return null;
		}

	}

	public void showRoom(Person per){
		System.out.println("Welcome to Car24");
		Car obj = this.getACar();
		per.getSelfDrive(obj);
	}
}




class Person {
	String name;

	Person(String name){
		this.name = name;
	}

	void getSelfDrive(Car obj){
		if(obj == null){
			System.out.println("Oops! No Car was delivered");
			return;
		}
		obj.experience();
	}
}



class UpcastingGuide{

	public static void main(String args[]){

		Person p = new Person("Dhoni");
		Car24 c = new Car24();
		c.showRoom(p);
	}
}