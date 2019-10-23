/*
 * File: MainFrame.java
 * Author: Bacchus Jackson
 * Date: October 22, 2019
 * Purpose: This class builds a user interface which takes an hourly rate
 *          and calculates the income at various intervals.
 */

package umuc.bacchusjackson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame {
  static final int WIDTH = 300, HEIGHT = 200;

  public MainFrame() {
    super("Main Frame");
    setFrame(WIDTH, HEIGHT);
    add(new body());
  }

  public void display() {
    setVisible(true);
  }

  private void setFrame(int width, int height) {
    setSize(width, height);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

class body extends JPanel {

  static final double MINUTES_IN_HOUR = 60.00;
  static final double HOURS_IN_WEEK = 40.00;
  static final double HOURS_IN_MONTH = 173.34;
  static final double HOURS_IN_YEAR = 2080.00;

  // Create Labels
  private JLabel[] labels = {
          new JLabel("Hourly Rate"),
          new JLabel("Income Per Minute"),
          new JLabel("Income Per Hour"),
          new JLabel("Income Per Week"),
          new JLabel("Income Per Month"),
          new JLabel("Income Per Year")
  };

  // Create Fields
  private JTextField[] textFields = {
          new JTextField(""), new JTextField(""),
          new JTextField(""), new JTextField(""),
          new JTextField(""), new JTextField(""),
  };

  // Create Button
  private JButton submitButton = new JButton("Calculate");

  // Constructor
  public body() {

    setLayout(new BorderLayout());
    JPanel bodyPanel = new JPanel();
    bodyPanel.setLayout(new GridLayout(6,2, 0, 5));


    // Disable the text fields and add them to the panel
    for(int i=0; i<textFields.length; i++) {
      textFields[i].setBackground(Color.lightGray);
      textFields[i].setEnabled(false);

      // Add the label and then the text field
      bodyPanel.add(labels[i]);
      bodyPanel.add(textFields[i]);
    }

    // Make the first field (Hourly Rate) enabled
    textFields[0].setEnabled(true);
    textFields[0].setBackground(Color.white);

    add(bodyPanel, BorderLayout.CENTER);

    // Add a button
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    buttonPanel.add(submitButton);
    add(buttonPanel, BorderLayout.SOUTH);

    // Button Action
    submitButton.addActionListener(buttonClickAction);

  }

  // Add an action to the button
  ActionListener buttonClickAction = new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      int hourlyRate = getHourlyRate();
      textFields[1].setText(String.valueOf(hourlyRate / MINUTES_IN_HOUR));
      textFields[2].setText(String.valueOf(hourlyRate));
      textFields[3].setText(String.valueOf(hourlyRate * HOURS_IN_WEEK));
      textFields[4].setText(String.valueOf(hourlyRate * HOURS_IN_MONTH));
      textFields[5].setText(String.valueOf(hourlyRate * HOURS_IN_YEAR));
    }
  };

  private int getHourlyRate() {
    return Integer.parseInt(textFields[0].getText());
  }

}