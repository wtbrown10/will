package com.will;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 1, 4};
        int[][] number = {{1,2,3}, {4,5,6}};
        final float PI = 3.14F;
        double result = (double)10 / (double)3;
        short x = 1;
        int y = x + 2;
        int result2 = Math.round(1.1F);
        System.out.println(result2);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result3 = currency.format(1234567.891);

        System.out.println("currency:" + result3);



        System.out.println(Arrays.deepToString(number));
        System.out.println(result);;
    }
}
