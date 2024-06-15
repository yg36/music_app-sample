// public class File{
// 	public static void main(String[] args){
// 		int a = 20;
// 		System.out.println(a);
//     }
// }

// public class File{
// 	public static void main(String[] args){
// 		String name = "YOGITA";
// 		System.out.println(name);
//     }
// }

// public class File{
// 	public static void main(String[] args){
// 		float n = 2.3f;
// 		System.out.println(n);
//     }
// }


// // importing string 
// import java.util.Scanner;

// public class File{
// 	public static void main(String[] args){

// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("enter your name ");
// 		String name = sc.next();
// 		//  next is used to get string as input
// 		// Integer i = sc.nextInt();
// 		System.out.println(name);
// 		// scanner is name of class , sc is object created
//     }
// }


// // importing integer
// import java.util.Scanner;

// public class File{
// 	public static void main(String[] args){

// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("enter your roll no ");
// 		//  next is used to get string as input
// 		Integer i = sc.nextInt();
// 		// for float nextfloat is used
// 		// for double nextdouble is used
// 		System.out.println(i);
// 		// scanner is name of class , sc is object created
//     }
// }

// //  creating method
// //  public(access specifier) int (return type) sum(method name) <parameters>

// public class File {
// 	public void display(){
// 		System.out.println("Yogita");
// 	}

// 	public static void main(String[] args){
// 		File m= new File(); 
// 		// object creation
// 		m.display();
// 	}
// }

// public class File {
// 	public void display(String name){
// 		System.out.println("hi I'm "+ name);
// 		System.out.println("its a good day");
// 	}

// 	public static void main(String[] args){
// 		File m= new File(); 
// 		// object creation
// 		m.display("Yogita");
// 		m.display("yogu");
// 	}
// }

import java.util.Scanner;

public class File {

	public static void main(String[] args){
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your age");
		age= sc.nextInt();

		if(age<18){
			System.out.println("not eligible");
		}
		else{
			System.out.println("eligible to vote");
		}
	}
}