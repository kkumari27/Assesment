package com.assesment;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Sales {
	

	    private ArrayList<Stock>StockList;
	    private Scanner sc = new Scanner(System.in);

	    public Sales() {
	        System.out.println("New Shop for Items created.");
	        StockList = new ArrayList<Stock>();
	    }

	    public int getSize() {
	        return StockList.size();

	    }

	    private Stock search(int code) {
	        Iterator<Stock> itr = StockList.iterator();
	        Stock item=null;
	        while (itr.hasNext()) {
	            item = new Stock(item);
	            if (item.getCodeofitem() == code) {
	                return item;
	            }
	        }
	        return null;
	    }

	    public Stock search(String name) {
	        Iterator<Stock> itr = StockList.iterator();
	        Stock item = null;
	        while (itr.hasNext()) {
	            item = new Stock(item);
	            if (item.getStockname()== name) {
	                return item;
	            }
	        }
	        return null;
		    }

		    public void addItem() {
		        long aCode;
		        String aName;
		        double aRate;
		        int aQuantity;
		        Stock foundItem;

		        System.out.println("Enter Item code:");
		        aCode = sc.nextInt();
		        foundItem = search((int) aCode);
		        if (foundItem == null) {
		            System.out.println("Item name : ");
		            aName = sc.next();
		            System.out.println("Rate : ");
		            aRate = sc.nextDouble();
		            System.out.println("Quantity : ");
		            aQuantity = sc.nextInt();
		            Stock aStock = new Stock( aName, aRate, aQuantity, aQuantity);
		            StockList.add(aStock);
		        } else if (foundItem != null) {
		            System.out.println("Item exists");
		        }

		    }

		    public void updateStock() {
		        int choice, quantity;
		        int code;
		        double price;
		        Stock foundItem;

		        System.out.println("1. Update quantity.");
		        System.out.println("2. Update rate.");
		        System.out.println("Choice:");
		        choice = sc.nextInt();

		        System.out.println("Enter Item code:");
		        code = sc.nextInt();
		        foundItem = search(code);
		        if (foundItem == null) {
		            System.out.println("Item not found");
		            return;
		        }

		        if (choice == 1) {

		            System.out.println("Enter quantity to add: ");
		            quantity = sc.nextInt();
		            foundItem.setQuantity(foundItem.getQuantity() + quantity);
		            System.out.println("\n Quantity updated\n");
		            System.out.println("Present quantity: " + foundItem.getQuantity());
		        }

		        else if (choice == 2) {

		            System.out.println("Enter new price: ");
		            price = sc.nextDouble();
		            ((Stock) foundItem).setRateofItem(price);
		            System.out.println("\n Price updated\n");
		            System.out.println("Present Price: " + foundItem.getRateofItem());
		        }

		        else {
		            System.out.println("Wrong choice!!");
		            updateStock();
		        }

		    }

		    public void display() {

		        int code;
		        Stock foundItem;

		        System.out.println("Enter Item code:");
		        code = sc.nextInt();
		        foundItem = search(code);
		        if (foundItem == null) {
		            System.out.println("Item not found");
		            return;
		        }

		        System.out.println(foundItem.toString());
		    }

		    public void issueItem() {
		        int numberOfItem;
		        int code;
		        Stock foundItem;

		        System.out.println("Enter Item code:");
		        code = sc.nextInt();
		        foundItem = search(code);
		        if (foundItem == null) {
		            System.out.println("Item not found");
		            return;
		        }

		        System.out.println("Number of Item : ");
		        numberOfItem = sc.nextInt();
		        if (numberOfItem > foundItem.getQuantity()) {
		            System.out.println("\nRequired number of Items not in stock\n\n");
		            return;
		        }

		        else {
		            System.out.println("\nCost of " + numberOfItem + " copies : rs. "
		                    + numberOfItem * foundItem.getRateofItem());
		            foundItem.setQuantity(foundItem.getQuantity() - numberOfItem);
		        }
		    }

		    public double checkPrice(int code) {
		        Stock foundItem = search(code);
		        if (foundItem == null) {
		            System.out.println("Item not found");
		            return 0;
		        }

		        else
		            return foundItem.getRateofItem();
		    
		
		    }
}

			   
		   