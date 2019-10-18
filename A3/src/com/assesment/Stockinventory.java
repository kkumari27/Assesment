package com.assesment;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Stockinventory {
	
		public static void main(String args[]) {

	       
	        char choice;
	         Sales aSales = new Sales();
	        Scanner sc = new Scanner(System.in);

	        System.out.println("-----ITEM------");
	        do {
	            System.out.println("1. Add items");
	            System.out.println("2. Change item details");
	            System.out.println("3. Update the item details");
	            System.out.println("4. Display item details");
	            System.out.println("5. Print price for a item");
	            System.out.println("6. Exit");
	            System.out.println("Choice:");
	            choice = sc.nextLine().charAt(0);
	            switch (choice) {
	            case '1':
	                aSales.addItem();
	                break;

	            case '2':
	                aSales.updateStock();
	                break;

	            case '3':
	                aSales.issueItem();
	                break;

	            case '4':
	                aSales.display();
	                break;

	            case '5':

	                System.out.println("Price of the Item is:"
	                        + aSales.checkPrice((int) inputCode()));

	            case '6':
	                System.out.println("Thank you!\n");
	                break;
	            }
	        } while (choice != '6');
	        sc.close();
	    }


	    public static long inputCode() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Item code:");
	        if (sc.hasNextLong()) {
	            return sc.nextLong();
	        } else {
	            System.out.println("Invalid Input");
	            return 0;
	        }
	    }
	    }

