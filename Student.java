public class Student{
    String name;
    int age;
    String idcard;
    boolean validid;
    int semesternum;
    double avgg;

    public String sayHello(){
        String h="Hello from "+name;
        return h;
    }

    void displayName(){
        System.out.println(name);
    }
    void displayAge(){
        System.out.println(age);
    }

    void displayinfo(){
        System.out.println(name+", "+semesternum+", "+avgg);
    }

    void chgvalid(){
        boolean n;
        n=validid;
        validid= !n;
    }

    void displaymoreinfo(){
        System.out.println(name+", "+idcard+", "+validid);
    }

}