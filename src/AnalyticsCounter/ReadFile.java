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
public class ReadFile implements ContractReadFile {
	/**
	 * 
	 * @param NameList
	 * @return
	 */
	public BufferedReader Read(String nameList) {	
		try(BufferedReader reader = new BufferedReader (new FileReader(nameList))){
		      System.out.println("Reader works");

			return reader;
		} catch (Exception e) {
		      System.out.println("Reader Error");
		      e.printStackTrace();
		      return null;
		}
		
	}
}