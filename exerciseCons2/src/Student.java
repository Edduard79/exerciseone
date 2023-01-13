public class Student {

    public String name;
    public int grade;


        public Student(String studentName){
            System.out.println("New student joined! Welcome to " + studentName + ".");
            name = studentName;

        }

        public void getStudentDetails(){

            System.out.println("Name: " + name + " ----- " + "Grade: " + grade);

        }



}
