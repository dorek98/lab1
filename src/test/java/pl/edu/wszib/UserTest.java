package pl.edu.wszib;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    @DisplayName("should Increase Age After Birthday")
    public void shouldIncreaseAgeAfterBirthday(){
        //given: we create user
        final User user = new User("Dorian","Kraj",22);

        //when: user has birthday
        user.birthday();

        //then: age should be incremented by 1
        assertEquals(23, user.getAge(),"User's age should be 23");

    }
}