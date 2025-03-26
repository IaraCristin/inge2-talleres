package org.autotest.ejercicio3;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import java.util.Arrays;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Ejercicio3 {

    public static boolean debug = false;

    @Test
    public void testPopReturnPushedElement() throws Throwable {
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr();
        stackAr1.push(1);
        org.junit.Assert.assertEquals(1, stackAr1.pop());
    }

    @Test
    public void testHashCode() throws Throwable {
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(1);
        org.junit.Assert.assertEquals(calcHashCode(new Object[1], 0), stackAr1.hashCode());
    }

    int calcHashCode(Object[] array, int elems) {
        return 31*(31+ Arrays.hashCode(array)) + elems-1;
    }

    @Test
    public void testEqualsItself() throws Throwable {
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(1);
        org.junit.Assert.assertEquals(stackAr1.equals(stackAr1), true);
    }
}
