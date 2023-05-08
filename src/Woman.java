public class Woman extends Person {
    public Woman(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    Person getPartner(Person partner) {
        return null;
    }


    @Override
    public boolean isRetired() {
        if (getAge() > 60) {
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
    public void deregisterPartnership() {

    }
}
