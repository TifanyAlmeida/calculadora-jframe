//IMPORTACOES
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Arranjo extends JFrame {

	//DECLARACOES
	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextArea resultado;
	private JButton btn_calcular;
	private JButton btn_voltar;
	private int numero,p,respint;
	private float respa;

	//INTERFACE INICIAL
	public Arranjo() {
		setResizable(false);
		setTitle("Arranjo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 412);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//CRIACAO TEXT FIELDS
		JLabel label2 = new JLabel("Insira um Número");
		label2.setForeground(new Color(0, 0, 0));
		label2.setFont(new Font("Courier New", Font.PLAIN, 16));
		label2.setBounds(46, 63, 163, 49);
		contentPane.add(label2);
		
		textField1 = new JTextField();
		textField1.setBounds(209, 79, 163, 20);
		contentPane.add(textField1);
		textField1.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		textField1.setColumns(10);
		
		JLabel label3 = new JLabel("Insira a Posi\u00E7\u00E3o");
		label3.setForeground(new Color(0, 0, 0));
		label3.setFont(new Font("Courier New", Font.PLAIN, 16));
		label3.setBounds(46, 123, 163, 20);
		contentPane.add(label3);
		
		textField2 = new JTextField();
		textField2.setBounds(209, 125, 163, 20);
		contentPane.add(textField2);
		textField2.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		textField2.setColumns(10);
		
		resultado= new JTextArea();
		resultado.setEditable(false);
		resultado.setBounds(209, 188, 163, 105);
		contentPane.add(resultado);
		resultado.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		
		//CRIACAO BOTOES
		JButton btn_calcular = new JButton("Calcular");
		btn_calcular.setForeground(Color.white);
		btn_calcular.setBackground(new Color(0, 0, 153));
		btn_calcular.setFont(new Font("Courier New", Font.BOLD, 16));
		btn_calcular.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		btn_calcular.setBounds(45, 190, 95, 30);
		contentPane.add(btn_calcular);
		
		JButton btn_voltar = new JButton("Voltar");
		btn_voltar.setForeground(Color.white);
		btn_voltar.setBackground(new Color(0, 0, 153));
		btn_voltar.setFont(new Font("Courier New", Font.BOLD, 16));
		btn_voltar.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		btn_voltar.setBounds(45, 260, 95, 30);
		contentPane.add(btn_voltar);
		
		ButtonHandler handler = new ButtonHandler();
		btn_calcular.addActionListener(handler);
		btn_voltar.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener {


		@Override
		//EVENTO BOTOES
		public void actionPerformed(ActionEvent event) {
				
				if(event.getActionCommand().equals("Calcular")) {
					
				numero = Integer.parseInt(textField1.getText());
				p = Integer.parseInt(textField2.getText());
				Arranjo.this.calcula();
				//NUMERO INTEIRO SERÁ SETADO INTEIRO E DOUBLE SERÁ PRINTADO SETADO
				if((int) respa==respa)
				{
					respint = (int) respa;
					resultado.setText("O resultado é: "+String.valueOf(respint));
				}
				else
				{
					resultado.setText("O resultado é: "+String.valueOf(respa));
				}
				
				}
				
				else if(event.getActionCommand().equals("Voltar")) {
					dispose();
				}
		}
		
	}
	
	//CALCULO
	private float calcula() {
		
		int subtracao = 0;
		int fatorial1 = 1;  
		int fatorial2 = 1;
		
		
		if(numero >= 0){
			for(int i = 1; i <= numero; i++) {
				fatorial1 = fatorial1 * i;
			}
			subtracao = numero - p;
			for(int i = 1; i <= subtracao; i++) {
				fatorial2 = fatorial2 * i;
			}
			
			respa = fatorial1 / fatorial2;	
		}
		else {
			JOptionPane.showMessageDialog(null, "Digite um numero positivo");
		}
		
		return respa;
	}
}
