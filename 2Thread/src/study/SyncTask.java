package study;

public class SyncTask {
	private int value = 0;

	public synchronized void addValue() {
		value++;
		Thread.yield();
		value++;
	}

	public void cutValue() {
		synchronized (this) {
			value--;
			Thread.yield();
			value--;
		}
	}
	
	public synchronized int getValue() {
		return value;
	}
}
