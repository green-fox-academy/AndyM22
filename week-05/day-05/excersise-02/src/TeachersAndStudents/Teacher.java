package TeachersAndStudents;

public class Teacher {

    public Teacher (){

    }

    public static void answer(){
        System.out.println("Teacher is answering a question");
    }

    public Object teach(Object o){
        Student.learn();
        return o;
    }

}
