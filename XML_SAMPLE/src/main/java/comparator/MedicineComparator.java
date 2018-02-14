package comparator;

import model.Medicine;

import java.util.Comparator;


public class MedicineComparator implements Comparator<Medicine> {
    public int compare(Medicine o1, Medicine o2) {
        if(o1.getaPackage().getPrice() > o2.getaPackage().getPrice())
            return 1;
        if(o1.getaPackage().getPrice() < o2.getaPackage().getPrice())
            return -1;
        return 0;
    }
}
