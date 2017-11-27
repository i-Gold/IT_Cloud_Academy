package OOP_projects.Labs__2_10.LabWork__2_10_3__till__2_10_5;

import java.util.Comparator;

public class ShapeColorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        return shape1.getColor().compareTo(shape2.getColor());
    }
}
