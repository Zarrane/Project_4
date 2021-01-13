package AnalyticsCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.TreeMap;

/**
 * 
 * @author Zarrane
 *
 * @see SortSymptoms
 */

public interface ContractSortSymptoms {
	
	public TreeMap<String, Integer> symptomsList = new TreeMap<String, Integer>();

	public default TreeMap<String, Integer> Sort(BufferedReader reader) throws IOException{	//recoit un BufferedReader et le transforme en TreeMap trié /ordre Alphabétique
		String line = reader.readLine();													
		while (line != null) {										
			if (symptomsList.containsKey(line))							
			{	
				symptomsList.put(line, symptomsList.get(line) + 1);		
			}else{	
				symptomsList.put(line, 1);								
			}
			line = reader.readLine();	
		}
		return symptomsList;
    }
}

