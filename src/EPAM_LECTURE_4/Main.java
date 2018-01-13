package EPAM_LECTURE_4;

import java.util.Scanner;

/**
 * Created by User on 10-Jan-18.
 */
public class Main
{
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string += "\n";
        while(scanner.hasNextLine()){
            string += scanner.nextLine();
            string += "\n";
        }
        ExtendedString extendedString = new ExtendedString(string);
        string = extendedString.formatToRightEdge(10);
        //string = extendedString.shortenSequence();
        System.out.println(string);
        //extendedString.barrouzWillerMethod();
    }

}
