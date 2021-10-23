package com.ifce.frames;

import java.awt.Font;
import java.beans.PropertyVetoException;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutCreator extends JInternalFrame {

	/**
	 * Create the frame.
	 */
	public AboutCreator() {
		
		try {
			this.setMaximum(true);
						
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setFrameIcon(new ImageIcon(AboutCreator.class.getResource("/com/ifce/midias/editor.png")));
		setResizable(true);
		setTitle("Sobre o criador");
		setBounds(0, 0, 254, 289);
		getContentPane().setLayout(null);
		setVisible(true);

		JLabel lblNewLabel = new JLabel("David Teixeira de Masin");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 218, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel labelFoto = new JLabel("");
		labelFoto.setToolTipText("Ol\u00E1, eu sou o criador do sistema CRUD de estudantes.");
		labelFoto.setHorizontalAlignment(SwingConstants.CENTER);
		labelFoto.setIcon(new ImageIcon(AboutCreator.class.getResource("/com/ifce/midias/criador.jpg")));
		labelFoto.setBounds(25, 36, 189, 148);
		getContentPane().add(labelFoto);
		
		JLabel lblNewLabel_1 = new JLabel("davidtmasin");
		lblNewLabel_1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		
		lblNewLabel_1.setBounds(49, 188, 73, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("davidteixeirademasin");
		lblNewLabel_1_1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(49, 213, 112, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("davidteixeira.info@gmail.com");
		lblNewLabel_1_1_1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(49, 238, 179, 14);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel githubLabel = new JLabel("");
		githubLabel.setIcon(new ImageIcon(AboutCreator.class.getResource("/com/ifce/midias/github.png")));
		githubLabel.setBounds(25, 188, 16, 14);
		getContentPane().add(githubLabel);
		
		JLabel githubLabel_1 = new JLabel("");
		githubLabel_1.setIcon(new ImageIcon(AboutCreator.class.getResource("/com/ifce/midias/linkedin.png")));
		githubLabel_1.setBounds(25, 213, 16, 14);
		getContentPane().add(githubLabel_1);
		
		JLabel githubLabel_1_1 = new JLabel("");
		githubLabel_1_1.setIcon(new ImageIcon(AboutCreator.class.getResource("/com/ifce/midias/gmail.png")));
		githubLabel_1_1.setBounds(25, 238, 16, 14);
		getContentPane().add(githubLabel_1_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setToolTipText("Clique aqui para voltar");
		btnNewButton.setIcon(new ImageIcon(AboutCreator.class.getResource("/com/ifce/midias/go-back-arrow.png")));
		btnNewButton.setBounds(197, 195, 31, 25);
		getContentPane().add(btnNewButton);
		
		//labelFoto.setIcon(resize.redimensionar(labelFoto, 158, 148));

	}
}
