package EPAM_LECTURE_6;

import java.util.Collection;

/**
 * Created by User on 17-Jan-18.
 */
public final class Algorithm {
    public static <T> int countIf(Collection<Integer> list, UnaryPredicate<T> predicate){
        int number = 0;
        for (Integer element:list) {
            if(predicate.check((T)element)){
               number++;
            }
        }
        return number;
    }
}
