package org.lessons.java.array;

public class CibiPreferiti {

	public static void main(String[] args) {

		String[] favouriteFood = {"pizza", "carbonara", "pad thai", "sushi", "risotto", "pollo alla strogonoff", "tiramisù"};
		
		int favFoodLength = favouriteFood.length;
		
		System.out.println("In totale ci sono " + favFoodLength + " cibi in classifica");
		
		System.out.println("Il primo in classifica è: " + favouriteFood[0]);

		System.out.println("L'ultimo in classifica è: " + favouriteFood[favFoodLength - 1]);
		
		if (favFoodLength % 2 != 0) {
			System.out.println("A metà classifica troviamo: " + favouriteFood[favFoodLength / 2]);
		} else {
			System.out.println("A metà classifica troviamo: " + favouriteFood[favFoodLength / 2 - 1] + " e " + favouriteFood[favFoodLength / 2]);
		}

	}

}
