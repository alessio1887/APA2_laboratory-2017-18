package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximalSub {

	public static void main(String[] args) throws FileNotFoundException {

				//Testo esercizio
				//int []a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
				/* maxsum = 0
				 * for every starting position h = 0 ... a.length
				 * 		for every ending position  k = h ... a.length
				 * 			compute sum from a[h] to a[k]
				 * 			remember the sum if it is the maximum so far 
				 */
				
//				int []a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//				int max_somma=0, somma=0;
//				int i;
//				for(i=0; i<a.length; i++) {
//					if(somma>0) somma+=a[i];
//					else somma=a[i];
//					
//					if(somma>max_somma) max_somma=somma;
//				}
//				System.out.println("La maximal subsequence dell'array a ha una somma di " +max_somma);
		
		
				//ARRAY GENERATO CASUALMENTE
//				int n = 1000000;
//				int a[] = new int[n];
//				for (int i=0; i < n; i++)
//					a[i] = (int)(Math.random()*200)-100;
				
//				int max_somma=0, somma=0;
//				int i;
//				for(i=0; i<arr.length; i++) {
//					if(somma>0) somma+=arr[i];
//					else somma=arr[i];
//					
//					if(somma>max_somma) max_somma=somma;
//				}
//			    System.out.println("La maximal subsequence ha una somma di " +max_somma);
				
				//GET DATA FROM COMMNAD LINE
//				System.out.println("Inserire la dimensione dell array");
//				Scanner in = new Scanner(System.in); 
//				int dim = in.nextInt();
//				
//				int a[] = new int[dim];
//				int i;
//				for(i=0;i<dim;i++) {
//					a[i]=in.nextInt();
//				}
				//for(i=0;i<dim;i++) {
				//	System.out.println(a[i]);
				//}
//				int max_somma=0, somma=0;
//				for(i=0; i<a.length; i++) {
//					if(somma>0) somma+=a[i];
//					else somma=a[i];
//					
//					if(somma>max_somma) max_somma=somma;
//				}
//				System.out.println("La maximal subsequence dell array a, ha una somma di " +max_somma);

				//GET DATA FROM FILE
				Scanner inf = new Scanner(new File("un_array.txt")); 
				int dim = inf.nextInt();
				int a[]= new int [dim];
				for(int i=0;i<dim;i++) {
					a[i]=inf.nextInt();
				}
				int max_somma=0, somma=0;
				for(int i=0; i<a.length; i++) {
					if(somma>0) somma+=a[i];
					else somma=a[i];
					
					if(somma>max_somma) max_somma=somma;
				}
				System.out.println("La maximal subsequence dell array a, ha una somma di " +max_somma);		
		}

	}