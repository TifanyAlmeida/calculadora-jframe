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
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Combinacao extends JFrame {

	//DECLARACOES
	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextArea textAreaResult;
	private int numero,respint,p;
	
	private float resp;
	
	//INTERFACE INICIAL
	public Combinacao() {
		setTitle("Combina\u00E7\u00E3o");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 412);
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
		
		//CRIACAO BOTOES
		JButton btn_resp = new JButton("Calcular");
		btn_resp.setForeground(Color.white);
		btn_resp.setBackground(new Color(0, 0, 153));
		btn_resp.setFont(new Font("Courier New", Font.BOLD, 16));
		btn_resp.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		btn_resp.setBounds(40, 171, 95, 30);
		contentPane.add(btn_resp);
		
		textAreaResult = new JTextArea();
		textAreaResult.setEditable(false);
		textAreaResult.setBounds(212, 171, 165, 104);
		textAreaResult.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		contentPane.add(textAreaResult);
		
		JButton btn_voltar = new JButton("Voltar");
		btn_voltar.setForeground(Color.white);
		btn_voltar.setBackground(new Color(0, 0, 153));
		btn_voltar.setFont(new Font("Courier New", Font.BOLD, 16));
		btn_voltar.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		btn_voltar.setBounds(40, 245, 95, 30);
		contentPane.add(btn_voltar);
		
		ButtonHandler handler = new ButtonHandler();
		btn_resp.addActionListener(handler);
		btn_voltar.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener {


		@Override
		//EVENTO BOTOES
		public void actionPerformed(ActionEvent event) {
				
				if(event.getActionCommand().equals("Calcular")) {
					
				numero = Integer.parseInt(textField1.getText());
				p = Integer.parseInt(textField2.getText());
				Combinacao.this.calcula();
				
				//NUMERO INTEIRO SERÁ SETADO INTEIRO E DOUBLE SERÁ PRINTADO SETADO
				if((int) resp==resp)
				{
					respint = (int) resp;
					textAreaResult.setText("O resultado é: "+String.valueOf(respint));
				}
				else
				{
					textAreaResult.setText("O resultado é: "+String.valueOf(resp));
				}
				
			}
				
				else if(event.getActionCommand().equals("Voltar")) {
					dispose();
				}
		}
		
	}

	//CALCULO
	public float calcula() {
		
		int fatoracao1= 1;
		int fatoracao2 = 1;
		int fatoracao3 = 1;
		int denominador;
		float multi;
		
		if(numero >= 0) {
			for(int i = 1; i <= numero; i++) {
				fatoracao1 = fatoracao1 * i; 
			}
			
			denominador = numero - p;
			
			for(int i = 1; i <= p; i++) {
				fatoracao2 = fatoracao2 * i; 
			}
			for(int i = 1; i <= denominador; i++) {
				fatoracao3 = fatoracao3 * i; 
			}
			multi = (fatoracao2 * fatoracao3);
			resp = fatoracao1/multi;
		}
		else {
			JOptionPane.showMessageDialog(null, "Digite um numero positivo");
		}
		
		return resp;
	}
}