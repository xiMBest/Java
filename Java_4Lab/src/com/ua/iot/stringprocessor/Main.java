package com.ua.iot.stringprocessor;

import java.io.IOException;
import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		StringProcessor stringProcessor=new StringProcessor();
		try{
		List<String>arrayString= stringProcessor.processText(stringProcessor.readInputText());
		arrayString=stringProcessor.processSentences(arrayString);
		arrayString=stringProcessor.processQuestions(arrayString);
		stringProcessor.showResult(arrayString);
		}catch(IOException e){
			
		}
		
       }

}
