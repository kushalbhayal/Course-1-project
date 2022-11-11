package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws IOException {
		FileUtil util = new FileUtil();
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Application Name=LockedMe.com");
		System.out.println("Devloper Details---");
		System.out.println(" Devloper Name=Kushal Bhayal \n Devloper Email address=kushalbhayal01@gmail.com");
		
		boolean b = true;
		while (b) {
			
			System.out.println("==============================");
			System.out.println("1.Add File");
			System.out.println("2.Delete File");
			System.out.println("3.Display File");
			System.out.println("4.Search File");
			System.out.println("5. Exit");
			System.out.println("Enter option");
			List f =new ArrayList();
			try {
				ch = Integer.parseInt(sc.nextLine());
				
				switch (ch) {
				case 1:
					boolean d1=true;
					while(d1) {
					List drive=util.Drive();
					ch=Integer.parseInt(sc.nextLine());
					if(ch>=1 && ch<=drive.size()) {
					util.getDrives(ch-1);
					f=util.Folders();
					d1=false;
					}else {
						System.out.println("Enter a valid input");
					}
					}
					boolean d2=true;
					while(d2) {
						ch=Integer.parseInt(sc.nextLine());
						if(ch>=1 && ch<=f.size()) {
							util.getFolder(ch-1);
							d2=false;
							}else {
								System.out.println("Enter a valid input");
							}
					}
					String fileName;
					System.out.println("Enter a file name -----\n filename contains only ONE OR MORE -, _, PERIOD, SPACE, or alphanumeric characters, \n followed by exactly one of .pdf, .txt or .csv at the end of the filename. ");
					boolean inpSecond = true;
					first: while (inpSecond) {
						fileName = sc.nextLine();
						if (fileName.matches("[-_. A-Za-z0-9]+\\.(pdf|txt|csv|png|jpg)")) {
							if (util.addFile(fileName)) {
								System.out.println("file added successfully");
							} else {
								System.out.println("File already existed");
							}
							inpSecond = false;
						} else {
							System.out.println("Enter a valid fileName");
						}
					}
					break;
				case 2:
					boolean d3=true;
					while(d3) {
					List drive=util.Drive();
					ch=Integer.parseInt(sc.nextLine());
					if(ch>=1 && ch<=drive.size()) {
					util.getDrives(ch-1);
					f=util.Folders();
					d3=false;
					}else {
						System.out.println("Enter a valid input");
					}
					}
					boolean d4=true;
					while(d4) {
						ch=Integer.parseInt(sc.nextLine());
						if(ch>=1 && ch<=f.size()) {
							util.getFolder(ch-1);
							d4=false;
							}else {
								System.out.println("Enter a valid input");
							}
					}
					String fileName1;
					System.out
							.println("Enter file name----- \n filename contains only ONE OR MORE -, _, PERIOD, SPACE, or alphanumeric characters, \n followed by exactly one of .pdf, .txt or .csv at the end of the filename. ");
					boolean inpthird = true;
					while (inpthird) {
						fileName1 = sc.nextLine();
						if (fileName1.matches("[-_. A-Za-z0-9]+\\.(pdf|txt|csv|png|jpg)")) {
							if (util.search(fileName1)) {
								if (util.deleteFile(fileName1)) {
									System.out.println("File deleted successfully");
									inpthird = false;
								}
							} else {
								System.out.println("File does not exists");
								inpthird = false;
							}
						} else {
							System.out.println("Enter a valid FileName");
						}
					}
					break;
				case 3:
					boolean d5=true;
					while(d5) {
					List drive=util.Drive();
					ch=Integer.parseInt(sc.nextLine());
					if(ch>=1 && ch<=drive.size()) {
					util.getDrives(ch-1);
					f=util.Folders();
					d5=false;
					}else {
						System.out.println("Enter a valid input");
					}
					}
					boolean d6=true;
					while(d6) {
						ch=Integer.parseInt(sc.nextLine());
						if(ch>=1 && ch<=f.size()) {
							util.getFolder(ch-1);
							d6=false;
							}else {
								System.out.println("Enter a valid input");
							}
					}
					List<MyFile> files = util.getFiles();
					for (MyFile ff : files) {
						System.out.println(ff.getId() + "\t" + ff.getFileName());
					}
					break;
				case 4:
					boolean d7=true;
					while(d7) {
					List drive=util.Drive();
					ch=Integer.parseInt(sc.nextLine());
					if(ch>=1 && ch<=drive.size()) {
					util.getDrives(ch-1);
					f=util.Folders();
					d7=false;
					}else {
						System.out.println("Enter a valid input");
					}
					}
					boolean d8=true;
					while(d8) {
						ch=Integer.parseInt(sc.nextLine());
						if(ch>=1 && ch<=f.size()) {
							util.getFolder(ch-1);
							d8=false;
							}else {
								System.out.println("Enter a valid input");
							}
					}
					String fileName2;
					System.out.println(
							"Enter file name---\n filename contains only ONE OR MORE -, _, PERIOD, SPACE, or alphanumeric characters, \n followed by exactly one of .pdf, .txt or .csv at the end of the filename. ");
					boolean inpfourth = true;
					while (inpfourth) {
						fileName2 = sc.nextLine();
						if (fileName2.matches("[-_. A-Za-z0-9]+\\.(pdf|txt|csv|png|jpg)")) {
							if (util.search(fileName2)) {
								System.out.println("File existed");
								inpfourth = false;
							} else {
								System.out.println("File not existed");
								inpfourth = false;
							}
						} else {
							System.out.println("Enter a valid fileName");
						}
					}
					break;
				case 5:
					System.out.println("Application exited");
					b = false;
					break;

				default:
					System.out.println("==============================");
					System.out.println("Enter a valid input");
					break;
				}
			} catch (Exception ime) {
				
				System.out.println("Enter a valid input");
			}

		}
	}

}
