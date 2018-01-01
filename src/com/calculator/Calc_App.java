package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calc_App {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double Secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc_App window = new Calc_App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc_App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.setBounds(100, 100, 264, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 230, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton Btm7 = new JButton("7");
		Btm7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText()+Btm7.getText();
				textField.setText(EnterNumber);
			}
		});
		Btm7.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btm7.setBounds(10, 127, 50, 50);
		frame.getContentPane().add(Btm7);
		
		JButton Btm8 = new JButton("8");
		Btm8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+Btm8.getText();
				textField.setText(EnterNumber);
				
			}
		});
		Btm8.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btm8.setBounds(70, 127, 50, 50);
		frame.getContentPane().add(Btm8);
		
		JButton Btm9 = new JButton("9");
		Btm9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+Btm9.getText();
				textField.setText(EnterNumber);
			}
		});
		Btm9.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btm9.setBounds(130, 127, 50, 50);
		frame.getContentPane().add(Btm9);
		
		JButton Btm4 = new JButton("4");
		Btm4.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btm4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText()+Btm4.getText();
				textField.setText(EnterNumber);
			}
		});
		Btm4.setBounds(10, 185, 50, 50);
		frame.getContentPane().add(Btm4);
		
		JButton Btm5 = new JButton("5");
		Btm5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText()+Btm5.getText();
				textField.setText(EnterNumber);
			}
			
		});
		Btm5.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btm5.setBounds(70, 185, 50, 50);
		frame.getContentPane().add(Btm5);
		
		JButton Btm6 = new JButton("6");
		Btm6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+Btm6.getText();
				textField.setText(EnterNumber);
			}
		});
		Btm6.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btm6.setBounds(130, 185, 50, 50);
		frame.getContentPane().add(Btm6);
		
		JButton Btm1 = new JButton("1");
		Btm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+Btm1.getText();
				textField.setText(EnterNumber);
			}
		});
		Btm1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btm1.setBounds(10, 245, 50, 50);
		frame.getContentPane().add(Btm1);
		
		JButton Btm2 = new JButton("2");
		Btm2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+Btm2.getText();
				textField.setText(EnterNumber);
			}
		});
		Btm2.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btm2.setBounds(70, 245, 50, 50);
		frame.getContentPane().add(Btm2);
		
		JButton Btm3 = new JButton("3");
		Btm3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+Btm3.getText();
				textField.setText(EnterNumber);
			}
		});
		Btm3.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btm3.setBounds(130, 245, 50, 50);
		frame.getContentPane().add(Btm3);
		
		JButton BtmPlus = new JButton("+");
		BtmPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		BtmPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtmPlus.setBounds(190, 69, 50, 50);
		frame.getContentPane().add(BtmPlus);
		
		JButton BtmSub = new JButton("-");
		BtmSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		BtmSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtmSub.setBounds(190, 127, 50, 50);
		frame.getContentPane().add(BtmSub);
		
		JButton BtmMul = new JButton("X");
		BtmMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
				
			}
		});
		BtmMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtmMul.setBounds(190, 185, 50, 50);
		frame.getContentPane().add(BtmMul);
		
		JButton Btm0 = new JButton("0");
		Btm0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+Btm0.getText();
				textField.setText(EnterNumber);
			}
		});
		Btm0.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btm0.setBounds(10, 306, 50, 50);
		frame.getContentPane().add(Btm0);
		
		JButton BtmDot = new JButton(".");
		BtmDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtmDot.setBounds(70, 306, 50, 50);
		frame.getContentPane().add(BtmDot);
		
		JButton BtmThreeDot = new JButton("...");
		BtmThreeDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtmThreeDot.setBounds(130, 306, 50, 50);
		frame.getContentPane().add(BtmThreeDot);
		
		JButton BtmEqual = new JButton("=");
		BtmEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				Secondnum=Double.parseDouble(textField.getText());
				if(operations=="+")
				{
					result=firstnum+Secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operations=="-")
				{
					result=firstnum-Secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operations=="*")
				{
					result=firstnum*Secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operations=="/")
				{
					result=firstnum/Secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operations=="%")
				{
					result=firstnum%Secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		BtmEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtmEqual.setBounds(190, 306, 50, 50);
		frame.getContentPane().add(BtmEqual);
		
		JButton BtmBack = new JButton("<--");
		BtmBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		BtmBack.setFont(new Font("Tahoma", Font.BOLD, 10));
		BtmBack.setBounds(10, 69, 50, 50);
		frame.getContentPane().add(BtmBack);
		
		JButton BtmCancle = new JButton("c");
		BtmCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				textField.setText(null);
			}
		});
		BtmCancle.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtmCancle.setBounds(70, 69, 50, 50);
		frame.getContentPane().add(BtmCancle);
		
		JButton BtmPercent = new JButton("%");
		BtmPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="%";
			}
		});
		BtmPercent.setFont(new Font("Tahoma", Font.BOLD, 12));
		BtmPercent.setBounds(130, 69, 50, 50);
		frame.getContentPane().add(BtmPercent);
		
		JButton BtmBy = new JButton("/");
		BtmBy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		BtmBy.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtmBy.setBounds(190, 245, 50, 50);
		frame.getContentPane().add(BtmBy);
		
	
	}
}
