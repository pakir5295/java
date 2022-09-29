import java.io.File;
import java.io.IOException;


public class File_mkdir {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String curdir = "c:/myTemp";
		
		
		//if no directory, mkdir
		File tempDir = new File(curdir);
		if(!tempDir.exists())
			tempDir.mkdir();;
		System.out.println(tempDir.exists());
		
		//File object create
		File newFile = new File(curdir+"/testdata.txt");
		if(!newFile.exists())
			newFile.createNewFile();
		
		File newFile2 = new File(curdir+"/newFile2.txt");
		if(!newFile2.exists())
				newFile2.createNewFile();
		File newFile3 = new File("c:\\myTemp\\newFile3.txt");
		if(!newFile3.exists())
			newFile3.createNewFile();
	
//		File newFile4 = new File("c:"+File.separator+"myTemp"+File.pathSeparator+"newFile4.txt");
//		if(!newFile4.exists())
//			newFile4.createNewFile();
	
		System.out.println(newFile.exists());
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
//		System.out.println(newFile4.exists());
		System.out.println();

		System.out.println(newFile.getAbsolutePath());
		System.out.println(newFile2.getAbsolutePath());
		
		System.out.println(System.getProperty("user.dir"));
		File tempDir1 = new File(curdir+"/abc");
		if(!tempDir1.exists())
			tempDir1.mkdir();
		File newFile5=new File(curdir+"/abc/newFile5.txt");
		if(!newFile5.exists())
			newFile5.createNewFile();
		System.out.println(newFile5.getAbsolutePath());
	}

}
