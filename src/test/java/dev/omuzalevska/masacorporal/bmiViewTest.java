package dev.omuzalevska.masacorporal;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class BmiViewTest {

    @Test
    void testAskWeight() {
        String input = "70\n"; 
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        bmiView view = new bmiView();
        double weight = view.askWeight();

        assertEquals(70, weight);
    }

    @Test
    void testAskHeight() {
        String input = "1.75\n"; 
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        bmiView view = new bmiView();
        double height = view.askHeight();

        assertEquals(1.75, height);
    }

    @Test
    void testShowResults() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        bmiView view = new bmiView();
        view.showResults(22.86, "Normal weight");

        String expectedOutput = "You BMI is: 22,86\n\nYou BMI is: Normal weight\n";
        assertEquals(expectedOutput, out.toString());
    }
}

