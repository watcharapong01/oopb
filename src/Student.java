public class Student {

    String studentId;
    String studentName;
    String faculy;
    String major;

    void enrollment() {
        System.out.println("ลงเเล้วจริงๆนะ");
    }

    void payment() {
        System.out.println("จ่ายเเล้วจริงๆนะ");
    }

    void addCourse() {
        System.out.println("ลงทะเบียนเเล้วนะ");
    }

    void dropCourse() {
        System.out.println("ถอนรายวิชาเเล้วนะ");
    }

    public static void main(String[] args) {
        Student pon = new Student();
        System.out.println(">>" + pon );
        pon.enrollment();
        pon.payment();
        pon.addCourse();
        pon.dropCourse();
        
    }
    

}//end 
