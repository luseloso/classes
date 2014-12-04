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
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Application app = new Application(){};
        MainForm form = new MainForm();
        form.setVisible(true);
        //app.runTest();
    }

    private void runTest() 
    {
        Syllabus test = new Syllabus(100,100,100);
        test.SyllabusInput();
        System.out.println("Course total: " + test.classTotal());
    }
    
}
