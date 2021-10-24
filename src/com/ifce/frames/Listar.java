package com.ifce.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Listar extends JInternalFrame {
	JTextArea txtListaResultado;
	
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
		
		txtListaResultado = new JTextArea();
		scrollPane.setViewportView(txtListaResultado);
		btnVoltarListar.setBounds(73, 225, 89, 23);
		getContentPane().add(btnVoltarListar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtListaResultado.selectAll();
				txtListaResultado.replaceSelection("");
				for(int i=0;i<FrameMain.estudantes.size();i++) {
					System.out.println("Estudante "+i+"\n"+FrameMain.estudantes.get(i));
					
					txtListaResultado.append("--------------------------------\n"+FrameMain.estudantes.get(i).toString() + 
								"--------------------------------\n");
					
					/*
					String resultadoLista = FrameMain.estudantes.get(i).toString();
					txtListaResultado.append(resultadoLista);
					txtListaResultado.append("\n");
					txtListaResultado.append("--------------------------------");
					txtListaResultado.append("\n");*/
					//System.out.println(FrameMain.estudantes.get(i).toString());
					
				}
			}
		});
		btnListar.setBounds(73, 11, 89, 23);
		getContentPane().add(btnListar);
		setVisible(true);

	}
}
