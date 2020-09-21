package com.company;
//E6.5
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static class PrimeGenerator{
        ArrayList<Integer> myList = new ArrayList<Integer>(0);
        PrimeGenerator(int num){
            if(num < 2){//if less than two number, output none and exit
                System.out.println("There is none...");
                System.exit(2);
            }
            else{//keep adding numbers
                int next = 1;
                while(nextprime(next) <= num){
                    myList.add(nextprime(next));
                    next = nextprime(next);
                }
            }
        }
        boolean isprime(int number){//judge if prime
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
        int nextprime(int prePrime){//return next prime until int limit
            for (int i = prePrime + 1; i <= 2147483647; i++){
                if(isprime(i)){
                    return i;
                }
            }
            return 0;
        }
        void output(){//output all
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