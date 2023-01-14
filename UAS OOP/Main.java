import javax.swing.*;
import java.awt.event.*;

public class Main{
  public static void main(String[] args) {
    final Animal cat = new
    Cat("Fluffy");
    final Animal dog = new 
    Dog("Buddy");

    JFrame frame = new 
    JFrame("Animal Sounds");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();

    JButton buttonCat = new JButton("Cat");

    buttonCat.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        cat.makeSound();

      }
    });
    panel.add(buttonCat);

    JButton buttonDog = new JButton("Dog");

    buttonDog.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        dog.makeSound();

      }
    });
    panel.add(buttonDog);

    frame.add(panel);

    frame.pack();
    frame.setVisible(true);

  }
}
