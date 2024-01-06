package RandomStuff;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaschenrechnerGrafik {

    public static void main (String []args) {
        float zahl1;
        float zahl2;
        float ergebnis1;
        String op1;

        JFrame frame = new JFrame();
        JTextField eingabe1 = new JTextField();
        JTextField eingabe2 = new JTextField();
        JTextField operator = new JTextField();
        JTextField ergebnis = new JTextField();

        JLabel eing1 = new JLabel("Zahl1");
        JLabel eing2 = new JLabel("Zahl2");
        JLabel op = new JLabel("Operator");
        JLabel erg = new JLabel("Ergebnis");

        JButton rechnen = new JButton("Ausrechnen");

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBounds(200, 200, 600, 350);

        eingabe1.setBounds(10, 27, 80, 20);
        frame.add(eingabe1);

        eingabe2.setBounds(155, 27, 80, 20);
        frame.add(eingabe2);

        operator.setBounds(300, 27, 40, 20);
        frame.add(operator);

        ergebnis.setBounds(400, 27, 80, 20);
        frame.add(ergebnis);

        eing1.setBounds(10, 11, 105, 14);
        frame.add(eing1);

        eing2.setBounds(154, 11, 87, 14);
        frame.add(eing2);

        op.setBounds(300, 11, 87, 14);
        frame.add(op);

        erg.setBounds(400, 11, 87, 14);
        frame.add(erg);

        rechnen.setBounds(500, 27, 80, 14);
        frame.add(rechnen);

       rechnen.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               if (eingabe1.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null, "Zahl1 ist leer!");
               } else if(eingabe2.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null, "Eingabe2 ist leer!!");
               } else if (operator.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null, "Fehlender Operator");
               } else {
                    String textFromTextField1 = eingabe1.getText();
                    float zahl1 = Float.parseFloat(textFromTextField1);
                    System.out.println(zahl1);

                    String textFromTextField2 = eingabe2.getText();
                    float zahl2 = Float.parseFloat(textFromTextField2);

                    String textFromTextField3 = operator.getText();

                    float ergebnis1;

                   switch (textFromTextField3) {
                       case "+":
                           ergebnis1 = zahl1 + zahl2;
                           String s = String.valueOf(ergebnis1);
                           System.out.println(s);
                           ergebnis.setText(s);
                           break;
                       case "-":
                           ergebnis1 = zahl1 - zahl2;
                           String s1 = String.valueOf(ergebnis1);
                           System.out.println(s1);
                           ergebnis.setText(s1);
                           break;
                       case "*":
                           ergebnis1 = zahl1 * zahl2;

                           String s2 = String.valueOf(ergebnis1);
                           System.out.println(s2);
                           ergebnis.setText(s2);
                           break;
                       case "/":
                           if (zahl2 == 0){
                               JOptionPane.showMessageDialog(null, "nicht durch Null teilen!");
                           }else {
                               ergebnis1 = zahl1 / zahl2;
                               String s3 = String.valueOf(ergebnis1);
                               System.out.println(s3);
                               ergebnis.setText(s3);
                               break;
                           }
               }
           }
        }
    });
    }
}
