package org.junit.jupiter.junit_jupiter_api;
public class Main {
	
	/**
	 * Diese Kommandozeilen-Applikation nimmt über die Standard-Eingabe drei Integer-Zahlen entgegen. Jede Zahl wird dabei
	 * als Seitenlänge eines Dreiecks verstanden. Das Programm gibt anschließend auf der Standardausgabe aus, ob das Dreieck
	 * mit diesen drei Seitenlängen gleichschenklig, gleichseitig oder ungleichseitig ist.
	 */
	    public void trian(int a ,int b,int c){
	   
	        // Die eigentliche Überprüfung und die Ausgabe
	        if (a == b && b == c) {
	            System.out.println("gleichseitig");
	        } else if (a == b || b == c || a == c) {
	            System.out.println("gleichschenklig");
	        } else {
	            System.out.println("ungleichseitig");
	        }
	    }
	}


