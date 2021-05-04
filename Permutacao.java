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

public class Permutacao extends JFrame {

	//DECLARACOES
	private JPanel contentPanel;
	private JTextField textField1;
	private int resp;
	private int numero;
	private JTextArea textAreaResult;
	private int respint;
	
	public Permutacao() {
		
		//INTERFACE INICIAL
		setTitle("Fatora\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 412);
		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(51, 204, 255));
		contentPanel.setForeground(Color.BLACK);
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel label1 = new JLabel("Escolha o Número");
		label1.setForeground(new Color(0, 0, 0));
		label1.setFont(new Font("Courier New", Font.PLAIN, 16));
		label1.setBounds(22, 57, 190, 58);
		contentPanel.add(label1);
		
		//CRIACAO TEXT FIELDS
		textField1 = new JTextField();
		textField1.setBounds(186, 75, 181, 23);
		contentPanel.add(textField1);
		textField1.setColumns(10);
		textField1.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		
		textAreaResult = new JTextArea();
		textAreaResult.setEditable(false);
		textAreaResult.setBounds(186, 153, 181, 110);
		textAreaResult.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		contentPanel.add(textAreaResult);
		
		//CRIACAO BOTOES
		
		//CALCULAR
		JButton btn_resp = new JButton("Calcular");
		btn_resp.setForeground(Color.white);
		btn_resp.setBackground(new Color(0, 0, 153));
		btn_resp.setFont(new Font("Courier New", Font.BOLD, 16));
		btn_resp.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		btn_resp.setBounds(35, 160, 95, 30);
		contentPanel.add(btn_resp);
		
		//VOLTAR
		JButton btn_voltar = new JButton("Voltar");
		btn_voltar.setForeground(Color.white);
		btn_voltar.setBackground(new Color(0, 0, 153));
		btn_voltar.setFont(new Font("Courier New", Font.BOLD, 16));
		btn_voltar.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		btn_voltar.setBounds(35, 230, 95, 30);
		contentPanel.add(btn_voltar);
		
		ButtonHandler handler = new ButtonHandler();
		btn_voltar.addActionListener(handler);
		btn_resp.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			
		//ACOES DOS BOTOES	
				if(event.getActionCommand().equals("Calcular")) {
					
				numero = Integer.parseInt(textField1.getText());
				Permutacao.this.calcula();
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
				//VOLTAR
				else if(event.getActionCommand().equals("Voltar")) {
					dispose();
				}
		}
		
	}
	//CALCULO
	private int calcula() {
		
		int valor=1;
		if(numero>=0) {
			for(int i = 2;i<=numero;i++)
			{
				valor *= i;
			}	
				resp = valor;
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Digite um numero positivo");
		}
		return resp;
	}
	
}