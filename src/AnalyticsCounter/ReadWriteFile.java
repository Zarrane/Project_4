package AnalyticsCounter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
/**
 * 
 * @author Zarrane
 * @version 1.0
 */
public class ReadWriteFile implements ContractReadWriteFile {
	/**
	 * 
	 * @param NameList
	 * @return
	 */
	public  BufferedReader Reader = null;
	
	public boolean ReadAndWrite(String nameList) throws IOException {	// Read the file, sort it (Instanciation of "SortSymptoms"), then write in the outputfile 
		try(FileReader myFileReader = new FileReader(nameList)){
			Reader = new BufferedReader(myFileReader);
			SortSymptoms mySymptoms = new SortSymptoms();
			mySymptoms.Sort(Reader);										
			try(FileWriter writer = new FileWriter (Constantes.outputFile)){	// Utilise le TreeMap de SortSymptoms pour écrire dans le fichier result.out	
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