package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setResizable(false);
		setTitle("Obrisi  kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 376, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Sifra");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setBounds(10, 10, 74, 22);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(10, 28, 160, 22);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("Prodajni kurs");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setBounds(10, 61, 160, 22);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(10, 81, 160, 22);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("Srednji kurs");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setBounds(10, 118, 149, 22);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(10, 139, 160, 22);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("Naziv");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setBounds(199, 10, 74, 22);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(199, 28, 160, 22);
		contentPane.add(textField_3);
		
		JLabel label_4 = new JLabel("Kupovni kurs");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setBounds(199, 61, 162, 22);
		contentPane.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(199, 82, 160, 22);
		contentPane.add(textField_4);
		
		JLabel label_5 = new JLabel("Skraceni naziv");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setBounds(199, 118, 162, 22);
		contentPane.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(199, 140, 160, 22);
		contentPane.add(textField_5);
		
		final JButton btnObrisi = new JButton("Obrisi");
		btnObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String noviPodaci = "Sifra: " + textField.getText() + " Naziv: " + textField_3.getText() +
						" Prodajni kurs: " + textField_1.getText() + " Kupovni kurs: " + textField_4.getText() + 
						" Srednji kurs: " + textField_2.getText() + " Skraceni naziv: " + textField_5.getText();
				MenjacnicaGUI.textArea.setText(MenjacnicaGUI.textArea.getText() + "\n" + noviPodaci);
				ObrisiKursGUI.this.dispose();
			}
		});
		btnObrisi.setEnabled(false);
		btnObrisi.setBounds(10, 213, 160, 23);
		contentPane.add(btnObrisi);
		
		JButton button_1 = new JButton("Odustani");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ObrisiKursGUI.this.dispose();
			}
		});
		button_1.setBounds(199, 213, 160, 23);
		contentPane.add(button_1);
		
		final JCheckBox chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
		chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxZaistaObrisiKurs.isSelected() == true)
					btnObrisi.setEnabled(true);
				else btnObrisi.setEnabled(false);
			}
		});
		chckbxZaistaObrisiKurs.setBounds(10, 174, 160, 31);
		contentPane.add(chckbxZaistaObrisiKurs);
	}
}
