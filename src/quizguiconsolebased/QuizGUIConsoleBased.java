/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizguiconsolebased;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hrishav Tandukar
 */
public class QuizGUIConsoleBased extends JFrame implements ActionListener 
{
    int wrong = 0;
    
    //For asking first question
    JLabel q1;
    
    //For asking second question
    JLabel q2;
    
    //For asking third question
    JLabel q3;
    
    //For asking fourth question
    JLabel q4;
    
    //For asking fifth question
    JLabel q5;
    
    //For OPtion buttons for quiz game of question number 1.
    JButton q1option1;
    JButton q1option2;
    JButton q1option3;
    JButton q1option4;
    
    //For OPtion buttons for quiz game of question number 2.
    JButton q2option1;
    JButton q2option2;
    JButton q2option3;
    JButton q2option4;
    
    //For OPtion buttons for quiz game of question number 3.
    JButton q3option1;
    JButton q3option2;
    JButton q3option3;
    JButton q3option4;
    
    //For OPtion buttons for quiz game of question number 4.
    JButton q4option1;
    JButton q4option2;
    JButton q4option3;
    JButton q4option4;
    
    //For OPtion buttons for quiz game of question number 4.
    JButton q5option1;
    JButton q5option2;
    JButton q5option3;
    JButton q5option4;
    
    Container c = getContentPane();
    
    /**
     * For generating random number.
     */
  
