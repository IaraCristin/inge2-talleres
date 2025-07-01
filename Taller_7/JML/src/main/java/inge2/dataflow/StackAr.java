package inge2.dataflow;

public class StackAr {

    /**
     * Capacidad por defecto de la pila.
     */
    //@ spec_public
    private final static int DEFAULT_CAPACITY = 10;

    /**
     * Arreglo que contiene los elementos de la pila.
     */
    //@ spec_public
    private final  int[] elems;

    /**
     * Indice del tope de la pila.
     */
    //@ spec_public
    private int top = -1;

    //Invariante de la clase
    //@ public invariant -1 <= top < elems.length;
    //@ public invariant elems != null;

    //@ public normal_behaviour
    //@     ensures this.top == -1;
    //@     ensures this.elems.length == this.DEFAULT_CAPACITY;
    public StackAr() {
        this(DEFAULT_CAPACITY);
    }

    //@ public normal_behaviour
    //@     requires capacity > 0;
    //@     ensures this.top == -1;
    //@     ensures this.elems.length == capacity;
    //@ public exceptional_behaviour
    //@     requires capacity <= 0;
    //@     signals_only IllegalArgumentException;
    public StackAr(int capacity) {
        if (capacity <= 0){
            throw new IllegalArgumentException();
        }
        this.elems = new int[capacity];
    }

    //@ ensures \result == ((this.top + 1) == 0);
    //@ pure
    public boolean isEmpty() {
        return size() == 0;
    }

    //Intentamos usando size() pero causaba problemas
    //@ ensures \result == ((this.top + 1) == this.elems.length);
    //@ pure
    public boolean isFull() {
        return size() == elems.length;
    }

    //@ requires this.top < Integer.MAX_VALUE;
    //@ ensures \result == (this.top + 1);
    //@ pure
    public int size() {
        return top + 1;
    }

    //@ public normal_behaviour
    //@     requires ((this.top + 1) < this.elems.length);
    //@     requires this.top > -1;
    //@     ensures this.top == (\old(this.top) + 1);
    //@     ensures this.elems[this.top] == o;
    //@     ensures (\forall int k; 0 <= k < \old(this.size()) ; this.elems[k] == \old(this.elems[k]));
    public void push(int o) {
        if ((this.top + 1) >= this.elems.length ){
            throw new IllegalStateException();
        }
        this.top++;
        this.elems[top] = o;
    }

    //@ public normal_behaviour
    //@     requires this.top >= 0;
    //@     ensures this.top == (\old(this.top) - 1);
    //@     ensures \result == \old(this.elems[\old(this.top)]);
    //@     ensures (\forall int k; 0 <= k < \old(this.size())-1 ; this.elems[k] == \old(this.elems[k]));
    public int pop() {
        if (this.top < 0){
            throw new IllegalStateException();
        }

        int rv = this.peek();
        top--;
        return rv;
    }


    //@ public normal_behaviour
    //@     requires this.top >= 0;
    //@     ensures \result == this.elems[this.top];
    //@     ensures (\forall int k; 0 <= k < \old(this.size()) ; this.elems[k] == \old(this.elems[k]));
    //@ pure
    public int peek() {
        if (this.top < 0){
            throw new IllegalStateException();
        }

        return elems[top];
    }
}

