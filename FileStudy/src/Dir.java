import java.io.File;


public class Dir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\android_develop\\exercise");
		
		if (!f.isDirectory()) {
			System.out.println("the directory is not exist!");
			System.exit(0);
		}
		
		System.out.println("the absolut path is " + f.getAbsolutePath());
		File[] subfiles = f.listFiles();
		int fn = 0, dn = 0;
		for (int i = 0; i < subfiles.length; i++) {
			if (subfiles[i].isFile()) {
				fn++;
				System.out.println("the file length is " + subfiles[i].length() + " subfile name is " + subfiles[i].getName());
			} else {
				dn++;
				System.out.println("Dir" + " dir name is " + subfiles[i].getName());
			}
		}
		System.out.println("total file is " + fn + " total dir is " + dn);
	}

}
