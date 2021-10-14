package com.ifce.frames;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class ListarEstudante extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarEstudante frame = new ListarEstudante();
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
	public ListarEstudante() {
		setBounds(100, 100, 450, 300);

	}

}
