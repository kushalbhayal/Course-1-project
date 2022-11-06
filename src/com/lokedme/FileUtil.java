/////package com.lokedme;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	static int count=0;
List<MyFile> files=new ArrayList<>();

public FileUtil() {
	
}
public List<MyFile> getFile(){
	File f=new File("e://java");
	String[] fs=f.list();
	for(String file:fs) {
		count++;
		files.add(new MyFile(count,file));
	}
	return files;
}
public void addFile(String fileName) throws IOException {
	File f=new File("e://java//"+fileName+".txt");
	f.createNewFile();
}
public boolean deleteFile(String fileName) {
	boolean isDeleted=false;
	File f=new File("e://java//"+fileName+".txt");
	if(f.delete()) {
		isDeleted=true;
		return isDeleted;
	}
	else {
		return isDeleted;
	}
}
public boolean search(String fileName) {
	boolean isIdentified=false;
	File f=new File("e://java//"+fileName+".txt");
	if(f.exists()) {
		isIdentified=true;
		return isIdentified;
	}
	else {
		return isIdentified;
	}
	}
}

