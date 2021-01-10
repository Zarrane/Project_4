package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
		

	public static void main(String args[]) throws Exception {
		
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt")); // Get input
		String line = reader.readLine();											// First Line is read and push in a string --> 'line'
		HashMap<String, Integer> symptomList = new HashMap<String, Integer>();	   // Initialisation of the list: HashMap<'Symptom's name', Number it> 
		if(line != null) {															/// Exeption: IF --> 'line' is already empty
			System.out.println("EXEPTION : NO AVALABLE CONTENT IN THE INPUT FILE");	// Write on console the error
		}else {																		/// ELSE --> 'line' can be use
			while (line != null) {										// WHILE 'line' is'nt empty (null), use the loop
				if (symptomList.containsKey(line))							// For every line, cheking if the symptome already exist
				{	
					symptomList.put(line, symptomList.get(line) + 1);		// IF yes(true), +1 in the second column 
				}else{	
					symptomList.put(line, 1);								// ELSE, add the symptom with 1 in the second columne
				}
				line = reader.readLine();									// Take the next line of the reader
			}	
		    
			FileWriter writer = new FileWriter ("result.out");			// Generate output file
			for (String i : symptomList.keySet()) {						// FOR every Symptom :
			    writer.write(i + " --> " + symptomList.get(i) + "\n");	// Write in the output file : 'Symptom' --> 'Number of Symptom'
			}
			reader.close(); //Close the resource 'reader'
			writer.close();	//Close the resource 'reader'
		}
	}
}
