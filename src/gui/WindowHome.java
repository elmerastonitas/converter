package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class WindowHome extends JFrame {

	private JPanel PanelConverter;

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
		setTitle("ConverterONE - Inicio/Convertir");
		setIconImage(Toolkit.getDefaultToolkit().getImage(WindowHome.class.getResource("/imgs/converter.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
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
		
		JMenu mnNewMenu_1 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Acerca de ConverterONE");
		mntmNewMenuItem.setIcon(new ImageIcon(WindowHome.class.getResource("/imgs/ico-converter.png")));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowAbout windowAbout = new WindowAbout();

				// Muestra el JFrame
				windowAbout.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		PanelConverter = new JPanel();
		PanelConverter.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelConverter);
		PanelConverter.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("Powered by Elmer Astonitas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PanelConverter.add(lblNewLabel, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		PanelConverter.add(panel, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("Monedas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Crea una instancia del JFrame que se desea abrir
				WindowCurrency windowCurrency = new WindowCurrency();

				// Muestra el JFrame
				windowCurrency.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);

			}
		});
		btnNewButton.setIcon(new ImageIcon(WindowHome.class.getResource("/imgs/money3.png")));
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Temperatura");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowTemperature windowTemperature = new WindowTemperature();

				// Muestra el JFrame
				windowTemperature.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(WindowHome.class.getResource("/imgs/temperatura.png")));
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Tiempo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowTime windowTime = new WindowTime();

				// Muestra el JFrame
				windowTime.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(WindowHome.class.getResource("/imgs/tiempo.png")));
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Longitud");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowLength windowLength = new WindowLength();

				// Muestra el JFrame
				windowLength.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(WindowHome.class.getResource("/imgs/longitud.png")));
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Masa");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowMass windowMass = new WindowMass();

				// Muestra el JFrame
				windowMass.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(WindowHome.class.getResource("/imgs/masa.png")));
		panel.add(btnNewButton_4);

		JLabel lblNewLabel_1 = new JLabel(
				"<html><body><br><br><br\r\n<h1>Welcome to ConverterONE</h1>\r\n<br><br><br>\r\n</body></html>");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		PanelConverter.add(lblNewLabel_1, BorderLayout.NORTH);
	}

}
