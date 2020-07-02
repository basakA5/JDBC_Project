package Utility;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class basicsOfLoop {

	public static void main(String[] args) {

/*
	 	boolean f = false;
	 	do {
	 		if (!f) {
	 			f = true;
	 			System.out.print("1");
	 			System.out.print(" " + "Sen kimsin? " + " ");
	 		}
	 	}while (!f);
	 	System.out.println("2");
	 	
	 	*/
//================================================================ 
		/*
		int k = 0;
		for (int i=10; i>0; i-- ) {
			while (i>3) i-=3;
			k+=1;
		}
		System.out.println(k);  */
//================================================================
		/*
		int count =0;
		do {
			do {
				count++;  //1
			}while (count <2);
				break;
		}while (true);
		System.out.println(count);   */
//===================================================================
	/*	for (int outer=1; outer <=12; outer++) {
			System.out.println("============");
			for (int inner=1; inner<=12; inner++) {
				
				System.out.println(outer + "x" + inner + "=" + (outer*inner));
			}
			System.out.println("============");   
			}  */
//==========================================================================
	/*
	char [] grades = new char [5];
	 grades [0] = 'A';
	 grades [1] = 'B';
	 grades [2] = 'C';
	 grades [3] = 'D';
	 grades [4] = 'E';
	 
	 char mygrade = grades [0];
	 System.out.println(mygrade); */
	
//=================================================================================
	 /*
		String [] cars = new String [] {"audi", "fiat", "toyota", "porche", "hundai", "mercedes"};
	 
	 //System.out.println(cars.length);
	 
	// int m = 0;
	// System.out.println(cars[m]);
	 //m++;
	 //System.out.println(cars[m]);   
	 
	 // print all values using a for loop
	 
	 for ( int i=0; i<=5; i++) {
		 System.out.println(cars[i]); }    */
//==================================================================================
	/*	 
		 String [] kitchenItems = {"KNIFE", "wooDenspoon", "fork"};
		  
		 // for loop ile bunlari yazdiralim
		 
		 for (int i=0; i <kitchenItems.length; i++) {
			 System.out.println(kitchenItems[i]);
		 }
		 System.out.println("================================="); 
			 
		 //find the size of the array
		 System.out.println(kitchenItems.length);
		 
		 System.out.println("================================="); 
			 
		 // for each loop ile yazdir		 
		 for (String utensils : kitchenItems ) {
			 System.out.println(utensils);
		 }
		System.out.println("================================="); 
		 // simdi for each loop icinde switch statement ile yazdiralim 
		 for (String utensils : kitchenItems ) {
			 System.out.println(utensils);
			 
			 //FOR STRING MANIPULATION THE OTHER WAY IS >>>>
			 //utensils = utensils.toLowerCase();
			 
			 // normalde ()'in icinde sadece utensils kelimesi vardi, String manipulation icin .toLowerCase() ekledik
			 // birde gereksiz bosluklar varsa chaning yapalim .trim() ekleyelim
			 
			switch (utensils.toLowerCase().trim()) {
			case "knife":
				System.out.println("Knife is used to cut the veggies");
				break;
			case "woodenspoon":
				System.out.println("to dring soup, or stir");
				break;
			case "fork":
				System.out.println("to eat salad");
				break;	
			}
			
		 }																						*/
//====================Creating array and printing items with for Each loop============
		/* 
	 // create int array assign 10 difffrent numbers, between 1-100. 
		
		int [] points = {10,20,30,40,50,60,70,80,90,99};
		
		//check if the array has 10 items
		
	if (points.length == 10) {
		System.out.println("it has 10 points");
	}else {
		System.out.println("error");
	}
	System.out.println("---------------------");
	
	//using for loop print each item
	
	for (int i=0; i<points.length; i++ ) {
		System.out.print(" " + points[i]);
	}
	System.out.println("\n---------------------");

	// using for each loop print the values
	for (int numbers: points) {
		System.out.print(" "+ numbers);
	}
	System.out.println("\n---------------------");

	//using for each loop print each item in reverse order, in the same line, seperated by space
	//for each loop ile reverse yapamayiz.
	for (int p: points) {
		System.out.print(" "+ p);
	}
	
	System.out.println("\n------Reverse For loop--------");
	
	// we can reverse with for loop
	for (int i=points.length-1; i>=0; i-- ) {
		System.out.print(" " + points[i]);
	}
	System.out.println("\n----- Reverse While Loop-------");

	//using while loop, print each item in reverse order, in the same line, seperated by space 
	
	int idx =points.length-1;
	while (idx >= 0) {
		System.out.print(points[idx] + " ");  // sout ile idx--; nin yerlerini degistirince exception veroyor 
		idx--;
		
	//	sout icine [idx--] yazilip alttaki kullanilmasa da olur
	}										*/
//===============================Search for a Specific Number=================================
	
		/*
		 create an array and assign 10 different numbers 
		 search for number 100, by using for loop,once found print the index location and "100 found"
		 if it is not fount print " not found"
		 once you found exit the loop 
		 */
	 
/*	int [] numbers = {100, 200,300,400,500,600,700,80,90,70};

	// 1. yol
	int lookFor = 100;
	
	for (int i = 0; i< numbers.length; i++) {
		if (numbers [i] == lookFor) {
			System.out.println(lookFor + " is found");
			break; // mesajin loop yapmasini onlemek icin kullanilir 
			
		}else {
			System.out.println("not found");
			break; // mesajin loop yapmasini onlemek icin kullanilir 
		}
	}
	
	// 2. yol
	
	int wanted = 300;
	boolean found = false;
	
	for (int idx = 0; idx<numbers.length; idx++) {
		if (numbers [idx] == wanted) {
			found = true;
			System.out.println( wanted +" is found at index " + idx);
			break;
		}
	}
	 if (!found) {
		 System.out.println("not found");
	 }  */
//=============================Find more than $20===============================================
/* 
 create a double array 
 assign it 10 prices
 using a loop count how many items are more than $20
 print the count, if there is no price print "No items more than $20"		
 */
	 /*
	 double [] prices = {20, 30, 40, 55.99, 64.99, 14.99, 8, 9.99, 19.99, 49.99};
	 
	 int count=0;
	 
	 for (double p : prices) {
		 if (p > 20) {
			 count++;
			  }
		  }
	 System.out.println(count + " items are more than 20.0");    */
//=============================Find largest Array===================================================
	
		//  ORNEK 1
		//ask user to enter how many items in array 
		//then create an array in that capacity
	/*	
		Scanner input = new Scanner (System.in);
		System.out.println("How many items in Array?");
		
		int count = input.nextInt();
		
		// create an array with that capacity
		 int [] nums = new int[count];
		
		
		// using loop enter numbers one by one 
		for (int i = 0; i<count; i++) {
			System.out.println("entee the numbers!");
			
			nums[i]= input.nextInt();
		}
		for (int n:nums) {
			System.out.print(n + " ");
		}   */
		
		//ORNEK 2
		
	/*	Scanner input = new Scanner (System.in);
		System.out.println("How many items in array?");
		
		int count = input.nextInt();
		int [] nums = new int [count];
		
		for (int it=0; it<count; it++) {
			System.out.println("enter a number" + (it+1));
			nums[it]= input.nextInt();
		}
		for (int n : nums) {
			System.out.print(n + " ");
		}    */
		
		//ORNEK 3 aciklamali
	/*	
		Scanner input2 =new Scanner (System.in);
		System.out.println("Please say how many items you have!");
		
		int count = input2.nextInt(); // I assign the total number to count
		
		int [] nums = new int [count];  // I create an array in count capacity
		
		for (int i=0; i<count; i++) {   // I ask and assign each item one by one 
			System.out.println("Enter a number");
			
			nums [i] = input2.nextInt(); // what user say I assigned to each index
		}
		
		for (int n : nums) {            // I will peint it in one line with for each loop
			System.out.print( n + " ");
		}
	 //                   NOW FIND THE LARGEST ONE
	 // Assume that first item is the largest one. LOOP through the rest and 
		//check if they are greater than the value of the largest one 
		//if true >> assign that value to the largest
		
		int largest = nums [0];  // Assume that first item is the largest one
		for (int b : nums ) {	 // For Each loop is the best to check
			if ( b > largest ) {  // if the new one greater than the largest one 
				largest = b;       // assiggn the largest one to that one
			}
		}
		System.out.println("\n The largest number is  " + largest);   */
		
//====================== Find the Smallest Value ===========================		
	/*	
		int [] nums = {7,8,9,2};
		
		int smallest = nums[0];
		
		for ( int n : nums) {    // n is the temporary item to which I assign the values one by one
			if (n < smallest) {
				smallest = n;
			}
		}  System.out.println("\n The smallest number is " + smallest);   */
		
//======================== Sum of Array items ==============================
	/*	
		int [] nums = { 23, 555,22,45};
		
		int sum = 0;  // evertime start with a default one
		
		for ( int n : nums) {
			sum = sum + n;   // this can be like that >>> sum+=n
		}
		System.out.println("Sum is " + sum);    */

//======== Sum of odd and Even numbers =========
/*		
		int [] nums = { 23, 555,22,45};
		
		int sumOfEven = 0;
		int sumOfOdd = 0;
		
		for (int n : nums) {
			if (sumOfEven %2 == 0) {
				sumOfEven += n;
			}else {
				sumOfOdd += n;
			}
		}
		System.out.println("Sum of even numbers is " + sumOfEven);
		System.out.println("Sum of odd numbers is " + sumOfOdd);   */
		
//=================== Random numbers =========================================
	
	/*	Scanner input = new Scanner (System.in);
		Random random = new Random();
		
		System.out.println("Enter a number");
		int count = input.nextInt();
		
		int [] nums = new int[count];
		
		int sumEven = 0;
		int odd = 0;
		
		for ( int i=0; i<count; i++) {
			nums [i] = random.nextInt();
		}
		for (int n : nums) {
			if (sumEven % 2== 0) {
				sumEven +=n;
			}else {
				odd +=n;
			}
			}
		System.out.println("Sum of even numbers " + sumEven);
		System.out.println("Sum of odd numbers " + odd);            */  
//==========================================================================	 
	 /*
		String str = "adfgh";

			String reverse="";

			for(int i=str.length()-1; i >= 0; i--)

			reverse += str.toCharArray()[i];

			System.out.println(reverse);      */
		
//==========================   REVERSE    ==================================================
		
		// Reverse "ABCD" ===>   "DCBA"
		/*	
			String word= "ABCD";
			String reverse1 = "";
			
			for (int i=word.length()-1; i>=0; i--) {
				reverse1 += word.toCharArray()[i];
			
			}
			System.out.println(reverse1);
			
			String a = "apple";
			
			
			char [] arr = a.toCharArray();
			System.out.println(arr);         */
		
		
//==========================find the unique letters===================================================
	
		/*
		String str = "aabbcde";
		String [] arr = str.split("");
		String unique = "";
		
		for (int j=0; j<arr.length; j++) {
			
			int num=0;
			for (int i=0; i<arr.length; i++) {
				if (arr[j].equals(arr[i])) 
					num++;
			}
			if (num ==1)
				unique += arr[j];
		}
		
		System.out.println(unique);	*/
		
//================================Remove Dublicates===============================================	
		/*
		String str = "AABBCCDD";
		String remDub = "";
		
		for (int i=0; i<str.length(); i++) {
			
			if(!remDub.contains("" +str.charAt(i))) {
				
				remDub += "" + str.charAt(i);
				
			}
		}
		System.out.println(remDub);              */

//=========================check if a String build out of the same as another String==============
	/*	
		String a = "basak";
		String b = "kasab";
		
		char [] arr1 = a.toCharArray();
		char [] arr2 = b.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String s1 = "";
		String s2 = "";
		
		for (char each : arr1) 
			 s1 += each;
		
		for (char each : arr2)
			s2 += each;
		
		
		if (s1.equals(s2)) {
			//System.out.println(s1 + " and " + s2 + " both are equal");
		}
		
		
		System.out.println(""+ s1.charAt(0));			*/
		
//======================================== Frequency of char =========================================		
	/*	
		String str = "AABBCCCCCHHE";
		String nonDub ="";
		
		for (int i=0; i<str.length(); i++) 
			
			if (!nonDub.contains("" + str.charAt(i))) {
				nonDub += "" + str.charAt(i);
			}
			 String result = "";
			 
			 for (int j=0; j<nonDub.length(); j++) {
				 
				 int count =0;
				 for (int i=0; i<str.length(); i++) 
					 if (str.charAt(i)==nonDub.charAt(j)) {
						 count++;
					 }
					 result +=nonDub.charAt(j) + "" + count;
				 
			 }
		
		System.out.println(result);								*/
	
//============================= find Min number from int Array ======================================
		/*
		int [] arr = {9,80,777,98};
		
		int min = Integer.MAX_VALUE;
		 for (int each : arr) {
			 if (each < min) {
				 min = each;
			 }
		 }
		System.out.println(min);   */
		
		
//================================ Sort the array in an ascending order ===============================
	/*	
		int [] arr = { 76,987,987,54,1};
		
		Arrays.sort(arr);
		for (int each : arr) {
			System.out.println(each);
		}    */
		
//====================================  Remove Dublication   ==========================================		
		
	/*	String str = "AABBCCDDUU";
		String remdub = "";
		
		for (int i=0; i<str.length(); i++) {
			if (!remdub.contains("" + str.charAt(i))) {
				remdub += ""+str.charAt(i);
			}
		}
		System.out.println(remdub);	*/

//====================================  Remove Dublication from Input   ==========================================		
/*
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter word");
		
		String input = scan.nextLine();
		String result = "";
		
		for (int i =0; i<input.length(); i++) {
			if (!result.contains(""+ input.charAt(i))) {
				result += ""+input.charAt(i);
			}
		}
		System.out.println(result);   */
		
//===================================  Find Unique Characters  =================================================
		
		//  turn it to an array, compare it its own letters. split()
		/*
		String str = "HHFGFVDNBDJDGDHDGDYYYDHZZZ";
		
		String [] arr = str.split("");
		String unique = "";
		
		for (int j=0; j<arr.length; j++) {
			
			int num=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[j].equals(arr[i])) {
				num++;
			}
		}
		if(num ==1) {
			unique += arr[j];
		}
		}	
		System.out.println(unique);			*/
		
//==================================  find the unique ===================================================
		
	/*	String str = "AABBDGK";
		String [] arr = str.split("");
		String unique = "";
		
		for (int j=0; j<arr.length; j++) {
			
			int count=0;
			for (int i=0; i<arr.length; i++) {
				if (arr[j].equals(arr[i])) {
					count++;
				}
			}
			if(count == 1) 
				unique += arr[j];			
		}
		System.out.println(unique);		*/

//===============================  Reverse String   ======================================================
		
		String str = "NASA";
		String reverse = "";
		
		for (int i=str.length()-1; i>=0; i--) {
			reverse += str.toCharArray()[i]; 
		}
			System.out.println(reverse);
	
		
		
		
	}	
		}
	





















