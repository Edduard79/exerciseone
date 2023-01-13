public class Teacher {
    public String teacherName;

    public Teacher(String teacherName){
        System.out.println("Hired new teacher! Say hi to Mr./Mss " + teacherName + ".");
    }

    public void assignGrade(Student alum, int finalGrade){

        alum.grade = finalGrade;

    }
}
