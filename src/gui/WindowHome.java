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
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class WindowHome extends JFrame {

	private JPanel PanelHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowHome frame = new WindowHome();
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
	public WindowHome() {
		setTitle("ConverterFull - Inicio");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\eclipse-workspace\\converter\\src\\imgs\\converter.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Convertir");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Acerca de");
		menuBar.add(mnNewMenu_2);
		
		PanelHome = new JPanel();
		PanelHome.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelHome);
		PanelHome.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Powered by Elmer Astonitas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PanelHome.add(lblNewLabel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("¡Bienvenido/a al ConverterFull!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		PanelHome.add(lblNewLabel_1, BorderLayout.CENTER);
	}

}
