package com.ifce.frames;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.ifce.estudante.Estudante;
import javax.swing.JLabel;

public class FrameMain extends JFrame {
	JMenu menuSistema;
	private JPanel contentPane;
	JDesktopPane desktopPane;
	
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	
	CadastroEstudante cadastro;
	Listar lista;
	AboutCreator creator;
	Alterar alterar;
	
	public static ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMain frame = new FrameMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameMain() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrameMain.class.getResource("/com/ifce/midias/school.png")));
		setTitle("Sistema Escolar");
		setBounds(100, 100, 270, 350);
		
		this.setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuSistema = new JMenu("Estudante");
		menuBar.add(menuSistema);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cadastrar");
		mntmNewMenuItem.setSelected(true);
		mntmNewMenuItem.setEnabled(false);
		mntmNewMenuItem.setAction(action);
		mntmNewMenuItem.setIcon(new ImageIcon(FrameMain.class.getResource("/com/ifce/midias/students.png")));
		menuSistema.add(mntmNewMenuItem);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mntmBuscar.setAction(action_3);
		mntmBuscar.setIcon(new ImageIcon(FrameMain.class.getResource("/com/ifce/midias/lupa.png")));
		menuSistema.add(mntmBuscar);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listar");
		mntmNewMenuItem_1.setAction(action_2);
		mntmNewMenuItem_1.setIcon(new ImageIcon(FrameMain.class.getResource("/com/ifce/midias/list.png")));
		menuSistema.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Alterar");
		mntmNewMenuItem_2.setAction(action_5);
		mntmNewMenuItem_2.setIcon(new ImageIcon(FrameMain.class.getResource("/com/ifce/midias/updating.png")));
		menuSistema.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Deletar");
		mntmNewMenuItem_3.setIcon(new ImageIcon(FrameMain.class.getResource("/com/ifce/midias/delete.png")));
		menuSistema.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Sair");
		mntmNewMenuItem_4.setAction(action_1);
		mntmNewMenuItem_4.setIcon(new ImageIcon(FrameMain.class.getResource("/com/ifce/midias/exit.png")));
		menuSistema.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu = new JMenu("Sobre");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Criador");
		mntmNewMenuItem_5.setAction(action_4);
		mntmNewMenuItem_5.setIcon(new ImageIcon(FrameMain.class.getResource("/com/ifce/midias/editor.png")));
		mnNewMenu.add(mntmNewMenuItem_5);
		getContentPane().setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 254, 289);
		getContentPane().add(desktopPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(FrameMain.class.getResource("/com/ifce/midias/bgFrameMain.jpeg")));
		lblNewLabel.setBounds(0, 0, 254, 289);
		desktopPane.add(lblNewLabel);

	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Cadastrar");
			putValue(SHORT_DESCRIPTION, "Cadastro de estudantes.");
		}
		public void actionPerformed(ActionEvent e) {
			cadastro = new CadastroEstudante();
			desktopPane.add(cadastro);			
			//cadastro.setVisible(true);
			//lista.setVisible(false);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Sair");
			putValue(SHORT_DESCRIPTION, "Encerrar atividades.");
		}
		public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
			
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Listar");
			putValue(SHORT_DESCRIPTION, "Listar estudantes.");
		}
		public void actionPerformed(ActionEvent e) {
			lista = new Listar();
			desktopPane.add(lista);
			//lista.setVisible(true);
			//cadastro.setVisible(false);
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Buscar");
			putValue(SHORT_DESCRIPTION, "Buscar estudantes");
		}
		public void actionPerformed(ActionEvent e) {
			new Buscar(); //só assim já resolve
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Criador");
			putValue(SHORT_DESCRIPTION, "Sobre o criador do programa");
		}
		public void actionPerformed(ActionEvent e) {
			creator = new AboutCreator();
			desktopPane.add(creator);	
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "Alterar");
			putValue(SHORT_DESCRIPTION, "Alterar dados do estudante");
		}
		public void actionPerformed(ActionEvent e) {
			new Alterar();
		}
	}
}
