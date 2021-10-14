package com.ifce.frames;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class FrameMain extends JFrame {
	JMenu menuSistema;
	private JPanel contentPane;
	JDesktopPane desktopPane;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	
	CadastroEstudante cadastro;
	Listar lista;

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
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listar");
		mntmNewMenuItem_1.setAction(action_2);
		mntmNewMenuItem_1.setIcon(new ImageIcon(FrameMain.class.getResource("/com/ifce/midias/list.png")));
		menuSistema.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Alterar");
		mntmNewMenuItem_2.setIcon(new ImageIcon(FrameMain.class.getResource("/com/ifce/midias/updating.png")));
		menuSistema.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Deletar");
		mntmNewMenuItem_3.setIcon(new ImageIcon(FrameMain.class.getResource("/com/ifce/midias/delete.png")));
		menuSistema.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Sair");
		mntmNewMenuItem_4.setAction(action_1);
		mntmNewMenuItem_4.setIcon(new ImageIcon(FrameMain.class.getResource("/com/ifce/midias/exit.png")));
		menuSistema.add(mntmNewMenuItem_4);
		getContentPane().setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 254, 289);
		getContentPane().add(desktopPane);

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
			lista.setVisible(false);
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
			cadastro.setVisible(false);
		}
	}
}
