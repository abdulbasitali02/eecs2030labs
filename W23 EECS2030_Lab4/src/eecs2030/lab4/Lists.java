package eecs2030.lab4;

import java.util.Comparator;
import java.util.List;

public class Lists {
	private Lists(){} //no objects of this class are desired
	
	public static <T extends Comparable <? super T>> void defaultSort(List <T> list){
		list.sort(Comparator.naturalOrder()); //will use a built-in variation of mergesort
											//alternative: Collections.sort(list);
	}

	public static <T extends Comparable <? super T>> void insertionSortRecursive(List <T> list){
		//base case
		if (list.size() <= 1){
			return;
		}
		
		//Sort the first n-1 elements
		insertionSortRecursive(list.subList(0, list.size()-1));

		//Insert the nth element into the sorted list
		T item = list.get(list.size()-1);
		int j = list.size() - 2;
		while (j >= 0 && list.get(j).compareTo(item) > 0){
			list.set(j+1, list.get(j));
			j--;
		}
		list.set(j+1, item);
	}
	
	public static <T extends Comparable <? super T>> void insertionSortIterative(List <T> list){
		int i = 1;
		
		while (i < list.size()){
			T item = list.get(i);
			int j = i - 1;
			while (j >= 0 && list.get(j).compareTo(item) > 0){
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, item);
			i++;
		}
	}

}
