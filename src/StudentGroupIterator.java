import java.util.Iterator;
import java.util.List;

class StudentGroupIterator implements Iterator<Student> {
    private int count;
    private final List<Student> studentList;

    public StudentGroupIterator(List<Student> studentList) {
        this.count = 0;
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return count < studentList.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return studentList.get(count++);
    }

    @Override
    public void remove() {
        studentList.remove(count - 1);
    }
}