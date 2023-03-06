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
		// base case: list is empty or has only one element
		if (list.size() <= 1){
			return;
		}
		// recursive case: list has more than one element
		// remove the last element from the list
		T item = list.remove(list.size() - 1);
		
		insertionSortRecursive(list);	
		insertionSortRecursiveInsert(list, item);
	}

	private static <T extends Comparable <? super T>> void insertionSortRecursiveInsert(List <T> list, T item) {
		// base case: list is empty or item is greater than or equal to the last element in the list
		if (list.size() == 0 || item.compareTo(list.get(list.size() - 1)) >= 0){
			list.add(item);
			return;
		}
	
		T last = list.remove(list.size() - 1);
		insertionSortRecursiveInsert(list, item);
		list.add(last);
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
