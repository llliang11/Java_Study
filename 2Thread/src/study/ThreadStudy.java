package study;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadStudy {

	public static class Task implements Runnable {
		int i = 10;
		SyncTask mTsk;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (i > 0) {
				i--;
				if (i % 2 == 0) {
					mTsk.addValue();
					System.out.println("i is " + i);
					System.out.println("value is: " + mTsk.getValue());
				} else {
					mTsk.cutValue();
					System.out.println("i is " + i);
					System.out.println("value is: " + mTsk.getValue());
				}

			}
		}
		
		public Task(SyncTask tsk) {
			mTsk = tsk;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub0
//		Task tsk = new Task();
		SyncTask syncTsk = new SyncTask();

//		Thread thread = new Thread(tsk);
//		thread.start();
		
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 2; i++) {
			exec.submit(new Task(syncTsk));
			System.out.println("new thread task");
		}
		exec.shutdown();
	}

}
