package com.iot.automarket.model;

import com.iot.automarket.model.enums.Category;
import com.iot.automarket.model.enums.EUStandart;
import com.iot.automarket.model.enums.Energy;
import com.iot.automarket.model.enums.Mark;

public class Automobile {
	
	private Mark mark;
	private Category categories;
	private Energy energy;
	private EUStandart eustandart;
	private int year;
	private int cargo;
	private int passenger;
	private int weigth;
	private int engine;
	
	public Automobile() {}
	
	public Automobile(Mark mark, Category categories, Energy energy, EUStandart eustandart, int year, int cargo, int passenger, int weigth, int engine) {
		this.mark = mark;
		this.categories = categories;
		this.energy = energy;
		this.eustandart = eustandart;
		this.year = year;
		this.cargo = cargo;
		this.passenger = passenger;
		this.weigth = weigth;
		this.engine = engine;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

	public Category getCategories() {
		return categories;
	}

	public void setCategories(Category categories) {
		this.categories = categories;
	}

	public Energy getEnergy() {
		return energy;
	}

	public void setEnergy(Energy energy) {
		this.energy = energy;
	}

	public EUStandart getEustandart() {
		return eustandart;
	}

	public void setEustandart(EUStandart eustandart) {
		this.eustandart = eustandart;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Automobile [mark=" + mark + ", categories=" + categories + ", energy=" + energy + ", eustandart="
				+ eustandart + ", year=" + year + ", cargo=" + cargo + ", passenger=" + passenger + ", weigth=" + weigth
				+ ", engine=" + engine + "]"+"\n";
	}
	

}
