package com.iot.automarket;

import java.util.Scanner;

import com.iot.automarket.manager.Automarket;
import com.iot.automarket.model.Automobile;
import com.iot.automarket.model.enums.Category;
import com.iot.automarket.model.enums.EUStandart;
import com.iot.automarket.model.enums.Energy;
import com.iot.automarket.model.enums.Mark;

public class Application {

    public static void main(String[] args) {
        Automarket market = new Automarket();
        market.addAutomobile(new Automobile(Mark.BMW,Category.CAR,Energy.GASOLINE,EUStandart.EURO5, 2016, 400, 3, 2000, 2));
        market.addAutomobile(new Automobile(Mark.MAN,Category.TRACK,Energy.DIESEL,EUStandart.EURO6, 2017, 19000, 2, 14000, 15));
        market.addAutomobile(new Automobile(Mark.NISSAN,Category.MINIVEN,Energy.GAS,EUStandart.EURO2, 2000, 700, 6, 3500, 3));
        market.addAutomobile(new Automobile(Mark.OPEL,Category.BUS,Energy.GASOLINE,EUStandart.EURO1, 1999, 400, 30, 3700, 6));



        boolean menu = true;
        while (menu) {

        	System.out.println("Menu:");
    		System.out.println("1 - Print list of Automobile;");
    		System.out.println("2 - Find by engine;");
    		System.out.println("3 - Find by year;");
    		System.out.println("4 - Print list Automobile sorted by year;");
    		System.out.println("5 - Print list Automobile sorted by engine;");
    		System.out.println("6 - Exit;");

    		Scanner scan = new Scanner (System.in);
    		int num = scan.nextInt();
    		//scan.close();
    		
    		switch (num) {
    			case 1: {
    				System.out.println(market.getAutomobileList().toString());
    				break;
    			}
    			case 2: {
    				Scanner scanner = new Scanner(System.in);
    				System.out.println("Enter the engine to find: ");
    				int engineToFind = scanner.nextInt();
    				System.out.println(market.findByEngine(engineToFind).toString());
    				break;
    			}
    			case 3: {
    				Scanner scanner = new Scanner(System.in);
    				System.out.println("Enter the year to find: ");
    				int yearToFind = scanner.nextInt();
    				System.out.println(market.findByYear(yearToFind).toString());
    				break;
    			}
    			
    			case 4: {
    				System.out.println(market.sortByYear().toString());
    				break;
    			}
    			case 5: {
    				System.out.println(market.sortByEngine().toString());
    				break;
    			}
    			case 6: default: {
    				menu = false;
    				System.out.println("Exit program...");
    				break;
    			}
    		}
    		

    	}
    	}

}
