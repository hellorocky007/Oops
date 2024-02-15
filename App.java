public class App {
    public static void main(String[] args) {
        //default constructor
        // Student s1 = new Student();
        // s1.name="Jay Bardhan Singh";
        // s1.id=19691;
        // s1.nos=7;
        // s1.age=22;
        // System.out.println(s1.name);
        Student s1 = new Student("Rocky Singh",19691,5,21);
        // System.out.println(s1.name);
        // System.out.println(s1.id);
        // System.out.println(s1.age);
        // System.out.println(s1.nos);
        // s1.eating();
        // s1.playing();
        // copy consturctor
        Student B = new Student(s1);
        System.out.println(B.name);
        System.out.println(B.id);
        System.out.println(B.age);
        System.out.println(B.nos);
        B.eating();B.playing();

    }
}
