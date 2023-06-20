package atm.management.system;

//Import awt from java
import java.awt.*;
import java.awt.event.*;


import java.time.*;
import java.time.format.DateTimeFormatter;

//Importing Swing from javax(Java Extended)
import javax.swing.*;

import com.toedter.calendar.*;



public class SignUpFirst extends JFrame implements ActionListener{

    JTextField firstNameField = new JTextField();
    JTextField lastNameField = new JTextField();
    JTextField fathersNameField = new JTextField();
    JTextField emailAddField = new JTextField();
    JTextField conNoField = new JTextField();
    

    public SignUpFirst(){

        setLayout(null);

        /*----------------------------Add Text Parts----------------------------*/
        JLabel heading = new JLabel("Personal Details: General");
        heading.setFont(new Font("Osward",Font.BOLD,28));
        heading.setBounds(250, 20,500,40);
        add(heading);

        //generate an unique Application Number according to date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        final long formatedDatetime = Long.parseLong(currentDateTime.format(DateTimeFormatter.ofPattern("yyyyMMddHHmm")));
        JLabel applicationNoLabel = new JLabel("Application No:"+formatedDatetime);
        applicationNoLabel.setFont(new Font("Osward",Font.BOLD,18));
        applicationNoLabel.setBounds(280, 55,500,40);
        add(applicationNoLabel); 

        /*----------------------------Add Credentials spaces----------------------------*/

        JLabel firstName = new JLabel("First Name:");
        firstName.setFont(new Font("Osward",Font.BOLD,18));
        firstName.setBounds(50, 120,110,40);
        add(firstName);

        
        firstNameField.setFont(new Font("Osward",Font.BOLD,18));
        firstNameField.setBounds(220, 125,450,30);
        add(firstNameField);

        JLabel lastName = new JLabel("Last Name:");
        lastName.setFont(new Font("Osward",Font.BOLD,18));
        lastName.setBounds(50, 170,100,40);
        add(lastName);

        
        lastNameField.setFont(new Font("Osward",Font.BOLD,18));
        lastNameField.setBounds(220, 175,450,30);
        add(lastNameField);

        JLabel fathersName = new JLabel("Father's Name:");
        fathersName.setFont(new Font("Osward",Font.BOLD,18));
        fathersName.setBounds(50, 220,150,40);
        add(fathersName);

        
        fathersNameField.setFont(new Font("Osward",Font.BOLD,18));
        fathersNameField.setBounds(220, 225,450,30);
        add(fathersNameField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Osward",Font.BOLD,18));
        dob.setBounds(50, 270,150,40);
        add(dob);

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(220, 275,450,30);
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Osward",Font.BOLD,18));
        gender.setBounds(50, 320,150,40);
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setFont(new Font("Osward",Font.BOLD,16));
        male.setBounds(220, 320,100,40);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setFont(new Font("Osward",Font.BOLD,16));
        female.setBounds(350, 320,100,40);
        add(female);

        JRadioButton gOthers = new JRadioButton("Others");
        gOthers.setFont(new Font("Osward",Font.BOLD,16));
        gOthers.setBounds(510, 320,150,40);
        add(gOthers);

        ButtonGroup gGroup = new ButtonGroup();
        gGroup.add(male);
        gGroup.add(female);
        gGroup.add(gOthers);

        JLabel mStatus = new JLabel("Marital Status:");
        mStatus.setFont(new Font("Osward",Font.BOLD,18));
        mStatus.setBounds(50, 370,150,40);
        add(mStatus);

        JRadioButton married = new JRadioButton("Married");
        married.setFont(new Font("Osward",Font.BOLD,16));
        married.setBounds(220, 370,100,40);
        add(married);

        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Osward",Font.BOLD,16));
        unmarried.setBounds(350, 370,150,40);
        add(unmarried);

        JRadioButton msOthers = new JRadioButton("Others");
        msOthers.setFont(new Font("Osward",Font.BOLD,16));
        msOthers.setBounds(510, 370,150,40);
        add(msOthers);

        ButtonGroup msGroup = new ButtonGroup();
        msGroup.add(married);
        msGroup.add(unmarried);
        msGroup.add(msOthers);

        JLabel conNo = new JLabel("Contact No:");
        conNo.setFont(new Font("Osward",Font.BOLD,18));
        conNo.setBounds(50, 420,150,40);
        add(conNo);

        conNoField.setFont(new Font("Osward",Font.BOLD,18));
        conNoField.setBounds(220, 425,450,30);
        add(conNoField);

        JLabel emailAdd = new JLabel("Email Address:");
        emailAdd.setFont(new Font("Osward",Font.BOLD,18));
        emailAdd.setBounds(50, 470,150,40);
        add(emailAdd);

        emailAddField.setFont(new Font("Osward",Font.BOLD,18));
        emailAddField.setBounds(220, 475,450,30);
        add(emailAddField);


        JButton cancel = new JButton("Cancel");
        cancel.setBackground(Color.RED);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Osward",Font.BOLD,18));
        cancel.setBounds(220,525,125,35);
        add(cancel);

        JButton nextPage = new JButton("Next");
        nextPage.setBackground(Color.GREEN);
        nextPage.setForeground(Color.WHITE);
        nextPage.setFont(new Font("Osward",Font.BOLD,18));
        nextPage.setBounds(520,525,125,35);
        add(nextPage);

        JButton clear = new JButton("Clear");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setFont(new Font("Osward",Font.BOLD,16));
        clear.setBounds(370,525,125,35);
        add(clear);


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

    public static void main(String arg[]){
        
        new SignUpFirst();
    }
}
