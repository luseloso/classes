/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package grades;

/**
 *
 * @author luislopez
 */
public class Grades 
{
    String type;
    int count;
    float score, weight;
    public Grades(){}
    public Grades (String type, int count, float score, float weight)
    {     
        this.type = type;
        this.count = count;
        this.score = score;
        this. weight = weight;
    }
    
}
