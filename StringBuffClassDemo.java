class Rect {

	private int length;
	private int capacity;
	private char value[];

	public Rect() {
		this.value = new char[16];
		this.length = 0;
	}

	public Rect(int capacity) {
		this.value = new char[capacity];
		this.capacity = capacity;
		this.length  = 0;
	}

	public Rect(String str){
		this.value = new char[16 + str.length()];
		char temp[] = str.toCharArray();

		for(int i=0;i<str.length();i++){
			this.value[i] = temp[i];
		}
		this.capacity  = str.length() + 16;
		this.length = str.length();
	} 

	public int length() {
		return this.length;
	}

	public int capacity() {
		return this.capacity;
	}

	public String value() {
		return String.valueOf(this.value);
	}
}


public class StringBuffClassDemo {

	public static void main(String str[]) {

		System.out.println();
		System.out.println("============  Empty Constructor Demo  ==============");
		
		Rect emptyConstructor = new Rect();
		System.out.println("Length is ---> " + emptyConstructor.length());
		System.out.println("Capacity 16 by Default ---> " + emptyConstructor.capacity());
		System.out.println("Value of String is ---> "+ emptyConstructor.value());

		System.out.println("============  With Length Demo  ==============");
		System.out.println();

		Rect withLengthConstructor =  new Rect(4);
		System.out.println("Length is ---> "+ withLengthConstructor.length());
		System.out.println("Capacity is ( 4 Given )---> "+ withLengthConstructor.capacity());
		System.out.println("Value of String is  ---> " + withLengthConstructor.value());
		
		System.out.println();
		System.out.println("============  With String Demo  ==============");
		
		Rect withStringConstructor = new Rect("Ashu");
		System.out.println("Length is  ---> "+ withStringConstructor.length());
		System.out.println("Capacity is (16 + length of string passed) ---> " + withStringConstructor.capacity());
		System.out.println("Value of String is ---> "+ withStringConstructor.value());

	}
}