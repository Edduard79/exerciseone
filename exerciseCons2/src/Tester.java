public class Tester {
    public Tester(){
    }

    public static void main(String[] args){

        Student student1 = new Student("Carla");
        Student student2 = new Student("Ferdinando");



        Teacher teacher1 = new Teacher("Antonio");

        teacher1.assignGrade(student1, 29);
        teacher1.assignGrade(student2, 24);

        student1.getStudentDetails();
        student2.getStudentDetails();










        }
}
