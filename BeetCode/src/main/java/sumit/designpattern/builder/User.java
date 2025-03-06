package sumit.designpattern.builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    // Public no-argument constructor
    public User() {}

    // Fluent "with" methods returning the same (mutable) instance
    public User withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public User withAge(int age) {
        this.age = age;
        return this;
    }

    public User withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User withAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "User: " + firstName + " " + lastName +
                ", Age: " + age +
                ", Phone: " + phone +
                ", Address: " + address;
    }
}
