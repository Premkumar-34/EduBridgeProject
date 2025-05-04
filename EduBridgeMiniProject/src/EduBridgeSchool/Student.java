package EduBridgeSchool;

public class Student {
    private int id;
    private String stdName;
    private int grade;
    private int feesPaid;
    private int totalFees;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.stdName = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.totalFees = 30000; // Default total fees
    }

    public void payFees(int amount){
        feesPaid += amount;
    }
    public int getId() {
        return id;
    }

    public String getStdName() {
        return stdName;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getRemainingFees() {
        return totalFees - feesPaid;
    }

    @Override
    public String toString() {
        return "Student Name: " + stdName + " | ID: " + id + " | Grade: " + grade + " | Fees Paid: ₹" + feesPaid;
    }
}
