package org.estudos;

public class Main {
    public static void main(String[] args) {

        Fila <String> minhaFila = new Fila<> ();

        minhaFila.enqueue("PRIMEIRO");
        minhaFila.enqueue("SEGUNDO");
        minhaFila.enqueue("TERCEIRO");
        minhaFila.enqueue("QUART0");
        minhaFila.enqueue("QUINTO");
        minhaFila.enqueue("SEXT0");
        minhaFila.enqueue("SETIMO");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);
    }
}