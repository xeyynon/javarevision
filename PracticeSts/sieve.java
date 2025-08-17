//package PracticeSts;

import java.util.Scanner;

public class sieve {
    public static void simpleSieve(boolean arr[], int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    arr[j] = false;

                }
            }
        }

    }

    // count total number of prime numbers
    public static int count(boolean arr[]) {
        int count = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == true) {
                count++;

            }
        }
        return count;
    }

    // sum all of the prime numbers
    public static int sum(boolean arr[]) {
        int sum = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == true) {
                sum = sum + i;

            }
        }
        return sum;
    }

    // finding the given prime of input k
    public static void find(boolean arr[], int k) {
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == true && i == k) {
                System.out.println(arr[k]);

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N Value");
        int n = sc.nextInt();

        boolean arr[] = new boolean[n + 1];

        // assuming all numbers are prime initially
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }

        // implementing sieve algorithm
        simpleSieve(arr, n);

        for (int i = 2; i <= n; i++) {
            System.out.println(arr[i]);
        }

        // System.out.println(count(arr));
        // System.out.println(sum(arr));

        // System.out.println("Entehr the k value");
        // int k = sc.nextInt();
        // find(arr, k);

    }
}
