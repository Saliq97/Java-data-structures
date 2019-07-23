package recursion;

public class linearSearch {
	static int num = 0;

	
	// if the number is present in the array then return number.
	public static int find(int a[], int data, int index) {
		while (index < a.length) {
			if (a[index] == data)
				return index;

			else {
				index++;
				find(a, data, index);
			}
		}
		return -1;
	}

	
	
	

	//To check sorted increasing order .
	static boolean isSorted(int[] a, int index) {
		if (index == a.length - 1)
			return true;

		if (a[index] > a[index + 1])
			return false;
		else {
			boolean restans = isSorted(a, index + 1);
			return restans;
		}
	}

//last index of the given number
	
	public static int lastIndex(int a[], int data, int index) {
		int index1 = -1;
		while (index < a.length) {
			if (a[index] == data) {
				index1 = index;
				index++;
			}

			else {
				index++;
				lastIndex(a, data, index);
			}

		}
		if (index1 == -1)
			return -1;
		else
			return index1;
	}

//Return all the indeces where the given num is available.
	public static int[] allIndex(int a[], int data, int index) {
		

		if(a[index] == data)
			
		
		
	}
	
	
	
	
	
	
// Optimized power function
	public static long fastpower(int a, int b) {

		if (b == 0)
			return 1;
		long smallans = fastpower(a, b / 2);
		smallans *= smallans;

		if ((b % 2) == 1) {
			return a * smallans;
		}

		else
			return smallans;
	}
	
	
//Increasing and decreasing upto n , 1 respectively.
	public static void printIncDec(int n) {

		if (n == 1) {
			System.out.println(n);
			System.out.print(n + " ");
		}

		else {
			System.out.print(n + " ");
			printIncDec(n - 1);
			System.out.print(n + " ");
		}
	}

//Multiplication of two number without using * 
	public static int mulTwoNum(int a, int b) {
		int num;
		int flag = 0;

		if (b < 0) {
			b = -b;
			flag++;
		}

		if (a < 0) {
			a = -a;
			flag++;
		}

		if (b == 0)
			return b;
		else {
			num = a + mulTwoNum(a, b - 1);
		}

		if (flag == 0 || flag == 2)
			return num;
		else
			return -num;
	}
	
	
// String to Integer
	public static int strToInt(String str) {
		if (str.length() == 0)
			return 0;
		num = num * 10 + Integer.parseInt(str.substring(0, 1));
		strToInt(str.substring(1));
		return num;
	}

// Main Function
	public static void main(String[] args) {

		int[] arr = { 3, 3, 1, 3, 4, 6 ,3,4,5,3};
		int[] all = new int[10];
		int a = 20, b = -120;
		int n = 10;
		System.out.println("Yes , Present num  : " + find(arr, 4, 0));
		System.out.println("Array is sorted : " + isSorted(arr, 0));
		System.out.println("The value of 'a' raise to the power 'b' is : " + fastpower(2 ,20));
		System.out.println("Increasing and decreasing upto n , 1 respectively --");
		printIncDec(n);
		System.out.println("\nMultiplication is : " + mulTwoNum(a, b));
		System.out.println("String to int conversion : " + strToInt("786"));
		System.out.println("Last index of the given element is : " + lastIndex(arr, 3, 0));
		all = allIndex(arr, 3, 0);
		for(int i =0 ; i <all.length; i++)
		   System.out.print(all[i]+ ",");

	}

}