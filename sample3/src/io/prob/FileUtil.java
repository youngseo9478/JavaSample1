package io.prob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileUtil {
	public ArrayList compareFile(String fstFileName, String scdFileName) 
			 throws Exception{
		ArrayList<String> list = new ArrayList<>();
		FileReader fis1 = null,fis2 = null;
		BufferedReader bis1 = null,bis2=null;
		String read1=null,read2=null;
		
		
        fis1=new FileReader(fstFileName);
        bis1 = new BufferedReader(fis1);
        
        fis2 = new FileReader(scdFileName);
        bis2 = new BufferedReader(fis2);
		int line = 0;
		while(true){
			read1 = bis1.readLine();
			read2 = bis2.readLine();
			if(read1==null||read2==null){
				break;
			}
			line++;
			if(!read1.equals(read2)){
				list.add("Line "+line +read2);
			}
		}
		
		return list;
	}
	
	public void fileCopy(String src,String dest){
		
	}
    public void fileMerge(String ...src){
		
	}
}
