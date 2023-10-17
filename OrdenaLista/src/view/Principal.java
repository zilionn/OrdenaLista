package view;

import java.util.LinkedList;
import java.util.List;
import Controller.ControllerOrdena;

public class Principal {

	public static void main(String[] args) {
			ControllerOrdena contOrd = new ControllerOrdena();
			List<Integer> lista = new LinkedList<>();
	        	lista.add(10);
	        	lista.add(5);
	        	lista.add(8);
	        	lista.add(1);
	        	lista.add(9);
	        	lista.add(2);
	        	lista.add(4);
	        	lista.add(7);
	        	lista.add(3);
	        	lista.add(6);
	 
	        System.out.println("Lista original: " + lista);
	        System.out.println("Lista ordenada: " + contOrd.mergeSort(lista, 0, lista.size() - 1));
	    }
	 

	}


