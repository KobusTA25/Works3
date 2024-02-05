import java.util.Iterator;
import java.util.List;

class StudentGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return studentList.iterator();
    }
}
