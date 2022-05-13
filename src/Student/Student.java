package Student;

public class Student {
//    final data member are initialized as soon as possible.
    String name;
    private int rollno;
    private final String age;
    private static int numStudent;
    
    public Student(String name, int rollno, String age){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        numStudent++;
    }
    
//    public void setNameRollNo(int rn){
//        if (rn <= 0){
//            return;
//        }
//        rollno = rn;
//    }
//    public int getRollno(){
//        return rollno;
//    }
    
    public static int getNumStudent() {
    	return numStudent;
    }
    
    public void print(){
        System.out.print(rollno + " ");
        System.out.println(name + " " + age);
        System.out.println(numStudent);
    }
}
