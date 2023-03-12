package gui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(WindowAbout.class.getResource("/imgs/converter.png")));
		setResizable(false); // deshabilita la maximización
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Volver a inicio");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Crea una instancia del JFrame que se desea abrir
				WindowHome windowHome = new WindowHome();

				// Muestra el JFrame
				windowHome.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(WindowAbout.class.getResource("/imgs/home.png")));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Convertir monedas");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowCurrency windowCurrency = new WindowCurrency();

				// Muestra el JFrame
				windowCurrency.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
				
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(WindowHome.class.getResource("/imgs/money3.png")));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Convertir temperatura");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowTemperature windowTemperature = new WindowTemperature();

				// Muestra el JFrame
				windowTemperature.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
				
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon(WindowHome.class.getResource("/imgs/temperatura.png")));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Convertir tiempo");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowTime windowTime = new WindowTime();

				// Muestra el JFrame
				windowTime.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
				
			}
		});
		mntmNewMenuItem_3.setIcon(new ImageIcon(WindowHome.class.getResource("/imgs/tiempo.png")));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Convertir longitud");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowLength windowLength = new WindowLength();

				// Muestra el JFrame
				windowLength.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
				
			}
		});
		mntmNewMenuItem_4.setIcon(new ImageIcon(WindowHome.class.getResource("/imgs/longitud.png")));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Convertir masa");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowMass windowMass = new WindowMass();

				// Muestra el JFrame
				windowMass.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
				
			}
		});
		mntmNewMenuItem_5.setIcon(new ImageIcon(WindowHome.class.getResource("/imgs/masa.png")));
		mnNewMenu.add(mntmNewMenuItem_5);

		JMenu mnNewMenu_2 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Acerca de ConverterONE");
		mntmNewMenuItem_6.setIcon(new ImageIcon(WindowAbout.class.getResource("/imgs/ico-converter.png")));
		mnNewMenu_2.add(mntmNewMenuItem_6);
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
				"<html>\r\n<body>\r\n\r\n<br><h3>ConverterONE</h3>\r\n<br>Convertidor de challenge ONE de especializacion de Dev Backend, por Alura Latam y Oracle.\r\n\r\n<br><br> Versión: 1.0.0\r\n<br> Copyright (c) 2023 Elmer Astonitas \r\n\r\n<br><br> Este software esta desarrollado bajo licencia de código abierto MIT License.\r\n<br>Codigo disponible en GitHub: <a href=\"https://github.com/elmerastonitas/converter\">https://github.com/elmerastonitas/converter</a>\r\n\r\n</body>\r\n</html>");
		panel.add(lblNewLabel_1);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		panel.add(separator);
	}
}
