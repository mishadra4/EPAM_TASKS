package EPAM_LECTURE_6;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 17-Jan-18.
 */
public class CountingElements {
    private List<Integer> list;

    private boolean isPrime(Integer number){
        if(number <= 2 ){
            return true;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number % i != 0){
                return false;
            }
        }
        return true;
    }

    public <T extends Integer> int countOddNumbers(List<T> list){
        int number = 0;
        for (Integer element: list) {
            if(element % 2 == 1){
                number++;
            }
        }
        return number;
    }
    public <T extends String> int countingPalindromes(List<T> list){
        int number = 0;
        for (String element: list) {
            for (int i = 0; i < element.length() / 2; i++) {
                if(element.charAt(i) != element.charAt(element.length() - i -1)){
                    number--;
                    break;
                }
            }
            number++;
        }
        return number;
    }
    public <T extends Integer> int countPrimeNumbers(List<T> list){
        int number = 0;
        for (Integer element: list) {            if(isPrime(element)){
                number++;
            }
        }
        return number;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
}
