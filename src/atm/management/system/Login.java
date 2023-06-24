package atm.management.system;

//Import awt from java
import java.awt.*;
import java.awt.event.*;

//Importing Swing from javax(Java Extended)
import javax.swing.*;

public class Login extends JFrame implements ActionListener{

    //We need to define the needed buttons objects globaly so that we can use in the objects in the construtor as well as in all needed functions
    JButton loginButton = new JButton("Log In");
    JButton clearButton = new JButton("Clear");
    JButton signupButton = new JButton("Sign Up");

    JTextField cardNoField = new JTextField();
    JPasswordField pinField = new JPasswordField();
    //Define the constructor "Login" as whenever we create a Login object a we get a proper frame immidiately
    Login(){
        //setTitle: set the title of the frame
        setTitle("Automated Teller Machine");
        
        //setLayout: change the default layout *I'm making this null as I am creating my own layout*
        setLayout(null);

        /*----------------------------Add Logo Part----------------------------*/

        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("images/atm-machine.png"));
        Image temp_img = icon1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(temp_img);
        JLabel label1 = new JLabel(icon2);
        label1.setBounds(70, 10, 100, 100);
        add(label1);

        /*----------------------------Add Text Parts----------------------------*/

        JLabel heading = new JLabel("Welcome to ATM System!");
        heading.setFont(new Font("Osward",Font.BOLD,36));
        heading.setBounds(200, 40,500,40);
        add(heading);

        /*----------------------------Add Credentials spaces----------------------------*/

        JLabel cardNo = new JLabel("Card No:");
        cardNo.setFont(new Font("Osward",Font.BOLD,26));
        cardNo.setBounds(120, 150, 400, 40);
        add(cardNo);

        cardNoField.setBounds(300, 150, 225, 40);
        cardNoField.setFont(new Font("Arial",Font.BOLD,20));
        add(cardNoField);

        JLabel pin = new JLabel("Secret PIN:");
        pin.setFont(new Font("Osward",Font.BOLD,26));
        pin.setBounds(120, 220, 400,40);
        add(pin);

        pinField.setBounds(300, 220, 225, 40);
        pinField.setFont(new Font("Arial",Font.BOLD,20));
        add(pinField);

        JLabel signuptxt = new JLabel("New in this system click on 'Sign Up' button!");
        signuptxt.setFont(new Font("Osward",Font.BOLD,16));
        signuptxt.setBounds(245, 350, 400, 40);
        add(signuptxt);

        /*----------------------------Add Buttons----------------------------*/
        //LogIn
        loginButton.setBounds(300,300,110,40);
        loginButton.addActionListener(this);
        add(loginButton);
        //Clear
        clearButton.setBounds(415,300,110,40);
        clearButton.addActionListener(this);
        add(clearButton);
        //SignUp
        signupButton.setBounds(300,400,220,40);
        signupButton.addActionListener(this);
        add(signupButton);

        /*----------------------------set the frame----------------------------*/

        //setSize: creats the frame according to it's given parameters(width,height)
        setSize(800,500);
        //setVisible: use to make the frame visible or not according to its bool type parameter
        setVisible(true);
        //setLocation: set the initial location of the window
        setLocation(325,175);

        
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==loginButton)
        {

        }
        else if(ae.getSource()==clearButton)
        {
            cardNoField.setText("");
            pinField.setText("");
        }
        else if(ae.getSource()==signupButton)
        {
            setVisible(false);
            new SignUpFirst().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
