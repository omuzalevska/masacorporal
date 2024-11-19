package dev.omuzalevska.masacorporal;

public class App {

public static void main(String[] args) {

     bmiView view = new bmiView();

     double weight = view.askWeight(); 
     double height = view.askHeight(); 

     Person person = new Person(weight, height);

     BmiModel model = new BmiModel(person);

     double bmi = model.calculateBmi();

     String classification = model.giveResultsBMI(bmi);

     view.showResults(bmi, classification);
    }
}
