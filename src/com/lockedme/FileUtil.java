package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	static int count = 0;
	List<MyFile> files = new ArrayList<>();
	List drive;
	List fol;

	public FileUtil() {

	}

	public List Drive() {
		drive = new ArrayList();
		int count = 0;
		File[] f = File.listRoots();
		for (File f1 : f) {
			drive.add(f1);
			count++;
			System.out.println(count + "." + f1);
		}
		System.out.println("======Choose your drive======");
		return drive;
	}

	String dr;

	public void getDrives(int ch) {
		dr = "" + (File) drive.get(ch);
	}

	String folder;
	

	public List Folders() {
		int temp = 0;
		fol = new ArrayList();
		File f = new File(dr);
		File[] ff = f.listFiles();
		for (File f1 : ff) {
			if (f1.isDirectory()) {
				temp++;
				fol.add(f1);
				System.out.println(temp + "." + f1);
			}
		}
		System.out.println("======choose your folder======");
		return fol;
	}

	public void getFolder(int ch) {
		folder = "" + (File) fol.get(ch);
	}

	public List<MyFile> getFiles() {
		count = 0;
		files = new ArrayList<>();
		File f = new File(folder);
		String[] fs = f.list();

		for (String file : fs) {
			count++;
			files.add(new MyFile(count, file));
		}
		return files;
	}

	public boolean addFile(String fileName) throws IOException {
		File f = new File(folder+"\\"+fileName);
		boolean ff = f.createNewFile();
		return ff;

	}

	public boolean deleteFile(String fileName) {
		boolean isDeleted = false;
		File f = new File(folder+"\\"+fileName);
		isDeleted = f.delete();
		return isDeleted;
	}

	public boolean search(String fileName) {

		boolean isIdentified = false;
		File f = new File(folder+"\\"+fileName);
		isIdentified = f.exists();
		return isIdentified;
	}
}
