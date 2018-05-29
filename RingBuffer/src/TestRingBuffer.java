import java.nio.ByteBuffer;
public class TestRingBuffer {

	private static final int BUF_SIZE = 1024;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RingBuffer mRb = new RingBuffer();
		
		Thread thd1 = new Thread(new Runnable( ) {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					ByteBuffer buffer = ByteBuffer.allocate(BUF_SIZE);
					byte[] src = new byte[10];
					src[1] = 0x1d;
					src[2] = 0x3a;
					buffer.put(src);
					if (mRb.addElement(buffer))
						System.out.println("add element into ringbuffer");
					try {
						Thread.sleep(1000);
					}
					catch (Exception exception) {
						System.out.println("caught exception");
					}

				}
			}
			
		});
		
		thd1.start();
		
		Thread thd2 = new Thread(new Runnable( ) {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					ByteBuffer buffer = null;
					buffer = mRb.getElement();
					if (buffer != null)
						System.out.println("get element from ringbuffer");
					try {
						Thread.sleep(500);
					}
					catch (Exception exception) {
						System.out.println("caught exception");
					}

				}
			}
			
		});
		thd2.start();

	}

}
