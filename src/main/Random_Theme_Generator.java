package main;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Filip Jamroga
 */
public class Random_Theme_Generator {
    JLabel Preview;
    JTextArea code;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random_Theme_Generator m = new Random_Theme_Generator();
        m.doDziela();
    }
    
    public void doDziela(){
	JFrame okno = new JFrame("Generator tematów kolorystycznych HTML"); //definiujemy okienko
	JPanel panel = new JPanel();
        
        Preview = new JLabel(); //tu wstawiamy wygląd strony
        Preview.setText(""
                + "<html>\n"
                    + "<body style=\"background-color: rgb("+(int)( Math.random()*255) +", "+(int)( Math.random()*255) +", "+(int)( Math.random()*255) +");\">\n"
                        + "<h1 style=\"color: rgb("+(int)( Math.random()*255) +", "+(int)( Math.random()*255) +", "+(int)( Math.random()*255) +"); text-align: center;\"><u>Lorem Ipsum</u></h1>\n"
                        +"<p style=\"color: rgb("+(int)( Math.random()*255) +", "+(int)( Math.random()*255) +", "+(int)( Math.random()*255) +");\">\n"
                            + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque in lacus non mi sagittis semper. \n"
                            + "<br>Ut nec sodales velit. Nullam faucibus gravida nibh, in sodales velit bibendum vitae.Phasellus non \n"
                            + "<br>ex mauris. Nunc eleifend aliquam quam vel blandit. Fusce rhoncus tristique sapien, at vehicula quam \n"
                            + "<br>dictum in. Morbi lorem neque, eleifend mattis eros ut, tempor fringilla <br>ligula. Praesent ultrices \n"
                            + "consectetur tempus. Donec ullamcorper tincidunt justo, non auctor nisi \n"
                            + "<br>euismod et. Suspendisse vitae tortor eu felis vestibulum porttitor at quis tortor. Vestibulum finibus \n"
                            + "<br>pulvinar tincidunt. Nullam lacinia, diam id faucibus accumsan, nibh mauris pulvinar nisl, in congue felis \n"
                            + "<br>odio non nibh eu nisi. Donec ullamcorper pulvinar ligula, vel interdum ipsum luctus id. \n"
                        + "</p>\n"
                    + "</body>\n"
                + "</html>");
        code = new JTextArea(40,40); //a tu kod strony
	code.setBorder(new LineBorder(Color.BLACK));
        code.setText(Preview.getText());
	
        JButton b = new JButton("Losuj Losula"); //nasz guziczek
	
	ButtonListener listen = new ButtonListener(); //i jego "słuchacz"
	
	b.addActionListener(listen); //definiowanie okna ciąg dalszy
        panel.add(Preview);
        panel.add(code);
	
	okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	okno.add(b, BorderLayout.PAGE_START);
        okno.add(panel, BorderLayout.CENTER);
	okno.setSize(600,600);
	okno.setVisible(true);
    }
    
    public class ButtonListener implements ActionListener { //klasa wewnętrzna odpowiedzialna za obsługiwanie guzika
        @Override
        public void actionPerformed(ActionEvent ev) {
            Preview.setText("" //tworzymy nową losową stronę
                    + "<html>\n"
                        + "<body style=\"background-color: rgb("+(int)( Math.random()*255) +", "+(int)( Math.random()*255) +", "+(int)( Math.random()*255) +");\">\n"
                            + "<h1 style=\"color: rgb("+(int)( Math.random()*255) +", "+(int)( Math.random()*255) +", "+(int)( Math.random()*255) +"); text-align: center;\"><u>Lorem Ipsum</u></h1>\n"
                            +"<p style=\"color: rgb("+(int)( Math.random()*255) +", "+(int)( Math.random()*255) +", "+(int)( Math.random()*255) +");\">\n"
                                + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque in lacus non mi sagittis semper. \n"
                                + "<br>Ut nec sodales velit. Nullam faucibus gravida nibh, in sodales velit bibendum vitae.Phasellus non \n"
                                + "<br>ex mauris. Nunc eleifend aliquam quam vel blandit. Fusce rhoncus tristique sapien, at vehicula quam \n"
                                + "<br>dictum in. Morbi lorem neque, eleifend mattis eros ut, tempor fringilla <br>ligula. Praesent ultrices \n"
                                + "consectetur tempus. Donec ullamcorper tincidunt justo, non auctor nisi \n"
                                + "<br>euismod et. Suspendisse vitae tortor eu felis vestibulum porttitor at quis tortor. Vestibulum finibus \n"
                                + "<br>pulvinar tincidunt. Nullam lacinia, diam id faucibus accumsan, nibh mauris pulvinar nisl, in congue felis \n"
                                + "<br>odio non nibh eu nisi. Donec ullamcorper pulvinar ligula, vel interdum ipsum luctus id. \n"
                            + "</p>\n"
                        + "</body>\n"
                    + "</html>");
            code.setText(Preview.getText()); //i pokazujemy jej kod
        }
    }  
}
