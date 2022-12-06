package Praktika;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        JFrame f=new JFrame("ВУЗы");


        JTable t = new JTable();
        t.setBounds(170, 20, 400, 330);

        JButton b=new JButton("ВУЗы");
        b.setBounds(20,20,130, 40);
        JButton b2=new JButton("Студенты");
        b2.setBounds(20,80,130, 40);
        JButton b3=new JButton("Направления");
        b3.setBounds(20,140,130, 40);
        JButton b4=new JButton("Преподаватели");
        b4.setBounds(20,200,130, 40);

        f.add(b);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(t);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            }
        });

        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
