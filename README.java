# java-age-project
// Jave age project from codecademy.

public class Person {
  public int age;
  public int wisdom;
  public int fitness;
  
  public Person (int inputAge) {
    this.age = inputAge;
    this.wisdom = inputAge * 5;
    this.fitness = 100 - inputAge;
  }
 
  public void setAge (int newAge) {
    this.age = newAge;
  }
