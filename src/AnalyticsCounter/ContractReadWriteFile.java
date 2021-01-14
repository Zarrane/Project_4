package AnalyticsCounter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Zarrane
 *
 * @see ReadWriteFile
 */
public interface ContractReadWriteFile {
	
	public  BufferedReader reader = null;
	
	public default boolean ReadAndWrite(String nameList) throws IOException {	// Read the file, sort it (Instanciation of "SortSymptoms"), then write in the outputfile 
		FileReader myFileReader = new FileReader(nameList);
		SortSymptoms mySymptoms = new SortSymptoms();
		mySymptoms.Sort(reader);								
		FileWriter writer = new FileWriter (Constantes.outputFile);
		return true;
	}
}
