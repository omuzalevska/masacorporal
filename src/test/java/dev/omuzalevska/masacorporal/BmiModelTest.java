package dev.omuzalevska.masacorporal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BmiModelTest {

    @Test
    void testCalculateBmi() {
        Person person = new Person(70.0, 1.75);
        BmiModel bmiModel = new BmiModel(person);
        double bmi = bmiModel.calculateBmi();
        assertEquals(22.86, bmi, 0.01); 
    }

    @Test
    void testGiveResultsBMI() {
        Person person = new Person(70.0, 1.75);
        BmiModel bmiModel = new BmiModel(person);

        assertEquals("Normal weight", bmiModel.giveResultsBMI(22.86));
        assertEquals("Severe thinnes", bmiModel.giveResultsBMI(15.5));
        assertEquals("Moderate obesity", bmiModel.giveResultsBMI(38));
        assertEquals("Moderate thinnes", bmiModel.giveResultsBMI(16.9));
        assertEquals("Slight thinnes", bmiModel.giveResultsBMI(17.0));
        assertEquals("Normal weight", bmiModel.giveResultsBMI(18.5));
    }
}