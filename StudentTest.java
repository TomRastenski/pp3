public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name="Peter";
        s.age=21;
        s.idcard="221048";
        s.validid=true;
        s.semesternum=5;
        s.avgg=4.5;

        System.out.println(s.name+" "+s.age);
        System.out.println(s.sayHello());
        s.displayAge();
        s.displayName();
        s.displayinfo();
        s.displaymoreinfo();
        s.chgvalid();
        s.displaymoreinfo();



    }
}

