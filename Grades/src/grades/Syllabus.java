/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package grades;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author luislopez
 */
public class Syllabus 
{
    
    // We are going to need the user inputs for the grades breakdown
    // We already know the highest grade in the class is 100%
    // For now all the values are generic to test the stuff
    // The grade breakdowns for now are
    // Hw       50%
    // Midterms 20%
    // Final    30%
    private int classtotal = 100;
    public String userID, studentEmail, userPassword;
    public float homeworkScores, finalScore, midtermScore;
    
    public Syllabus(float homeworkScores, float midtermScore, float finalScore)
    {
        this.homeworkScores = homeworkScores;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }
    
    // Created a Map that contains the grades break down
    
    private Map<String, Grades> syllabus = new HashMap<>();
    private LinkedList<String> categories = new LinkedList<>();
    
    public void SyllabusInput()
    {        
    // create a new instance of the class with the student input
    // **Implement the 'scan fucntion'**
        Homeworks homeworkInput = new Homeworks(this.homeworkScores);
    // create a new instance of the class with the student input
    // **Implement the 'scan fucntion'**
        Final finalInput = new Final(this.finalScore);   
    // create a new instance of the class with the student input
    // **Implement the 'scan fucntion'**
        Midterms midtermsInput = new Midterms(this.midtermScore);
    
        syllabus.put("Midterms", new Grades("Midterms", midtermsInput.count, midtermsInput.score, midtermsInput.weight ));
        syllabus.put("Homeworks", new Grades("Homeworks", homeworkInput.count, homeworkInput.score, homeworkInput.weight));
        syllabus.put("Final", new Grades("Final", finalInput.count, finalInput.score, finalInput.weight));
        categories.add("Midterms");
        categories.add("Homeworks");
        categories.add("Final");
    }
    
    public float classTotal()
    {
        float result = 0;
        
        for (int i = 0; i < categories.size(); i++) 
        {
            Grades current = syllabus.get(categories.get(i));
            //System.out.println(categories.get(i));
            //System.out.println(current.score);
            result += (current.score * current.weight/100);
        }
        
        return result;        
    }
   
    
    
    
    
    
    
    
}
