package eecs2030.lab4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class sortExperiment {
	private static Random rng = new Random();

	public static void main(String[] args) throws FileNotFoundException {
		List <Integer> list;
		long start, end;

		//You might need to change the 1M value to something smaller for other sorts
		
		System.setOut(new PrintStream(new FileOutputStream("testrun.txt")));
		System.out.println("DEFAULT");
		for (int i = 8; i <= 10000; i *= 10){ 
			list = createRandomList(i); 
			
			start = System.nanoTime();
			Lists.defaultSort(list);
			end = System.nanoTime();
			
			System.out.println("N=" + i + " Time spent: " + (end - start)/1e6 + " ms");
		}
		
		System.out.println("\nRECURSIVE");
		for (int i = 8; i <= 10000; i *= 10){ 
			list = createRandomList(i); 
			
			start = System.nanoTime();
			Lists.insertionSortRecursive(list);
			end = System.nanoTime();
			
			System.out.println("N=" + i + " Time spent: " + (end - start)/1e6 + " ms");
		}

		System.out.println("\nITERATIVE");
		for (int i = 8; i <= 10000; i *= 10){ 
			list = createRandomList(i); 
			
			start = System.nanoTime();
			Lists.insertionSortIterative(list);
			end = System.nanoTime();
		
			System.out.println("N=" + i + " Time spent: " + (end - start)/1e6 + " ms");
		}
		
		System.out.println("\nRECURSIVE STACKOVERFLOW");
		for (int i = 8; i <= 100000; i *= 10){ 
			list = createRandomList(i); 
			
			start = System.nanoTime();
			Lists.insertionSortRecursive(list);
			end = System.nanoTime();
			
			System.out.println("N=" + i + " Time spent: " + (end - start)/1e6 + " ms");
		}
	}

	private static List <Integer> createRandomList (int size){
		rng.setSeed(8);
		List <Integer> list = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			list.add(rng.nextInt());
		}
		return list;
	}


}
