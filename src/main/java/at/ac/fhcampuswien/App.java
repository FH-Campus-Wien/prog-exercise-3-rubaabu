package at.ac.fhcampuswien;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static
    public static void oneMonthCalendar(int numberDays, int startingDay) {
        int counter = 1;
        int col = 0;

        for (int i = 1; i < startingDay; i++) {
            System.out.print("   ");
            col++;
        }

        for(int x = 1; x <= numberDays; x++) {
            if(col % 7 == 0){
                System.out.println();
            }
            if (counter > 9 ){
                System.out.print( counter + " ");

            } else{
                System.out.print(" " + counter + " ");

            }
            counter++;
            col++;
        }

        System.out.println();
    }

    public static long[] lcg(long startValue){
        // Xi+1 = (aXi + c) mod m

        long[] array = new long[11];
        array[0] = startValue;

        long a = 1103515245;
        long c = 12345;
        long m = (long) Math.pow(2, 31);

        for (int i = 1; i < 11; i++){
            array[i] = ((array[i - 1] * a) + c) % m;

        }

        return Arrays.copyOfRange(array,1,array.length);
    }

    public static void guessingGame(int numberToGuess) {

        Scanner scanner = new Scanner(System.in);
        int userInput;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Guess number " + i + ": ");
             userInput = scanner.nextInt();

            if (i  == 10){
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }

            if (userInput == numberToGuess){
                System.out.println("You won wisenheimer!");
                break;
            }

            if (userInput > numberToGuess) {
                System.out.println("The number AI picked is lower than your guess.");
            }
            if (userInput < numberToGuess) {
                System.out.println("The number AI picked is higher than your guess.");
            }


        }
    }

    public static int randomNumberBetweenOneAndHundred(){
        Random random = new Random();
        int min = 1;
        int max = 100;
        int number = random.nextInt(max)+min;
        return  number;
    }
    public static Boolean swapArrays(int[] firstArray, int[] secondArray){
        if(firstArray.length != secondArray.length){
            return false;
        }
        int[] instanceOfFirstArray = new int[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            instanceOfFirstArray[i] = firstArray[i];

        }
        for (int i = 0; i < secondArray.length; i++){
            firstArray[i] = secondArray[i];

        }
        for (int i = 0; i < instanceOfFirstArray.length; i++){
            secondArray[i] = instanceOfFirstArray[i];
        }
        return true;

    }

    public static int checkDigit(int[] code){
        int[] weighing = new int[code.length];
        int result = 0;
        System.out.println();
        int sum = 0;

        for (int i = 0; i < code.length; i++) {

            weighing[i] += i + 2;
            System.out.println(weighing[i]);

            code[i] *= weighing[i];
            sum += code[i];
        }

        int rest = sum % 11;
        result = 11 - rest;

        if (result ==  10){
            result = 0;
        } else if (result == 11) {
            result = 5;
        }

        return result;
    }


    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.


    }




}