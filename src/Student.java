class Student implements Comparable<Student> {
    private Long studentGroupId;
    private String group1;
    private String group2;
    private String group3;

    public Student(String group1) {
        this.group1 = group1;
    }

    public Long getStudentGroupId() {
        return studentGroupId;
    }

    public void setStudentGroupId(Long studentGroupId) {
        this.studentGroupId = studentGroupId;
    }

    public String getGroup1() {
        return group1;
    }

    public void setGroup1(String group1) {
        this.group1 = group1;
    }

    public String getGroup2() {
        return group2;
    }

    public void setGroup2(String group2) {
        this.group2 = group2;
    }

    public String getGroup3() {
        return group3;
    }

    public void setGroup3(String group3) {
        this.group3 = group3;
    }

    @Override
    public int compareTo(Student o) {
        return this.group1.compareTo(o.group1);
    }

    @Override
    public String toString() {
        return "Студент {" +
                "Номер группы в потоке = " + studentGroupId +
                ", Группа1 = '" + group1 + '\'' +
                ", Группа2 = '" + group2 + '\'' +
                ", Группа3 = '" + group3 + '\'' +
                '}';
    }
}