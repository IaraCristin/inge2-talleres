package inge2.dataflow;

public class BusquedaLineal {

    // Busca un elemento en un arreglo de enteros.
    //
    /*
    *Primero verificamos que el array no sea nulo, pues si es vacío sí vale (siempre da falso), pero si es nulo no se puede analizar.
    *En el caso de elem, por ser de tipo primitivo, no tiene valor null, por lo tanto no hace falta verificar
    *
    * Luego para la post condición decimos que el resultado es igual a la existencia de un k tal que arr[k] == elem.
    */
    //@ requires arr != null;
    //@ ensures \result == (\exists int k; 0 <= k < arr.length; arr[k] == elem);
    public static boolean busquedaLineal(int elem, int[] arr) {
        boolean result = false;

        //@ loop_writes result;
        //@ loop_invariant 0 <= i <= arr.length;
        //@ loop_invariant result == (\exists int k; 0 <= k < i; arr[k] == elem);
        //@ loop_decreases arr.length - i;

        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                result = true;
            }
        }

        return result;
    }
}