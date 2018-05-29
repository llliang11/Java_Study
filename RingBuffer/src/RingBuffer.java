import java.nio.ByteBuffer;
public class RingBuffer {
	private final int RingBufferSize = 10;
	private ByteBuffer[] bufferArry; 
	private int head;
	private int tail;
	private int bufSize;
	
	public RingBuffer() {
		bufferArry = new ByteBuffer[RingBufferSize];
		head = 0;
		tail = 0;
		bufSize = RingBufferSize;
	}
	
	public RingBuffer(int maxSize) {
		bufferArry = new ByteBuffer[maxSize];
		head = 0;
		tail = 0;
		bufSize = maxSize;
	}
	
	private boolean isFull() {
		return head == (tail + 1) % bufSize;
	}
	
	private boolean isEmpty() {
		return tail == head;
	}
	
	public boolean addElement(ByteBuffer buffer) {
		if (isFull()) {
			System.out.println("the ring buffer is full");
			return false;
		}
		
		bufferArry[tail] = buffer;
		tail = (tail + 1) % bufSize;
		return true;
	}
	
	public ByteBuffer getElement() {
		if (isEmpty()) {
			System.out.println("the ring buffer is empty");
			return null;
		}
		
		ByteBuffer buffer = bufferArry[head];
		head = (head + 1) % bufSize;
		return buffer;
	}
}


















