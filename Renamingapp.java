/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renamingapp;

/**
 *
 * @author p_unit
 */
public class Renamingapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Start start = new Start();
            start.setVisible(true);
            start.setTitle("File(s) name changer");
            start.setSize(514, 370);
            start.setLocation(387, 219);
            start.setResizable(false);

        } catch (Exception e) {

            System.out.println(e.getStackTrace());

        }
    }

}
