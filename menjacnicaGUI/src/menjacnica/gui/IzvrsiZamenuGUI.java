package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldIznos;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 374, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Kupovni kurs");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setBounds(10, 10, 131, 22);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(10, 32, 131, 22);
		contentPane.add(textField);
		
		JLabel lblValuta = new JLabel("Valuta");
		lblValuta.setHorizontalAlignment(SwingConstants.LEFT);
		lblValuta.setBounds(143, 10, 83, 22);
		contentPane.add(lblValuta);
		
		JLabel label_1 = new JLabel("Prodajni kurs");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setBounds(227, 10, 131, 22);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(227, 32, 131, 22);
		contentPane.add(textField_1);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
		comboBox.setBounds(143, 32, 83, 22);
		contentPane.add(comboBox);
		
		JLabel lblIznos = new JLabel("Iznos");
		lblIznos.setHorizontalAlignment(SwingConstants.LEFT);
		lblIznos.setBounds(10, 65, 83, 22);
		contentPane.add(lblIznos);
		
		textFieldIznos = new JTextField();
		textFieldIznos.setColumns(10);
		textFieldIznos.setBounds(10, 88, 131, 22);
		contentPane.add(textFieldIznos);
		
		JLabel lblVrstaTransakcije = new JLabel("Vrsta transakcije");
		lblVrstaTransakcije.setHorizontalAlignment(SwingConstants.LEFT);
		lblVrstaTransakcije.setBounds(227, 65, 131, 22);
		contentPane.add(lblVrstaTransakcije);
		
		final JRadioButton rdbtnKupovina = new JRadioButton("Kupovina");
		rdbtnKupovina.setSelected(true);
		buttonGroup.add(rdbtnKupovina);
		rdbtnKupovina.setBounds(227, 88, 109, 22);
		contentPane.add(rdbtnKupovina);
		
		JRadioButton rdbtnProdaja = new JRadioButton("Prodaja");
		buttonGroup.add(rdbtnProdaja);
		rdbtnProdaja.setBounds(227, 113, 109, 22);
		contentPane.add(rdbtnProdaja);
		
		JButton btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
		btnIzvrsiZamenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String noviPodaci = "Valuta: " + comboBox.getSelectedItem() + " Iznos: " + textFieldIznos.getText() +
						" Kupovina/Prodaja: ";
				if(rdbtnKupovina.isSelected() == true) MenjacnicaGUI.textArea.setText(noviPodaci + " Kupovina");
						else MenjacnicaGUI.textArea.setText(MenjacnicaGUI.textArea.getText() + "\n" + noviPodaci + " Prodaja");
				IzvrsiZamenuGUI.this.dispose();
			}
		});
		btnIzvrsiZamenu.setBounds(10, 190, 131, 23);
		contentPane.add(btnIzvrsiZamenu);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					IzvrsiZamenuGUI.this.dispose();
			}
		});
		btnOdustani.setBounds(227, 190, 131, 23);
		contentPane.add(btnOdustani);
		
		final JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textFieldIznos.setText("" + slider.getValue());
			}
		});
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(10);
		slider.setBounds(10, 134, 348, 45);
		contentPane.add(slider);
	}
}
