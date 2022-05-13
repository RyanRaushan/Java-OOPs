package Student;

public class StudentUse {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.name = "Ryan";
////        student1.rollno = 23;
//        student1.setNameRollNo(23);
//        System.out.println(student1.getRollno() + " " + student1.name);
//        student1.setNameRollNo(0);
//        System.out.println(student1.getRollno());

//        Student student1 = new Student("Raju", -45);
////        System.out.print(student1.getRollno() + " ");
////        System.out.println(student1.name);
//        student1.print();
//
//        Student student2 = new Student("Payal", 1);
//        System.out.print(student2.getRollno() + " ");
//        System.out.println(student2.name);
//
//        student2.print();

        Student s1 = new Student("Koyal", 10, "F");
        s1.print();

        Student s2 = new Student("Rohit", 11, "M");
        s2.print();
        
        Student s3 = new Student("Rahul", 12, "M");
        s3.print();
        
//        System.out.println(s1.numStudent);
//        
//        s1.numStudent = 10;
//        System.out.println(s1.numStudent);
        
        System.out.println(s1.getNumStudent());
        
        
        
       
    }
}
