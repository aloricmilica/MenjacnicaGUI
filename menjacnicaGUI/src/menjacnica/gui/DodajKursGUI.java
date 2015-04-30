package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javafx.scene.control.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldProdajni;
	private JTextField textFieldKupovni;
	private JTextField textFieldSrednji;
	private JTextField textFieldSkraceni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
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
	public DodajKursGUI() {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 369, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSifra = new JLabel("Sifra");
		lblSifra.setHorizontalAlignment(SwingConstants.LEFT);
		lblSifra.setBounds(10, 22, 74, 22);
		contentPane.add(lblSifra);
		
		JLabel lblNaziv = new JLabel("Naziv");
		lblNaziv.setHorizontalAlignment(SwingConstants.LEFT);
		lblNaziv.setBounds(191, 22, 74, 22);
		contentPane.add(lblNaziv);
		
		textFieldSifra = new JTextField();
		textFieldSifra.setBounds(10, 40, 160, 22);
		contentPane.add(textFieldSifra);
		textFieldSifra.setColumns(10);
		
		textFieldNaziv = new JTextField();
		textFieldNaziv.setColumns(10);
		textFieldNaziv.setBounds(191, 40, 162, 22);
		contentPane.add(textFieldNaziv);
		
		JLabel lblProdajniKurs = new JLabel("Prodajni kurs");
		lblProdajniKurs.setHorizontalAlignment(SwingConstants.LEFT);
		lblProdajniKurs.setBounds(10, 83, 160, 22);
		contentPane.add(lblProdajniKurs);
		
		JLabel lblKupovniKurs = new JLabel("Kupovni kurs");
		lblKupovniKurs.setHorizontalAlignment(SwingConstants.LEFT);
		lblKupovniKurs.setBounds(191, 83, 162, 22);
		contentPane.add(lblKupovniKurs);
		
		textFieldProdajni = new JTextField();
		textFieldProdajni.setColumns(10);
		textFieldProdajni.setBounds(10, 102, 160, 22);
		contentPane.add(textFieldProdajni);
		
		textFieldKupovni = new JTextField();
		textFieldKupovni.setColumns(10);
		textFieldKupovni.setBounds(191, 102, 160, 22);
		contentPane.add(textFieldKupovni);
		
		JLabel lblSrednjiKurs = new JLabel("Srednji kurs");
		lblSrednjiKurs.setHorizontalAlignment(SwingConstants.LEFT);
		lblSrednjiKurs.setBounds(10, 140, 149, 22);
		contentPane.add(lblSrednjiKurs);
		
		JLabel lblSkraceniNaziv = new JLabel("Skraceni naziv");
		lblSkraceniNaziv.setHorizontalAlignment(SwingConstants.LEFT);
		lblSkraceniNaziv.setBounds(191, 135, 162, 22);
		contentPane.add(lblSkraceniNaziv);
		
		textFieldSrednji = new JTextField();
		textFieldSrednji.setColumns(10);
		textFieldSrednji.setBounds(10, 158, 160, 22);
		contentPane.add(textFieldSrednji);
		
		textFieldSkraceni = new JTextField();
		textFieldSkraceni.setColumns(10);
		textFieldSkraceni.setBounds(191, 158, 160, 22);
		contentPane.add(textFieldSkraceni);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String noviPodaci = "Sifra: " + textFieldSifra.getText() + " Naziv: " + textFieldNaziv.getText() +
						" Prodajni kurs: " + textFieldProdajni.getText() + " Kupovni kurs: " + textFieldKupovni.getText() + 
						" Srednji kurs: " + textFieldSrednji.getText() + " Skraceni naziv: " + textFieldSkraceni.getText();
				MenjacnicaGUI.textArea.setText(MenjacnicaGUI.textArea.getText() + "\n" + noviPodaci);
				DodajKursGUI.this.dispose();
			}
		});
		btnDodaj.setBounds(10, 200, 160, 23);
		contentPane.add(btnDodaj);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DodajKursGUI.this.dispose();
			}
		});
		btnOdustani.setBounds(191, 200, 160, 23);
		contentPane.add(btnOdustani);
	}
}
