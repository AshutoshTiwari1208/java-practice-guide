
class BufferDemo { 

	public static void main(String args[]){

		System.out.println();
		System.out.println("============  Empty Constructor Demo  ==============");
		
		StringBuffer emptyConstructor = new StringBuffer();
		System.out.println("Length is ---> " + emptyConstructor.length());
		System.out.println("Capacity 16 by Default ---> " + emptyConstructor.capacity());
		System.out.println("Value of String is ---> "+ emptyConstructor);

		System.out.println("============  With Length Demo  ==============");
		System.out.println();

		StringBuffer withLengthConstructor =  new StringBuffer(4);
		System.out.println("Length is ---> "+ withLengthConstructor.length());
		System.out.println("Capacity is ( 4 Given )---> "+ withLengthConstructor.capacity());
		System.out.println("Value of String is  ---> " + withLengthConstructor);
		
		System.out.println();
		System.out.println("============  With String Demo  ==============");
		
		StringBuffer withStringConstructor = new StringBuffer("Ashu");
		System.out.println("Length is  ---> "+ withStringConstructor.length());
		System.out.println("Capacity is (16 + length of string passed) ---> " + withStringConstructor.capacity());
		System.out.println("Value of String is ---> "+ withStringConstructor);


	}

}