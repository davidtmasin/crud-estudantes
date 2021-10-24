package com.ifce.frames;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.ifce.estudante.Estudante;

public class Alterar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtMatricula;
	private JTextField txtCPF;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public Alterar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Alterar.class.getResource("/com/ifce/midias/updating.png")));
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Alterar dados do estudante");
		setBounds(100, 100, 550, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(76, 19, 140, 20);
		contentPane.add(txtNome);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setBounds(10, 50, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(76, 47, 40, 20);
		contentPane.add(txtIdade);
		
		JLabel lblNewLabel_2 = new JLabel("Matr\u00EDcula:");
		lblNewLabel_2.setBounds(10, 78, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(76, 75, 140, 20);
		contentPane.add(txtMatricula);
		
		JLabel lblNewLabel_3 = new JLabel("CPF:");
		lblNewLabel_3.setBounds(10, 106, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(76, 103, 140, 20);
		contentPane.add(txtCPF);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(239, 11, 285, 189);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Idade", "Matr\u00EDcula", "CPF"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowSelected = table.getSelectedRow();
				
				String nome = txtNome.getText();
				int idade = Integer.parseInt(txtIdade.getText());
				String matricula = txtMatricula.getText();
				String cpf = txtCPF.getText();
				
				
				for(int i=0;i<FrameMain.estudantes.size();i++) {
					
					if(FrameMain.estudantes.get(rowSelected).getId() == rowSelected) {
						long idEstudante = FrameMain.estudantes.get(rowSelected).getId(); 
						System.out.println("Estudante id: "+idEstudante);
						System.out.println("Nome antes da edição: "+FrameMain.estudantes.get(i).getNome());
						System.out.println("Idade antes da edição: "+FrameMain.estudantes.get(i).getIdade());
						System.out.println("Matrícula antes da edição: "+FrameMain.estudantes.get(i).getMatricula());
						System.out.println("CPF antes da edição: "+FrameMain.estudantes.get(i).getCPF());
						
						FrameMain.estudantes.get(i).setNome(nome);
						FrameMain.estudantes.get(i).setIdade(idade);
						FrameMain.estudantes.get(i).setMatricula(matricula);
						FrameMain.estudantes.get(i).setCPF(cpf);
						
						break;
					}						
				}
				
				limpaRegistro();
				
				JOptionPane.showMessageDialog(null, "Contato alterado com sucesso.", "Sucesso na alteração", JOptionPane.INFORMATION_MESSAGE);
			
				
			}
		});
		
		btnAlterar.setBounds(121, 143, 108, 23);
		contentPane.add(btnAlterar);
		
		JButton btnVoltar2 = new JButton("Voltar");
		btnVoltar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnVoltar2.setBounds(64, 177, 108, 23);
		contentPane.add(btnVoltar2);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Trazer dados
				int num = table.getSelectedRow();
				System.out.println("Estudante id: "+FrameMain.estudantes.get(num).getId());
				
				for(int i=0;i<FrameMain.estudantes.size();i++) {					
					txtNome.setText(table.getValueAt(num, 0).toString());
					txtIdade.setText(table.getValueAt(num, 1).toString());
					txtMatricula.setText(table.getValueAt(num, 2).toString());
					txtCPF.setText(table.getValueAt(num, 3).toString());
					
				}	
				
			}
		});
		btnListar.setBounds(8, 143, 108, 23);
		contentPane.add(btnListar);
	
		
		mostraRegistros();
		
		
		
	}

public void limpaRegistro() {
	
	DefaultTableModel modelo = (DefaultTableModel) table.getModel();
	modelo.setNumRows(0);
	
	limpaTela();
	mostraRegistros();
}

public void limpaTela() {
	txtNome.setText("");
	txtIdade.setText("");
	txtMatricula.setText("");
	txtCPF.setText("");
	
	txtNome.grabFocus();
}

public void mostraRegistros() {
	//int num = table.getSelectedRow();
	DefaultTableModel modelo = (DefaultTableModel) table.getModel();
	
	for(int i=0;i<FrameMain.estudantes.size();i++) {
		modelo.addRow(new Object[] {
				FrameMain.estudantes.get(i).getNome(),
				FrameMain.estudantes.get(i).getIdade(),
				FrameMain.estudantes.get(i).getMatricula(),
				FrameMain.estudantes.get(i).getCPF()
		});
		System.out.println("Nome: "+FrameMain.estudantes.get(i).getNome());
		System.out.println("Idade: "+FrameMain.estudantes.get(i).getIdade());
		System.out.println("Matricula: "+FrameMain.estudantes.get(i).getMatricula());
		System.out.println("CPF: "+FrameMain.estudantes.get(i).getCPF());
		System.out.println("------------------------------------------");
		/**
		 * 
		table.setValueAt(FrameMain.estudantes.get(i).getNome(), i, 0);
		table.setValueAt(FrameMain.estudantes.get(i).getIdade(), i, 1);
		table.setValueAt(FrameMain.estudantes.get(i).getMatricula(), i, 2);
		table.setValueAt(FrameMain.estudantes.get(i).getCPF(), i, 3);
		 * 
		 */
	}
}
}
