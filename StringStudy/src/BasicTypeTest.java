
public class BasicTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = {'c', 'h', 'i', 'n','a'};
		String stringStr = new String(str);
		System.out.println("str is " + stringStr);
		
		StringBuffer sBuffer = new StringBuffer("china");
		sBuffer.append(" success");
		System.out.println("sBuffer is " + sBuffer.toString());
		
		byte[] audioDataArry = new byte[1024];
		byte[] videoDataArry = {0x34, 0x56};
		audioDataArry[0] = (byte) 0xaf;
		System.out.println("the data length is " + audioDataArry.length);
		System.out.println("the data length is " + videoDataArry.length);
	}

}
