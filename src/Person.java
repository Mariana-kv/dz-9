public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Person partner;

    public Person(String firstName, String lastName, int age, Person partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }


    abstract Person getPartner(Person partner);

    abstract boolean isRetired();


    abstract void registerPartnership();

    public abstract void registerPartnership(Person partner);

    abstract void deregisterPartnership();

}
