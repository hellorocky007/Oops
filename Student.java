public class Student {
    // Atrributes
    private int id;
    private String name;
    private int nos;
    private int age;
    // using getter and setter to access those thing
   public String getName(){
    return this.name;
   }
   public int getAge(){
    return this.age;
   }
   public void setAge(int a){
    this.age = a;
   }
    // private String gf;
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
        // this.gf = gf;
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
