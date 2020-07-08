package file.manipulations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		// Using FileReader BufferReader
		
		FileReader fr = new FileReader("C:\\Users\\Owner\\Desktop\\Liliia\\To Read.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine())!=null) {
			
			System.out.println(str);
			
		}
		br.close();
		
		
		//Using File and Scanner
		
		File file = new File ("C:\\Users\\Owner\\Desktop\\Liliia\\To Read.txt");
		Scanner sc =new Scanner(file);
		
		//loop statement
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		
		// 
		
		
		
	}

}
