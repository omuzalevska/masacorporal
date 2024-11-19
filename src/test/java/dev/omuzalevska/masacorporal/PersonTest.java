package dev.omuzalevska.masacorporal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testGettersAndSetters() {
        Person person = new Person(70.0, 1.75);
        assertEquals(70.0, person.getWeight());
        assertEquals(1.75, person.getHeight());

        person.setWeight(80.0);
        person.setHeight(1.80);

        assertEquals(80.0, person.getWeight());
        assertEquals(1.80, person.getHeight());
    }
}