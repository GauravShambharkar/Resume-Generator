
public class App {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Gaurav Shambharkar");
        person.setContact("84325656565");
        person.setaddress("Ram Nagar Ward, Hinganghat");

        Resume resume = new Resume();
        resume.setName("Gaurav Shambharkar");
        resume.setContact("84325656565");
        resume.setaddress("Ram Nagar Ward, Hinganghat");
        resume.setSkills("Java, JavaScript, ReactJS, NodeJS, Express");
        resume.setEducation("Graduation");
        resume.setExperience("5yr+");

        System.out.println(person); // calls person.toString()
        System.out.println(resume);
    }
}