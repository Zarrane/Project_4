package AnalyticsCounter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.TreeMap;
/**
 * 
 * @author Zarrane
 * @version 1.0
 */
public interface ContractSymptomReader {
	/**
	 * 
	 * @param NameList
	 * @return
	 * @throws Exception
	 */
	static boolean main(String NameList) throws Exception {
		return ReadText(NameList);
	}
		
	public static boolean ReadText(String myString) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(myString));
		return CreateSymptomesList(reader);
	}
	public static boolean CreateSymptomesList(BufferedReader reader) throws Exception{
		String line = reader.readLine();	
	    TreeMap<String, Integer> symptomList = new TreeMap<String, Integer>();  
	    if(line == null) {															
			System.out.println("EXEPTION : NO AVALABLE CONTENT IN THE INPUT FILE");
			return false;
	    }else {				
	    	return true;
	    }
	}
}
