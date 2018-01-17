package EPAM_LECTURE_6;

/**
 * Created by User on 17-Jan-18.
 */
public class OddPredicate implements UnaryPredicate {
    @Override
    public boolean check(Object obj) {
        if(obj.getClass() == Integer.class){
            if((Integer)obj % 2 == 1){
                return true;
            }
        }
        return false;
    }
}
