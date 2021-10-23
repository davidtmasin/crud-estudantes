package com.ifce.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buscar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JTextArea textArea;

	
	/**
	 * Create the frame.
	 */
	public Buscar() {
		setTitle("Buscar estudante");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o CPF do estudante:");
		lblNewLabel.setBounds(10, 32, 165, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(185, 29, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i <FrameMain.estudantes.size();i++) {
					if(textField.getText().equals(FrameMain.estudantes.get(i).getCPF())) {
						
						textArea.append(FrameMain.estudantes.get(i).toString());
					}
				}
			}
		});
		btnNewButton.setBounds(335, 28, 89, 23);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 74, 414, 164);
		contentPane.add(textArea);
	}
}
