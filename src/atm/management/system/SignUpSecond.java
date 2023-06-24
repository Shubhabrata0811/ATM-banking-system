package atm.management.system;

//Import awt from java
import java.awt.*;
import java.awt.event.*;


//Importing Swing from javax(Java Extended)
import javax.swing.*;



public class SignUpSecond extends JFrame implements ActionListener{
    SignUpSecond(){

        setLayout(null);

        /*----------------------------set the frame----------------------------*/

        //setSize: creats the frame according to it's given parameters(width,height)
        setSize(850,650);
        //setVisible: use to make the frame visible or not according to its bool type parameter
        setVisible(true);
        //setLocation: set the initial location of the window
        setLocation(300,100);
    }

    public void actionPerformed(ActionEvent ae){

    }

    public static void main(String[] args){
        new SignUpSecond();
    }
}
