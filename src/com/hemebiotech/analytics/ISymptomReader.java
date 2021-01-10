package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	public class Symptomes(){

		public HashMap<String,Integer> SymptomesListMaker(String myLine){
			HashMap<String, Integer> symptomList = new HashMap<String, Integer>(); //initialisation de la liste (HashMap,Table de hachage) 
/*symptomList.put("Java", 10);
symptomList.put("PHP", 11);
symptomList.put("Python", 15);
symptomList.put("Python", symptomList.get("Python") + 1);*/
			while (line != null) {
				if (symptomList.containsKey(line))
				{
					symptomList.put(line, symptomList.get(line) + 1);
				}else{
					symptomList.put(line, 1);
				}
				
				//SI aucune donnée n'est valable, return Empty
				//SINON --> Commencer l'algorithme
					//Pour chaque ligne, vérifier si le symptome existe déja
					//Si oui, +1 sur la deuxieme colone
					//Si non, rajouter le symptome avec +1 dans la deuxieme colone
				line = reader.readLine();
			}
			
			System.out.println("Symptoms :" );
			for (String i : symptomList.keySet()) {
			    System.out.println(i + " --> " + symptomList.get(i));
			  }
		}
	}
	
	

	//List<String> GetSymptoms ();
}
