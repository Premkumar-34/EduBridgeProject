package EduBridgeSchool;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int moneyEarned;
    private int moneySpent;

    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        this.moneyEarned = 0;
        this.moneySpent = 0;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }


    public void addStudent(Student student){
        students.add(student);
    }

    public void receiveFees(int fees){
        moneyEarned += fees;
    }

    public void salary(int salary){
        moneySpent += salary;
    }

    public List<Teacher> getTeachers(){
        return teachers;
    }

    public List<Student> getStudents(){
        return students;
    }

    public int getMoneyEarned(){
        return moneyEarned;
    }

    public int getMoneySpent(){
        return moneySpent;
    }
}
