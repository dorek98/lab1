package pl.edu.wszib;

public class UserDoubleAged extends User {
    public UserDoubleAged(String firstname, String lastname, int age) {
        super(firstname, lastname, age);
    }

    public void birthday(){
        setAge(getAge() + 2 );
    }
}
