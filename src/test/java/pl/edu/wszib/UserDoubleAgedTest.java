package pl.edu.wszib;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDoubleAgedTest {
    @Test
    @DisplayName("should Increase Age by 2 After Birthday")
    public void shouldIncreaseAgeBy2AfterBirthday(){
        //given: we create user
        final UserDoubleAged user = new UserDoubleAged("Dorian","Kraj",22);

        //when: user has birthday
        user.birthday();

        //then: age should be incremented by 1
        assertEquals(24, user.getAge(),"User's age should be 24");

    }

}