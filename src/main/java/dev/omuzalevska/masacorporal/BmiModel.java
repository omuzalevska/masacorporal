package dev.omuzalevska.masacorporal;

public class BmiModel {
  // calcular el imc  
private Person person;

public BmiModel(Person person){
    this.person = person;
}

public double calculateBmi() {
    double weight = person.getWeight();
    double height = person.getHeight();

    // return weight / (height*height); // помiняти на квадрат
    return weight / (Math.pow(height, 2));
}

public String giveResultsBMI(double bmi) {
    if (bmi < 16) {
        return "Severe thinnes";
    } else if (bmi < 17) {
        return "Moderate thinnes";
    } else if (bmi < 20) {
        return "Mild thinnes";
    } else if (bmi < 30) {
        return "Normal thinnes";
    } else if (bmi < 35) {
        return "Owerveight";
    } else if (bmi < 40) {
        return "Mild obesity";
    }else {
        return "none";
    }

}

}
