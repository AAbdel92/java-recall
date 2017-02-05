package co.simplon.recall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PlayingWithNumber {
	protected float includingTaxe;
	protected float excludingtaxe;
	protected float vat;
	protected int[] sortTab;

	public static long addingTwoNumbers(long number1, long number2) {
		return number1 + number2;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		return number1 + number2 + number3;
	}

	public static long addingSeveralNumbers(final long... numbers) {
		long resultat = 0;
		for (final long nombre : numbers) {
			resultat += nombre;
		};
		return resultat;
		
	}

	public static int[] allElementsExceptFirstThree(int array[]) {
		int[] resultat = new int[array.length - 3];
				
		for (int i = 3; i <array.length; i++) {
			resultat[i - 3] = array[i];
		}
		return resultat;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		int[] resultat = new int[array.length + 1];
		resultat[0] = element;
		for (int i = 0; i < array.length; i++) {
			resultat[i + 1] = array[i];
		}
		return resultat;
		
	}

	public static Float makeNegative(Float number) {
		Float resultat = number;
		if (number > 0) {
			resultat = -number;
		}		
		return resultat;
	}

	public void calculateInvoiceAmount(float htAmount[], float tva) {
		for (int i = 0; i < htAmount.length; i ++) {
			this.excludingtaxe += htAmount[i];
			this.includingTaxe += htAmount[i] + (htAmount[i] * tva / 100);
			this.vat += htAmount[i] * tva / 100;
		}
		
		

	}

	public static String[] getElementsLowerThanSix(String[] array) {		
		//String[] resIntermediaire = new String[array.length];
		List<Integer> liste = new ArrayList<Integer>();
		
		for (String element : array) {
			if (Integer.parseInt(element) <= 6) {
				liste.add(Integer.parseInt(element));				
			}
			
		}
		liste.sort(null);
		//resIntermediaire[0] = liste.get(0).toString();
		for (int i = 1; i < liste.size(); i ++) {
			if (liste.get(i) == liste.get(i - 1)) {
				liste.remove(i);
			}
			
		}
		String[] resultat = new String[liste.size()];
		for (int i = 0; i < liste.size(); i ++) {			
				resultat[i] = liste.get(i).toString();			
			
		}
		
		return resultat;
		
	}

	public void sortTabBySelection() {		
			Arrays.sort(sortTab, 0, sortTab.length);
		

	}
	
	public static int[] sortTabByInsertion(int[] array) {
		int[] resultat;
		resultat = array.clone();
		Arrays.sort(resultat, 0, resultat.length);		
		return resultat;
	}

	public void sortTabByBubble() {

	}
	
	public static int findIndexByDichotomy(int elemet, int[] array) {
		return 0;
	}
	
	public static int roundUp(float number) {
		return 0;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		return 0;
	}

	public static int convertToCelsius(int temperature) {
		return 0;
	}
}
