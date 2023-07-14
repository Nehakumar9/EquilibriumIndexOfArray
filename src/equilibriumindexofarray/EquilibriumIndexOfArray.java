package equilibriumindexofarray;

import java.util.Scanner;

public class EquilibriumIndexOfArray {

	public static int equilibriumIndexOfArray(int array[],int size) {
		int[] P = new int[size];
		P[0] = array[0];
		for(int i=1;i<size;i++) {
			P[i] = P[i-1]+array[i];
		}
		for(int i=1;i<size;i++) {
			if(P[i-1]==P[size-1]-P[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int results = equilibriumIndexOfArray(array,n);
		System.out.println(results);
	}

}
