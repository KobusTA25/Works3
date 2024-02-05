import java.util.List;

class Controller {
    public void addStudentGroup(List<StudentGroup> studentGroupList, StudentGroup studentGroup) {
        studentGroupList.add(studentGroup);
    }

    public void sortStudentGroups(List<StudentGroup> studentGroupList) {
        StudentGroupService service = new StudentGroupService();
        service.sortStudentGroups(studentGroupList);
    }
}