public class Person {
    //instance fields
    String name;
    String contact;
    String address;

    void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setContact(String contact){
        this.contact = contact;
    }

    public String getContact(){
        return contact;
    }

    void setaddress(String address){
        this.address = address;
    }

    void display_personData(){
        setName("gaurav shambharkar");
        setContact("84325656565");
        setaddress("ram nagar ward, hinganghat");
    }
}

