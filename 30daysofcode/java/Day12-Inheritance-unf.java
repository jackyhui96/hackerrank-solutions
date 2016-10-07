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

class Student extends Person{
	private int[] testScores;
   
}