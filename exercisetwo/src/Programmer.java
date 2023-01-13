public class Programmer {

    public String name;
    public String programmingLanguage;
    public int yearsOfExperience;

        public void printProgrammerDetails(String prName, String prProgrammingLanguage, int prYearsOfExperience){
            name = prName;
            programmingLanguage = prProgrammingLanguage;
            yearsOfExperience = prYearsOfExperience;

            System.out.println("Name: " + name + " -- " +"Languages: " + programmingLanguage + " -- " + "Years of exp: " + yearsOfExperience);

        }

}
