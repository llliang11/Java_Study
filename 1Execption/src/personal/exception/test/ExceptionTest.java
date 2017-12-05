package personal.exception.test;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			funTest();
		}
		catch (RemoteException e){
			System.out.println("the exception code is ");
			System.out.println(e.GetErrCode());
		}
		
		try {
			InputFile in = new InputFile("Cleanup.java");
			try {
				String s;
				int i = 1;
				while((s = in.getLine()) != null)
					;
			} catch (Exception e) {
				System.out.println("Caught Exception in main");
				e.printStackTrace(System.out);
			} finally {
				in.dispose();
			}
		} catch(Exception e) {
			System.out.println("InputFile construction failed");
		}
	}
	
	public static void funTest() throws RemoteException{
		throw new RemoteException(ErrCode.INVALID_PARAMETER);
	}

}
