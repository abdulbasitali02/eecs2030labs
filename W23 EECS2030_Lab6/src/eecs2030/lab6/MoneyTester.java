package eecs2030.lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoneyTester {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(CAD.values()));

		List <CAD> list = new ArrayList<>();
		list.add(CAD.TWENTY);
		list.add(CAD.FIVE);
		list.add(CAD.FIVE);
		list.add(CAD.LOONIE);
		list.add(CAD.QUARTER);
		list.add(CAD.QUARTER);
		list.add(CAD.NICKEL);
		
		System.out.println(list.get(0));
		System.out.println(list.get(0).getValue());
		System.out.println(list.get(5).getValue());
		System.out.println();
		System.out.println(CAD.sum(list));
		System.out.println();
		System.out.println(CAD.countOut(31.53));
		System.out.println();
		System.out.println(CAD.countOutString(31.53));
		System.out.println();
		System.out.println(CAD.countOutString(2.2));
	}

}
