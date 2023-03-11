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
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\eclipse-workspace\\converter\\src\\imgs\\converter.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_2 = new JMenu("Acerca de");
		menuBar.add(mnNewMenu_2);
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
		btnNewButton.setIcon(new ImageIcon("D:\\eclipse-workspace\\converter\\src\\imgs\\money3.png"));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Temperatura");
		btnNewButton_1.setIcon(new ImageIcon("D:\\eclipse-workspace\\converter\\src\\imgs\\temperatura.png"));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Tiempo");
		btnNewButton_2.setIcon(new ImageIcon("D:\\eclipse-workspace\\converter\\src\\imgs\\tiempo.png"));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Longitud");
		btnNewButton_3.setIcon(new ImageIcon("D:\\eclipse-workspace\\converter\\src\\imgs\\longitud.png"));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Masa");
		btnNewButton_4.setIcon(new ImageIcon("D:\\eclipse-workspace\\converter\\src\\imgs\\masa.png"));
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html><body><br><br><br\r\n<h1>Welcome to ConverterONE</h1>\r\n<br><br><br>\r\nElige una opcion para convertir:\r\n<br><br><br>\r\n</body></html>");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		PanelConverter.add(lblNewLabel_1, BorderLayout.NORTH);
	}

}
