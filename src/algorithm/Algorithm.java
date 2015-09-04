/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Ujjwal
 */
public class Algorithm {
//Function to generate prime numbers

    static ArrayList primeno() {
        ArrayList<Integer> pno = new ArrayList<>();
        double max = 100;
        for (int i = 1; i < max; i++) {
            boolean isPrime = true;

            //check to see if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                pno.add(i);
            }
        }
        System.out.println("Number of candidates: " + pno.size());
        return (pno);
    }

//    Function Hire Assistant
    static int Hire_Assistant(ArrayList<Integer> pno) {
        int best = 0;
        int hired = 0;
        for (int i = 0; i < pno.size(); i++) {
            if (pno.get(i) > best) {
                best = pno.get(i);
                System.out.println(best);
                hired++;
            }
        }
        return (hired);
    }

//    Function to randomly permute arrays
    static ArrayList permute_arrays(ArrayList<Integer> a) {
        int n = a.size();
        
        int k=0;
        for (int j = 0; j < n; j++) {
            Random rn = new Random();
            int index = rn.nextInt(n);
            Collections.swap(a, k++, index);
        }
        return (a);
    }

    public static void main(String[] args) {
        ArrayList<Integer> prime = primeno();
        System.out.println(prime);

        ArrayList<Integer> permutedarray = permute_arrays(prime);
        System.out.println(permutedarray);

        int count = Hire_Assistant(permutedarray);
        System.out.println("Total Hired: " + count);
    }

}
