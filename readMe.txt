#Description: 
This project here is to depict the working of packages in Java.
We can keep our source java files and compiled byte-codes in organised fashion.
The same thing can be achieved easily by "Eclipse" or other IDE's- this is handled internally in them.


#Working:
--code-source folder:
	==> Contains .java Files

--code-final folder:
	===> Contains packages after compiling source

1. To Compile Java Files Again
	==> (Except Test.java) Goto File Location in source and type "javac -d path:\code-final FILENAME.java"
	==> When compiling Test.java ==> "javac -d path:\code-final -classpath path:\code-final Test.java"
	
2. To Run Code
	===> Type "java -cp path:\source-final\ test.Test"


#Note:
1. Both code-source and code-final are assumed to be kept in same directory.


	