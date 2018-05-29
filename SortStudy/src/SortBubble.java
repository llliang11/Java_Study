import java.util.Comparator;

interface Sorter {
	public <T extends Comparable<T>> void sort(T[] list);
	public <T> void sort(T[] list, Comparator<T> comp);
}

public class SortBubble implements Sorter{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortBubble sortor = new SortBubble();
		String arry[] = new String[5];
		arry[0] = "hello";
		arry[1] = "world";
		arry[2] = "larry";
		arry[3] = "test";
		arry[4] = "sortor";

		sortor.sort(arry);
		System.out.println("the str is ");
		for (String str : arry) {
			System.out.println(str);
		}
		
		sortor.sort(arry, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.compareTo(o2) > 0) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		System.out.println("the str is ");
		for (String str : arry) {
			System.out.println(str);
		}
	}

	@Override
	public <T extends Comparable<T>> void sort(T[] list) {
		// TODO Auto-generated method stub
		boolean swapped = true;
		for (int i = 1, len = list.length; i < len && swapped; ++i) {
			swapped = false;
			for (int j = 0; j < len - i; ++j) {
				if (list[j].compareTo(list[j + 1]) > 0) {
					T temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					swapped = true;
				}
			}
		}
	}

	@Override
	public <T> void sort(T[] list, Comparator<T> comp) {
		// TODO Auto-generated method stub
		boolean swapped = true;
		for (int i = 1, len = list.length; i < len && swapped; ++i) {
			swapped = false;
			for (int j = 0; j < len - i; ++j) {
				if (comp.compare(list[j], list[j + 1]) > 0) {
					T temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					swapped = true;
				}
			}
		}
	}
}
