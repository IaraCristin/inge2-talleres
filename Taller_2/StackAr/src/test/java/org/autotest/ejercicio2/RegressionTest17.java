package org.autotest.ejercicio2;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0851");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean5 = stackAr4.isFull();
        boolean boolean6 = stackAr1.equals((Object) stackAr4);
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        stackAr9.push((Object) (-1L));
        boolean boolean12 = stackAr9.isEmpty();
        String str13 = stackAr9.toString();
        boolean boolean14 = stackAr1.equals((Object) stackAr9);
        boolean boolean15 = stackAr9.isEmpty();
        Object obj16 = stackAr9.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[-1]" + "'", str13, "[-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1L) + "'", obj16, (-1L));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0852");
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
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) 'a');
        String str23 = stackAr22.toString();
        stackAr22.push((Object) 0.0f);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        String str28 = stackAr27.toString();
        boolean boolean29 = stackAr22.equals((Object) stackAr27);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        int int32 = stackAr31.size();
        Class<?> wildcardClass33 = stackAr31.getClass();
        stackAr27.push((Object) stackAr31);
        int int35 = stackAr27.size();
        boolean boolean36 = stackAr27.isEmpty();
        int int37 = stackAr27.size();
        stackAr1.push((Object) int37);
        boolean boolean39 = stackAr1.isFull();
        boolean boolean40 = stackAr1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0853");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean8 = stackAr7.isFull();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean11 = stackAr10.isFull();
        boolean boolean12 = stackAr7.equals((Object) stackAr10);
        Class<?> wildcardClass13 = stackAr10.getClass();
        boolean boolean14 = stackAr1.equals((Object) wildcardClass13);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        int int17 = stackAr16.size();
        int int18 = stackAr16.size();
        boolean boolean19 = stackAr16.isFull();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        boolean boolean21 = stackAr20.isFull();
        boolean boolean23 = stackAr20.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        boolean boolean26 = stackAr20.equals((Object) '4');
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        boolean boolean30 = stackAr28.equals((Object) (-1.0f));
        boolean boolean32 = stackAr28.equals((Object) "");
        boolean boolean33 = stackAr20.equals((Object) "");
        boolean boolean34 = stackAr20.isFull();
        stackAr16.push((Object) stackAr20);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr(0);
        boolean boolean38 = stackAr16.equals((Object) stackAr37);
        boolean boolean39 = stackAr1.equals((Object) stackAr37);
        boolean boolean40 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean43 = stackAr42.isFull();
        int int44 = stackAr42.size();
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) 'a');
        String str47 = stackAr46.toString();
        stackAr46.push((Object) 0.0f);
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) '4');
        String str52 = stackAr51.toString();
        boolean boolean53 = stackAr46.equals((Object) stackAr51);
        stackAr51.push((Object) 1.0f);
        boolean boolean56 = stackAr42.equals((Object) stackAr51);
        int int57 = stackAr42.size();
        boolean boolean58 = stackAr1.equals((Object) int57);
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr();
        boolean boolean60 = stackAr59.isFull();
        int int61 = stackAr59.size();
        boolean boolean62 = stackAr59.isEmpty();
        org.autotest.StackAr stackAr64 = new org.autotest.StackAr((int) '4');
        int int65 = stackAr64.size();
        int int66 = stackAr64.size();
        boolean boolean67 = stackAr64.isFull();
        org.autotest.StackAr stackAr68 = new org.autotest.StackAr();
        boolean boolean69 = stackAr68.isFull();
        boolean boolean71 = stackAr68.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr73 = new org.autotest.StackAr((int) '4');
        boolean boolean74 = stackAr68.equals((Object) '4');
        org.autotest.StackAr stackAr76 = new org.autotest.StackAr((int) 'a');
        boolean boolean78 = stackAr76.equals((Object) (-1.0f));
        boolean boolean80 = stackAr76.equals((Object) "");
        boolean boolean81 = stackAr68.equals((Object) "");
        boolean boolean82 = stackAr68.isFull();
        stackAr64.push((Object) stackAr68);
        org.autotest.StackAr stackAr84 = new org.autotest.StackAr();
        int int85 = stackAr84.size();
        int int86 = stackAr84.size();
        stackAr68.push((Object) int86);
        boolean boolean88 = stackAr59.equals((Object) int86);
        boolean boolean89 = stackAr1.equals((Object) boolean88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0854");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((Object) (-1.0f));
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        stackAr1.push((Object) "[0,[0]]");
        Object obj8 = null;
        stackAr1.push(obj8);
        Object obj10 = stackAr1.pop();
        int int11 = stackAr1.size();
        boolean boolean12 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0855");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 1);
        stackAr1.push((Object) (short) 1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) (short) 0);
        stackAr5.push((Object) (short) 0);
        String str11 = stackAr5.toString();
        boolean boolean12 = stackAr1.equals((Object) stackAr5);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) 'a');
        String str15 = stackAr14.toString();
        stackAr14.push((Object) 0.0f);
        boolean boolean18 = stackAr14.isFull();
        Object obj19 = stackAr14.top();
        boolean boolean20 = stackAr14.isFull();
        String str21 = stackAr14.toString();
        boolean boolean22 = stackAr1.equals((Object) stackAr14);
        int int23 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0]" + "'", str11, "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[0.0]" + "'", str21, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0856");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        String str2 = stackAr1.toString();
        stackAr1.push((Object) (short) 10);
        boolean boolean5 = stackAr1.isEmpty();
        Object obj6 = stackAr1.top();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0857");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) 'a');
        String str8 = stackAr7.toString();
        stackAr7.push((Object) 0.0f);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        String str13 = stackAr12.toString();
        boolean boolean14 = stackAr7.equals((Object) stackAr12);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        int int17 = stackAr16.size();
        Class<?> wildcardClass18 = stackAr16.getClass();
        stackAr12.push((Object) stackAr16);
        int int20 = stackAr12.size();
        boolean boolean21 = stackAr1.equals((Object) stackAr12);
        int int22 = stackAr1.size();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        String str25 = stackAr24.toString();
        String str26 = stackAr24.toString();
        int int27 = stackAr24.size();
        int int28 = stackAr24.size();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((Object) stackAr24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0858");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        String str3 = stackAr1.toString();
        String str4 = stackAr1.toString();
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean9 = stackAr8.isFull();
        int int10 = stackAr8.size();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        String str13 = stackAr12.toString();
        stackAr12.push((Object) 0.0f);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        String str18 = stackAr17.toString();
        boolean boolean19 = stackAr12.equals((Object) stackAr17);
        stackAr17.push((Object) 1.0f);
        boolean boolean22 = stackAr8.equals((Object) stackAr17);
        int int23 = stackAr8.size();
        int int24 = stackAr8.size();
        boolean boolean25 = stackAr8.isEmpty();
        stackAr1.push((Object) boolean25);
        Class<?> wildcardClass27 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0859");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((Object) (byte) 0);
        Object obj6 = new Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        int int12 = stackAr11.size();
        boolean boolean13 = stackAr11.isEmpty();
        stackAr11.push((Object) (byte) 0);
        Object obj16 = new Object();
        boolean boolean17 = stackAr11.equals(obj16);
        boolean boolean18 = stackAr11.isEmpty();
        boolean boolean19 = stackAr11.isEmpty();
        String str20 = stackAr11.toString();
        stackAr1.push((Object) str20);
        int int22 = stackAr1.size();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
        int int24 = stackAr23.size();
        String str25 = stackAr23.toString();
        String str26 = stackAr23.toString();
        boolean boolean27 = stackAr23.isFull();
        boolean boolean28 = stackAr1.equals((Object) boolean27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[0]" + "'", str20, "[0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0860");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        String str5 = stackAr1.toString();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        boolean boolean12 = stackAr6.equals((Object) '4');
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) 'a');
        boolean boolean16 = stackAr14.equals((Object) (-1.0f));
        boolean boolean18 = stackAr14.equals((Object) "");
        boolean boolean19 = stackAr6.equals((Object) "");
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean22 = stackAr21.isEmpty();
        boolean boolean23 = stackAr21.isEmpty();
        stackAr6.push((Object) stackAr21);
        boolean boolean25 = stackAr21.isFull();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        boolean boolean29 = stackAr26.equals((Object) (byte) -1);
        String str30 = stackAr26.toString();
        int int31 = stackAr26.size();
        boolean boolean32 = stackAr21.equals((Object) stackAr26);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        boolean boolean36 = stackAr33.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) '4');
        boolean boolean39 = stackAr33.equals((Object) '4');
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) 'a');
        boolean boolean43 = stackAr41.equals((Object) (-1.0f));
        boolean boolean45 = stackAr41.equals((Object) "");
        boolean boolean46 = stackAr33.equals((Object) "");
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean49 = stackAr48.isEmpty();
        boolean boolean50 = stackAr48.isEmpty();
        stackAr33.push((Object) stackAr48);
        boolean boolean52 = stackAr48.isFull();
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr();
        boolean boolean54 = stackAr53.isFull();
        boolean boolean56 = stackAr53.equals((Object) (byte) -1);
        String str57 = stackAr53.toString();
        int int58 = stackAr53.size();
        boolean boolean59 = stackAr48.equals((Object) stackAr53);
        stackAr26.push((Object) stackAr53);
        stackAr1.push((Object) stackAr26);
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr((int) '4');
        int int64 = stackAr63.size();
        boolean boolean65 = stackAr63.isEmpty();
        stackAr63.push((Object) (byte) 0);
        String str68 = stackAr63.toString();
        org.autotest.StackAr stackAr70 = new org.autotest.StackAr((int) '4');
        int int71 = stackAr70.size();
        int int72 = stackAr70.size();
        boolean boolean73 = stackAr70.isFull();
        org.autotest.StackAr stackAr74 = new org.autotest.StackAr();
        boolean boolean75 = stackAr74.isFull();
        boolean boolean77 = stackAr74.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr79 = new org.autotest.StackAr((int) '4');
        boolean boolean80 = stackAr74.equals((Object) '4');
        org.autotest.StackAr stackAr82 = new org.autotest.StackAr((int) 'a');
        boolean boolean84 = stackAr82.equals((Object) (-1.0f));
        boolean boolean86 = stackAr82.equals((Object) "");
        boolean boolean87 = stackAr74.equals((Object) "");
        boolean boolean88 = stackAr74.isFull();
        stackAr70.push((Object) stackAr74);
        org.autotest.StackAr stackAr90 = new org.autotest.StackAr();
        int int91 = stackAr90.size();
        int int92 = stackAr90.size();
        stackAr74.push((Object) int92);
        boolean boolean94 = stackAr74.isFull();
        stackAr63.push((Object) stackAr74);
        boolean boolean96 = stackAr26.equals((Object) stackAr74);
        boolean boolean97 = stackAr74.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[0]" + "'", str68, "[0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0861");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean8 = stackAr7.isEmpty();
        boolean boolean9 = stackAr7.isFull();
        boolean boolean10 = stackAr4.equals((Object) boolean9);
        boolean boolean11 = stackAr1.equals((Object) stackAr4);
        int int12 = stackAr1.size();
        boolean boolean13 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0862");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(3);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0863");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        String str2 = stackAr1.toString();
        String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        String str6 = stackAr1.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 100);
        String str9 = stackAr8.toString();
        boolean boolean10 = stackAr8.isEmpty();
        String str11 = stackAr8.toString();
        int int12 = stackAr8.size();
        stackAr1.push((Object) stackAr8);
        // The following exception was thrown during execution in test generation
        try {
            Object obj14 = stackAr8.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0864");
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
        boolean boolean19 = stackAr0.isFull();
        int int20 = stackAr0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0865");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 1);
        stackAr1.push((Object) (short) 1);
        int int5 = stackAr1.size();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        String str9 = stackAr8.toString();
        stackAr8.push((Object) 0.0f);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        String str14 = stackAr13.toString();
        boolean boolean15 = stackAr8.equals((Object) stackAr13);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        boolean boolean19 = stackAr17.equals((Object) (-1.0f));
        boolean boolean21 = stackAr17.equals((Object) "");
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
        boolean boolean23 = stackAr22.isFull();
        stackAr17.push((Object) stackAr22);
        boolean boolean25 = stackAr13.equals((Object) stackAr17);
        Object obj26 = stackAr17.top();
        boolean boolean27 = stackAr17.isEmpty();
        Object obj28 = stackAr17.top();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        int int31 = stackAr30.size();
        String str32 = stackAr30.toString();
        int int33 = stackAr30.size();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr();
        boolean boolean35 = stackAr34.isFull();
        boolean boolean37 = stackAr34.equals((Object) (byte) -1);
        boolean boolean38 = stackAr30.equals((Object) (byte) -1);
        String str39 = stackAr30.toString();
        int int40 = stackAr30.size();
        stackAr17.push((Object) stackAr30);
        stackAr1.push((Object) stackAr30);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) '4');
        String str45 = stackAr44.toString();
        boolean boolean46 = stackAr44.isEmpty();
        boolean boolean47 = stackAr44.isFull();
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr();
        boolean boolean49 = stackAr48.isFull();
        int int50 = stackAr48.size();
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr((int) (short) 0);
        stackAr48.push((Object) (short) 0);
        stackAr44.push((Object) (short) 0);
        Object obj55 = stackAr44.top();
        boolean boolean56 = stackAr44.isFull();
        stackAr30.push((Object) boolean56);
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr();
        boolean boolean59 = stackAr58.isFull();
        org.autotest.StackAr stackAr61 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean62 = stackAr61.isEmpty();
        boolean boolean63 = stackAr61.isFull();
        boolean boolean64 = stackAr58.equals((Object) boolean63);
        boolean boolean65 = stackAr30.equals((Object) stackAr58);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj28), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (short) 0 + "'", obj55, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0866");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        String str2 = stackAr1.toString();
        stackAr1.push((Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((Object) stackAr6);
        stackAr6.push((Object) 1.0f);
        Object obj11 = stackAr6.top();
        Object obj12 = stackAr6.top();
        boolean boolean13 = stackAr6.isFull();
        String str14 = stackAr6.toString();
        Class<?> wildcardClass15 = stackAr6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[1.0]" + "'", str14, "[1.0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0867");
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
        boolean boolean36 = stackAr0.isFull();
        boolean boolean37 = stackAr0.isFull();
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) 'a');
        boolean boolean41 = stackAr39.equals((Object) (-1.0f));
        boolean boolean42 = stackAr39.isFull();
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr();
        boolean boolean44 = stackAr43.isFull();
        int int45 = stackAr43.size();
        boolean boolean46 = stackAr43.isEmpty();
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean49 = stackAr48.isFull();
        Class<?> wildcardClass50 = stackAr48.getClass();
        stackAr43.push((Object) wildcardClass50);
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean54 = stackAr53.isEmpty();
        boolean boolean55 = stackAr53.isEmpty();
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr();
        Class<?> wildcardClass57 = stackAr56.getClass();
        boolean boolean58 = stackAr53.equals((Object) stackAr56);
        Class<?> wildcardClass59 = stackAr56.getClass();
        stackAr43.push((Object) wildcardClass59);
        stackAr39.push((Object) stackAr43);
        String str62 = stackAr43.toString();
        Object obj63 = stackAr43.top();
        boolean boolean64 = stackAr0.equals((Object) stackAr43);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(String.valueOf(obj16), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "class org.autotest.StackAr");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(String.valueOf(obj34), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "class org.autotest.StackAr");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "[class org.autotest.StackAr,class org.autotest.StackAr]" + "'", str62, "[class org.autotest.StackAr,class org.autotest.StackAr]");
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals(obj63.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(String.valueOf(obj63), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "class org.autotest.StackAr");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0868");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((Object) 'a');
        Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isFull();
        Class<?> wildcardClass8 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 'a' + "'", obj4, 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0869");
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
        boolean boolean19 = stackAr0.isFull();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) 'a');
        String str22 = stackAr21.toString();
        stackAr21.push((Object) 0.0f);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        String str27 = stackAr26.toString();
        boolean boolean28 = stackAr21.equals((Object) stackAr26);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        int int31 = stackAr30.size();
        Class<?> wildcardClass32 = stackAr30.getClass();
        stackAr26.push((Object) stackAr30);
        int int34 = stackAr26.size();
        boolean boolean35 = stackAr26.isEmpty();
        stackAr0.push((Object) stackAr26);
        boolean boolean37 = stackAr0.isFull();
        boolean boolean38 = stackAr0.isFull();
        int int39 = stackAr0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0870");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((Object) 'a');
        Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr7.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isFull();
        Class<?> wildcardClass14 = stackAr12.getClass();
        stackAr7.push((Object) wildcardClass14);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
        int int17 = stackAr16.size();
        String str18 = stackAr16.toString();
        stackAr7.push((Object) stackAr16);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) '4');
        stackAr21.push((Object) (-1L));
        boolean boolean24 = stackAr21.isEmpty();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
        boolean boolean26 = stackAr25.isFull();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean29 = stackAr28.isEmpty();
        boolean boolean30 = stackAr28.isFull();
        boolean boolean31 = stackAr25.equals((Object) boolean30);
        boolean boolean32 = stackAr25.isFull();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        boolean boolean36 = stackAr33.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) '4');
        boolean boolean39 = stackAr33.equals((Object) '4');
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) 'a');
        boolean boolean43 = stackAr41.equals((Object) (-1.0f));
        boolean boolean45 = stackAr41.equals((Object) "");
        boolean boolean46 = stackAr33.equals((Object) "");
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean49 = stackAr48.isEmpty();
        boolean boolean50 = stackAr48.isEmpty();
        stackAr33.push((Object) stackAr48);
        stackAr33.push((Object) 1.0f);
        boolean boolean54 = stackAr25.equals((Object) stackAr33);
        boolean boolean55 = stackAr25.isEmpty();
        stackAr21.push((Object) stackAr25);
        stackAr16.push((Object) stackAr25);
        String str58 = stackAr16.toString();
        boolean boolean59 = stackAr1.equals((Object) str58);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 'a' + "'", obj4, 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[[]]" + "'", str58, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0871");
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
        int int19 = stackAr15.size();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) 'a');
        boolean boolean23 = stackAr21.equals((Object) (-1.0f));
        boolean boolean25 = stackAr21.equals((Object) "");
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) (short) 1);
        stackAr27.push((Object) (short) 1);
        int int31 = stackAr27.size();
        int int32 = stackAr27.size();
        stackAr21.push((Object) stackAr27);
        Object obj34 = stackAr27.top();
        boolean boolean35 = stackAr15.equals((Object) stackAr27);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 1 + "'", obj34, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0872");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((Object) wildcardClass7);
        Object obj9 = stackAr0.top();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(String.valueOf(obj9), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class org.autotest.StackAr");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0873");
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
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        String str18 = stackAr17.toString();
        stackAr17.push((Object) 0.0f);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) 'a');
        boolean boolean26 = stackAr24.equals((Object) (-1.0f));
        boolean boolean28 = stackAr24.equals((Object) "");
        stackAr24.push((Object) (-1.0d));
        stackAr22.push((Object) (-1.0d));
        boolean boolean32 = stackAr17.equals((Object) (-1.0d));
        stackAr0.push((Object) (-1.0d));
        boolean boolean34 = stackAr0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0874");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        String str11 = stackAr10.toString();
        stackAr10.push((Object) 0.0f);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '4');
        String str16 = stackAr15.toString();
        boolean boolean17 = stackAr10.equals((Object) stackAr15);
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        boolean boolean21 = stackAr19.equals((Object) (-1.0f));
        boolean boolean23 = stackAr19.equals((Object) "");
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        boolean boolean25 = stackAr24.isFull();
        stackAr19.push((Object) stackAr24);
        boolean boolean27 = stackAr15.equals((Object) stackAr19);
        boolean boolean28 = stackAr6.equals((Object) stackAr15);
        int int29 = stackAr6.size();
        String str30 = stackAr6.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0875");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) (short) 0);
        stackAr0.push((Object) (short) 0);
        String str6 = stackAr0.toString();
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
        Class<?> wildcardClass19 = stackAr17.getClass();
        boolean boolean20 = stackAr7.equals((Object) wildcardClass19);
        boolean boolean21 = stackAr0.equals((Object) boolean20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0]" + "'", str6, "[0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0876");
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
        boolean boolean19 = stackAr0.isFull();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) 'a');
        boolean boolean23 = stackAr21.equals((Object) (-1.0f));
        String str24 = stackAr21.toString();
        int int25 = stackAr21.size();
        stackAr0.push((Object) int25);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) ' ');
        boolean boolean29 = stackAr0.equals((Object) ' ');
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
        boolean boolean31 = stackAr30.isFull();
        int int32 = stackAr30.size();
        boolean boolean33 = stackAr30.isEmpty();
        boolean boolean34 = stackAr30.isFull();
        boolean boolean35 = stackAr30.isFull();
        boolean boolean37 = stackAr30.equals((Object) "[0.0,true]");
        stackAr0.push((Object) stackAr30);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr();
        boolean boolean41 = stackAr40.isFull();
        int int42 = stackAr40.size();
        boolean boolean43 = stackAr40.isEmpty();
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean46 = stackAr45.isFull();
        Class<?> wildcardClass47 = stackAr45.getClass();
        stackAr40.push((Object) wildcardClass47);
        boolean boolean49 = stackAr39.equals((Object) stackAr40);
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean52 = stackAr51.isEmpty();
        boolean boolean53 = stackAr51.isEmpty();
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr();
        Class<?> wildcardClass55 = stackAr54.getClass();
        boolean boolean56 = stackAr51.equals((Object) stackAr54);
        Class<?> wildcardClass57 = stackAr54.getClass();
        stackAr39.push((Object) wildcardClass57);
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr();
        boolean boolean60 = stackAr59.isFull();
        int int61 = stackAr59.size();
        boolean boolean62 = stackAr59.isFull();
        stackAr59.push((Object) 10L);
        stackAr59.push((Object) ' ');
        boolean boolean67 = stackAr39.equals((Object) stackAr59);
        org.autotest.StackAr stackAr68 = new org.autotest.StackAr();
        boolean boolean69 = stackAr68.isFull();
        org.autotest.StackAr stackAr71 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean72 = stackAr71.isEmpty();
        boolean boolean73 = stackAr71.isFull();
        boolean boolean74 = stackAr68.equals((Object) boolean73);
        boolean boolean75 = stackAr68.isFull();
        stackAr39.push((Object) boolean75);
        boolean boolean77 = stackAr30.equals((Object) boolean75);
        Object obj78 = null;
        boolean boolean79 = stackAr30.equals(obj78);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0877");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '4');
        int int5 = stackAr4.size();
        String str6 = stackAr4.toString();
        int int7 = stackAr4.size();
        boolean boolean8 = stackAr4.isEmpty();
        String str9 = stackAr4.toString();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) 'a');
        boolean boolean13 = stackAr11.equals((Object) (-1.0f));
        boolean boolean15 = stackAr11.equals((Object) "");
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
        boolean boolean17 = stackAr16.isFull();
        stackAr11.push((Object) stackAr16);
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) 'a');
        String str21 = stackAr20.toString();
        stackAr20.push((Object) 0.0f);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        String str26 = stackAr25.toString();
        boolean boolean27 = stackAr20.equals((Object) stackAr25);
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr((int) 'a');
        boolean boolean31 = stackAr29.equals((Object) (-1.0f));
        boolean boolean33 = stackAr29.equals((Object) "");
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr();
        boolean boolean35 = stackAr34.isFull();
        stackAr29.push((Object) stackAr34);
        boolean boolean37 = stackAr25.equals((Object) stackAr29);
        boolean boolean38 = stackAr16.equals((Object) stackAr25);
        boolean boolean40 = stackAr25.equals((Object) 1.0f);
        boolean boolean41 = stackAr4.equals((Object) boolean40);
        boolean boolean42 = stackAr4.isFull();
        Class<?> wildcardClass43 = stackAr4.getClass();
        stackAr1.push((Object) stackAr4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0878");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        boolean boolean4 = stackAr0.isFull();
        boolean boolean5 = stackAr0.isFull();
        boolean boolean6 = stackAr0.isFull();
        boolean boolean7 = stackAr0.isFull();
        boolean boolean8 = stackAr0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            Object obj9 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0879");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((Object) (byte) 0);
        String str6 = stackAr1.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        int int9 = stackAr8.size();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        boolean boolean13 = stackAr12.isFull();
        boolean boolean15 = stackAr12.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        boolean boolean18 = stackAr12.equals((Object) '4');
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) 'a');
        boolean boolean22 = stackAr20.equals((Object) (-1.0f));
        boolean boolean24 = stackAr20.equals((Object) "");
        boolean boolean25 = stackAr12.equals((Object) "");
        boolean boolean26 = stackAr12.isFull();
        stackAr8.push((Object) stackAr12);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        int int29 = stackAr28.size();
        int int30 = stackAr28.size();
        stackAr12.push((Object) int30);
        boolean boolean32 = stackAr12.isFull();
        stackAr1.push((Object) stackAr12);
        boolean boolean34 = stackAr12.isEmpty();
        String str35 = stackAr12.toString();
        String str36 = stackAr12.toString();
        int int37 = stackAr12.size();
        Object obj38 = stackAr12.top();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0]" + "'", str6, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[0]" + "'", str35, "[0]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[0]" + "'", str36, "[0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0880");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0881");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((Object) (byte) 0);
        Object obj6 = new Object();
        boolean boolean7 = stackAr1.equals(obj6);
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isFull();
        Object obj11 = stackAr1.top();
        Object obj12 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0882");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        String str2 = stackAr1.toString();
        String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr9.equals((Object) (-1.0f));
        boolean boolean12 = stackAr9.isFull();
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr();
        boolean boolean14 = stackAr13.isFull();
        int int15 = stackAr13.size();
        boolean boolean16 = stackAr13.isEmpty();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean19 = stackAr18.isFull();
        Class<?> wildcardClass20 = stackAr18.getClass();
        stackAr13.push((Object) wildcardClass20);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isEmpty();
        boolean boolean25 = stackAr23.isEmpty();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        Class<?> wildcardClass27 = stackAr26.getClass();
        boolean boolean28 = stackAr23.equals((Object) stackAr26);
        Class<?> wildcardClass29 = stackAr26.getClass();
        stackAr13.push((Object) wildcardClass29);
        stackAr9.push((Object) stackAr13);
        stackAr7.push((Object) stackAr13);
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) 'a');
        boolean boolean35 = stackAr34.isFull();
        Class<?> wildcardClass36 = stackAr34.getClass();
        boolean boolean37 = stackAr7.equals((Object) wildcardClass36);
        int int38 = stackAr7.size();
        boolean boolean39 = stackAr1.equals((Object) stackAr7);
        Class<?> wildcardClass40 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0883");
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
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        String str20 = stackAr19.toString();
        stackAr19.push((Object) 0.0f);
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) '4');
        String str25 = stackAr24.toString();
        boolean boolean26 = stackAr19.equals((Object) stackAr24);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        boolean boolean30 = stackAr28.equals((Object) (-1.0f));
        boolean boolean32 = stackAr28.equals((Object) "");
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        stackAr28.push((Object) stackAr33);
        boolean boolean36 = stackAr24.equals((Object) stackAr28);
        boolean boolean37 = stackAr15.equals((Object) stackAr24);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) '4');
        int int40 = stackAr39.size();
        String str41 = stackAr39.toString();
        int int42 = stackAr39.size();
        boolean boolean43 = stackAr39.isEmpty();
        String str44 = stackAr39.toString();
        boolean boolean45 = stackAr39.isFull();
        stackAr15.push((Object) boolean45);
        boolean boolean47 = stackAr1.equals((Object) boolean45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0884");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((Object) "");
        boolean boolean13 = stackAr0.equals((Object) "");
        String str14 = stackAr0.toString();
        String str15 = stackAr0.toString();
        String str16 = stackAr0.toString();
        String str17 = stackAr0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0885");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        String str2 = stackAr1.toString();
        String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        int int5 = stackAr1.size();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) 'a');
        boolean boolean9 = stackAr7.equals((Object) (-1.0f));
        boolean boolean10 = stackAr7.isFull();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        boolean boolean12 = stackAr11.isFull();
        int int13 = stackAr11.size();
        boolean boolean14 = stackAr11.isEmpty();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean17 = stackAr16.isFull();
        Class<?> wildcardClass18 = stackAr16.getClass();
        stackAr11.push((Object) wildcardClass18);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean22 = stackAr21.isEmpty();
        boolean boolean23 = stackAr21.isEmpty();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        Class<?> wildcardClass25 = stackAr24.getClass();
        boolean boolean26 = stackAr21.equals((Object) stackAr24);
        Class<?> wildcardClass27 = stackAr24.getClass();
        stackAr11.push((Object) wildcardClass27);
        stackAr7.push((Object) stackAr11);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean32 = stackAr31.isFull();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean35 = stackAr34.isFull();
        boolean boolean36 = stackAr31.equals((Object) stackAr34);
        int int37 = stackAr34.size();
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) 'a');
        String str40 = stackAr39.toString();
        stackAr39.push((Object) 0.0f);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean45 = stackAr44.isFull();
        boolean boolean46 = stackAr44.isEmpty();
        stackAr39.push((Object) boolean46);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) '4');
        int int50 = stackAr49.size();
        String str51 = stackAr49.toString();
        int int52 = stackAr49.size();
        boolean boolean53 = stackAr49.isEmpty();
        String str54 = stackAr49.toString();
        boolean boolean55 = stackAr49.isFull();
        boolean boolean56 = stackAr39.equals((Object) boolean55);
        stackAr34.push((Object) boolean55);
        boolean boolean58 = stackAr7.equals((Object) boolean55);
        boolean boolean59 = stackAr1.equals((Object) stackAr7);
        String str60 = stackAr1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[]" + "'", str60, "[]");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0886");
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
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr(0);
        boolean boolean23 = stackAr1.equals((Object) stackAr22);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) 'a');
        boolean boolean27 = stackAr25.equals((Object) (-1.0f));
        boolean boolean29 = stackAr25.equals((Object) "");
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
        boolean boolean31 = stackAr30.isFull();
        stackAr25.push((Object) stackAr30);
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) 'a');
        String str35 = stackAr34.toString();
        stackAr34.push((Object) 0.0f);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) '4');
        String str40 = stackAr39.toString();
        boolean boolean41 = stackAr34.equals((Object) stackAr39);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) 'a');
        boolean boolean45 = stackAr43.equals((Object) (-1.0f));
        boolean boolean47 = stackAr43.equals((Object) "");
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr();
        boolean boolean49 = stackAr48.isFull();
        stackAr43.push((Object) stackAr48);
        boolean boolean51 = stackAr39.equals((Object) stackAr43);
        boolean boolean52 = stackAr30.equals((Object) stackAr39);
        int int53 = stackAr30.size();
        boolean boolean54 = stackAr30.isEmpty();
        int int55 = stackAr30.size();
        // The following exception was thrown during execution in test generation
        try {
            stackAr22.push((Object) stackAr30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0887");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) 'a');
        String str8 = stackAr7.toString();
        stackAr7.push((Object) 0.0f);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        String str13 = stackAr12.toString();
        boolean boolean14 = stackAr7.equals((Object) stackAr12);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        int int17 = stackAr16.size();
        Class<?> wildcardClass18 = stackAr16.getClass();
        stackAr12.push((Object) stackAr16);
        int int20 = stackAr12.size();
        boolean boolean21 = stackAr1.equals((Object) stackAr12);
        int int22 = stackAr12.size();
        int int23 = stackAr12.size();
        boolean boolean24 = stackAr12.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0888");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((Object) (byte) 0);
        Object obj6 = new Object();
        boolean boolean7 = stackAr1.equals(obj6);
        int int8 = stackAr1.size();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((Object) (-1.0f));
        boolean boolean15 = stackAr12.isFull();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
        boolean boolean17 = stackAr16.isFull();
        int int18 = stackAr16.size();
        boolean boolean19 = stackAr16.isEmpty();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean22 = stackAr21.isFull();
        Class<?> wildcardClass23 = stackAr21.getClass();
        stackAr16.push((Object) wildcardClass23);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean27 = stackAr26.isEmpty();
        boolean boolean28 = stackAr26.isEmpty();
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
        Class<?> wildcardClass30 = stackAr29.getClass();
        boolean boolean31 = stackAr26.equals((Object) stackAr29);
        Class<?> wildcardClass32 = stackAr29.getClass();
        stackAr16.push((Object) wildcardClass32);
        stackAr12.push((Object) stackAr16);
        boolean boolean35 = stackAr1.equals((Object) stackAr12);
        String str36 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[0]" + "'", str36, "[0]");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0889");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        String str2 = stackAr1.toString();
        stackAr1.push((Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((Object) "");
        stackAr8.push((Object) (-1.0d));
        stackAr6.push((Object) (-1.0d));
        boolean boolean16 = stackAr1.equals((Object) (-1.0d));
        boolean boolean17 = stackAr1.isEmpty();
        boolean boolean19 = stackAr1.equals((Object) "[[],1.0]");
        Class<?> wildcardClass20 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0890");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        int int6 = stackAr5.size();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        boolean boolean12 = stackAr9.equals((Object) (byte) -1);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        boolean boolean15 = stackAr9.equals((Object) '4');
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        boolean boolean19 = stackAr17.equals((Object) (-1.0f));
        boolean boolean21 = stackAr17.equals((Object) "");
        boolean boolean22 = stackAr9.equals((Object) "");
        boolean boolean23 = stackAr9.isFull();
        stackAr5.push((Object) stackAr9);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
        int int26 = stackAr25.size();
        int int27 = stackAr25.size();
        stackAr9.push((Object) int27);
        boolean boolean29 = stackAr0.equals((Object) int27);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        String str32 = stackAr31.toString();
        String str33 = stackAr31.toString();
        int int34 = stackAr31.size();
        boolean boolean35 = stackAr31.isFull();
        boolean boolean37 = stackAr31.equals((Object) ' ');
        Object obj38 = new Object();
        Class<?> wildcardClass39 = obj38.getClass();
        stackAr31.push((Object) wildcardClass39);
        stackAr0.push((Object) wildcardClass39);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) 'a');
        String str44 = stackAr43.toString();
        stackAr43.push((Object) 0.0f);
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) '4');
        String str49 = stackAr48.toString();
        boolean boolean50 = stackAr43.equals((Object) stackAr48);
        String str51 = stackAr48.toString();
        boolean boolean52 = stackAr48.isEmpty();
        boolean boolean53 = stackAr48.isFull();
        boolean boolean54 = stackAr48.isEmpty();
        boolean boolean55 = stackAr0.equals((Object) stackAr48);
        int int56 = stackAr0.size();
        boolean boolean57 = stackAr0.isFull();
        Object obj58 = stackAr0.top();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertEquals(obj58.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(String.valueOf(obj58), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj58), "class java.lang.Object");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0891");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        String str4 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0892");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((Object) (byte) 0);
        int int6 = stackAr1.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) ' ');
        boolean boolean9 = stackAr8.isEmpty();
        boolean boolean10 = stackAr8.isEmpty();
        stackAr1.push((Object) stackAr8);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        int int13 = stackAr12.size();
        String str14 = stackAr12.toString();
        String str15 = stackAr12.toString();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        String str18 = stackAr17.toString();
        stackAr17.push((Object) 0.0f);
        boolean boolean21 = stackAr17.isFull();
        int int22 = stackAr17.size();
        stackAr12.push((Object) stackAr17);
        boolean boolean24 = stackAr8.equals((Object) stackAr12);
        Object obj25 = stackAr12.top();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[0.0]");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0893");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((Object) (byte) 0);
        String str6 = stackAr1.toString();
        boolean boolean7 = stackAr1.isEmpty();
        int int8 = stackAr1.size();
        int int9 = stackAr1.size();
        int int10 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0]" + "'", str6, "[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0894");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 1);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        String str4 = stackAr3.toString();
        stackAr1.push((Object) str4);
        boolean boolean6 = stackAr1.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0895");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isFull();
        String str7 = stackAr1.toString();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0896");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isFull();
        String str4 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0897");
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
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr(0);
        boolean boolean23 = stackAr1.equals((Object) stackAr22);
        boolean boolean24 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0898");
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
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean21 = stackAr20.isEmpty();
        boolean boolean22 = stackAr20.isFull();
        boolean boolean23 = stackAr20.isEmpty();
        boolean boolean24 = stackAr7.equals((Object) stackAr20);
        Class<?> wildcardClass25 = stackAr20.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0899");
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
        String str28 = stackAr21.toString();
        Class<?> wildcardClass29 = stackAr21.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[0]" + "'", str26, "[0]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[0]" + "'", str28, "[0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test0900");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isFull();
        stackAr0.push((Object) 10L);
        stackAr0.push((Object) ' ');
        String str8 = stackAr0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[10, ]" + "'", str8, "[10, ]");
    }
}

