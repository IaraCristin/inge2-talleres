package inge2.dataflow;

public class Absoluto {

    // Calcula el valor absoluto de un número entero.
    // Si el número es negativo, devuelve el opuesto.
    //
    //Primero pedimos que el valor de n no sea el mínimo entero posible porque obtendríamos una falla que resulta en overflow
    //@ requires n > Integer.MIN_VALUE;
    //@ ensures (n >= 0) ==> (\result == n);
    //@ ensures (n < 0) ==> (\result == -n);
    //@ ensures \result >= 0;
    public static int valorAbsoluto(int n) {
        if (n < 0) {
            return -n;
        } else {
            return n;
        }
    }
}