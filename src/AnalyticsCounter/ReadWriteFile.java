package AnalyticsCounter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.TreeMap;
/**
 * 
 * @author Zarrane
 * @version 1.0
 */
public class ReadWriteFile implements ContractReadFile {
	/**
	 * 
	 * @param NameList
	 * @return
	 */
	public  BufferedReader Reader = null;
	
	public boolean ReadAndWrite(String nameList) {							//Lis le fichier, le trie (Instancie "SortSymptoms"), puis écrit dans un fichier 
		System.out.println("balise 0");
		try(FileReader myFileReader = new FileReader(nameList)){
			
			Reader = new BufferedReader(myFileReader);
			
			SortSymptoms mySymptoms = new SortSymptoms();
			System.out.println("balise 1");
			mySymptoms.SortAndWrite(Reader);
			System.out.println("balise 2");
			try(FileWriter writer = new FileWriter ("result.out")){		//Constantes.outputFile
				for (String i : mySymptoms.symptomsList.keySet()) {						
					writer.write(i + " --> " + mySymptoms.symptomsList.get(i) + "\n");	
				}
				writer.close();	
				myFileReader.close();
				return true;
			} catch (Exception e) {
			    System.out.println("Writer Error");
			    e.printStackTrace();
			    return false;
			}
		}catch (Exception e) {
		      System.out.println("Reader Error");
		      e.printStackTrace();
		      return false;
		}
	}
}