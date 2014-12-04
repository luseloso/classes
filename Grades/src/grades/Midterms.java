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
public class Midterms 
{
    int count;
    float score;
    float weight;
        
    public Midterms(){}
    public Midterms(float score)
    {
        this.score = score;
        this.count = 1;
        this.weight = 60;
    }
}
