package day3;

public class SchoolApp {
    public static void main(String[] args) {
        Student ram= new Student();
        ram.setName("Ram Khadka");
        ram.setAddress("Pyuthan");
        ram.setAge(17);
        System.out.println(ram.getName());
        System.out.println(ram.getAge());
        System.out.println(ram.getAddress());

        Teacher hari= new Teacher();
        hari.setName("Hari");
        hari.setAge(34);
        hari.setAddress("Kathmandu");
        System.out.println(hari.getName());
        System.out.println(hari.getAge());
        System.out.println(hari.getAddress());
    }
}
