package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> nosToSort = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter the elements to be sorted with space ");
        String[] nos = sc.nextLine().split(" ", 0);
        for (String number : nos) {
            nosToSort.add(Integer.valueOf(number));
        }

        for (int i=1;i<nosToSort.size();i++){
            int temp = nosToSort.get(i);
            int j= i-1;
            while(j>=0 && nosToSort.get(j)>temp){
                nosToSort.set(j+1,nosToSort.get(j));
                j--;
            }
            nosToSort.set(j+1,temp);
        }
        System.out.println(nosToSort);
    }
}
