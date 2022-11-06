package com.lokedme;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Test {
public static void main(String[] args) throws IOException {
	FileUtil util=new FileUtil();
	int ch;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("1.Add File");
		System.out.println("2.Delete File");
		System.out.println("3.Display File");
		System.out.println("4.Search File");
		System.out.println("Eneter the choice");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			String fileName;
			System.out.println("Eneter the Filename");
			fileName=sc.next();
			util.addFile(fileName);
			break;
		case 2:
			String fileName1;
			System.out.println("Eneter the fileName");
			fileName1=sc.next();
			System.out.println(util.deleteFile(fileName1));
			break;
		case 3:
			List<MyFile> files=util.getFile();
			for(MyFile f:files) {
				System.out.println(f.getId()+"\t"+f.getFileName());
			}
			break;
		case 4:
			String fileName2;
			System.out.println("Eneter the fileName");
			fileName2=sc.next();
			
	System.out.println(util.search(fileName2));
			break;
			}
	}while(ch<5);
}
}
