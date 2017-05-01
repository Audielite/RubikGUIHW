package com.lex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

/**
 * Created by alexishennings on 4/30/17.
 */
public class RubikGUI extends JFrame{
    private JButton submitButton;
    private JTextField textField1;
    private JList<Solvers> RecordsJList;
    private JPanel rootPanel;
    private JTextField textField2;
    private JButton submitButton2;

    private DefaultListModel<Solvers> recordsListModel;

    protected RubikGUI() {

        super("Records");
        setContentPane(rootPanel);
        pack();
        setPreferredSize(new Dimension(3000, 5000));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        recordsListModel = new DefaultListModel<>();
        RecordsJList.setModel(recordsListModel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String solvers = textField1.getText();
                //String rating = (String) priorityLevelComboBox.getSelectedItem();
                String result = "Ticket created.";
                JOptionPane.showMessageDialog(RubikGUI.this, result);

                Solvers newSolvers = new Solvers(solvers);
                recordsListModel.addElement(newSolvers);

            }
        });

        submitButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time = textField2.getText();
                //String rating = (String) priorityLevelComboBox.getSelectedItem();
                //String result = "Ticket created.";
                //JOptionPane.showMessageDialog(RubikGUI.this, result);

                Solvers newTime = new Solvers(time);
                recordsListModel.addElement(newTime);

            }
        });

    }
}