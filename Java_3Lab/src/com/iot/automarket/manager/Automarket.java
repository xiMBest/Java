package com.iot.automarket.manager;

import java.util.LinkedList;
import java.util.List;

import com.iot.automarket.model.Automobile;

public class Automarket {
	
private List<Automobile> automobile = new LinkedList<Automobile>();
	
	public void print(){
		for (Automobile auto : automobile){
			System.out.println(auto);
		}
	}
	
	public Automarket() {}
	
	
	public void addAutomobile(Automobile addAuto) {
		automobile.add(addAuto);
	}
	
	public List<Automobile> getAutomobileList() {
		return automobile;
	}

	public void setAutomobileList(LinkedList<Automobile> automarket) {
		this.automobile = automarket;
	}
	
	public List<Automobile> findByYear(int yearToFind){
		List<Automobile> result = new LinkedList<Automobile>();
		for (Automobile auto : automobile){
			if (yearToFind == auto.getYear()){
				result.add(auto);
			}	
		}
		return result;
	}
	
	public List<Automobile> sortByYear() {
		automobile.sort((Automobile o1, Automobile o2)->o1.getYear()-o2.getYear());
		return automobile;
	} 
	
	public List<Automobile> sortByEngine() {
		automobile.sort((Automobile o1, Automobile o2)->o1.getEngine()-o2.getEngine());
		return automobile;
	}
	
	public Automarket (LinkedList<Automobile> automobile) {
		this.automobile = automobile;
	}

}
