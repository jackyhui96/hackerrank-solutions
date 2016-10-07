/*
    You are given two classes, Person and Student, 
    where Person is the base class and Student is the derived class. 
    Completed code for Person and a declaration for Student are provided for you in the editor. 
    Observe that Student inherits all the properties of Person.
    Complete the Student class by writing the following:
    A Student class constructor, which has 4 parameters:    
    
    A string, firstName.
    A string, lastName.
    An integer, id.
    An integer array (or vector) of test scores, scores. 

    A char calculate() method that calculates a Student object's average and 
    returns the grade character representative of their calculated average:

    O 90 <= a <= 100
    E 80 <= a < 90
    A 70 <= a < 80
    P 55 <= a < 70
    D 40 <= a < 50
    T a < 40
*/

class Student extends Person {
	private int[] testScores;
    
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    
    public char calculate() {
        int sum = 0;
        for(int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }

        int average = sum/testScores.length;
        if(average >= 90 && average <= 100) {
            return 'O';
        }
        else if(average >= 80 && average < 90) {
            return 'E';
        }
        else if(average >= 70 && average < 80) {
            return 'A';
        }
        else if(average >= 55 && average < 70) {
            return 'P';
        }
        else if(average >= 40 && average < 55) {
            return 'D';
        }
        else {
            return 'T';
        }
    }
}