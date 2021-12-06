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
        selectionSort();
        System.out.println(nosToSort);
    }

    static void selectionSort() {
        for (int i = 0; i < nosToSort.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nosToSort.size(); j++) {
                if (nosToSort.get(j) < nosToSort.get(min)) {
                    min = j;
                }
            }
            if(i!=min) {
                swap(i, min);
            }
            System.out.println(nosToSort);

        }
    }

    static void swap(int a, int b) {
        // Swapping using bit manipulation
        nosToSort.set(a, nosToSort.get(a) ^ nosToSort.get(b));
        nosToSort.set(b, nosToSort.get(a) ^ nosToSort.get(b));
        nosToSort.set(a, nosToSort.get(a) ^ nosToSort.get(b));
    }


}
