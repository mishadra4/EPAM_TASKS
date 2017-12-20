package EPAM_LECTURE_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 20-Dec-17.
 */
public class FibonacciNumbers {
    private int fibonacci;  //first component of fibonacci numbers
    private int fibonacci2; //second component of fibonacci numbers
    private List array;



    List generateFibonacci(int maxFibonacci){
        fibonacci = 1;
        fibonacci2 = 1;
        array = new ArrayList(); //creating new array list
        array.add(fibonacci);
        while(fibonacci2 <= maxFibonacci){   //here we calculate fibonacci numbers up to maxFibonacci
            int temp = fibonacci2;
            fibonacci2 += fibonacci;
            fibonacci = temp;
            array.add(fibonacci);
        }
        return array;
    }
    public List getArray() {
        return array;
    }

    public void setArray(List array) {
        this.array = array;
    }
}
