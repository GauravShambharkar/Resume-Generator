public class Resume extends Person{
    String[] skills;
    String[] education;
    String[] experience;

    void setSkills(String skills){
        this.skills = new String[]{skills};
    }

    public String[] getSkills(){
        return this.skills;
    }

    public void  setEducation(String education) {
        this.education = new String[]{education};
    }

    public String[] getEducation() {
        return education;
    }

    public String[] getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = new String[]{experience};
    }


}
