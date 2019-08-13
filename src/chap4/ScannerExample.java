package chap4;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.print("name is"+name);
        System.out.print("Enter age :");
        int age = sc.nextInt(); 
        if(age <=11) {
            System.out.println("วัยเด็ก");
        }else if (age <=20){
            System.out.println("วัยรุ่น");
        }else if (age <=40){
             System.out.println("วัยผู้ใหญ่");
        }else if (age <=60){
            System.out.println("วัยกลางคน");
        }else if (age <=65){
          System.out.println("วัยสูงอายุ");
        }else if (age >=66){
          System.out.println("ไม่ระบุ");
        }   
        System.out.print("enter salary:");
        double salary = sc.nextDouble();
        
        System.out.print("enter Degree:");
        int degree =sc.nextInt();
        switch (degree){
            case 1:
                System.out.print("ปริญญาตรี");
                break;
            case 2:
                System.out.print("ปริญญาโท");
                break;
            case 3:
                System.out.print("ปริญญาเอก");
                break;
            default:
                System.out.print("ไม่ระบุ");
                break;          
        }
        System.out.print("Employee name:"+name);
        System.out.print(",age:"+age+",salary:"+salary);   
    }
    }

    
      

    
