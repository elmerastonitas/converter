package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import java.awt.List;
import java.awt.Choice;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class WindowCurrency extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowCurrency frame = new WindowCurrency();
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
	public WindowCurrency() {
		setTitle("ConverterONE - Inicio/Convertir Monedas");
		setIconImage(Toolkit.getDefaultToolkit().getImage(WindowCurrency.class.getResource("/imgs/converter.png")));
		setResizable(false); // deshabilita la maximización
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
		mntmNewMenuItem_1.setIcon(new ImageIcon(WindowCurrency.class.getResource("/imgs/home.png")));
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Convertir monedas");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon(WindowCurrency.class.getResource("/imgs/money3.png")));
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
		mntmNewMenuItem_3.setIcon(new ImageIcon(WindowCurrency.class.getResource("/imgs/temperatura.png")));
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
		mntmNewMenuItem_4.setIcon(new ImageIcon(WindowCurrency.class.getResource("/imgs/tiempo.png")));
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
		mntmNewMenuItem_5.setIcon(new ImageIcon(WindowCurrency.class.getResource("/imgs/longitud.png")));
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
		mntmNewMenuItem_6.setIcon(new ImageIcon(WindowCurrency.class.getResource("/imgs/masa.png")));
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
		mntmNewMenuItem.setIcon(new ImageIcon(WindowCurrency.class.getResource("/imgs/ico-converter.png")));
		mnNewMenu_1.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Powered by Elmer Astonitas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Choice choice = new Choice();
		choice.setBounds(163, 71, 100, 20);
		panel.add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(330, 71, 100, 20);
		panel.add(choice_1);
		
		textField = new JTextField();
		textField.setBounds(234, 21, 155, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setBounds(163, 24, 61, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("De");
		lblNewLabel_3.setBounds(132, 77, 25, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("A");
		lblNewLabel_4.setBounds(299, 77, 25, 14);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.setIcon(new ImageIcon(WindowCurrency.class.getResource("/imgs/convertir.png")));
		btnNewButton.setBounds(163, 184, 112, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setIcon(new ImageIcon(WindowCurrency.class.getResource("/imgs/borrar.png")));
		btnNewButton_1.setBounds(300, 184, 112, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Resultado");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(188, 125, 201, 32);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("<html><body><br>\r\n<h3>Convertir monedas</h3>\r\n<br>\r\n</body></html>");
		contentPane.add(lblNewLabel_2, BorderLayout.NORTH);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
