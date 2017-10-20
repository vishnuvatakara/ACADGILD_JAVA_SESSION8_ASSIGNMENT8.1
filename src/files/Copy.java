package files;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		
		File f1=new File("C:\\Users\\vishnu\\eclipse-workspace\\assignment8.1\\file1.txt");	//defining file1
		File f2=new File("C:\\Users\\vishnu\\eclipse-workspace\\assignment8.1\\file2.txt");//defining file2 destination file
		int length;
		
		try {
			//file inputstarm and outputstream objects
			FileInputStream in=new FileInputStream(f1);
			FileOutputStream out=new FileOutputStream(f2);
			byte[] bfr=new byte[2048];	//byte array
			length=in.read(bfr);//length of file1 buffer array reading file1 content
		
			if(length>0)
			{
				out.write(bfr, 0, length);//write into file2 offset=0
				length--;
			}
			System.out.println("copy sucessfull");
			in.close();//closing files
			out.close();
		}
		catch(IOException ae){
			ae.printStackTrace();//handling exception
			
		}
		

	}

}
