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
	public static void main(String args[]) throws Exception {	//Fonction principale : Instancie ReadWriteFile, et utilise la fonction ReadAndWrite
		ReadWriteFile myReader = new ReadWriteFile();
		myReader.ReadAndWrite(Constantes.inputFile);
	}
}

