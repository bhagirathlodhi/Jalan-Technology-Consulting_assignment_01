package jalan.com;

import java.util.Scanner;

public class Jalan_assignment {

	public static int[] leftRotate(int array[], int n) {
		for (int i = 0; i < n; i++) {
			int first = array[0];
			for (int j = 0; j < array.length - 1; j++) {
				array[j] = array[j + 1];
			}
			array[array.length - 1] = first;
		}
		return array;
	}

	private static void rightRotate(int[] a, int n) {
		n %= a.length;
		int[] x = reverse(a, 0, a.length - 1);
		int[] y = reverse(a, 0, n - 1);
		int[] z = reverse(a, n, a.length - 1);
		printArray(z);
	}

	private static int[] reverse(int[] a, int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;

	}

	public static void printArray(int array[]) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter length of the Array:");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int array[] = new int[len];
		System.out.println("Enter " + len + " Integer Element");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("you entered:-");
		printArray(array);
		System.out.println();
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		System.out.println(" Enter p value :-- if you want to left rutate to press 0 & right for press 1");
		int p = sc.nextInt();
		if (p == 0) {
			int a[] = leftRotate(array, n);
			printArray(a);
		} else {
			rightRotate(array, n);
		}
	}
}
