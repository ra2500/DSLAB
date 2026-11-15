package Array;

import java.util.Scanner;

public class Arrays {
    Scanner input = new Scanner(System.in);

    public void traversal(int[] a) {

        for (int i = 0; i < a.length; i++)
            System.out.printf("index[" + i + "]=" + a[i]);
    }


    public void revers_traversal(int[] a) {
        for (int i = a.length - 1; i >= 0; i--)
            System.out.printf("index[" + i + "]=" + a[i]);


    }

    public void input(int[] a) {
        System.out.println("enter" + a.length + "elements");

        for (int i = 0; i < a.length; i++)
            a[i] = input.nextInt();
    }

    public void update(int[] a, int index, int nvalue) {
        if (index < 0 || index >= a.length)
            System.out.println("index not found");
        else
            a[index] = nvalue;

    }

    public void delete(int[] a, int index) {
        if (index < 0 || index <= a.length)
            System.out.println("index not found");
        else
            a[index] = 0;

    }

    public int LinearSearch(int[] a, int svalue) {
        for (int i = 0; i < a.length; i++) {

            if (svalue == a[i])
                return i;

        }
        return -1;
    }
}



