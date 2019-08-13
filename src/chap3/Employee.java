package chap3;
public class Employee {
    static int id = 1001;
    String name ="watcharapong";
    int age = 35;
    
    static void work(){
        System.out.println("work()");
    }
    
    void getSalary(){
        System.out.println("getSalary()");
    }
    
    public static void main(String[] args) {
        //call static
        System.out.println("id :"+id);
        work();
        //non static
       Employee em = new Employee();
        System.out.println("Name:"+em.name);
        System.out.println("Age:"+em.age);
        em.getSalary();     
    }
    
}
