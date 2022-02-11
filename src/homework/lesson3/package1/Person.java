package homework.lesson3.package1;


public class Person {
    public static void main(String[] args) {
        Student student = new Student();
        student.numele = "Sandu";
        student.prenumele = "Ion";
        student.idnp = "87676587876";
        student.virsta = 78;
        student.greutatea = 80;

        System.out.println(student.numele);
        System.out.println(student.prenumele);
        System.out.println(student.idnp);
        System.out.println(student.virsta);
        System.out.println(student.greutatea);
    }
}
