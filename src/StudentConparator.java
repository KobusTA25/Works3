import java.util.Comparator;

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getGroup1().compareTo(o2.getGroup1());
        if (result == 0) {
            result = o1.getGroup2().compareTo(o2.getGroup2());
            if (result == 0) {
                return o1.getGroup3().compareTo(o2.getGroup3());
            } else {
                return result;
            }
        } else {
            return result;
        }
    }
}