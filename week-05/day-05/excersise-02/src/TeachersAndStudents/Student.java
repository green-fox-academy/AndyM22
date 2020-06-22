package TeachersAndStudents;

public class Student {

    public Student(){

    }

    public static void learn(){
        System.out.println("Student is learning something new");
    }

    public Object question (Object o){
        Teacher.answer();
        return o;
    }



}
