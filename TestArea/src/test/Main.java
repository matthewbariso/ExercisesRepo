package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	// public static void main(String[] args) {

	// List <Object> list = new ArrayList<Object>();
	//
	// list.add("Asd");
	// list.add(5);
	// list.add(true);
	//
	//
	// System.out.println(list.get(0));
	// System.out.println(list.get(1));
	// System.out.println(list.get(2));
	//
	// }

	// --------------------------------------------------//
	// HAPPY NA
	/*
	 * static int value = 10; public static void main(String[] args) {
	 * System.out.println("main before p1: "+ value); value = p1(value);
	 * System.out.println("Main before p2: "+ value); value = p2(value);
	 * System.out.println("Main at the end:" + value); System.out.println("----");
	 * int value = 30; System.out.println("main before p1: "+ value); value =
	 * p1(value); System.out.println("Main before p2: "+ value); value = p2(value);
	 * System.out.println("Main at the end: "+ value); } static int p1(int input) {
	 * value = input * value; System.out.println("In p1: "+ value); return value; }
	 * static int p2(int input) { int value=5; value = input/value;
	 * System.out.println("In p2: "+ value); return value; }
	 */
	// -----------------------------------------------------//
	// 10. HAPPY na ulit 2 down

	// public static void main(String[] args) {
	// int value = 5;
	// int value2 = 1;
	// while(value2<4) {
	// for(;value>=value2; value--) {
	// System.out.println("*");
	// }
	// value2++;
	// }
	// }

	// //close enuf
	// public static void main(String[] args) {
	// double count;
	// int limit;
	// count = 9.0;
	// limit = 43/4;
	// for(; count<=limit; count = count + 0.5) {
	// System.out.println("in for:"+count);
	// }
	// System.out.println("after for: "+ count);
	// }

	// ------------------------------------------------------------//
	// 6. mali ang data type. huhu.
	//
	// public static void main(String[] args) {
	// for (double i = 1; i <= 4; i++) {
	// for (double j = 1; j <= 4; j++) {
	// System.out.print((i/4+j/4) + " ");
	// }
	// System.out.print("\n");
	// }
	// }
	// 1. naisu!
	// public static void main(String[] args) {
	// int i = 1;
	// for (int j = 0; j < 5; j=j+2) {
	// i = (i*i)+j;
	// }
	// switch (i) {
	// case 3:
	// System.out.println("zero");
	// break;
	// case 13:
	// System.out.println("one");
	// case 175:
	// System.out.println("two");
	// default:
	// System.out.println("default");
	// }
	// }

	//
	// public static void main(String[] args) {
	// int n;
	// int F_0=1,F_1=1;
	// int F_n=0;
	// System.out.println ("Enter the number");
	//// n=Keyboard.readInt ();
	// n = 5;
	// for (int i=1; i<n; i++)
	// {
	// F_n=F_0+F_1;
	// F_0=F_1;
	// F_1=F_n;
	// }
	// System.out.println (F_n);
	// }

	// public static void main(String[] args) {
	// int inner=2, outer=2;
	// int result=0;
	//
	// for (int i=0; i<outer; i++)
	// {
	// for (int j=0; j<inner; j++)
	// {
	// result = (result*result)+1;
	// }
	// }
	// System.out.println(result);
	// }

	// public static void main(String[] args) {
	// int x = 3;
	// int y = 10;
	// while (x < y)
	// {System.out.println ("Hello");
	// x = x + 1;
	// y = y - 1;
	// }
	// }
	//
	//
	// 7.
	// public static void main(String[] args) {
	// compute_value(60);
	// }
	// public static int compute_value(int integer_value) {
	// // Declare Local Variables
	// boolean done = false;
	// int count = 1;
	// int current = integer_value + 2;
	// while (! done) {
	// current = current / count;
	// if (current % 3 == 0)
	// done = true;
	// else if (current < 1)
	// done = true;
	// else
	// count += 1;
	// System.out.println(current);
	// }
	// System.out.println (count);
	// return count;
	// } // method compute_value
	//
	//
	//

	// public static void main(String[] args) {
	// Scanner scan = new Scanner (System.in);
	// int n = scan.nextInt();
	//
	// System.out.println(n);
	// }

	// public static void main(String[] args)
	// {
	// boolean a = true;
	// boolean b = false;
	// boolean c = false;
	// System.out.println (a + ", " + b + ", " + c);
	// do
	// {
	//
	// if (b == c)
	// b = a;
	// else if (a == c)
	// b = c;
	// else
	// a = c;
	// System.out.println(a + ", " + b + ", " + c);
	// }
	// while ( a || b || c);
	// }

	// public static void main(String[] args) {
	// int one = 1;
	// int two = 2;
	// int three = 3;
	// String output = "";
	// do {
	// one++;
	// output+="cart";
	// } while (one < 3);
	// for (int i = 0; i < two; i++) {
	// output+="o";
	// }
	// while (true) {
	// three++;
	// if (three == 5) {
	// break;
	// }
	// output+="n";
	//
	// }
	// System.out.println(output);
	// }

//	public static void main(String[] args) {
//		runner run1 = new runner();
//		runner run2 = new runner();
//
//		run1.start();
//		
//		run2.start();
//
//	}
	
	
//	public static void main(String[] args) {
//		Pattern p = Pattern.compile("\\d");
//		Matcher mat1 = p.matcher("9652018244");
//		
//		while(mat1.find()) {
//			System.out.println("\t\t" + mat1.group());
//		}
//		mat1.reset();
//		System.out.println("After resseting: ");
//		while(mat1.find()) {
//			System.out.println("\t\t" + mat1.group());
//		}
//	}

}

class runner extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Hello " + i);

			try {
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		
		}

	}

}
