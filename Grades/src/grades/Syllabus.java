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

    private int classtotal = 100;
    
    // Created a Map that contains the grades break down
    
    private Map<String, Grades> syllabus = new HashMap<>();
    private LinkedList<String> categories = new LinkedList<>();
    
    
    // create a new instance of the class with the student input
    // **Implement the 'scan fucntion'**
    private Homeworks homeworkInput = new Homeworks();
    // create a new instance of the class with the student input
    // **Implement the 'scan fucntion'**
    private Final finalInput = new Final();   
    // create a new instance of the class with the student input
    // **Implement the 'scan fucntion'**
    private Midterms midtermsInput = new Midterms();
    
    public void SyllabusInput()
    {                 
        syllabus.put("Midterms", new Grades("Midterms", getCount("Midterms"), getScore("Midterms"), getWeight("Midterms")));
        syllabus.put("Homeworks", new Grades("Homeworks", getCount("Homeworks"), getScore("Homeworks"), getWeight("Homeworks")));
        syllabus.put("Final", new Grades("Final", 1, getScore("Final"), getWeight("Final")));
        categories.add("Midterms");
        categories.add("Homeworks");
        categories.add("Final");
    }
        
    public int getCount(String type)
    {
        int result = 0;
        if (type == "Homeworks")
        {            
            return homeworkInput.getCount();
        }
        if (type == "Final")
        {            
            return finalInput.getCount();
        }
        if (type == "Midterms")
        {            
            return midtermsInput.getCount();
        }
        
        return result;
    }
    
    public float getScore(String type)
    {
        float result = 0;
        if (type == "Homeworks")
        {            
            return homeworkInput.getScore();
        }
        if (type == "Final")
        {            
            return finalInput.getScore();
        }
        if (type == "Midterms")
        {            
            return midtermsInput.getScore();
        }
        
        return result;
    }
    
    public float getWeight(String type)
    {
        int result = 0;
        if (type == "Homeworks")
        {            
            return homeworkInput.getWeight();
        }
        if (type == "Final")
        {            
            return finalInput.getWeight();
        }
        if (type == "Midterms")
        {            
            return midtermsInput.getWeight();
        }
        
        return result;
    }
    
    public float classTotal()
    {
        float result = 0;
        
        for (int i = 0; i < categories.size(); i++) 
        {
            Grades current = syllabus.get(categories.get(i));
            result += (current.score * current.weight/100);
        }
        
        return result;        
    }
   
    
    
    
    
    
    
    
}
