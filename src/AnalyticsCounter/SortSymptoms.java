package AnalyticsCounter;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

/**
 * 
 * @author Zarrane
 *
 */

public class SortSymptoms {
	public TreeMap<String, Integer> symptomsList = new TreeMap<String, Integer>();  
	
	public TreeMap<String, Integer> Sort(BufferedReader reader) throws IOException{	//recoit un BufferedReader et le transforme en TreeMap tri� /ordre Alphab�tique
		String line = reader.readLine();
	    if(line == null) {															
			System.out.println("EXEPTION : NO AVALABLE CONTENT IN THE INPUT FILE");	
			return null;
	    }else {																		
			while (line != null) {										
				if (symptomsList.containsKey(line))							
				{	
					symptomsList.put(line, symptomsList.get(line) + 1);		
				}else{	
					symptomsList.put(line, 1);								
				}
				line = reader.readLine();	
			}
				reader.close();
				return symptomsList;
	    }
	}
}
