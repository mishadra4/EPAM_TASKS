package PRESENTATIONS.DateTimeLocalization;

import java.time.LocalDate;
import java.time.chrono.Chronology;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        Locale ukraine = Locale.getDefault();
        ResourceBundle phrases = ResourceBundle.getBundle("Phrases", ukraine);
        System.out.println("Current locale is: " + ukraine.getDisplayName());
        System.out.println(phrases.getString("hello"));
        System.out.println(phrases.getString("thanks"));
    }
}
