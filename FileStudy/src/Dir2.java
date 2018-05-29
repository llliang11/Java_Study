import java.util.regex.*;
import java.io.*;
import java.util.*;

public class Dir2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("D:\\workspace\\liang\\JavaWorkspace\\Java_Study\\FileStudy\\src");
		String[] list;
//		list = path.list();
		list = path.list(new FilenameFilter() {
			private Pattern pattern = Pattern.compile(".*.java");
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		});
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String dirItem : list)
			System.out.println(dirItem);
		System.out.println("program end");
	}

}
