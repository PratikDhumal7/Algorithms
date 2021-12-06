package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> nosToSort = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter the numbers to sort with a space");
        String[] nos = sc.nextLine().split(" ", 0);
        for (String no : nos) {
            nosToSort.add(Integer.valueOf(no));
        }
        bubbleSort();
        System.out.println(nosToSort);
    }

    static void bubbleSort() {
        for (int i = 0; i < nosToSort.size(); i++) {
            boolean changesInCurrentIteration = false;
            for (int j = 0; j < nosToSort.size() - 1; j++) {
                if (nosToSort.get(j) > nosToSort.get(j + 1)) {
                    swap(j);
                    changesInCurrentIteration = true;
                }
            }
            if (!changesInCurrentIteration){
                break;
            }
        }
    }

    static void swap(int i) {
        // Swapping using bit manipulation
        nosToSort.set(i, nosToSort.get(i) ^ nosToSort.get(i + 1));
        nosToSort.set(i + 1, nosToSort.get(i) ^ nosToSort.get(i + 1));
        nosToSort.set(i, nosToSort.get(i) ^ nosToSort.get(i + 1));
    }
}
