/*Scrivere una funzione che restituisca un hashset riempito
Leggere l'hashSet e stampre grandezza ed elementi*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("HashSet contiene: " + hashSet());
        System.out.println("Grandezza dell'HashSet è: " + hashSet().size());

        for (Integer element : hashSet()) {
            System.out.print("Elemento:" + element);
        }

    }

    public static Set<Integer> hashSet() {
        Set<Integer> lista = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 3, 5));
        return lista;
    }
}