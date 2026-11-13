package Array;

import java.util.Scanner;

public class Arrays {
    Scanner input=new Scanner(System.in);

    public void traversal(int[]a){

        for(int i=0;i<a.length;i++)
            System.out.printf("index["+i+"]="+a[i]);
    }


    public void revers_traversal(int[]a){
        for(int i=a.length-1;i>0;i--)
            System.out.printf("index["+i+"]="+a[i]);


    }

    public void input(int[]a){
        System.out.printf("enter"+a.length+ "elements");

        for (int i=0;i<a.length;i++)
            a[i]=input.nextInt();
    }
}

