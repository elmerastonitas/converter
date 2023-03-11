package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class WindowAbout extends JFrame {

	private JPanel PanelHelp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowAbout frame = new WindowAbout();
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
	public WindowAbout() {
		setTitle("ConverterONE - Inicio/Acerca de");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\eclipse-workspace\\converter\\src\\imgs\\converter.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);

		JMenu mnNewMenu_2 = new JMenu("Acerca de");
		menuBar.add(mnNewMenu_2);
		PanelHelp = new JPanel();
		PanelHelp.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelHelp);
		PanelHelp.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("Powered by Elmer Astonitas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PanelHelp.add(lblNewLabel, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEADING);
		PanelHelp.add(panel, BorderLayout.CENTER);

		JLabel lblNewLabel_1 = new JLabel(
				"<html><body><br><strong>Convertidor de monedas, tiempo, masa, temperatura, longitud y más</strong> <br><br> Versión: 2023-03 (1.0.0) <br> Copyright (c) 2023 Elmer Astonitas <br><br> Este software esta desarrollado bajo licencia de código abierto MIT License.<br><br> Codigo disponible en GitHub: https://github.com/elmerastonitas/converter</body></html>");
		panel.add(lblNewLabel_1);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		panel.add(separator);
	}
}
