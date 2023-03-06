package OOPS.Encapsulation;


 class Student {
    private int rollNo=55;
    private String name="Nirmal";

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student detail=new Student();
        System.out.println(detail.getName()); // output => Nirmal
        detail.setName("Periyasamy");
        System.out.println(detail.getName()); // output => Periyasamy
    }
}