    Random random = new Random();
    int randomNumber =  random.nextInt(5);
    
    
    /**
     * Creating a Constructor,
     */
    public QuizGUIConsoleBased()
    {
        
        System.out.println(randomNumber);//For printing random number in console.
        
        /**
         * Makes GUI having randomNumber variable as 0. 
         */      
        if(randomNumber == 0)
        {
            //1
            //For asking first question
            q1 = new JLabel("Who is known as the father of computer science?");

            q1.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q1.setBounds(20,20,400,30);
            c.add(q1);

            //For option 1 of question 1.
            q1option1 = new JButton("1. Lady Ada Augusta");

            q1option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option1.setBounds(20,60,400,30);
            c.add(q1option1);

            q1option1.addActionListener(this);

            //For option 2 of question 1.
            q1option2 = new JButton("2. Charles Babbage");

            q1option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option2.setBounds(20,100,400,30);
            c.add(q1option2);

            q1option2.addActionListener(this);

            //For option 3 of question 1.
            q1option3 = new JButton("3. Alan Turing");

            q1option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option3.setBounds(20,140,400,30);    

            c.add(q1option3);

            q1option3.addActionListener(this);

            //For option 4 of question 1.
            q1option4 = new JButton("4. Steve Jobs");

            q1option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option4.setBounds(20,180,400,30);
            c.add(q1option4);

            q1option4.addActionListener(this);

            //2
            //For asking second question
            q2 = new JLabel("Who is the inventor of Apple computers?");

            q2.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q2.setBounds(20,20,400,30);

            c.add(q2);

            //So that question shall be hidden.
            q2.setVisible(false);

            //For option 1 of question 2.
            q2option1 = new JButton("1. Charles Babbage");

            q2option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option1.setBounds(20,60,400,30);
            c.add(q2option1);

            q2option1.addActionListener(this);

            //In order to hide the button.
            q2option1.setVisible(false);

            //For option 2 of question 2.
            q2option2 = new JButton("2. Bill Gates");

            q2option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option2.setBounds(20,100,400,30);
            c.add(q2option2);

            q2option2.addActionListener(this);

            //In order to hide the button.
            q2option2.setVisible(false);

            //For option 3 of question 2.
            q2option3 = new JButton("3. Vinton Cerf");

            q2option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option3.setBounds(20,140,400,30);
            c.add(q2option3);

            q2option3.addActionListener(this);

            //In order to hide the button.
            q2option3.setVisible(false);

            //For option 4 of question 2.
            q2option4 = new JButton("4. Steve Jobs");

            q2option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option4.setBounds(20,180,400,30);
            c.add(q2option4);

            q2option4.addActionListener(this);

            //In order to hide the button.
            q2option4.setVisible(false);

            //3
            //For asking third question
            q3 = new JLabel("What is the height of mount Kanchanjunga?");

            q3.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q3.setBounds(20,20,400,30);

            c.add(q3);

            //So that question shall be hidden.
            q3.setVisible(false);

            //For option 1 of question 3.
            q3option1 = new JButton("1. 8586m");

            q3option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option1.setBounds(20,60,400,30);
            c.add(q3option1);

            q3option1.addActionListener(this);

            //In order to hide the button.
            q3option1.setVisible(false);

            //For option 2 of question 3.
            q3option2 = new JButton("2. 8848m");

            q3option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option2.setBounds(20,100,400,30);
            c.add(q3option2);

            q3option2.addActionListener(this);

            //In order to hide the button.
            q3option2.setVisible(false);

            //For option 3 of question 3.
            q3option3 = new JButton("3. 8501m");

            q3option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option3.setBounds(20,140,400,30);
            c.add(q3option3);

            q3option3.addActionListener(this);

            //In order to hide the button.
            q3option3.setVisible(false);

            //For option 4 of question 3.
            q3option4 = new JButton("4. 8201m");

            q3option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option4.setBounds(20,180,400,30);
            c.add(q3option4);

            q3option4.addActionListener(this);

            //In order to hide the button.
            q3option4.setVisible(false);

            //4
            //For asking fourth question
            q4 = new JLabel("What is the name of longest river of the world?");

            q4.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q4.setBounds(20,20,400,30);

            c.add(q4);

            //So that question shall be hidden.
            q4.setVisible(false);

            //For option 1 of question 4.
            q4option1 = new JButton("1. Amazon");

            q4option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option1.setBounds(20,60,400,30);
            c.add(q4option1);

            q4option1.addActionListener(this);

            //In order to hide the button.
            q4option1.setVisible(false);

            //For option 2 of question 4.
            q4option2 = new JButton("2. Karnali");

            q4option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option2.setBounds(20,100,400,30);
            c.add(q4option2);

            q4option2.addActionListener(this);

            //In order to hide the button.
            q4option2.setVisible(false);

            //For option 3 of question 4.
            q4option3 = new JButton("3. Nile");

            q4option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option3.setBounds(20,140,400,30);
            c.add(q4option3);

            q4option3.addActionListener(this);

            //In order to hide the button.
            q4option3.setVisible(false);

            //For option 4 of question 4.
            q4option4 = new JButton("4. Kagera");

            q4option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option4.setBounds(20,180,400,30);
            c.add(q4option4);

            q4option4.addActionListener(this);

            //In order to hide the button.
            q4option4.setVisible(false);

            //5
            //For asking fifth question
            q5 = new JLabel("How many oscars did the Titanic movie got?");

            q5.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q5.setBounds(20,20,400,30);

            c.add(q5);

            //So that question shall be hidden.
            q5.setVisible(false);

            //For option 1 of question 5.
            q5option1 = new JButton("1. Five");

            q5option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option1.setBounds(20,60,400,30);
            c.add(q5option1);

            q5option1.addActionListener(this);

            //In order to hide the button.
            q5option1.setVisible(false);

            //For option 2 of question 5.
            q5option2 = new JButton("2. Nine");

            q5option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option2.setBounds(20,100,400,30);
            c.add(q5option2);

            q5option2.addActionListener(this);

            //In order to hide the button.
            q5option2.setVisible(false);

            //For option 3 of question 5.
            q5option3 = new JButton("3. Fifteen");

            q5option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option3.setBounds(20,140,400,30);
            c.add(q5option3);

            q5option3.addActionListener(this);

            //In order to hide the button.
            q5option3.setVisible(false);

            //For option 4 of question 5.
            q5option4 = new JButton("4. Eleven");

            q5option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option4.setBounds(20,180,400,30);
            c.add(q5option4);

            q5option4.addActionListener(this);

            //In order to hide the button.
            q5option4.setVisible(false);
        }
        
        /**
         * Makes GUI having randomNumber variable as 1. 
         */
        
        if(randomNumber == 1)
        {
            //1
            //For asking first question
            q1 = new JLabel("In what year was Google launched on the web?");

            q1.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q1.setBounds(20,20,400,30);
            c.add(q1);

            //For option 1 of question 1.
            q1option1 = new JButton("1. 1996");

            q1option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option1.setBounds(20,60,400,30);
            c.add(q1option1);

            q1option1.addActionListener(this);

            //For option 2 of question 1.
            q1option2 = new JButton("2. 1997");

            q1option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option2.setBounds(20,100,400,30);
            c.add(q1option2);

            q1option2.addActionListener(this);

            //For option 3 of question 1.
            q1option3 = new JButton("3. 1998");

            q1option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option3.setBounds(20,140,400,30);    

            c.add(q1option3);

            q1option3.addActionListener(this);

            //For option 4 of question 1.
            q1option4 = new JButton("4. 1999");

            q1option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option4.setBounds(20,180,400,30);
            c.add(q1option4);

            q1option4.addActionListener(this);

            //2
            //For asking second question
            q2 = new JLabel("Internet emerged from which network of computers?");

            q2.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q2.setBounds(20,20,400,30);

            c.add(q2);

            //So that question shall be hidden.
            q2.setVisible(false);

            //For option 1 of question 2.
            q2option1 = new JButton("1. Aspanet");

            q2option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option1.setBounds(20,60,400,30);
            c.add(q2option1);

            q2option1.addActionListener(this);

            //In order to hide the button.
            q2option1.setVisible(false);

            //For option 2 of question 2.
            q2option2 = new JButton("2. Internet");

            q2option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option2.setBounds(20,100,400,30);
            c.add(q2option2);

            q2option2.addActionListener(this);

            //In order to hide the button.
            q2option2.setVisible(false);

            //For option 3 of question 2.
            q2option3 = new JButton("3. Network");

            q2option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option3.setBounds(20,140,400,30);
            c.add(q2option3);

            q2option3.addActionListener(this);

            //In order to hide the button.
            q2option3.setVisible(false);

            //For option 4 of question 2.
            q2option4 = new JButton("4. Arpanet");

            q2option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option4.setBounds(20,180,400,30);
            c.add(q2option4);

            q2option4.addActionListener(this);

            //In order to hide the button.
            q2option4.setVisible(false);

            //3
            //For asking third question
            q3 = new JLabel("What is the height of mount Dhaulagiri?");

            q3.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q3.setBounds(20,20,400,30);

            c.add(q3);

            //So that question shall be hidden.
            q3.setVisible(false);

            //For option 1 of question 3.
            q3option1 = new JButton("1. 8586m");

            q3option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option1.setBounds(20,60,400,30);
            c.add(q3option1);

            q3option1.addActionListener(this);

            //In order to hide the button.
            q3option1.setVisible(false);

            //For option 2 of question 3.
            q3option2 = new JButton("2. 8848m");

            q3option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option2.setBounds(20,100,400,30);
            c.add(q3option2);

            q3option2.addActionListener(this);

            //In order to hide the button.
            q3option2.setVisible(false);

            //For option 3 of question 3.
            q3option3 = new JButton("3. 8167m");

            q3option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option3.setBounds(20,140,400,30);
            c.add(q3option3);

            q3option3.addActionListener(this);

            //In order to hide the button.
            q3option3.setVisible(false);

            //For option 4 of question 3.
            q3option4 = new JButton("4. 8201m");

            q3option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option4.setBounds(20,180,400,30);
            c.add(q3option4);

            q3option4.addActionListener(this);

            //In order to hide the button.
            q3option4.setVisible(false);

            //4
            //For asking fourth question
            q4 = new JLabel("Number of mountains having height over 8000m in Nepal");

            q4.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q4.setBounds(20,20,400,30);

            c.add(q4);

            //So that question shall be hidden.
            q4.setVisible(false);

            //For option 1 of question 4.
            q4option1 = new JButton("1. 14");

            q4option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option1.setBounds(20,60,400,30);
            c.add(q4option1);

            q4option1.addActionListener(this);

            //In order to hide the button.
            q4option1.setVisible(false);

            //For option 2 of question 4.
            q4option2 = new JButton("2. 10");

            q4option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option2.setBounds(20,100,400,30);
            c.add(q4option2);

            q4option2.addActionListener(this);

            //In order to hide the button.
            q4option2.setVisible(false);

            //For option 3 of question 4.
            q4option3 = new JButton("3. 8");

            q4option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option3.setBounds(20,140,400,30);
            c.add(q4option3);

            q4option3.addActionListener(this);

            //In order to hide the button.
            q4option3.setVisible(false);

            //For option 4 of question 4.
            q4option4 = new JButton("4. 6");

            q4option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option4.setBounds(20,180,400,30);
            c.add(q4option4);

            q4option4.addActionListener(this);

            //In order to hide the button.
            q4option4.setVisible(false);

            //5
            //For asking fifth question
            q5 = new JLabel("What is infant of whale called?");

            q5.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q5.setBounds(20,20,400,30);

            c.add(q5);

            //So that question shall be hidden.
            q5.setVisible(false);

            //For option 1 of question 5.
            q5option1 = new JButton("1. Calf");

            q5option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option1.setBounds(20,60,400,30);
            c.add(q5option1);

            q5option1.addActionListener(this);

            //In order to hide the button.
            q5option1.setVisible(false);

            //For option 2 of question 5.
            q5option2 = new JButton("2. Larvae");

            q5option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option2.setBounds(20,100,400,30);
            c.add(q5option2);

            q5option2.addActionListener(this);

            //In order to hide the button.
            q5option2.setVisible(false);

            //For option 3 of question 5.
            q5option3 = new JButton("3. Mammal");

            q5option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option3.setBounds(20,140,400,30);
            c.add(q5option3);

            q5option3.addActionListener(this);

            //In order to hide the button.
            q5option3.setVisible(false);

            //For option 4 of question 5.
            q5option4 = new JButton("4. Pony");

            q5option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option4.setBounds(20,180,400,30);
            c.add(q5option4);

            q5option4.addActionListener(this);

            //In order to hide the button.
            q5option4.setVisible(false);
        }
        
        /**
         * Makes GUI having randomNumber variable as 2. 
         */
        
        if(randomNumber == 2)
        {
            //1
            //For asking first question
            q1 = new JLabel("What is infant of horse called?");

            q1.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q1.setBounds(20,20,400,30);
            c.add(q1);

            //For option 1 of question 1.
            q1option1 = new JButton("1. Calf");

            q1option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option1.setBounds(20,60,400,30);
            c.add(q1option1);

            q1option1.addActionListener(this);

            //For option 2 of question 1.
            q1option2 = new JButton("2. Larvae");

            q1option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option2.setBounds(20,100,400,30);
            c.add(q1option2);

            q1option2.addActionListener(this);

            //For option 3 of question 1.
            q1option3 = new JButton("3. Mammal");

            q1option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option3.setBounds(20,140,400,30);    

            c.add(q1option3);

            q1option3.addActionListener(this);

            //For option 4 of question 1.
            q1option4 = new JButton("4. Pony");

            q1option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option4.setBounds(20,180,400,30);
            c.add(q1option4);

            q1option4.addActionListener(this);

            //2
            //For asking second question
            q2 = new JLabel("For which fruit is the US state of Georgia famous?");

            q2.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q2.setBounds(20,20,400,30);

            c.add(q2);

            //So that question shall be hidden.
            q2.setVisible(false);

            //For option 1 of question 2.
            q2option1 = new JButton("1. Apple");

            q2option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option1.setBounds(20,60,400,30);
            c.add(q2option1);

            q2option1.addActionListener(this);

            //In order to hide the button.
            q2option1.setVisible(false);

            //For option 2 of question 2.
            q2option2 = new JButton("2. Peach");

            q2option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option2.setBounds(20,100,400,30);
            c.add(q2option2);

            q2option2.addActionListener(this);

            //In order to hide the button.
            q2option2.setVisible(false);

            //For option 3 of question 2.
            q2option3 = new JButton("3. Mango");

            q2option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option3.setBounds(20,140,400,30);
            c.add(q2option3);

            q2option3.addActionListener(this);

            //In order to hide the button.
            q2option3.setVisible(false);

            //For option 4 of question 2.
            q2option4 = new JButton("4. Pineapple");

            q2option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option4.setBounds(20,180,400,30);
            c.add(q2option4);

            q2option4.addActionListener(this);

            //In order to hide the button.
            q2option4.setVisible(false);

            //3
            //For asking third question
            q3 = new JLabel("What is the height of mount Lhotse?");

            q3.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q3.setBounds(20,20,400,30);

            c.add(q3);

            //So that question shall be hidden.
            q3.setVisible(false);

            //For option 1 of question 3.
            q3option1 = new JButton("1. 8586m");

            q3option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option1.setBounds(20,60,400,30);
            c.add(q3option1);

            q3option1.addActionListener(this);

            //In order to hide the button.
            q3option1.setVisible(false);

            //For option 2 of question 3.
            q3option2 = new JButton("2. 8848m");

            q3option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option2.setBounds(20,100,400,30);
            c.add(q3option2);

            q3option2.addActionListener(this);

            //In order to hide the button.
            q3option2.setVisible(false);

            //For option 3 of question 3.
            q3option3 = new JButton("3. 8501m");

            q3option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option3.setBounds(20,140,400,30);
            c.add(q3option3);

            q3option3.addActionListener(this);

            //In order to hide the button.
            q3option3.setVisible(false);

            //For option 4 of question 3.
            q3option4 = new JButton("4. 8516m");

            q3option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option4.setBounds(20,180,400,30);
            c.add(q3option4);

            q3option4.addActionListener(this);

            //In order to hide the button.
            q3option4.setVisible(false);

            //4
            //For asking fourth question
            q4 = new JLabel("What is RAM short for?");

            q4.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q4.setBounds(20,20,400,30);

            c.add(q4);

            //So that question shall be hidden.
            q4.setVisible(false);

            //For option 1 of question 4.
            q4option1 = new JButton("1. Random Any Memory");

            q4option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option1.setBounds(20,60,400,30);
            c.add(q4option1);

            q4option1.addActionListener(this);

            //In order to hide the button.
            q4option1.setVisible(false);

            //For option 2 of question 4.
            q4option2 = new JButton("2. Read Any Memory");

            q4option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option2.setBounds(20,100,400,30);
            c.add(q4option2);

            q4option2.addActionListener(this);

            //In order to hide the button.
            q4option2.setVisible(false);

            //For option 3 of question 4.
            q4option3 = new JButton("3. Random Access Memory");

            q4option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option3.setBounds(20,140,400,30);
            c.add(q4option3);

            q4option3.addActionListener(this);

            //In order to hide the button.
            q4option3.setVisible(false);

            //For option 4 of question 4.
            q4option4 = new JButton("4. Read Only Memory");

            q4option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option4.setBounds(20,180,400,30);
            c.add(q4option4);

            q4option4.addActionListener(this);

            //In order to hide the button.
            q4option4.setVisible(false);

            //5
            //For asking fifth question
            q5 = new JLabel("What is the national sport in Japan?");

            q5.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q5.setBounds(20,20,400,30);

            c.add(q5);

            //So that question shall be hidden.
            q5.setVisible(false);

            //For option 1 of question 5.
            q5option1 = new JButton("1. Cricket");

            q5option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option1.setBounds(20,60,400,30);
            c.add(q5option1);

            q5option1.addActionListener(this);

            //In order to hide the button.
            q5option1.setVisible(false);

            //For option 2 of question 5.
            q5option2 = new JButton("2. Sumo Wrestling");

            q5option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option2.setBounds(20,100,400,30);
            c.add(q5option2);

            q5option2.addActionListener(this);

            //In order to hide the button.
            q5option2.setVisible(false);

            //For option 3 of question 5.
            q5option3 = new JButton("3. Football");

            q5option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option3.setBounds(20,140,400,30);
            c.add(q5option3);

            q5option3.addActionListener(this);

            //In order to hide the button.
            q5option3.setVisible(false);

            //For option 4 of question 5.
            q5option4 = new JButton("4. Table Tennis");

            q5option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option4.setBounds(20,180,400,30);
            c.add(q5option4);

            q5option4.addActionListener(this);

            //In order to hide the button.
            q5option4.setVisible(false);
        }
        
        /**
         * Makes GUI having randomNumber variable as 1. 
         */
        
        if(randomNumber == 3)
        {
            //1
            //For asking first question
            q1 = new JLabel("How many stars has the American flag got?");

            q1.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q1.setBounds(20,20,400,30);
            c.add(q1);

            //For option 1 of question 1.
            q1option1 = new JButton("1. 50");

            q1option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option1.setBounds(20,60,400,30);
            c.add(q1option1);

            q1option1.addActionListener(this);

            //For option 2 of question 1.
            q1option2 = new JButton("2. 30");

            q1option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option2.setBounds(20,100,400,30);
            c.add(q1option2);

            q1option2.addActionListener(this);

            //For option 3 of question 1.
            q1option3 = new JButton("3. 15");

            q1option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option3.setBounds(20,140,400,30);    

            c.add(q1option3);

            q1option3.addActionListener(this);

            //For option 4 of question 1.
            q1option4 = new JButton("4. 25");

            q1option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option4.setBounds(20,180,400,30);
            c.add(q1option4);

            q1option4.addActionListener(this);

            //2
            //For asking second question
            q2 = new JLabel("What is the infant of whale called?");

            q2.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q2.setBounds(20,20,400,30);

            c.add(q2);

            //So that question shall be hidden.
            q2.setVisible(false);

            //For option 1 of question 2.
            q2option1 = new JButton("1. Calf");

            q2option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option1.setBounds(20,60,400,30);
            c.add(q2option1);

            q2option1.addActionListener(this);

            //In order to hide the button.
            q2option1.setVisible(false);

            //For option 2 of question 2.
            q2option2 = new JButton("2. Larvae");

            q2option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option2.setBounds(20,100,400,30);
            c.add(q2option2);

            q2option2.addActionListener(this);

            //In order to hide the button.
            q2option2.setVisible(false);

            //For option 3 of question 2.
            q2option3 = new JButton("3. Mammal");

            q2option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option3.setBounds(20,140,400,30);
            c.add(q2option3);

            q2option3.addActionListener(this);

            //In order to hide the button.
            q2option3.setVisible(false);

            //For option 4 of question 2.
            q2option4 = new JButton("4. Cub");

            q2option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option4.setBounds(20,180,400,30);
            c.add(q2option4);

            q2option4.addActionListener(this);

            //In order to hide the button.
            q2option4.setVisible(false);

            //3
            //For asking third question
            q3 = new JLabel("How long is the Great Wall of China?");

            q3.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q3.setBounds(20,20,400,30);

            c.add(q3);

            //So that question shall be hidden.
            q3.setVisible(false);

            //For option 1 of question 3.
            q3option1 = new JButton("1. 3000 miles");

            q3option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option1.setBounds(20,60,400,30);
            c.add(q3option1);

            q3option1.addActionListener(this);

            //In order to hide the button.
            q3option1.setVisible(false);

            //For option 2 of question 3.
            q3option2 = new JButton("2. 4000 miles");

            q3option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option2.setBounds(20,100,400,30);
            c.add(q3option2);

            q3option2.addActionListener(this);

            //In order to hide the button.
            q3option2.setVisible(false);

            //For option 3 of question 3.
            q3option3 = new JButton("3. 5000 miles");

            q3option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option3.setBounds(20,140,400,30);
            c.add(q3option3);

            q3option3.addActionListener(this);

            //In order to hide the button.
            q3option3.setVisible(false);

            //For option 4 of question 3.
            q3option4 = new JButton("4. 6000 miles");

            q3option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option4.setBounds(20,180,400,30);
            c.add(q3option4);

            q3option4.addActionListener(this);

            //In order to hide the button.
            q3option4.setVisible(false);

            //4
            //For asking fourth question
            q4 = new JLabel("In which sport can you win the Davis Cup?");

            q4.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q4.setBounds(20,20,400,30);

            c.add(q4);

            //So that question shall be hidden.
            q4.setVisible(false);

            //For option 1 of question 4.
            q4option1 = new JButton("1. Cricket");

            q4option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option1.setBounds(20,60,400,30);
            c.add(q4option1);

            q4option1.addActionListener(this);

            //In order to hide the button.
            q4option1.setVisible(false);

            //For option 2 of question 4.
            q4option2 = new JButton("2. Basketball");

            q4option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option2.setBounds(20,100,400,30);
            c.add(q4option2);

            q4option2.addActionListener(this);

            //In order to hide the button.
            q4option2.setVisible(false);

            //For option 3 of question 4.
            q4option3 = new JButton("3. Tennis");

            q4option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option3.setBounds(20,140,400,30);
            c.add(q4option3);

            q4option3.addActionListener(this);

            //In order to hide the button.
            q4option3.setVisible(false);

            //For option 4 of question 4.
            q4option4 = new JButton("4. Badminton");

            q4option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option4.setBounds(20,180,400,30);
            c.add(q4option4);

            q4option4.addActionListener(this);

            //In order to hide the button.
            q4option4.setVisible(false);

            //5
            //For asking fifth question
            q5 = new JLabel("How many minutes is a rugby match?");

            q5.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q5.setBounds(20,20,400,30);

            c.add(q5);

            //So that question shall be hidden.
            q5.setVisible(false);

            //For option 1 of question 5.
            q5option1 = new JButton("1. 50 Minutes");

            q5option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option1.setBounds(20,60,400,30);
            c.add(q5option1);

            q5option1.addActionListener(this);

            //In order to hide the button.
            q5option1.setVisible(false);

            //For option 2 of question 5.
            q5option2 = new JButton("2. 60 Minutes");

            q5option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option2.setBounds(20,100,400,30);
            c.add(q5option2);

            q5option2.addActionListener(this);

            //In order to hide the button.
            q5option2.setVisible(false);

            //For option 3 of question 5.
            q5option3 = new JButton("3. 70 Minutes");

            q5option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option3.setBounds(20,140,400,30);
            c.add(q5option3);

            q5option3.addActionListener(this);

            //In order to hide the button.
            q5option3.setVisible(false);

            //For option 4 of question 5.
            q5option4 = new JButton("4. 80 Minutes");

            q5option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option4.setBounds(20,180,400,30);
            c.add(q5option4);

            q5option4.addActionListener(this);

            //In order to hide the button.
            q5option4.setVisible(false);
        }
        
        /**
         * Makes GUI having randomNumber variable as 1. 
         */
        
        if(randomNumber == 4)
        {
            //1
            //For asking first question
            q1 = new JLabel("In which country were the first Olympic Games held?");

            q1.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q1.setBounds(20,20,400,30);
            c.add(q1);

            //For option 1 of question 1.
            q1option1 = new JButton("1. Greece");

            q1option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option1.setBounds(20,60,400,30);
            c.add(q1option1);

            q1option1.addActionListener(this);

            //For option 2 of question 1.
            q1option2 = new JButton("2. China");

            q1option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option2.setBounds(20,100,400,30);
            c.add(q1option2);

            q1option2.addActionListener(this);

            //For option 3 of question 1.
            q1option3 = new JButton("3. Japan");

            q1option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option3.setBounds(20,140,400,30);    

            c.add(q1option3);

            q1option3.addActionListener(this);

            //For option 4 of question 1.
            q1option4 = new JButton("4. America");

            q1option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q1option4.setBounds(20,180,400,30);
            c.add(q1option4);

            q1option4.addActionListener(this);

            //2
            //For asking second question
            q2 = new JLabel("What do dragonflies prefer to eat?");

            q2.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q2.setBounds(20,20,400,30);

            c.add(q2);

            //So that question shall be hidden.
            q2.setVisible(false);

            //For option 1 of question 2.
            q2option1 = new JButton("1. Mosquitoes");

            q2option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option1.setBounds(20,60,400,30);
            c.add(q2option1);

            q2option1.addActionListener(this);

            //In order to hide the button.
            q2option1.setVisible(false);

            //For option 2 of question 2.
            q2option2 = new JButton("2. Housefly");

            q2option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option2.setBounds(20,100,400,30);
            c.add(q2option2);

            q2option2.addActionListener(this);

            //In order to hide the button.
            q2option2.setVisible(false);

            //For option 3 of question 2.
            q2option3 = new JButton("3. Spider");

            q2option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option3.setBounds(20,140,400,30);
            c.add(q2option3);

            q2option3.addActionListener(this);

            //In order to hide the button.
            q2option3.setVisible(false);

            //For option 4 of question 2.
            q2option4 = new JButton("4. Honeybee");

            q2option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q2option4.setBounds(20,180,400,30);
            c.add(q2option4);

            q2option4.addActionListener(this);

            //In order to hide the button.
            q2option4.setVisible(false);

            //3
            //For asking third question
            q3 = new JLabel("What is the national animal of Albania?");

            q3.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q3.setBounds(20,20,400,30);

            c.add(q3);

            //So that question shall be hidden.
            q3.setVisible(false);

            //For option 1 of question 3.
            q3option1 = new JButton("1. Bengal Tiger");

            q3option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option1.setBounds(20,60,400,30);
            c.add(q3option1);

            q3option1.addActionListener(this);

            //In order to hide the button.
            q3option1.setVisible(false);

            //For option 2 of question 3.
            q3option2 = new JButton("2. Kangaroo");

            q3option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option2.setBounds(20,100,400,30);
            c.add(q3option2);

            q3option2.addActionListener(this);

            //In order to hide the button.
            q3option2.setVisible(false);

            //For option 3 of question 3.
            q3option3 = new JButton("3. Black Hawk");

            q3option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option3.setBounds(20,140,400,30);
            c.add(q3option3);

            q3option3.addActionListener(this);

            //In order to hide the button.
            q3option3.setVisible(false);

            //For option 4 of question 3.
            q3option4 = new JButton("4. Golden eagle");

            q3option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q3option4.setBounds(20,180,400,30);
            c.add(q3option4);

            q3option4.addActionListener(this);

            //In order to hide the button.
            q3option4.setVisible(false);

            //4
            //For asking fourth question
            q4 = new JLabel("Who was the first president of the USA?");

            q4.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q4.setBounds(20,20,400,30);

            c.add(q4);

            //So that question shall be hidden.
            q4.setVisible(false);

            //For option 1 of question 4.
            q4option1 = new JButton("1. Donald Trump");

            q4option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option1.setBounds(20,60,400,30);
            c.add(q4option1);

            q4option1.addActionListener(this);

            //In order to hide the button.
            q4option1.setVisible(false);

            //For option 2 of question 4.
            q4option2 = new JButton("2. George Washington");

            q4option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option2.setBounds(20,100,400,30);
            c.add(q4option2);

            q4option2.addActionListener(this);

            //In order to hide the button.
            q4option2.setVisible(false);

            //For option 3 of question 4.
            q4option3 = new JButton("3. Abraham Lincoln");

            q4option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option3.setBounds(20,140,400,30);
            c.add(q4option3);

            q4option3.addActionListener(this);

            //In order to hide the button.
            q4option3.setVisible(false);

            //For option 4 of question 4.
            q4option4 = new JButton("4. Barack Obama");

            q4option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q4option4.setBounds(20,180,400,30);
            c.add(q4option4);

            q4option4.addActionListener(this);

            //In order to hide the button.
            q4option4.setVisible(false);

            //5
            //For asking fifth question
            q5 = new JLabel("In which English town did Adolf Hitler study art?");

            q5.setFont(new java.awt.Font("Tekton-BoldOblique", 1, 15));
            q5.setBounds(20,20,400,30);

            c.add(q5);

            //So that question shall be hidden.
            q5.setVisible(false);

            //For option 1 of question 5.
            q5option1 = new JButton("1. Barcelona");

            q5option1.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option1.setBounds(20,60,400,30);
            c.add(q5option1);

            q5option1.addActionListener(this);

            //In order to hide the button.
            q5option1.setVisible(false);

            //For option 2 of question 5.
            q5option2 = new JButton("2. Liverpool");

            q5option2.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option2.setBounds(20,100,400,30);
            c.add(q5option2);

            q5option2.addActionListener(this);

            //In order to hide the button.
            q5option2.setVisible(false);

            //For option 3 of question 5.
            q5option3 = new JButton("3. Arsenal");

            q5option3.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option3.setBounds(20,140,400,30);
            c.add(q5option3);

            q5option3.addActionListener(this);

            //In order to hide the button.
            q5option3.setVisible(false);

            //For option 4 of question 5.
            q5option4 = new JButton("4. Manchester United");

            q5option4.setFont(new java.awt.Font("Tahoma", 1, 15));
            q5option4.setBounds(20,180,400,30);
            c.add(q5option4);

            q5option4.addActionListener(this);

            //In order to hide the button.
            q5option4.setVisible(false);
        }
        
        setTitle("Quiz");
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setSize(440,270);
        setDefaultCloseOperation(3);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /**
         * For actionPerformed method in case if randomNumber is 0.
         */
        if(randomNumber == 0)
        {
            /**
             * ActionEvent method for question number 1.
             */
            if(ae.getSource() == q1option1 || ae.getSource() == q1option3 || ae.getSource() == q1option4)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q1option2)
            {
                //For hiding question number one and its options.
                q1.setVisible(false);
                q1option1.setVisible(false);
                q1option2.setVisible(false);
                q1option3.setVisible(false);
                q1option4.setVisible(false);

                //For Displaying question number two and its options.
                q2.setVisible(true);
                q2option1.setVisible(true);
                q2option2.setVisible(true);
                q2option3.setVisible(true);
                q2option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);  

            }

