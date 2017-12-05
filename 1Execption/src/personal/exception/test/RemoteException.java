package personal.exception.test;

public class RemoteException extends Exception{
	private ErrCode mErrCode;
	public RemoteException(String s) {
		super(s);
	} 
	public RemoteException(ErrCode err) {
		mErrCode = err;
	}
	public ErrCode GetErrCode() {
		return mErrCode;
	}
}
