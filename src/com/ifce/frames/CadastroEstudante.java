package com.ifce.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.ifce.estudante.Estudante;

public class CadastroEstudante extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtMatricula;
	private JTextField txtCPF;
	private final Action action = new SwingAction();
	public static long id = 0;
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

		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 27, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(10, 60, 32, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Matr\u00EDcula");
		lblNewLabel_2.setBounds(10, 94, 55, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPF");
		lblNewLabel_3.setBounds(10, 128, 24, 14);
		getContentPane().add(lblNewLabel_3);
		
		txtNome = new JTextField();
		txtNome.setBounds(75, 24, 153, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(75, 57, 55, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(75, 91, 153, 20);
		getContentPane().add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(75, 125, 153, 20);
		getContentPane().add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setToolTipText("Cadastrar estudante");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				int idade = Integer.parseInt(txtIdade.getText());
				String matricula = txtMatricula.getText();
				String CPF = txtCPF.getText();
								
				Estudante estudante = new Estudante(id, nome, idade, matricula, CPF);
				
				//Usando o arrayList para add os novos objetos Estudante que são criados aqui na função de cadastro
				FrameMain.estudantes.add(estudante);
				
				JOptionPane.showMessageDialog(btnCadastrar, "Estudante cadastrado com sucesso!", "Sucesso no cadastro", JOptionPane.INFORMATION_MESSAGE);
				
				
				txtNome.setText("");
				txtIdade.setText("");
				txtMatricula.setText("");
				txtCPF.setText("");		
				id++;
				
				txtNome.grabFocus();
				
			
			}
		});
		btnCadastrar.setBounds(64, 178, 108, 23);
		getContentPane().add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setToolTipText("Retornar \u00E0 tela anterior");
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
