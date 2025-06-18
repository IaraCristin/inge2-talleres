package inge2.dataflow;

public class MapSumaUno {

    // Suma uno a todos los elementos de un array.
    //
    /*
     *Primero verificamos que el array no sea nulo. Luego, si no lo es, verificamos que ninguno de sus elementos sea el valor máximo de enteros para que no dé error por overflow
     *
     * Luego para la post condición verificamos que cada uno de los elementos sean específicamente +1 del valor anterior.
     */
    //@ requires arr != null;
    //@ requires \forall int k; 0 <= k < arr.length; arr[k] < Integer.MAX_VALUE;
    //@ ensures \forall int k; 0 <= k < arr.length; arr[k] == (\old(arr[k]) + 1);
    public static void mapSumaUno(int[] arr) {

        //@ loop_writes i,arr[*];
        //@ loop_invariant 0 <= i <= arr.length;
        //Nos fijamos que para todos los valores del array hasta el que estamos viendo actualmente se le haya sumado 1
        //Pero también debemos asegurar que el resto de elementos se mantienen iguales
        //@ loop_invariant \forall int j; 0<= j < i; arr[j] == (\old(arr[j]) + 1);
        //@ loop_invariant \forall int j; i<= j < arr.length; arr[j] == \old(arr[j]);
        //@ loop_decreases arr.length - i;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
}