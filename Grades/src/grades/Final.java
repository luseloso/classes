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
public class Final 
{
    int count;
    float score;
    float weight;
        
    public Final(){}
    public Final(float score)
    {
        this.score = score;
        this.count = 1;
        this.weight = 36;
    }
    public float getScore()
    {
        return score;
    }
    
}
