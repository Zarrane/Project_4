package AnalyticsCounter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

public interface ContractReadFile {
	public  BufferedReader toReader = null;
	
	public default boolean Read(String nameList){	
		return true;
	}
}
