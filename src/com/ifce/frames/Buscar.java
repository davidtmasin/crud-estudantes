package com.ifce.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.ifce.estudante.Estudante;

public class Buscar extends JFrame {

	private JPanel contentPane;
	private JTextField textBusca;
	JTextArea textArea;

	
	/**
	 * Create the frame.
	 */
	public Buscar() {
		setTitle("Buscar estudante");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 326, 290);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o CPF do estudante");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(75, 11, 156, 14);
		contentPane.add(lblNewLabel);
		
		textBusca = new JTextField();
		textBusca.setToolTipText("Digite aqui o CPF do estudante");
		textBusca.setBounds(67, 38, 172, 20);
		contentPane.add(textBusca);
		textBusca.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Buscar.class.getResource("/com/ifce/midias/lupa.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textBusca.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor, digite um CPF!", "Atenção", JOptionPane.WARNING_MESSAGE);
				} else {
					for(int i = 0; i <FrameMain.estudantes.size();i++) {
						
						if(textBusca.getText().equals(FrameMain.estudantes.get(i).getCPF())) {
							textArea.selectAll();
							textArea.replaceSelection("");
							textArea.append(FrameMain.estudantes.get(i).toString());
							textArea.append("------------------------------------------------\n");
						} else {
							JOptionPane.showMessageDialog(null, "Não há aluno cadastrado para este CPF!", "Atenção", JOptionPane.WARNING_MESSAGE);
						}
					}
				}				
			}
		});
				
		btnNewButton.setBounds(253, 33, 30, 30);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 74, 287, 164);
		contentPane.add(textArea);
	}
}
