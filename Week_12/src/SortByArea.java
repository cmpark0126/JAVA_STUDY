import java.util.Comparator;

class SortByArea implements Comparator<Shape> {
    @Override
    public int compare(Shape firstStudent, Shape secondStudent) {
       return (firstStudent.getArea() - secondStudent.getArea());
    }
}