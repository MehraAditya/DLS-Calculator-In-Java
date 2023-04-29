import javax.swing.JFrame;
import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.math.*;


public class ODIFrame extends JFrame implements ActionListener {
 
    JTextField secondScore,firstWicket,secondWicket,firstOver, secondOver, firstScore;
    int ResultODIFinal;
   
    public void ResultODImethod( int ResultODI){
        this.ResultODIFinal=ResultODI;
    }

   
    JButton back,submit;
     JLabel lblempid;

    ODIFrame(){
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       ImageIcon i1 =new ImageIcon("bg.png");
       Image i2 =i1.getImage().getScaledInstance(1100,650,Image.SCALE_DEFAULT);
       ImageIcon i3 =new ImageIcon(i2);
       JLabel image =new JLabel(i3);
       image.setBounds(0,0,1100,650);
       add(image);
       

       JLabel heading = new JLabel("Please Fill The Following Details");
       heading.setBounds(320,30,500,50);
       heading.setFont(new Font("SAN_SERIE",Font.BOLD,25));
       image.add(heading);

       JLabel labelFirstScore=new JLabel("1st Innings Score");
       labelFirstScore.setBounds(50,150,150,30);
       labelFirstScore.setFont(new Font("serif",Font.PLAIN,20));
       image.add(labelFirstScore);

       firstScore = new JTextField();
       firstScore.setBounds(200,150,150,30);
       image.add(firstScore);

       JLabel labelSecondScore=new JLabel("2nd Innings Score");
       labelSecondScore.setBounds(400,150,150,30);
       labelSecondScore.setFont(new Font("serif",Font.PLAIN,20));
      image. add(labelSecondScore);

      secondScore = new JTextField();
      secondScore.setBounds(600,150,150,30);
       image.add(secondScore);

       

        

        JLabel labelFirstWicket=new JLabel("Wicket Lost");
        labelFirstWicket.setBounds(50,250,150,30);
        labelFirstWicket.setFont(new Font("serif",Font.PLAIN,20));
        image.add(labelFirstWicket);
 
        firstWicket = new JTextField();
        firstWicket.setBounds(200,250,150,30);
        image.add(firstWicket);

        JLabel labelSecondWicket=new JLabel("Wicket Lost");
        labelSecondWicket.setBounds(400,250,150,30);
        labelSecondWicket.setFont(new Font("serif",Font.PLAIN,20));
        image.add(labelSecondWicket);
 
        secondWicket = new JTextField();
        secondWicket.setBounds(600,250,150,30);
        image.add(secondWicket);

        

        

        JLabel labelFirstOver=new JLabel("Over Left");
        labelFirstOver.setBounds(50,350,150,30);
        labelFirstOver.setFont(new Font("serif",Font.PLAIN,20));
        image.add(labelFirstOver);

        firstOver = new JTextField();
        firstOver.setBounds(200,350,150,30);
        image.add(firstOver);

        JLabel labelSecondOver=new JLabel("Over Left");
        labelSecondOver.setBounds(400,350,150,30);
        labelSecondOver.setFont(new Font("serif",Font.PLAIN,20));
        image.add(labelSecondOver);
 
        secondOver = new JTextField();
        secondOver.setBounds(600,350,150,30);
        image.add(secondOver);

       

      

        back  = new JButton("Submit");
        back.setBounds(250,550,150,30);
        back.addActionListener(this);
        image.add(back);

      /*   back = new JButton("Back");
        back.setBounds(450,550,150,30);
        back.addActionListener(this);
        image.add(back);  */

       
 
        setSize(1100,650);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    // global declare to use in another method
    int FirstInnScore;
    int SecondInnScore;

    int FirstOverRem;
    int SecondOverRem;

    int FirstInnWicket;
    int SecondInnWkt;

    float ResourceValueODI;
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
           
      FirstInnScore = Integer.parseInt(firstScore.getText());
      SecondInnScore = Integer.parseInt(secondScore.getText());

      FirstOverRem = Integer.parseInt(firstOver.getText());
      SecondOverRem = Integer.parseInt(secondOver.getText());

      FirstInnWicket = Integer.parseInt(firstWicket.getText());
      SecondInnWkt = Integer.parseInt(secondWicket.getText());

     
      
     
    
    }else{
        JOptionPane.showMessageDialog(null,"The par score is : 360");
        setVisible(true);
       
        
        

    }
        setVisible(true);
        new home();
    
   


}
//calculation
public float ResourceValue1st(){  //float kr dena haii
         
    if((FirstOverRem>=40 && FirstOverRem<=50) &&(FirstInnWicket==0)){
        
            //  ResourceValueODI=100.0f;
              return 100.0f;

    }
    else if((FirstOverRem>=40 && FirstOverRem<=50) &&(FirstInnWicket<=2  && FirstInnWicket >0)){

        return 83.8f;

    }
    else if((FirstOverRem>=40 && FirstOverRem<=50) &&(FirstInnWicket<=5  && FirstInnWicket >2)){
        return 49.5f;

    }
    else if((FirstOverRem>=40 && FirstOverRem<=50) &&(FirstInnWicket<=7  && FirstInnWicket >5)){
        return 26.5f;
    }
    else if((FirstOverRem>=40 && FirstOverRem<=50) &&(FirstInnWicket<=10  && FirstInnWicket>7)){
        return 7.6f;
    }
    else{
        return 0.0f;
    }

}

public float ResourceValue2nd(){
    if((SecondOverRem>=40 && SecondOverRem<=50) &&(SecondInnWkt==0)){
        
        //  ResourceValueODI=100.0f;
          return 100.0f;

}
else if((SecondOverRem>=40 && SecondOverRem<=50) &&(SecondInnWkt<=2  && SecondInnWkt >0)){

    return 83.8f;

}
else if((SecondOverRem>=40 && SecondOverRem<=50) &&(SecondInnWkt<=5  && SecondInnWkt >2)){
    return 49.5f;

}
else if((SecondOverRem>=40 && SecondOverRem<=50) &&(SecondInnWkt<=7  && SecondInnWkt >5)){
    return 26.5f;
}
else if((SecondOverRem>=40 && SecondOverRem<=50) &&(SecondInnWkt<=10  && SecondInnWkt>7)){
    return 7.6f;
}
else{
    return 0.0f;
}

}






    

    public static void main(String args[]) {
        new ODIFrame();

        // object for resource value 

        ODIFrame MyObj1 = new ODIFrame();

        int FIIScore = MyObj1.FirstInnScore;



        float FirstInnScoreFloat = (float) FIIScore;
       float RSV2 = MyObj1.ResourceValue2nd();
       float RSV1 = MyObj1.ResourceValue1st();


        float ParScore = FirstInnScoreFloat*RSV2/RSV1;

        int absoluteValue = Math.abs((int) ParScore);

        MyObj1.ResultODImethod(absoluteValue);

    }
}
