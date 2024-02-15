public class Student {
    // Atrributes
    public int id;
    public String name;
    public int nos;
    public int age;
    //default contructor
    public Student(){
        System.out.println("This is default constructor");
    }
    // parametrize constructor
    public Student(String name,int id,int nos,int age){
        System.out.println("This is para constructor");
        this.name= name;
        this.id = id;
        this.nos = nos;
        this.age = age;
    }
    // copy constructor
    public Student(Student s){
        System.out.println("This is copy constructor");
        this.name= s.name;
        this.id = s.id;
        this.nos = s.nos;
        this.age = s.age;
    }
    //Behavior
    public void studying(){
        System.out.println(name+" Stdying");
    }
    public void playing(){
        System.out.println(name+" Playing");
    }
    public void eating(){
        System.out.println(name+" Eating");
    }
}
