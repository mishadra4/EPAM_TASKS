package EPAM_LECTURE_1;

import java.util.Scanner;

/**
 * Created by User on 20-Dec-17.
 */
public class Numbers {
    private int [] numbers = new int[10];

    public void inputNumbers(){
        System.out.println("Input 10 numbers which have five and more digits");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i < 10){
            int number = scanner.nextInt();
            if(number < 10000){
                continue;
            }else{
                numbers[i++] = number;
            }
        }
    }
    public void sortNumbers(){   //Sorting array by inserting method

        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i], minIndex = i;
            for (int j = i+1; j < numbers.length; j++) {
                if(min > numbers[j]){
                    min = numbers[j];
                    minIndex = j;
                }
            }
            numbers[minIndex] = numbers[i];
            numbers[i] = min;

        }
        System.out.println("Sorted array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    public void printNumbersWithUpDigits(){
        System.out.println("Numbers with growing up digits:");
        for (int i = 0; i < 10; i++) {
            int temp = numbers[i];
            boolean is = true;
            int k = temp%10;
            temp /= 10;
            while(temp > 0){    // here we extract digits from our number

                if(k <= temp % 10){ //if prev digit is smaller then our we break the cycle
                    is = false;
                    break;
                }
                k = temp%10;
                temp /= 10;
            }
            if(is){
                System.out.println(numbers[i]);
            }
        }
    }
    private boolean isSimpleNumber(int number){
        if(number <= 2 && number > 0) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public void printIfHasSimpleNumbers(){
        System.out.println("Numbers which contain simple digits:");
        for (int i = 0; i < 10; i++) {
            int temp = numbers[i];
            while(temp > 0){
                if(isSimpleNumber(temp%10)){
                    System.out.println(numbers[i]);
                    break;
                }
                temp /= 10;
            }
        }
    }
    public void printIfCanDivideOnPrev(){
        System.out.println("Numbers which can be divided on previous in array:");
        for (int i = 1; i < 10; i++) {
            if((numbers[i] % numbers[i-1]) == 0){ //if we haven`t any remaining then we can print this number
                System.out.println(numbers[i]);
            }
        }
    }
}
