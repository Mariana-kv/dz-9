public class Man extends Person {

    public Man(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    Person getPartner(Person partner) {
        return null;
    }

    @Override
    public boolean isRetired() {
        if (getAge() > 65) {
            return true;
        }
        return false;
    }

    @Override
    void registerPartnership() {

    }

    @Override
    public void registerPartnership(Person partner) {

    }

    @Override
    void deregisterPartnership() {

    }

}
