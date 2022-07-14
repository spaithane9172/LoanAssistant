package com.mycompany.loanassistant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class LoanAssistant extends JFrame {

    GridBagConstraints gridConstraint;
    JTextField monthsTextField;
    JTextField paymentTextField;
    JButton monthsButton;
    JButton paymentButton;
    JButton computeButton;
    JTextField balanceTextField;
    JTextField interestTextField;
    JTextArea analysisTextArea;
    JButton newLoanButton;

    public LoanAssistant() {
        setVisible(true);
        setSize(800, 400);
        setResizable(false);
        setTitle("LoanAssistant");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridBagLayout());

        JLabel balanceLabel = new JLabel();
        balanceTextField = new JTextField();
        JLabel interestLabel = new JLabel();
        interestTextField = new JTextField();
        JLabel monthsLabel = new JLabel();
        monthsTextField = new JTextField();
        JLabel paymentLabel = new JLabel();
        paymentTextField = new JTextField();

        Font myFont = new Font("Arial", Font.PLAIN, 16);

        balanceLabel.setFont(myFont);
        balanceLabel.setText("Loan Balance");
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 0;
        gridConstraint.gridy = 0;
        gridConstraint.insets = new Insets(10, 10, 0, 10);
        gridConstraint.anchor = GridBagConstraints.WEST;
        getContentPane().add(balanceLabel, gridConstraint);

        balanceTextField.setPreferredSize(new Dimension(100, 25));
        balanceTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        balanceTextField.setFont(myFont);
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 1;
        gridConstraint.gridy = 0;
        gridConstraint.insets = new Insets(10, 10, 0, 0);
        getContentPane().add(balanceTextField, gridConstraint);

        interestLabel.setText("Interest Rate");
        interestLabel.setFont(myFont);
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 0;
        gridConstraint.gridy = 1;
        gridConstraint.insets = new Insets(10, 10, 0, 10);
        gridConstraint.anchor = GridBagConstraints.WEST;
        getContentPane().add(interestLabel, gridConstraint);

        interestTextField.setPreferredSize(new Dimension(100, 25));
        interestTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        interestTextField.setFont(myFont);
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 1;
        gridConstraint.gridy = 1;
        gridConstraint.insets = new Insets(10, 10, 0, 0);
        getContentPane().add(interestTextField, gridConstraint);

        monthsLabel.setText("Number of Payment");
        monthsLabel.setFont(myFont);
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 0;
        gridConstraint.gridy = 2;
        gridConstraint.anchor = GridBagConstraints.WEST;
        gridConstraint.insets = new Insets(10, 10, 0, 10);
        getContentPane().add(monthsLabel, gridConstraint);

        monthsTextField.setFont(myFont);
        monthsTextField.setPreferredSize(new Dimension(100, 25));
        monthsTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 1;
        gridConstraint.gridy = 2;
        gridConstraint.insets = new Insets(10, 10, 0, 0);
        getContentPane().add(monthsTextField, gridConstraint);

        paymentLabel.setFont(myFont);
        paymentLabel.setText("Monthly Payment");
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 0;
        gridConstraint.gridy = 3;
        gridConstraint.insets = new Insets(10, 10, 0, 10);
        gridConstraint.anchor = GridBagConstraints.WEST;
        getContentPane().add(paymentLabel, gridConstraint);

        paymentTextField.setPreferredSize(new Dimension(100, 25));
        paymentTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        paymentTextField.setFont(myFont);
        paymentTextField.setBackground(lightYellow);
        paymentTextField.setEditable(false);
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 1;
        gridConstraint.gridy = 3;
        gridConstraint.insets = new Insets(10, 10, 0, 0);
        getContentPane().add(paymentTextField, gridConstraint);

        computeButton = new JButton();
        newLoanButton = new JButton();

        computeButton.setText("Compute Monthly Paymet");
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 0;
        gridConstraint.gridy = 4;
        gridConstraint.gridwidth = 2;
        gridConstraint.insets = new Insets(10, 0, 0, 0);
        getContentPane().add(computeButton, gridConstraint);

        computeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                computeButtonActionPerformed(e);
            }
        });

        newLoanButton.setText("New Loan Analyasis");
        newLoanButton.setEnabled(false);
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 0;
        gridConstraint.gridy = 5;
        gridConstraint.gridwidth = 2;
        gridConstraint.insets = new Insets(10, 0, 0, 0);
        getContentPane().add(newLoanButton, gridConstraint);

        newLoanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                newLoanButtonActionPerformed(e);
            }
        });

        monthsButton = new JButton();
        paymentButton = new JButton();

        monthsButton.setText("X");
        monthsButton.setFocusable(false);
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 2;
        gridConstraint.gridy = 2;
        gridConstraint.insets = new Insets(10, 10, 0, 0);
        getContentPane().add(monthsButton, gridConstraint);

        monthsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                monthsButtonActionPerformed(e);
            }
        });

        paymentButton.setText("X");
        paymentButton.setFocusable(false);
        paymentButton.setVisible(false);
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 2;
        gridConstraint.gridy = 3;
        gridConstraint.insets = new Insets(10, 10, 0, 0);
        getContentPane().add(paymentButton, gridConstraint);

        paymentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                paymentButtonActionPerformed(e);
            }
        });

        JLabel analysisLabel = new JLabel();
        analysisTextArea = new JTextArea();
        JButton exitButton = new JButton();

        analysisLabel.setText("Loan Analysis");
        analysisLabel.setFont(myFont);
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 3;
        gridConstraint.gridy = 0;
        gridConstraint.insets = new Insets(10, 20, 0, 0);
        gridConstraint.anchor = GridBagConstraints.WEST;
        getContentPane().add(analysisLabel, gridConstraint);

        analysisTextArea.setPreferredSize(new Dimension(250, 150));
        analysisTextArea.setFocusable(false);
        analysisTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        analysisTextArea.setFont(new Font("Courier New", Font.PLAIN, 14));
        analysisTextArea.setEditable(false);
        analysisTextArea.setBackground(Color.WHITE);
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 3;
        gridConstraint.gridy = 1;
        gridConstraint.gridheight = 4;
        gridConstraint.insets = new Insets(10, 20, 0, 0);
        getContentPane().add(analysisTextArea, gridConstraint);

        exitButton.setText("Exit");
        exitButton.setFocusable(false);
        gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 3;
        gridConstraint.gridy = 5;
        gridConstraint.insets = new Insets(10, 0, 0, 0);
        getContentPane().add(exitButton, gridConstraint);

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitButtonActionPerformed(e);
            }
        });

        balanceTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                balanceTextFieldActionPerformed(e);
            }
        });
        interestTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                interestTextFieldActionPerformed(e);
            }
        });
        monthsTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                monthsTextFieldActionPerformed(e);
            }
        });
        paymentTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                paymentTextFieldActionPerformed(e);
            }
        });

        paymentButton.doClick();
    }

    private void balanceTextFieldActionPerformed(ActionEvent e) {
        balanceTextField.transferFocus();
    }

    private void interestTextFieldActionPerformed(ActionEvent e) {
        interestTextField.transferFocus();
    }

    private void monthsTextFieldActionPerformed(ActionEvent e) {
        monthsTextField.transferFocus();
    }

    private void paymentTextFieldActionPerformed(ActionEvent e) {
        paymentTextField.transferFocus();
    }

    public boolean validateDecimalNumber(JTextField tf) {
        String s = tf.getText().trim();
        boolean hasDecimal = false;
        boolean valid = true;
        if (s.length() == 0) {
            valid = false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= '0' && c <= '9') {
                    continue;
                } else if (c == '.' && !hasDecimal) {
                    hasDecimal = true;
                } else {
                    valid = false;
                }
            }
        }
        tf.setText(s);
        if (!valid) {
            tf.requestFocus();
        }

        return (valid);
    }

    public void exitButtonActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    public void monthsButtonActionPerformed(ActionEvent e) {
        computePayment = false;
        paymentButton.setVisible(true);
        monthsButton.setVisible(false);

        monthsTextField.setBackground(lightYellow);
        paymentTextField.setBackground(Color.WHITE);
        paymentTextField.setEditable(true);
        monthsTextField.setEditable(false);
        computeButton.setText("Compute Nuber of Payments");
        monthsTextField.setText("");
        paymentTextField.setFocusable(true);
        balanceTextField.requestFocus();
    }
    Color lightYellow = new Color(255, 255, 128);
    boolean computePayment;

    public void paymentButtonActionPerformed(ActionEvent e) {
        computePayment = true;
        monthsButton.setVisible(true);
        paymentButton.setVisible(false);
        paymentTextField.setBackground(lightYellow);
        monthsTextField.setBackground(Color.WHITE);
        paymentTextField.setEditable(false);
        monthsTextField.setEditable(true);
        paymentTextField.setText("");
        computeButton.setText("Compute Monthly Payment");
        monthsTextField.setFocusable(true);
        paymentTextField.setFocusable(false);
        balanceTextField.requestFocus();
    }

    public void computeButtonActionPerformed(ActionEvent e) {
        double balance, payment, interest;
        int months;
        double monthlyInterest, multiplier;
        double loanBalance, finalPayment;
        if (validateDecimalNumber(balanceTextField)) {
            balance = Double.valueOf(balanceTextField.getText()).doubleValue();
        } else {
            JOptionPane.showConfirmDialog(null, "Invalid or empty Loan Balance entry.\nPlease correct.", "Balance Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (validateDecimalNumber(interestTextField)) {
            interest = Double.valueOf(interestTextField.getText()).doubleValue();
        } else {
            JOptionPane.showConfirmDialog(null, "Invalid or empty Interest Rate entry.\nPlease correct.", "Interest Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        monthlyInterest = interest / 1200;
        if (computePayment) {

            if (validateDecimalNumber(monthsTextField)) {
                months = Integer.valueOf(monthsTextField.getText()).intValue();
            }
            else{
                JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Paymentsentry.\nPlease correct.", "Number of Payments Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (interest == 0) {
                payment = balance / months;
            } else {
                multiplier = Math.pow(1 + monthlyInterest, months);
                payment = balance * monthlyInterest * multiplier / (multiplier - 1);
            }

            paymentTextField.setText(new DecimalFormat("0.00").format(payment));
        } else {
            if(validateDecimalNumber(paymentTextField)){
                payment = Double.valueOf(paymentTextField.getText()).doubleValue();
                if(payment<=(balance*monthlyInterest+1.0)){
                    if (JOptionPane.showConfirmDialog(null, "Minimum payment must be $" + new DecimalFormat("0.00").format((int)(balance * monthlyInterest + 1.0)) + "\n" + "Do you want to use the minimum payment?", "Input Error", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                        paymentTextField.setText(new DecimalFormat("0.00").format((int)(balance * monthlyInterest + 1.0)));
                        payment =Double.valueOf(paymentTextField.getText()).doubleValue();
                    }
                    else{
                        paymentTextField.requestFocus();
                        return;
                    }
                }
            }
            else{
                JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Paymententry.\nPlease correct.", "Payment Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (interest == 0) {
                months = (int) (balance / payment);
            } else {
                months = (int) ((Math.log(payment) - Math.log(payment - balance * monthlyInterest)) / Math.log(1 + monthlyInterest));
            }

            monthsTextField.setText(String.valueOf(months));
        }
        payment = Double.valueOf(paymentTextField.getText()).doubleValue();
        analysisTextArea.setText("Loan Balance: $" + new DecimalFormat("0.00").format(balance));
        analysisTextArea.append("\n" + "Interest Rate: " + new DecimalFormat("0.00").format(interest) + "%");
        loanBalance = balance;
        for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++) {
            loanBalance += loanBalance * monthlyInterest - payment;
        }
        finalPayment = loanBalance;
        if (finalPayment > payment) {
            loanBalance += loanBalance * monthlyInterest - payment;
            finalPayment = loanBalance;
            months++;
            monthsTextField.setText(String.valueOf(months));
        }
        analysisTextArea.append("\n\n" + String.valueOf(months - 1) + " Payments of $" + new DecimalFormat("0.00").format(payment));
        analysisTextArea.append("\n" + "Final Paymentd of: $" + new DecimalFormat("0.00").format(finalPayment));
        analysisTextArea.append("\n" + "Total Payment: $" + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment));
        analysisTextArea.append("\n" + "Interes Paid $" + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment - balance));
        computeButton.setEnabled(false);
        newLoanButton.setEnabled(true);
        newLoanButton.requestFocus();
    }

    public void newLoanButtonActionPerformed(ActionEvent e) {
        if (computePayment) {
            paymentTextField.setText("");
        } else {
            monthsTextField.setText("");
        }
        analysisTextArea.setText("");
        computeButton.setEnabled(true);
        newLoanButton.setEnabled(false);
        balanceTextField.requestFocus();
    }

    public static void main(String[] args) {
        new LoanAssistant();
    }
}
