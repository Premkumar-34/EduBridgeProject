package EduBridgeSchool;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> teacherList = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();
        School school = new School(teacherList, studentList);

        Scanner in = new Scanner(System.in);

        System.out.println("=== Welcome to EduBridgeSchool Management System ====");

        while (true){
            System.out.println("\n Choose an Option :");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Pay Fees");
            System.out.println("4. Pay Salary");
            System.out.println("5. Show Students");
            System.out.println("6. Show Teachers");
            System.out.println("7. Show Financial Details");
            System.out.println("8. Exit");

            int choice = in.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Enter Student Id: ");
                    int stdId = in.nextInt();
                    System.out.println("Enter Student Name: ");
                    String name = in.next();
                    System.out.println("Enter Student Grade: ");
                    int grade = in.nextInt();
                    Student s = new Student(stdId, name, grade);
                    school.addStudent(s);
                    System.out.println("Student added successfully!");
                    break;
                case 2 :
                    System.out.println("Enter Teacher Id: ");
                    int teacherId = in.nextInt();
                    System.out.println("Enter Teacher Name: ");
                    String teacherName = in.next();
                    System.out.println("Enter Salary: ");
                    int salary = in.nextInt();
                    Teacher teacher = new Teacher(teacherId, teacherName, salary);
                    school.addTeacher(teacher);
                    System.out.println("Teacher added successfully!");
                    break;
                case 3 :
                    System.out.print("Enter student ID: ");
                    int sidPay = in.nextInt();
                    boolean foundStudent = false;
                    for (Student stu : school.getStudents()) {
                        if (stu.getId() == sidPay) {
                            System.out.print("Enter fees amount: ");
                            int fees = in.nextInt();
                            stu.payFees(fees);
                            school.receiveFees(fees);
                            System.out.println("Fees paid successfully!");
                            foundStudent = true;
                            break;
                        }
                    }
                    if (!foundStudent) {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4 :
                    System.out.print("Enter teacher ID: ");
                    int tidPay = in.nextInt();
                    boolean foundTeacher = false;
                    for (Teacher tea : school.getTeachers()) {
                        if (tea.getId() == tidPay) {
                            tea.receiveSalary(tea.getSalary());
                            school.salary(tea.getSalary());
                            System.out.println("Salary paid successfully!");
                            foundTeacher = true;
                            break;
                        }
                    }
                    if (!foundTeacher) {
                        System.out.println("Teacher not found!");
                    }
                    break;
                case 5 :
                    System.out.println("=== Students List ===");
                    for (Student stu : school.getStudents()) {
                        System.out.println(stu);
                    }
                    break;

                case 6 :
                    System.out.println("=== Teachers List ===");
                    for (Teacher tea : school.getTeachers()) {
                        System.out.println(tea);
                    }
                    break;

                case 7 :
                    System.out.println("=== Financial Summary ===");
                    System.out.println("Total Money Earned: ₹" + school.getMoneyEarned());
                    System.out.println("Total Money Spent: ₹" + school.getMoneySpent());
                    System.out.println("Net Balance: ₹" + (school.getMoneyEarned() - school.getMoneySpent()));
                    break;

                case 8 :
                    System.out.println("Thank you! Exiting...");
                    in.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Option. Try Again once...");
            }
        }
    }
}
