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

    //generate an unique Application Number according to date and time
    public static LocalDateTime currentDateTime = LocalDateTime.now();
    public static long formatedDatetime = Long.parseLong(currentDateTime.format(DateTimeFormatter.ofPattern("yyyyMMddHHmm")));
    public static final long appNo = formatedDatetime;

    JTextField firstNameField = new JTextField();
    JTextField lastNameField = new JTextField();
    JTextField fathersNameField = new JTextField();
    JTextField emailAddField = new JTextField();
    JTextField conNoField = new JTextField();

    JDateChooser dateChooser = new JDateChooser();

    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    JRadioButton gOthers = new JRadioButton("Others");

    JRadioButton married = new JRadioButton("Married");
    JRadioButton unmarried = new JRadioButton("Unmarried");
    JRadioButton msOthers = new JRadioButton("Others");

    ButtonGroup gGroup = new ButtonGroup();
    ButtonGroup msGroup = new ButtonGroup();

    JButton cancelButton = new JButton("Cancel");
    JButton clearButton = new JButton("Clear");
    JButton nextPageButton = new JButton("Next");

    

    public SignUpFirst(){

        setLayout(null);

        /*----------------------------Add Text Parts----------------------------*/
        JLabel heading = new JLabel("Welcome to ATM System!");
        heading.setFont(new Font("Osward",Font.BOLD,28));
        heading.setBounds(230, 10,500,40);
        add(heading);

        JLabel tyHeading = new JLabel("Thankyou for choosing our service...");
        tyHeading.setFont(new Font("Osward",Font.BOLD,24));
        tyHeading.setBounds(200, 45,500,40);
        add(tyHeading);

        JLabel subHeading = new JLabel("Personal Details: General");
        subHeading.setFont(new Font("Osward",Font.BOLD,16));
        subHeading.setBounds(100, 85,300,40);
        add(subHeading);

        JLabel applicationNoLabel = new JLabel("Application No:"+appNo);
        applicationNoLabel.setFont(new Font("Osward",Font.BOLD,16));
        applicationNoLabel.setBounds(450, 85,500,40);
        add(applicationNoLabel);

        /*----------------------------Add Credentials spaces----------------------------*/

        JLabel firstName = new JLabel("First Name:");
        firstName.setFont(new Font("Osward",Font.BOLD,18));
        firstName.setBounds(50, 130,110,40);
        add(firstName);

        
        firstNameField.setFont(new Font("Osward",Font.BOLD,18));
        firstNameField.setBounds(220, 135,450,30);
        add(firstNameField);

        JLabel lastName = new JLabel("Last Name:");
        lastName.setFont(new Font("Osward",Font.BOLD,18));
        lastName.setBounds(50, 180,100,40);
        add(lastName);

        
        lastNameField.setFont(new Font("Osward",Font.BOLD,18));
        lastNameField.setBounds(220, 185,450,30);
        add(lastNameField);

        JLabel fathersName = new JLabel("Father's Name:");
        fathersName.setFont(new Font("Osward",Font.BOLD,18));
        fathersName.setBounds(50, 230,150,40);
        add(fathersName);

        
        fathersNameField.setFont(new Font("Osward",Font.BOLD,18));
        fathersNameField.setBounds(220, 235,450,30);
        add(fathersNameField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Osward",Font.BOLD,18));
        dob.setBounds(50, 280,150,40);
        add(dob);

        dateChooser.setBounds(220, 285,450,30);
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Osward",Font.BOLD,18));
        gender.setBounds(50, 330,150,40);
        add(gender);

        male.setFont(new Font("Osward",Font.BOLD,16));
        male.setBounds(220, 330,100,40);
        add(male);

        female.setFont(new Font("Osward",Font.BOLD,16));
        female.setBounds(350, 330,100,40);
        add(female);

        gOthers.setFont(new Font("Osward",Font.BOLD,16));
        gOthers.setBounds(510, 330,150,40);
        add(gOthers);

        gGroup.add(male);
        gGroup.add(female);
        gGroup.add(gOthers);

        JLabel mStatus = new JLabel("Marital Status:");
        mStatus.setFont(new Font("Osward",Font.BOLD,18));
        mStatus.setBounds(50, 380,150,40);
        add(mStatus);

        married.setFont(new Font("Osward",Font.BOLD,16));
        married.setBounds(220, 380,100,40);
        add(married);

        unmarried.setFont(new Font("Osward",Font.BOLD,16));
        unmarried.setBounds(350, 380,150,40);
        add(unmarried);

        msOthers.setFont(new Font("Osward",Font.BOLD,16));
        msOthers.setBounds(510, 380,150,40);
        add(msOthers);

        msGroup.add(married);
        msGroup.add(unmarried);
        msGroup.add(msOthers);

        JLabel conNo = new JLabel("Contact No:");
        conNo.setFont(new Font("Osward",Font.BOLD,18));
        conNo.setBounds(50, 430,150,40);
        add(conNo);

        conNoField.setFont(new Font("Osward",Font.BOLD,18));
        conNoField.setBounds(220, 435,450,30);
        add(conNoField);

        JLabel emailAdd = new JLabel("Email Address:");
        emailAdd.setFont(new Font("Osward",Font.BOLD,18));
        emailAdd.setBounds(50, 480,150,40);
        add(emailAdd);

        emailAddField.setFont(new Font("Osward",Font.BOLD,18));
        emailAddField.setBounds(220, 485,450,30);
        add(emailAddField);


        cancelButton.setBackground(Color.RED);
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setFont(new Font("Osward",Font.BOLD,18));
        cancelButton.setBounds(220,535,125,35);
        cancelButton.addActionListener(this);
        add(cancelButton);

        nextPageButton.setBackground(Color.GREEN);
        nextPageButton.setForeground(Color.WHITE);
        nextPageButton.setFont(new Font("Osward",Font.BOLD,18));
        nextPageButton.setBounds(520,535,125,35);
        nextPageButton.addActionListener(this);
        add(nextPageButton);

        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.WHITE);
        clearButton.setFont(new Font("Osward",Font.BOLD,16));
        clearButton.setBounds(370,535,125,35);
        clearButton.addActionListener(this);
        add(clearButton);


        /*----------------------------set the frame----------------------------*/

        //setSize: creats the frame according to it's given parameters(width,height)
        setSize(850,650);
        //setVisible: use to make the frame visible or not according to its bool type parameter
        setVisible(true);
        //setLocation: set the initial location of the window
        setLocation(300,100);
    }
   

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==cancelButton){
            setVisible(false);
            new Login().setVisible(true);

        }
        else if(ae.getSource()==clearButton){
            firstNameField.setText("");
            lastNameField.setText("");
            fathersNameField.setText("");
            dateChooser.setDate(null);
            msGroup.clearSelection();
            gGroup.clearSelection();
            emailAddField.setText("");
            conNoField.setText("");
        }
        else if(ae.getSource()==nextPageButton){
            String appNoDB = ""+ appNo;
            String firstNameDB = firstNameField.getText();
            String lastNameDB = lastNameField.getText();
            String fathersNameDB = fathersNameField.getText();
            String genderDB = new String("");
            String mstatusDB = new String("");
            String conNoDB = conNoField.getText();
            String emailAddDB = emailAddField.getText();
            java.util.Date dob = dateChooser.getDate();
            java.sql.Date dobDB = null;
            if(dob == null)
            {
                JOptionPane.showMessageDialog(null,"Date of Birth is required!");
            }
            else{
                dobDB =new java.sql.Date(dob.getTime());
            }


            boolean valid = true;
            try{
                if (firstNameDB.equals("")){
                    JOptionPane.showMessageDialog(null,"First Name required!");
                    valid = false;
                }
                
                if (lastNameDB.equals("")){
                    JOptionPane.showMessageDialog(null,"Last Name required!");
                    valid = false;
                }

                if (fathersNameDB.equals("")){
                    JOptionPane.showMessageDialog(null,"Father's Name required!");
                    valid = false;
                }

                //Gender
                if(male.isSelected()){
                genderDB ="Male";
                }
                else if(female.isSelected()){
                    genderDB ="Female";
                }
                else if(gOthers.isSelected()){
                    genderDB ="Others";
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please select your gender!");
                    valid = false;
                }

                //Marital status
                if(married.isSelected()){
                mstatusDB ="Married";
                }
                else if(unmarried.isSelected()){
                    mstatusDB ="Unmarried";
                }
                else if(msOthers.isSelected()){
                    mstatusDB ="Others";
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please select your marital status!");
                    valid = false;
                }
            
                if (emailAddDB.equals("")){
                    JOptionPane.showMessageDialog(null,"Email address required!");
                    valid = false;
                }

                if (conNoDB.equals("")){
                    JOptionPane.showMessageDialog(null,"Contact Number required!");
                    valid = false;
                }

                if(valid){
                    //Enter data to Data Base
                    DBconnection dbconn = new DBconnection();
                    String querry = "insert into signupgeneral values('"+appNoDB+"','"+firstNameDB+"','"+lastNameDB+"','"+fathersNameDB+"','"+dobDB+"','"+genderDB+"','"+mstatusDB+"','"+conNoDB+"','"+emailAddDB+"');";
                    dbconn.stat.executeUpdate(querry);
                }
            }
            catch(Exception ex){
                valid = false;
                System.out.println(ex);
            }
            if(valid){
                setVisible(false);
                new SignUpSecond().setVisible(true);
            }

        }
    }

    public static void main(String[] arg){
        
        new SignUpFirst();
    }
}
