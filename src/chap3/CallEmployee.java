package chap3;
public class CallEmployee {
    public static void main(String[] args) {
        //call static
        System.out.println("Id:"+Employee.id);
        Employee.work();
        //non static
        Employee em= new Employee();
        System.out.println("Name:"+em.name);
        System.out.println("Age:"+em.age);
        em.getSalary();
    }
    
}
