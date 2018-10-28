package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void T1()
    {
        int n = 25;
        int[] A = new int[n];
        int Max = A[0], Min = A[0];
        int MaxE = 0, MinE = 0;
        for (int i = 0; i < A.length; i++)
        {
            A[i] = i + 1;
        }
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] > Max)
            {
                Max = A[i];
                MaxE = i;
            }
            if (A[i] < Min)
            {
                Min = A[i];
                MinE = i;
            }
        }
        int Change = A[MaxE];
        A[MaxE] = A[MinE];
        A[MinE] = Change;
        System.out.println("Ответ на задание 1:");
        String s = Arrays.toString(A);
        System.out.println(s);
    }

    private static void BubbleSort(int[] B)
    {
        for (int i = B.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (B[j] > B[j + 1])
                {
                    int tmp = B[j];
                    B[j] = B[j + 1];
                    B[j + 1] = tmp;
                }
            }
        }
    }

    public static void T2()
    {
        int[] B = new int[25];
        for (int i = 0; i < B.length; i++)
        {
            B[i] = (int) (Math.random() * 25);
        }
        BubbleSort(B);
        System.out.println("Ответ на задание 2:");
        String s = Arrays.toString(B);
        System.out.println(s);
    }

    public static void T3()
    {
        int[] C = new int[20];
        for (int i = 0; i < C.length; i++)
        {
            C[i] = (int) (Math.random() * 20);
        }
        int Average, sum = 0;
        if (C.length > 0)
        {
            for (int j = 0; j < C.length; j++)
            {
                sum += C[j];
            }
            Average = sum / C.length;
        }
        System.out.println("Ответ на задание 3:");
        System.out.println(sum);
    }

    public static void T4()
    {
        int[] D = new int[30];
        for (int i = 0; i < D.length; i++)
        {
            D[i] = (int) (Math.random() * 30);
        }
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < D.length; i++)
        {
            if (i % 2 == 0)
            {
                evenSum += D[i];
            }
            else
                {
                oddSum += D[i];
                }
        }
        System.out.println("Ответ на задание 4:");
        System.out.print("Сумма четных элементов = " + evenSum);
        System.out.print(", сумма нечётных элементов = " + oddSum);
    }

    public static void T5()
    {
        final int n = 3, m = 5;
        int Table[][] = new int[n][m];
        Random rand = new Random();
        for (int row = 0; row < n; row++)
            for (int column = 0; column < m; column++)
                Table[row][column] = rand.nextInt(10);
        System.out.println();
        for (int row = 0; row < n; row++)
        {
            for (int column = 0; column < m; column++)
                System.out.print(Table[row][column] + " ");
            System.out.println();
        }
    }

    private static void maxX()
    {
        int n = 25;
        int[] A = new int[n];
        int Max = A[0], Min = A[0];
        int MaxE = 0, MinE = 0;
        for (int i = 0; i < A.length; i++)
        {
            A[i] = i + 1;
        }
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] > Max)
            {
                Max = A[i];
                MaxE = i;
            }
            if (A[i] < Min)
            {
                Min = A[i];
                MinE = i;
            }
        }
        int Change = A[MaxE];
        A[MaxE] = A[MinE];
        A[MinE] = Change;
        System.out.println("Ответ на задание 6:");
        String s = Arrays.toString(A);
        System.out.println(s);
        System.out.println("Максимальный элемент: " + A[0]);
    }

    public static void T6()
    {
        maxX();
    }

    public static void T7()
    {
        String s1, s2, s3, s4, s5;
        s1 = "Random";
        s3 = "Text";
        s2 = "For";
        s4 = "The";
        s5 = "Task 7";
        System.out.println("Ответ на задание 7:");
        if (s4.equals(s5))
        {
            System.out.println(s1+ " " + s2);
        }
        else
            {
            System.out.println(s1+ " " + s3);
            }
    }

    public static void main(String[] args)
    {
        T1();
        T2();
        T3();
        T4();
        T5();
        T6();
        T7();
    }
}