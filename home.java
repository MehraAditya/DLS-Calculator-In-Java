import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class home extends JFrame implements ActionListener {
    JButton add,update;
    home(){
        setLayout(null);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("bg3.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1100,650,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,1100,650);
        add(image);

        JLabel heading = new JLabel ("DLS Calculator");
        heading.setBounds(50,50,400,40);
        heading.setFont(new Font("SAN_SERIE",Font.BOLD,25));
        image.add(heading);
       
        // add for t20i

         add = new JButton("T20");
        add.setBounds(50,350,150,40);
        add.addActionListener(this);
        image.add(add);

     // update for odi

         update = new JButton("ODI");
        update.setBounds(50,420,150,40);
        update.addActionListener(this);
        image.add(update);

        
      



        setSize(1100,650);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

      
    }
    public void actionPerformed(ActionEvent ae){
       
           
        
     if(ae.getSource()==add){
        setVisible(false);
        new T20Frame();

     }else if (ae.getSource()==update){
        setVisible(false);
        new ODIFrame();

     }else{

     }
     
    }
     public static void main(String[]rk) {
        new home();
        
    }
}
