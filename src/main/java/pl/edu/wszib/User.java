package pl.edu.wszib;

public class User {
    private final String firstname;
    private final String lastname;
    private int age;

    public User(final String firstname,
                final String lastname,
                int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public void birthday(){
        this.age += 1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
