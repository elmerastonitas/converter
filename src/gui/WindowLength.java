package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WindowLength extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowLength frame = new WindowLength();
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
	public WindowLength() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(WindowLength.class.getResource("/imgs/converter.png")));
		setResizable(false); // deshabilita la maximización
		setTitle("ConverterONE - Inicio/Convertir Longitud");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Volver a inicio");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowHome windowHome = new WindowHome();

				// Muestra el JFrame
				windowHome.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
				
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(WindowLength.class.getResource("/imgs/home.png")));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Convertir monedas");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowCurrency windowCurrency = new WindowCurrency();

				// Muestra el JFrame
				windowCurrency.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
				
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon(WindowLength.class.getResource("/imgs/money3.png")));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Convertir temperatura");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowTemperature windowTemperature = new WindowTemperature();

				// Muestra el JFrame
				windowTemperature.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
				
			}
		});
		mntmNewMenuItem_3.setIcon(new ImageIcon(WindowLength.class.getResource("/imgs/temperatura.png")));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Convertir tiempo");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowTime windowTime = new WindowTime();

				// Muestra el JFrame
				windowTime.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
				
			}
		});
		mntmNewMenuItem_4.setIcon(new ImageIcon(WindowLength.class.getResource("/imgs/tiempo.png")));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Convertir longitud");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowLength windowLength = new WindowLength();

				// Muestra el JFrame
				windowLength.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
				
			}
		});
		mntmNewMenuItem_5.setIcon(new ImageIcon(WindowLength.class.getResource("/imgs/longitud.png")));
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Convertir masa");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Crea una instancia del JFrame que se desea abrir
				WindowMass windowMass = new WindowMass();

				// Muestra el JFrame
				windowMass.setVisible(true);

				// Cierra el JFrame actual
				setVisible(false);
			}
		});
		mntmNewMenuItem_6.setIcon(new ImageIcon(WindowLength.class.getResource("/imgs/masa.png")));
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_1 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Acerca de ConverterONE");
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
		mntmNewMenuItem.setIcon(new ImageIcon(WindowLength.class.getResource("/imgs/ico-converter.png")));
		mnNewMenu_1.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Powered by Elmer Astonitas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
	}

}
