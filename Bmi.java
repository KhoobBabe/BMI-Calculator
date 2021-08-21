package com.khubaib;

import java.util.Scanner;

//class for BMI calculation
public class Bmi {

    //variables declared
    String name;
    int age;
    double weight;
    double height;

    //BMI constructor
    public Bmi(String names, int ages, double weights, double heights){
        name = names;
        age = ages;
        weight = weights;
        height = heights;
    }

    //BMI constructor without age (not used)
    public Bmi(String names, double weights, double heights){
        name = names;
        weight = weights;
        height = heights;
    }

    //returns the value of BMI
    public double getBmi(){
        return Math.round(weight * 0.45359237 / (height * 0.0254 * height * 0.0254));
    }

    //returns the status of BMI of the person
    public String getStatus() {
        if (getBmi() < 18.5) {
            return "Underweight";
        } else if (getBmi() >=18.5 && getBmi() <=24.9) {
            return "Normal";
        } else if (getBmi() >=25 && getBmi() <=29.9) {
            return "Overweight";
        } else if (getBmi() >= 30) {
            return "Obese";
        }
        return null;
    }

    //to get age
    public int getAge(){
        return age;
    }
    //to get weight
    public double getWeight(){
        return weight;
    }
    //to get height
    public double getHeight(){
        return height;
    }
    //to get name
    public String getName(){
        return name;
    }

    public void setName(String names){
        name = names;
    }
    public void setAge(int ages){
        age = ages;
    }
    public  void setWeight(double weights){
        weight = weights;
    }
    public void setHeight(double heights){
        height = heights;
    }
}

//class to test BMI
class BmiTest{

    public static void main(String[] args) {

        //input declared
        Scanner input = new Scanner(System.in);

        System.out.println("           BMI CALCULATOR         ");
        System.out.println("Enter your name: ");
        String name = input.next();//name input
        System.out.println("Enter your age: ");
        int age = input.nextInt();//age input
        System.out.println("Enter your weight: ");
        double weight = input.nextDouble();//weight input
        System.out.println("Enter your height: ");
        double height = input.nextDouble();//height input

        Bmi person = new Bmi(name, age, weight, height);//info sent to BMI class

        //output is printed
        System.out.println("\n OUTPUT");
        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+person.getAge());
        System.out.println("Weight: "+person.getWeight());
        System.out.println("Height: "+person.getHeight());
        System.out.println("BMI: "+person.getBmi());
        System.out.println("Status: "+person.getStatus());

    }
}
