package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static class PrimeGenerator{
        ArrayList<Integer> myList = new ArrayList<Integer>(0);
        PrimeGenerator(int num){
            if(num < 2){
                System.out.println("There is none...");
                System.exit(2);
            }
            else{
                int next = 1;
                while(nextprime(next) <= num){
                    myList.add(nextprime(next));
                    next = nextprime(next);
                }
            }
        }
        boolean isprime(int number){
            if(number < 2){
                return false;
            }
            for(Integer z: myList){
                if(number % z == 0){
                    return false;
                }
            }
            return true;
        }
        int nextprime(int prePrime){
            for (int i = prePrime + 1; i <= 2147483647; i++){
                if(isprime(i)){
                    return i;
                }
            }
            return 0;
        }
        void output(){
            for(Integer i: myList){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        int num = myinput.nextInt();
        PrimeGenerator myobj = new PrimeGenerator(num);
        myobj.output();
    }
}
/*myList.add(2);
        boolean judge = false;
        if(num < 2){
            System.out.println("There is none...");
            System.exit(2);
        }
        else{
            for(int i = 2; i <= num; i++){
                judge = true;
                for(Integer z: myList){
                    if(i % z == 0){
                        judge = false;
                        break;
                    }
                }
                if(judge){
                    myList.add(i);
                }
            }
        }*/