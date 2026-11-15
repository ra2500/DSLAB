package Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arrays arr =new Arrays();
        int []numbers={1,2,3,4,3,2,8,9,7,5,4};
        int result=arr.LinearSearch(numbers,8);
        //int[]numbers2=new int [10];
       // arr.input(numbers2);

       // arr.traversal(numbers2);
        arr.update(numbers,4,9);
       // arr.delete(numbers,8);
        if(result!=-1)

            System.out.println("value found at index: "+result);
        else
            System.out.println("value not found!");



    }
}
