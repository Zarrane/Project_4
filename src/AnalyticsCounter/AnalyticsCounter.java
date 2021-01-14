package AnalyticsCounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.TreeMap; 

/**
 * 
 * @author Zarrane
 *
 * @version 1.0
 *
 */

public class AnalyticsCounter{
	/**
	 * 
	 * @param args
	 * @throws Exception
	 * 
	 */
	public static void main(String args[]) throws Exception {	// Instantiation of the object ReadWriteFile, and use function ReadAndWrite
		ReadWriteFile myReader = new ReadWriteFile();			
		myReader.ReadAndWrite(Constantes.inputFile);			

	}
}

