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
        quickSort(0, nosToSort.size() - 1);
        System.out.println(nosToSort);
    }

    static void quickSort(int lowerLimit, int upperLimit) {
        if (lowerLimit < upperLimit) {
            int newPivot = partition(lowerLimit, upperLimit);
            quickSort(lowerLimit, newPivot - 1);
            quickSort(newPivot + 1, upperLimit);
        }
    }

    static int partition(int forwardMovingPointer, int backwardMovingPointer) {
        int pivot = (forwardMovingPointer+backwardMovingPointer)/2;
        while (forwardMovingPointer < backwardMovingPointer) {
            while (nosToSort.get(forwardMovingPointer) <= nosToSort.get(pivot)) {
                forwardMovingPointer++;
            }
            while (nosToSort.get(backwardMovingPointer) > nosToSort.get(pivot)) {
                backwardMovingPointer--;
            }
            if (forwardMovingPointer < backwardMovingPointer) {
                swap(forwardMovingPointer, backwardMovingPointer);
            }
        }
        if (pivot != backwardMovingPointer) {
            swap(pivot, backwardMovingPointer);
        }
        return backwardMovingPointer;
    }

    static void swap(int a, int b) {
        // Swapping using bit manipulation
        nosToSort.set(a, nosToSort.get(a) ^ nosToSort.get(b));
        nosToSort.set(b, nosToSort.get(a) ^ nosToSort.get(b));
        nosToSort.set(a, nosToSort.get(a) ^ nosToSort.get(b));
    }


}
