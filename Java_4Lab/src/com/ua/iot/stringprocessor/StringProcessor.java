package com.ua.iot.stringprocessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {
	
	    public String readInputText() throws IOException {
	        //add error handling
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter String: ");
	        return br.readLine();
	    }
	    
	    public List<String> processText(String text) {
	    	Pattern p=Pattern.compile("[A-Za-z]+[A-Za-z\\s]+[!.?]");
	    	Matcher m=p.matcher(text);
	    	List<String> sentences = new LinkedList();
	    	while(m.find()){
	    		sentences.add(text.substring(m.start(), m.end()));
	    	}
	        
	        return sentences;
	    }
	
	    public List<String> processSentences(List<String> sentences) {
	    	List<String> result = new LinkedList();
	    	for(String text: sentences){
	    	Pattern p=Pattern.compile("[a-zA-Z\\s]*[?]");
	    	Matcher m=p.matcher(text);
	    	while(m.find()){
	    		result.add(text.substring(m.start(), m.end()));
	    	}
	    	}
	       return result;
	    }
	    
	    public List<String> processQuestions(List<String> questions) {
	    	StringBuffer sb;
	    	List<String> result=new LinkedList();
	    	for(String string: questions){
	    		String[] arrayString=string.split("\\s");
	    		if(arrayString.length % 2==0){
	    			sb=new StringBuffer(arrayString[arrayString.length/2-1]);
	    			sb.reverse();
	    			arrayString[arrayString.length/2-1]=sb.toString();
	    			sb=new StringBuffer(arrayString[arrayString.length/2]);
	    			sb.reverse();
	    			arrayString[arrayString.length/2]=sb.toString();
	    		}else{
	    			sb=new StringBuffer(arrayString[arrayString.length/2]);
	    			sb.reverse();
	    			arrayString[arrayString.length/2]=sb.toString();
	    		}
	    		String text=new String();
	    		for(String varriable :arrayString){
	    			text=text+varriable+" ";
	    		}
	    		result.add(text);
	    	}
	       return result;
	    }
	   

	    public void showResult(List<String> resultText) {
	        resultText.forEach((String string)->System.out.println(string));
}




}
