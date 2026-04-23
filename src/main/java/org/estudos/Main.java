package org.estudos;

public class Main {
    public static void main(String[] args) {

        Fila <String> minhaFila = new Fila <String> ();

        minhaFila.enqueue(new No("PRIMEIRO"));
        minhaFila.enqueue(new No("SEGUNDO"));
        minhaFila.enqueue(new No("TERCEIRO"));
        minhaFila.enqueue(new No("QUART0"));
        minhaFila.enqueue(new No("QUINTO"));
        minhaFila.enqueue(new No("SEXT0"));
        minhaFila.enqueue(new No("SETIMO"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue(new No("ultimo"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);
    }
}