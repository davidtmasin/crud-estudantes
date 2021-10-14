package com.ifce.frames;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;

import javax.swing.Action;

public class CadastroEstudante extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtMatricula;
	private JTextField txtCPF;
	private final Action action = new SwingAction();


	/**
	 * Create the frame.
	 */
	
	public CadastroEstudante() {
		try {
			this.setMaximum(true);
						
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		setFrameIcon(new ImageIcon(CadastroEstudante.class.getResource("/com/ifce/midias/students.png")));
		setTitle("Cadastro de estudante");
		setBounds(0, 0, 254, 289);
		getContentPane().setLayout(null);
		
		setVisible(true);

		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 27, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setBounds(10, 52, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Matr\u00EDcula:");
		lblNewLabel_2.setBounds(10, 77, 60, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPF:");
		lblNewLabel_3.setBounds(10, 105, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		txtNome = new JTextField();
		txtNome.setBounds(76, 24, 140, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(76, 49, 40, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(76, 74, 140, 20);
		getContentPane().add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(76, 102, 140, 20);
		getContentPane().add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(64, 178, 108, 23);
		getContentPane().add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setAction(action);
		btnVoltar.setBounds(64, 212, 108, 23);
		getContentPane().add(btnVoltar);
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Voltar");
			putValue(SHORT_DESCRIPTION, "Retornar à página inicial");
		}
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
		}
	}
}
