package Controller;

import java.util.LinkedList;
import java.util.List;

public class ControllerOrdena {

	public ControllerOrdena() {
		super();
	}

	public List <Integer> mergeSort(List<Integer> lista, int ini, int fim) {
        if (ini < fim) {
            int meio = (ini + fim) / 2;
            mergeSort(lista, ini, meio);
            mergeSort(lista, meio + 1, fim);
            merge(lista, ini, meio, fim);
        }
        return lista;
    }
 
    private static void merge(List<Integer> lista, int ini, int meio, int fim) {
        int x = meio - ini + 1;
        int y = fim - meio;
 
        List<Integer> esq = new LinkedList<>();
        List<Integer> dir = new LinkedList<>();
 
        for (int i = 0; i < x; ++i) {
            esq.add(lista.get(ini + i));
        }
        for (int j = 0; j < y; ++j) {
            dir.add(lista.get(meio + 1 + j));
        }
 
        int i = 0, j = 0;
        int k = ini;
        while (i < x && j < y) {
            if (esq.get(i) <= dir.get(j)) {
                lista.set(k, esq.get(i));
                i++;
            } else {
                lista.set(k, dir.get(j));
                j++;
            }
            k++;
        }
 
        while (i < x) {
            lista.set(k, esq.get(i));
            i++;
            k++;
        }
 
        while (j < y) {
            lista.set(k, dir.get(j));
            j++;
            k++;
        }
    }
}

