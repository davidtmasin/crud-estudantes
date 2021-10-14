package com.ifce.frames;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Listar extends JInternalFrame {

	
	/**
	 * Create the frame.
	 */
	public Listar() {
		try {
			this.setMaximum(true);
						
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setTitle("Listar estudantes");
		setFrameIcon(new ImageIcon(Listar.class.getResource("/com/ifce/midias/list.png")));
		setBounds(0, 0, 254, 289);
		getContentPane().setLayout(null);
		
		JButton btnVoltarListar = new JButton("Voltar");
		btnVoltarListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(8, 40, 218, 174);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		btnVoltarListar.setBounds(73, 225, 89, 23);
		getContentPane().add(btnVoltarListar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(85, 11, 64, 23);
		getContentPane().add(btnListar);
		setVisible(true);

	}
}
