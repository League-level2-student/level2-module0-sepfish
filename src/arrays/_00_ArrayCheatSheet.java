package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] names = new String[5];
		for (int i = 0; i < 5; i++) {
			names[i] = "name" + i;
		}

		// 2. print the third element in the array
		System.out.println(names[2]);
		// 3. set the third element to a different value
		names[2] = "Ix";
		// 4. print the third element again
		System.out.println(names[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int j = 0; j < names.length; j++) {
			System.out.println(names[j]);
		}
		// 6. make an array of 50 integers
		int[] integers = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random rand;
		for (int i = 0; i < 50; i++) {
			rand = new Random();
			int random = rand.nextInt(55);
			integers[i] = random;
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int smallest = integers[0];
		for (int i = 1; i < integers.length; i++) {
			if (integers[i] < smallest) {
				smallest = integers[i];
			}
		}
		System.out.println("this is the smallest: " + smallest);
		// 9 print the entire array to see if step 8 was correct
		System.out.println("here comes the array:");
		for (int i = 0; i < integers.length; i++) {
			System.out.println(integers[i]);
		}
		// 10. print the largest number in the array.
		int biggest = integers[0];
		for (int i = 1; i < integers.length; i++) {
			if (integers[i] > biggest) {
				biggest = integers[i];
			}
		}
		System.out.println("this is the biggest: " + biggest);
	}
}
