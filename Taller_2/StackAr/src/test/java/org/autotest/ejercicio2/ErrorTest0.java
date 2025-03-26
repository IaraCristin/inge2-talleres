package org.autotest.ejercicio2;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        stackAr1.push((Object) (-1L));
        Object obj4 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        String str2 = stackAr1.toString();
        stackAr1.push((Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean12 = stackAr10.equals((Object) (-1.0f));
        boolean boolean14 = stackAr10.equals((Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        stackAr10.push((Object) stackAr15);
        boolean boolean18 = stackAr6.equals((Object) stackAr10);
        int int19 = stackAr10.size();
        Object obj20 = stackAr10.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr10", stackAr10.repOK());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr();
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        Class<?> wildcardClass8 = stackAr6.getClass();
        stackAr1.push((Object) wildcardClass8);
        boolean boolean10 = stackAr0.equals((Object) stackAr1);
        Object obj11 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        String str2 = stackAr1.toString();
        stackAr1.push((Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((Object) stackAr6);
        stackAr6.push((Object) 1.0f);
        Object obj11 = stackAr6.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        String str2 = stackAr1.toString();
        stackAr1.push((Object) 0.0f);
        boolean boolean6 = stackAr1.equals((Object) (byte) -1);
        Object obj7 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        String str2 = stackAr1.toString();
        stackAr1.push((Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        int int11 = stackAr10.size();
        Class<?> wildcardClass12 = stackAr10.getClass();
        stackAr6.push((Object) stackAr10);
        int int14 = stackAr6.size();
        Object obj15 = stackAr6.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr6", stackAr6.repOK());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((Object) wildcardClass7);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isEmpty();
        Class<?> wildcardClass12 = stackAr10.getClass();
        boolean boolean13 = stackAr0.equals((Object) wildcardClass12);
        Object obj14 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((Object) "");
        boolean boolean13 = stackAr0.equals((Object) "");
        stackAr0.push((Object) (byte) 0);
        Object obj16 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) 'a');
        boolean boolean5 = stackAr3.equals((Object) (-1.0f));
        boolean boolean6 = stackAr3.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr7.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isFull();
        Class<?> wildcardClass14 = stackAr12.getClass();
        stackAr7.push((Object) wildcardClass14);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean18 = stackAr17.isEmpty();
        boolean boolean19 = stackAr17.isEmpty();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        Class<?> wildcardClass21 = stackAr20.getClass();
        boolean boolean22 = stackAr17.equals((Object) stackAr20);
        Class<?> wildcardClass23 = stackAr20.getClass();
        stackAr7.push((Object) wildcardClass23);
        stackAr3.push((Object) stackAr7);
        stackAr1.push((Object) stackAr7);
        Object obj27 = stackAr7.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr7", stackAr7.repOK());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        String str6 = stackAr5.toString();
        stackAr5.push((Object) 0.0f);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        String str11 = stackAr10.toString();
        boolean boolean12 = stackAr5.equals((Object) stackAr10);
        stackAr10.push((Object) 1.0f);
        boolean boolean15 = stackAr1.equals((Object) stackAr10);
        Object obj16 = stackAr10.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr10", stackAr10.repOK());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 1);
        stackAr1.push((Object) (short) 1);
        Object obj5 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        boolean boolean3 = stackAr2.isFull();
        int int4 = stackAr2.size();
        boolean boolean5 = stackAr2.isEmpty();
        stackAr1.push((Object) stackAr2);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean9 = stackAr8.isEmpty();
        boolean boolean10 = stackAr8.isFull();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        boolean boolean12 = stackAr11.isFull();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean15 = stackAr14.isEmpty();
        boolean boolean16 = stackAr14.isFull();
        boolean boolean17 = stackAr11.equals((Object) boolean16);
        boolean boolean18 = stackAr8.equals((Object) stackAr11);
        int int19 = stackAr11.size();
        stackAr1.push((Object) int19);
        Object obj21 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        boolean boolean8 = stackAr5.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        boolean boolean11 = stackAr5.equals((Object) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr13.equals((Object) (-1.0f));
        boolean boolean17 = stackAr13.equals((Object) "");
        boolean boolean18 = stackAr5.equals((Object) "");
        boolean boolean19 = stackAr5.isFull();
        stackAr1.push((Object) stackAr5);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        int int22 = stackAr21.size();
        int int23 = stackAr21.size();
        stackAr5.push((Object) int23);
        Object obj25 = stackAr5.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr5", stackAr5.repOK());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((Object) (byte) 0);
        Object obj6 = new Object();
        boolean boolean7 = stackAr1.equals(obj6);
        Object obj8 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((Object) (byte) 0);
        Object obj6 = new Object();
        boolean boolean7 = stackAr1.equals(obj6);
        String str8 = stackAr1.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isEmpty();
        boolean boolean14 = stackAr12.isFull();
        boolean boolean15 = stackAr9.equals((Object) boolean14);
        boolean boolean16 = stackAr9.isFull();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        boolean boolean18 = stackAr17.isFull();
        boolean boolean20 = stackAr17.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        boolean boolean23 = stackAr17.equals((Object) '4');
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) 'a');
        boolean boolean27 = stackAr25.equals((Object) (-1.0f));
        boolean boolean29 = stackAr25.equals((Object) "");
        boolean boolean30 = stackAr17.equals((Object) "");
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean33 = stackAr32.isEmpty();
        boolean boolean34 = stackAr32.isEmpty();
        stackAr17.push((Object) stackAr32);
        stackAr17.push((Object) 1.0f);
        boolean boolean38 = stackAr9.equals((Object) stackAr17);
        stackAr1.push((Object) stackAr17);
        Object obj40 = stackAr17.top();
        Object obj41 = stackAr17.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr17", stackAr17.repOK());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((Object) (byte) 0);
        int int6 = stackAr1.size();
        Object obj7 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((Object) "");
        boolean boolean13 = stackAr0.equals((Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr15.isEmpty();
        stackAr0.push((Object) stackAr15);
        boolean boolean19 = stackAr15.isFull();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        boolean boolean21 = stackAr20.isFull();
        boolean boolean23 = stackAr20.equals((Object) (byte) -1);
        String str24 = stackAr20.toString();
        int int25 = stackAr20.size();
        boolean boolean26 = stackAr15.equals((Object) stackAr20);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
        boolean boolean28 = stackAr27.isFull();
        boolean boolean30 = stackAr27.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        boolean boolean33 = stackAr27.equals((Object) '4');
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) 'a');
        boolean boolean37 = stackAr35.equals((Object) (-1.0f));
        boolean boolean39 = stackAr35.equals((Object) "");
        boolean boolean40 = stackAr27.equals((Object) "");
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean43 = stackAr42.isEmpty();
        boolean boolean44 = stackAr42.isEmpty();
        stackAr27.push((Object) stackAr42);
        boolean boolean46 = stackAr42.isFull();
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
        boolean boolean48 = stackAr47.isFull();
        boolean boolean50 = stackAr47.equals((Object) (byte) -1);
        String str51 = stackAr47.toString();
        int int52 = stackAr47.size();
        boolean boolean53 = stackAr42.equals((Object) stackAr47);
        stackAr20.push((Object) stackAr47);
        Object obj55 = stackAr20.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr20", stackAr20.repOK());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        String str2 = stackAr1.toString();
        stackAr1.push((Object) 0.0f);
        boolean boolean5 = stackAr1.isFull();
        Object obj6 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((Object) wildcardClass7);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isEmpty();
        Class<?> wildcardClass12 = stackAr10.getClass();
        boolean boolean13 = stackAr0.equals((Object) wildcardClass12);
        boolean boolean14 = stackAr0.isFull();
        Object obj15 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isEmpty();
        stackAr4.push((Object) stackAr5);
        boolean boolean10 = stackAr1.equals((Object) stackAr5);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        int int13 = stackAr12.size();
        int int14 = stackAr12.size();
        boolean boolean15 = stackAr12.isFull();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) ' ');
        stackAr12.push((Object) ' ');
        boolean boolean19 = stackAr5.equals((Object) stackAr12);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) '4');
        int int22 = stackAr21.size();
        boolean boolean23 = stackAr21.isEmpty();
        stackAr21.push((Object) (byte) 0);
        String str26 = stackAr21.toString();
        stackAr5.push((Object) stackAr21);
        Object obj28 = stackAr21.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr21", stackAr21.repOK());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) (short) 0);
        stackAr0.push((Object) (short) 0);
        boolean boolean6 = stackAr0.isEmpty();
        Object obj7 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) 'a');
        boolean boolean5 = stackAr3.equals((Object) (-1.0f));
        boolean boolean6 = stackAr3.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr7.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isFull();
        Class<?> wildcardClass14 = stackAr12.getClass();
        stackAr7.push((Object) wildcardClass14);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean18 = stackAr17.isEmpty();
        boolean boolean19 = stackAr17.isEmpty();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        Class<?> wildcardClass21 = stackAr20.getClass();
        boolean boolean22 = stackAr17.equals((Object) stackAr20);
        Class<?> wildcardClass23 = stackAr20.getClass();
        stackAr7.push((Object) wildcardClass23);
        stackAr3.push((Object) stackAr7);
        stackAr1.push((Object) stackAr7);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        boolean boolean29 = stackAr28.isFull();
        Class<?> wildcardClass30 = stackAr28.getClass();
        boolean boolean31 = stackAr1.equals((Object) wildcardClass30);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean34 = stackAr33.isFull();
        boolean boolean35 = stackAr33.isEmpty();
        String str36 = stackAr33.toString();
        int int37 = stackAr33.size();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
        boolean boolean39 = stackAr38.isFull();
        int int40 = stackAr38.size();
        boolean boolean41 = stackAr38.isEmpty();
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean44 = stackAr43.isFull();
        Class<?> wildcardClass45 = stackAr43.getClass();
        stackAr38.push((Object) wildcardClass45);
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean49 = stackAr48.isEmpty();
        Class<?> wildcardClass50 = stackAr48.getClass();
        boolean boolean51 = stackAr38.equals((Object) wildcardClass50);
        boolean boolean52 = stackAr38.isFull();
        boolean boolean53 = stackAr38.isEmpty();
        boolean boolean54 = stackAr33.equals((Object) stackAr38);
        Class<?> wildcardClass55 = stackAr38.getClass();
        boolean boolean56 = stackAr1.equals((Object) stackAr38);
        Object obj57 = stackAr38.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr38", stackAr38.repOK());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((Object) wildcardClass7);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isEmpty();
        Class<?> wildcardClass12 = stackAr10.getClass();
        boolean boolean13 = stackAr0.equals((Object) wildcardClass12);
        String str14 = stackAr0.toString();
        Object obj15 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr();
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        Class<?> wildcardClass8 = stackAr6.getClass();
        stackAr1.push((Object) wildcardClass8);
        boolean boolean10 = stackAr0.equals((Object) stackAr1);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isEmpty();
        boolean boolean14 = stackAr12.isEmpty();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        Class<?> wildcardClass16 = stackAr15.getClass();
        boolean boolean17 = stackAr12.equals((Object) stackAr15);
        Class<?> wildcardClass18 = stackAr15.getClass();
        stackAr0.push((Object) wildcardClass18);
        Object obj20 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        boolean boolean8 = stackAr5.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        boolean boolean11 = stackAr5.equals((Object) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr13.equals((Object) (-1.0f));
        boolean boolean17 = stackAr13.equals((Object) "");
        boolean boolean18 = stackAr5.equals((Object) "");
        boolean boolean19 = stackAr5.isFull();
        stackAr1.push((Object) stackAr5);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        int int22 = stackAr21.size();
        int int23 = stackAr21.size();
        stackAr5.push((Object) int23);
        boolean boolean25 = stackAr5.isFull();
        Object obj26 = stackAr5.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr5", stackAr5.repOK());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((Object) "");
        stackAr1.push((Object) (-1.0d));
        Object obj8 = stackAr1.top();
        Object obj9 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((Object) (byte) 0);
        Object obj6 = new Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        Object obj10 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        String str2 = stackAr1.toString();
        stackAr1.push((Object) 0.0f);
        boolean boolean5 = stackAr1.isFull();
        int int6 = stackAr1.size();
        Object obj7 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isFull();
        stackAr0.push((Object) 10L);
        stackAr0.push((Object) ' ');
        Object obj8 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((Object) (-1.0f));
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isEmpty();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isFull();
        Class<?> wildcardClass12 = stackAr10.getClass();
        stackAr5.push((Object) wildcardClass12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr15.isEmpty();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        Class<?> wildcardClass19 = stackAr18.getClass();
        boolean boolean20 = stackAr15.equals((Object) stackAr18);
        Class<?> wildcardClass21 = stackAr18.getClass();
        stackAr5.push((Object) wildcardClass21);
        stackAr1.push((Object) stackAr5);
        Object obj24 = stackAr5.top();
        Object obj25 = stackAr5.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr5", stackAr5.repOK());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        stackAr1.push((Object) (-1L));
        boolean boolean4 = stackAr1.isEmpty();
        String str5 = stackAr1.toString();
        Object obj6 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 1);
        stackAr1.push((Object) (short) 1);
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        Object obj7 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((Object) 'a');
        Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        Object obj6 = stackAr1.top();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        String str9 = stackAr8.toString();
        stackAr8.push((Object) 0.0f);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        String str14 = stackAr13.toString();
        boolean boolean15 = stackAr8.equals((Object) stackAr13);
        boolean boolean16 = stackAr1.equals((Object) stackAr8);
        Object obj17 = stackAr8.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr8", stackAr8.repOK());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        String str6 = stackAr5.toString();
        stackAr5.push((Object) (short) 10);
        stackAr1.push((Object) stackAr5);
        Object obj10 = stackAr1.top();
        boolean boolean11 = stackAr1.isFull();
        Object obj12 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) 'a');
        boolean boolean5 = stackAr3.equals((Object) (-1.0f));
        boolean boolean6 = stackAr3.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr7.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isFull();
        Class<?> wildcardClass14 = stackAr12.getClass();
        stackAr7.push((Object) wildcardClass14);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean18 = stackAr17.isEmpty();
        boolean boolean19 = stackAr17.isEmpty();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        Class<?> wildcardClass21 = stackAr20.getClass();
        boolean boolean22 = stackAr17.equals((Object) stackAr20);
        Class<?> wildcardClass23 = stackAr20.getClass();
        stackAr7.push((Object) wildcardClass23);
        stackAr3.push((Object) stackAr7);
        stackAr1.push((Object) stackAr7);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
        boolean boolean28 = stackAr27.isFull();
        int int29 = stackAr27.size();
        boolean boolean30 = stackAr27.isFull();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        boolean boolean32 = stackAr31.isFull();
        boolean boolean34 = stackAr31.equals((Object) (byte) -1);
        String str35 = stackAr31.toString();
        boolean boolean37 = stackAr31.equals((Object) 10L);
        boolean boolean38 = stackAr31.isEmpty();
        boolean boolean39 = stackAr31.isEmpty();
        boolean boolean40 = stackAr31.isEmpty();
        stackAr27.push((Object) boolean40);
        boolean boolean42 = stackAr7.equals((Object) boolean40);
        Object obj43 = stackAr7.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr7", stackAr7.repOK());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((Object) (byte) 0);
        Object obj6 = new Object();
        boolean boolean7 = stackAr1.equals(obj6);
        int int8 = stackAr1.size();
        Object obj9 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) ' ');
        stackAr1.push((Object) ' ');
        String str8 = stackAr1.toString();
        Object obj9 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((Object) 'a');
        Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        Object obj6 = stackAr1.top();
        Object obj7 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((Object) (-1.0f));
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isEmpty();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isFull();
        Class<?> wildcardClass12 = stackAr10.getClass();
        stackAr5.push((Object) wildcardClass12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr15.isEmpty();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        Class<?> wildcardClass19 = stackAr18.getClass();
        boolean boolean20 = stackAr15.equals((Object) stackAr18);
        Class<?> wildcardClass21 = stackAr18.getClass();
        stackAr5.push((Object) wildcardClass21);
        stackAr1.push((Object) stackAr5);
        Object obj24 = stackAr5.top();
        String str25 = stackAr5.toString();
        boolean boolean26 = stackAr5.isFull();
        Object obj27 = stackAr5.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr5", stackAr5.repOK());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        String str2 = stackAr1.toString();
        String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean7 = stackAr1.equals((Object) ' ');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isEmpty();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean15 = stackAr14.isFull();
        Class<?> wildcardClass16 = stackAr14.getClass();
        stackAr9.push((Object) wildcardClass16);
        boolean boolean18 = stackAr8.equals((Object) stackAr9);
        int int19 = stackAr8.size();
        stackAr1.push((Object) stackAr8);
        Object obj21 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) 'a');
        String str7 = stackAr6.toString();
        stackAr6.push((Object) 0.0f);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        String str12 = stackAr11.toString();
        boolean boolean13 = stackAr6.equals((Object) stackAr11);
        stackAr1.push((Object) boolean13);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) (short) 1);
        stackAr16.push((Object) (short) 1);
        int int20 = stackAr16.size();
        boolean boolean21 = stackAr1.equals((Object) int20);
        String str22 = stackAr1.toString();
        Object obj23 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((Object) wildcardClass7);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        int int10 = stackAr9.size();
        String str11 = stackAr9.toString();
        stackAr0.push((Object) stackAr9);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        stackAr14.push((Object) (-1L));
        boolean boolean17 = stackAr14.isEmpty();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        boolean boolean19 = stackAr18.isFull();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean22 = stackAr21.isEmpty();
        boolean boolean23 = stackAr21.isFull();
        boolean boolean24 = stackAr18.equals((Object) boolean23);
        boolean boolean25 = stackAr18.isFull();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        boolean boolean29 = stackAr26.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        boolean boolean32 = stackAr26.equals((Object) '4');
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) 'a');
        boolean boolean36 = stackAr34.equals((Object) (-1.0f));
        boolean boolean38 = stackAr34.equals((Object) "");
        boolean boolean39 = stackAr26.equals((Object) "");
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean42 = stackAr41.isEmpty();
        boolean boolean43 = stackAr41.isEmpty();
        stackAr26.push((Object) stackAr41);
        stackAr26.push((Object) 1.0f);
        boolean boolean47 = stackAr18.equals((Object) stackAr26);
        boolean boolean48 = stackAr18.isEmpty();
        stackAr14.push((Object) stackAr18);
        stackAr9.push((Object) stackAr18);
        String str51 = stackAr9.toString();
        Object obj52 = stackAr9.top();
        Object obj53 = stackAr9.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr9", stackAr9.repOK());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        String str2 = stackAr1.toString();
        stackAr1.push((Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        boolean boolean8 = stackAr6.isEmpty();
        stackAr1.push((Object) boolean8);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        int int12 = stackAr11.size();
        String str13 = stackAr11.toString();
        int int14 = stackAr11.size();
        boolean boolean15 = stackAr11.isEmpty();
        String str16 = stackAr11.toString();
        boolean boolean17 = stackAr11.isFull();
        boolean boolean18 = stackAr1.equals((Object) boolean17);
        Object obj19 = stackAr1.top();
        Object obj20 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((Object) (-1.0f));
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isEmpty();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isFull();
        Class<?> wildcardClass12 = stackAr10.getClass();
        stackAr5.push((Object) wildcardClass12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr15.isEmpty();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        Class<?> wildcardClass19 = stackAr18.getClass();
        boolean boolean20 = stackAr15.equals((Object) stackAr18);
        Class<?> wildcardClass21 = stackAr18.getClass();
        stackAr5.push((Object) wildcardClass21);
        stackAr1.push((Object) stackAr5);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean26 = stackAr25.isFull();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean29 = stackAr28.isFull();
        boolean boolean30 = stackAr25.equals((Object) stackAr28);
        int int31 = stackAr28.size();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) 'a');
        String str34 = stackAr33.toString();
        stackAr33.push((Object) 0.0f);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean39 = stackAr38.isFull();
        boolean boolean40 = stackAr38.isEmpty();
        stackAr33.push((Object) boolean40);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) '4');
        int int44 = stackAr43.size();
        String str45 = stackAr43.toString();
        int int46 = stackAr43.size();
        boolean boolean47 = stackAr43.isEmpty();
        String str48 = stackAr43.toString();
        boolean boolean49 = stackAr43.isFull();
        boolean boolean50 = stackAr33.equals((Object) boolean49);
        stackAr28.push((Object) boolean49);
        boolean boolean52 = stackAr1.equals((Object) boolean49);
        Object obj53 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        String str5 = stackAr1.toString();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) 'a');
        boolean boolean9 = stackAr7.equals((Object) (-1.0f));
        int int10 = stackAr7.size();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        int int13 = stackAr12.size();
        int int14 = stackAr12.size();
        boolean boolean15 = stackAr12.isFull();
        boolean boolean16 = stackAr12.isEmpty();
        stackAr7.push((Object) boolean16);
        stackAr1.push((Object) stackAr7);
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '4');
        String str21 = stackAr20.toString();
        boolean boolean22 = stackAr20.isEmpty();
        boolean boolean23 = stackAr20.isFull();
        String str24 = stackAr20.toString();
        stackAr1.push((Object) str24);
        String str26 = stackAr1.toString();
        String str27 = stackAr1.toString();
        Object obj28 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((Object) (byte) 0);
        Object obj6 = new Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        String str9 = stackAr1.toString();
        Object obj10 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        String str2 = stackAr1.toString();
        String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean7 = stackAr1.equals((Object) ' ');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isEmpty();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean15 = stackAr14.isFull();
        Class<?> wildcardClass16 = stackAr14.getClass();
        stackAr9.push((Object) wildcardClass16);
        boolean boolean18 = stackAr8.equals((Object) stackAr9);
        int int19 = stackAr8.size();
        stackAr1.push((Object) stackAr8);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) (byte) 10);
        boolean boolean24 = stackAr22.equals((Object) 0.0d);
        boolean boolean25 = stackAr22.isEmpty();
        stackAr1.push((Object) boolean25);
        Object obj27 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((Object) wildcardClass7);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isEmpty();
        Class<?> wildcardClass12 = stackAr10.getClass();
        boolean boolean13 = stackAr0.equals((Object) wildcardClass12);
        boolean boolean14 = stackAr0.isFull();
        boolean boolean15 = stackAr0.isEmpty();
        Object obj16 = stackAr0.top();
        boolean boolean17 = stackAr0.isFull();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        boolean boolean19 = stackAr18.isFull();
        int int20 = stackAr18.size();
        boolean boolean21 = stackAr18.isEmpty();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isFull();
        Class<?> wildcardClass25 = stackAr23.getClass();
        stackAr18.push((Object) wildcardClass25);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean29 = stackAr28.isEmpty();
        Class<?> wildcardClass30 = stackAr28.getClass();
        boolean boolean31 = stackAr18.equals((Object) wildcardClass30);
        boolean boolean32 = stackAr18.isFull();
        boolean boolean33 = stackAr18.isEmpty();
        Object obj34 = stackAr18.top();
        stackAr0.push((Object) stackAr18);
        boolean boolean36 = stackAr0.isEmpty();
        Object obj37 = stackAr0.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr0", stackAr0.repOK());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) ' ');
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        int int5 = stackAr3.size();
        boolean boolean6 = stackAr3.isEmpty();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean9 = stackAr8.isFull();
        Class<?> wildcardClass10 = stackAr8.getClass();
        stackAr3.push((Object) wildcardClass10);
        boolean boolean12 = stackAr2.equals((Object) stackAr3);
        Class<?> wildcardClass13 = stackAr2.getClass();
        stackAr1.push((Object) stackAr2);
        boolean boolean15 = stackAr1.isEmpty();
        Object obj16 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((Object) (byte) 0);
        String str6 = stackAr1.toString();
        boolean boolean7 = stackAr1.isEmpty();
        int int8 = stackAr1.size();
        int int9 = stackAr1.size();
        Object obj10 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }
}