            /**
             * ActionEvent method for question number 3.
             */
            if(ae.getSource() == q2option1 || ae.getSource() == q2option2 || ae.getSource() == q2option3)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q2option4)
            {
                //For hiding question number two and its options.
                q2.setVisible(false);
                q2option1.setVisible(false);
                q2option2.setVisible(false);
                q2option3.setVisible(false);
                q2option4.setVisible(false);

                //For Displaying question number three and its options.
                q3.setVisible(true);
                q3option1.setVisible(true);
                q3option2.setVisible(true);
                q3option3.setVisible(true);
                q3option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 3.
             */
            if(ae.getSource() == q3option4 || ae.getSource() == q3option2 || ae.getSource() == q3option3)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q3option1)
            {
                //For hiding question number one and its options.
                q3.setVisible(false);
                q3option1.setVisible(false);
                q3option2.setVisible(false);
                q3option3.setVisible(false);
                q3option4.setVisible(false);

                //For Displaying question number two and its options.
                q4.setVisible(true);
                q4option1.setVisible(true);
                q4option2.setVisible(true);
                q4option3.setVisible(true);
                q4option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 4.
             */
            if(ae.getSource() == q4option4 || ae.getSource() == q4option2 || ae.getSource() == q4option1)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q4option3)
            {
                //For hiding question number one and its options.
                q4.setVisible(false);
                q4option1.setVisible(false);
                q4option2.setVisible(false);
                q4option3.setVisible(false);
                q4option4.setVisible(false);

                //For Displaying question number two and its options.
                q5.setVisible(true);
                q5option1.setVisible(true);
                q5option2.setVisible(true);
                q5option3.setVisible(true);
                q5option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 5.
             */
            if(ae.getSource() == q5option3 || ae.getSource() == q5option2 || ae.getSource() == q5option1)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q5option4)
            {
                JOptionPane.showMessageDialog(null,"Your answer is correct." + "\n" + "Number of times you selected wrong answer is:" + wrong,"Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(randomNumber == 1)
        {
             /**
             * ActionEvent method for question number 1.
             */
            if(ae.getSource() == q1option1 || ae.getSource() == q1option2 || ae.getSource() == q1option4)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q1option3)
            {
                //For hiding question number one and its options.
                q1.setVisible(false);
                q1option1.setVisible(false);
                q1option2.setVisible(false);
                q1option3.setVisible(false);
                q1option4.setVisible(false);

                //For Displaying question number two and its options.
                q2.setVisible(true);
                q2option1.setVisible(true);
                q2option2.setVisible(true);
                q2option3.setVisible(true);
                q2option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);  

            }

            /**
             * ActionEvent method for question number 3.
             */
            if(ae.getSource() == q2option1 || ae.getSource() == q2option2 || ae.getSource() == q2option3)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q2option4)
            {
                //For hiding question number two and its options.
                q2.setVisible(false);
                q2option1.setVisible(false);
                q2option2.setVisible(false);
                q2option3.setVisible(false);
                q2option4.setVisible(false);

                //For Displaying question number three and its options.
                q3.setVisible(true);
                q3option1.setVisible(true);
                q3option2.setVisible(true);
                q3option3.setVisible(true);
                q3option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 3.
             */
            if(ae.getSource() == q3option4 || ae.getSource() == q3option2 || ae.getSource() == q3option1)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q3option3)
            {
                //For hiding question number one and its options.
                q3.setVisible(false);
                q3option1.setVisible(false);
                q3option2.setVisible(false);
                q3option3.setVisible(false);
                q3option4.setVisible(false);

                //For Displaying question number two and its options.
                q4.setVisible(true);
                q4option1.setVisible(true);
                q4option2.setVisible(true);
                q4option3.setVisible(true);
                q4option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 4.
             */
            if(ae.getSource() == q4option4 || ae.getSource() == q4option2 || ae.getSource() == q4option1)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q4option3)
            {
                //For hiding question number one and its options.
                q4.setVisible(false);
                q4option1.setVisible(false);
                q4option2.setVisible(false);
                q4option3.setVisible(false);
                q4option4.setVisible(false);

                //For Displaying question number two and its options.
                q5.setVisible(true);
                q5option1.setVisible(true);
                q5option2.setVisible(true);
                q5option3.setVisible(true);
                q5option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 5.
             */
            if(ae.getSource() == q5option3 || ae.getSource() == q5option2 || ae.getSource() == q5option4)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q5option1)
            {
                JOptionPane.showMessageDialog(null,"Your answer is correct." + "\n" + "Number of times you selected wrong answer is:" + wrong,"Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(randomNumber == 2)
        {
             /**
             * ActionEvent method for question number 2.
             */
            if(ae.getSource() == q1option1 || ae.getSource() == q1option2 || ae.getSource() == q1option3)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q1option4)
            {
                //For hiding question number one and its options.
                q1.setVisible(false);
                q1option1.setVisible(false);
                q1option2.setVisible(false);
                q1option3.setVisible(false);
                q1option4.setVisible(false);

                //For Displaying question number two and its options.
                q2.setVisible(true);
                q2option1.setVisible(true);
                q2option2.setVisible(true);
                q2option3.setVisible(true);
                q2option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);  

            }

            /**
             * ActionEvent method for question number 3.
             */
            if(ae.getSource() == q2option1 || ae.getSource() == q2option4 || ae.getSource() == q2option3)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q2option2)
            {
                //For hiding question number two and its options.
                q2.setVisible(false);
                q2option1.setVisible(false);
                q2option2.setVisible(false);
                q2option3.setVisible(false);
                q2option4.setVisible(false);

                //For Displaying question number three and its options.
                q3.setVisible(true);
                q3option1.setVisible(true);
                q3option2.setVisible(true);
                q3option3.setVisible(true);
                q3option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 3.
             */
            if(ae.getSource() == q3option3 || ae.getSource() == q3option2 || ae.getSource() == q3option1)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q3option4)
            {
                //For hiding question number one and its options.
                q3.setVisible(false);
                q3option1.setVisible(false);
                q3option2.setVisible(false);
                q3option3.setVisible(false);
                q3option4.setVisible(false);

                //For Displaying question number two and its options.
                q4.setVisible(true);
                q4option1.setVisible(true);
                q4option2.setVisible(true);
                q4option3.setVisible(true);
                q4option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 4.
             */
            if(ae.getSource() == q4option4 || ae.getSource() == q4option2 || ae.getSource() == q4option1)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q4option3)
            {
                //For hiding question number one and its options.
                q4.setVisible(false);
                q4option1.setVisible(false);
                q4option2.setVisible(false);
                q4option3.setVisible(false);
                q4option4.setVisible(false);

                //For Displaying question number two and its options.
                q5.setVisible(true);
                q5option1.setVisible(true);
                q5option2.setVisible(true);
                q5option3.setVisible(true);
                q5option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 5.
             */
            if(ae.getSource() == q5option3 || ae.getSource() == q5option1 || ae.getSource() == q5option4)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q5option2)
            {
                JOptionPane.showMessageDialog(null,"Your answer is correct." + "\n" + "Number of times you selected wrong answer is:" + wrong,"Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(randomNumber == 3)
        {
             /**
             * ActionEvent method for question number 3.
             */
            if(ae.getSource() == q1option4 || ae.getSource() == q1option2 || ae.getSource() == q1option3)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q1option1)
            {
                //For hiding question number one and its options.
                q1.setVisible(false);
                q1option1.setVisible(false);
                q1option2.setVisible(false);
                q1option3.setVisible(false);
                q1option4.setVisible(false);

                //For Displaying question number two and its options.
                q2.setVisible(true);
                q2option1.setVisible(true);
                q2option2.setVisible(true);
                q2option3.setVisible(true);
                q2option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);  

            }

            /**
             * ActionEvent method for question number 3.
             */
            if(ae.getSource() == q2option3 || ae.getSource() == q2option4 || ae.getSource() == q2option2)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q2option1)
            {
                //For hiding question number two and its options.
                q2.setVisible(false);
                q2option1.setVisible(false);
                q2option2.setVisible(false);
                q2option3.setVisible(false);
                q2option4.setVisible(false);

                //For Displaying question number three and its options.
                q3.setVisible(true);
                q3option1.setVisible(true);
                q3option2.setVisible(true);
                q3option3.setVisible(true);
                q3option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 3.
             */
            if(ae.getSource() == q3option3 || ae.getSource() == q3option4 || ae.getSource() == q3option1)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q3option2)
            {
                //For hiding question number one and its options.
                q3.setVisible(false);
                q3option1.setVisible(false);
                q3option2.setVisible(false);
                q3option3.setVisible(false);
                q3option4.setVisible(false);

                //For Displaying question number two and its options.
                q4.setVisible(true);
                q4option1.setVisible(true);
                q4option2.setVisible(true);
                q4option3.setVisible(true);
                q4option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 4.
             */
            if(ae.getSource() == q4option4 || ae.getSource() == q4option2 || ae.getSource() == q4option1)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q4option3)
            {
                //For hiding question number one and its options.
                q4.setVisible(false);
                q4option1.setVisible(false);
                q4option2.setVisible(false);
                q4option3.setVisible(false);
                q4option4.setVisible(false);

                //For Displaying question number two and its options.
                q5.setVisible(true);
                q5option1.setVisible(true);
                q5option2.setVisible(true);
                q5option3.setVisible(true);
                q5option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 5.
             */
            if(ae.getSource() == q5option3 || ae.getSource() == q5option1 || ae.getSource() == q5option2)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q5option4)
            {
                JOptionPane.showMessageDialog(null,"Your answer is correct." + "\n" + "Number of times you selected wrong answer is:" + wrong,"Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(randomNumber == 4)
        {
             /**
             * ActionEvent method for question number 3.
             */
            if(ae.getSource() == q1option4 || ae.getSource() == q1option2 || ae.getSource() == q1option3)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q1option1)
            {
                //For hiding question number one and its options.
                q1.setVisible(false);
                q1option1.setVisible(false);
                q1option2.setVisible(false);
                q1option3.setVisible(false);
                q1option4.setVisible(false);

                //For Displaying question number two and its options.
                q2.setVisible(true);
                q2option1.setVisible(true);
                q2option2.setVisible(true);
                q2option3.setVisible(true);
                q2option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);  

            }

            /**
             * ActionEvent method for question number 3.
             */
            if(ae.getSource() == q2option3 || ae.getSource() == q2option4 || ae.getSource() == q2option2)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q2option1)
            {
                //For hiding question number two and its options.
                q2.setVisible(false);
                q2option1.setVisible(false);
                q2option2.setVisible(false);
                q2option3.setVisible(false);
                q2option4.setVisible(false);

                //For Displaying question number three and its options.
                q3.setVisible(true);
                q3option1.setVisible(true);
                q3option2.setVisible(true);
                q3option3.setVisible(true);
                q3option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 3.
             */
            if(ae.getSource() == q3option3 || ae.getSource() == q3option2 || ae.getSource() == q3option1)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q3option4)
            {
                //For hiding question number one and its options.
                q3.setVisible(false);
                q3option1.setVisible(false);
                q3option2.setVisible(false);
                q3option3.setVisible(false);
                q3option4.setVisible(false);

                //For Displaying question number two and its options.
                q4.setVisible(true);
                q4option1.setVisible(true);
                q4option2.setVisible(true);
                q4option3.setVisible(true);
                q4option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 4.
             */
            if(ae.getSource() == q4option4 || ae.getSource() == q4option3 || ae.getSource() == q4option1)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q4option2)
            {
                //For hiding question number one and its options.
                q4.setVisible(false);
                q4option1.setVisible(false);
                q4option2.setVisible(false);
                q4option3.setVisible(false);
                q4option4.setVisible(false);

                //For Displaying question number two and its options.
                q5.setVisible(true);
                q5option1.setVisible(true);
                q5option2.setVisible(true);
                q5option3.setVisible(true);
                q5option4.setVisible(true);

                JOptionPane.showMessageDialog(null,"Your answer is correct.","Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
            }

            /**
             * ActionEvent method for question number 5.
             */
            if(ae.getSource() == q5option3 || ae.getSource() == q5option1 || ae.getSource() == q5option4)
            {
                JOptionPane.showMessageDialog(null,"Your answer is incorrect.","Please try again!!!.",JOptionPane.ERROR_MESSAGE);
                wrong++;
            }

            if(ae.getSource() == q5option2)
            {
                JOptionPane.showMessageDialog(null,"Your answer is correct." + "\n" + "Number of times you selected wrong answer is:" + wrong,"Congratulation!!!",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println(JFrame.EXIT_ON_CLOSE);
        new QuizGUIConsoleBased();
    }
    
}
