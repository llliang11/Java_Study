package personal.innerclass.test;

interface Selector {
	boolean end();
	Object current();
	void next();
}

public class InnerClassTest {
	private Object[] items;
	private int next = 0;
	
	public InnerClassTest(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length) {
			items[next++] = x;
		}
	}
	
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() {
			return i == items.length;
		}
		
		public Object current() {
			return items[i];
		}
		
		public void next() {
			if (i < items.length) {
				i++;
			}
		}
	}
	
	public Selector seclector() {
		return new SequenceSelector();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassTest iClass = new InnerClassTest(10);
		for (int i = 0; i < 10; i++) {
			iClass.add(Integer.toString(i));
		}
		Selector selector = iClass.seclector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}

}
