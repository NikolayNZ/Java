package com.gmail.tsa;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Double {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println(c);

        int a1 = 2_000_000_000;
        int b2 = 2_000_000_000;
        int c1 = a1 + b2;
        System.out.println(c1);

        double a3 = 0.3;
        double b3 = 0.1;
        double c3 = a3 - (b3 + b3 + b3);
        System.out.println(c3);

        int a4 = 2;
        int b4 = 3;
        int c4 = a4 * b4;
        System.out.println(c4);


        int a5 = 5;
        int b5 = 3;
        int r = a5 / b5;
        int q = a5 % b5;
        System.out.println(r);
        System.out.println(q);

        BigInteger a7 = new BigInteger("5");
        BigInteger b7 = new BigInteger("3");
        BigInteger w = a7.divide(b7);
        BigInteger s = a7.remainder(b7);
        System.out.println(w);
        System.out.println(s);

        double a8 = 5.2;
        double b9 = 2.1;
        double c9 = a/b;
        System.out.println(c9);

        int f = 3;
        int g = 2;
        double h = Math.pow(a,b);
        System.out.println(h);

        BigInteger j = new BigInteger("3");
        BigInteger k = new BigInteger("3");
        BigInteger l = j.pow(k.intValue());
        System.out.println(l);

        double x1 = 16;
        double x2 = 2.25;
        double x3 = 0.25;
        double x4 = 520;

        System.out.println(Math.sqrt(x1));
        System.out.println(Math.sqrt(x2));
        System.out.println(Math.sqrt(x3));
        System.out.println(Math.sqrt(x4));

        }

    }
