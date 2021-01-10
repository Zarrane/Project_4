package AnalyticsCounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.TreeMap;
/**
 * 
 * @author Zarrane
 * @version 1.0
 */
public class MySymptomesList implements ContractSymptomReader {
	/**
	 * 
	 * @param NameList
	 * @return
	 */
	public static boolean main(String NameList) {	
		try(BufferedReader reader = new BufferedReader (new FileReader(NameList))){
			CreateSymptomesList(reader);
			return true;
		} catch (Exception e) {
		      System.out.println("Reader Error");
		      e.printStackTrace();
		      return false;
		}
	}
	

		
	public static boolean CreateSymptomesList(BufferedReader reader) throws Exception{
		String line = reader.readLine();	
	    TreeMap<String, Integer> symptomList = new TreeMap<String, Integer>(); 
	    if(line == null) {															
			System.out.println("EXEPTION : NO AVALABLE CONTENT IN THE INPUT FILE");	
			return false;
	    }else {																		
			while (line != null) {										
				if (symptomList.containsKey(line))							
				{	
					symptomList.put(line, symptomList.get(line) + 1);		
				}else{	
					symptomList.put(line, 1);								
				}
				line = reader.readLine();	
			}	
			try(FileWriter writer = new FileWriter ("result.out")){		
				for (String i : symptomList.keySet()) {						
					writer.write(i + " --> " + symptomList.get(i) + "\n");	
				}
				writer.close();	
				reader.close();
				return true;
			} catch (Exception e) {
			    System.out.println("Writer Error");
			    e.printStackTrace();
			    return false;
			}
		}
		
	}
	
	
	
}
