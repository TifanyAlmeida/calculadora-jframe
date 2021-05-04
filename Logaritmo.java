//IMPORTACOES
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Logaritmo extends JFrame {

	//DECLARACOES
	private JPanel panel;
	private JTextField textField1;
	private JTextArea textAreaResult;
	// : BOTOES LOG CALCULO
	private JButton btn_log10,btn_logn,btn_loge, btn_voltar,btn_igual,btn_apagatudo;
	// VARIAVEIS PARA CALCULO DO LOG
	private double num1,num2,resp;
	private String operacao;
	private int respint;
	
	public Logaritmo() {
		
		//INTERFACE
		setTitle("Logaritmo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 412);
		panel = new JPanel();
		panel.setBackground(new Color(51, 204, 255));
		panel.setForeground(Color.BLACK);
		setContentPane(panel);
		panel.setLayout(null);
		
		//AREA TEXTO  N log
		JLabel label2 = new JLabel("<html>Escolha o log <br>ou a Base</html>");
		label2.setForeground(new Color(0, 0, 0));
		label2.setFont(new Font("Courier New", Font.PLAIN, 16));
		label2.setBounds(20, 57, 190, 58);
		panel.add(label2);
		
		//TEXTFIELD NUMERO
		textField1 = new JTextField();
		textField1.setBounds(190, 75, 160, 23);
		panel.add(textField1);
		textField1.setColumns(10);
		textField1.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		
		//RESULTADO AREA
		textAreaResult = new JTextArea();
		textAreaResult.setEditable(false);
		textAreaResult.setBounds(190,165, 160, 100);
		textAreaResult.setFont(new Font("Courier New", Font.PLAIN, 17));
		textAreaResult.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel.add(textAreaResult);
		
		//CRIACAO DE BOTOES
		//BOTAO VOLTAR
				btn_voltar = new JButton("<");
				btn_voltar.setForeground(Color.white);
				btn_voltar.setBackground(new Color(51,153,255));
				btn_voltar.setBorder(new LineBorder(new Color(0, 0, 0), 1));
				btn_voltar.setFont(new Font("Courier New", Font.BOLD, 17));
				btn_voltar.setBounds(15,11, 45, 30);
				panel.add(btn_voltar);
				btn_voltar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getActionCommand().equals("<")) {
							dispose();
						}
				}
			});
				
		
		//LOGARITMO BASE10
		btn_log10 =  new JButton("log10(n)");
		btn_log10.setForeground(Color.white);
		btn_log10.setBackground(new Color(0, 0, 153));
		btn_log10.setFont(new Font("Courier New", Font.BOLD, 16));
		btn_log10.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		btn_log10.setBounds(40, 200, 100, 30);
		panel.add(btn_log10);
		btn_log10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField1.getText());
				resp = Math.log10(num1);
				//numero inteiro sera printado inteiro e double sera printado double
				if((int) resp==resp)
				{
					respint = (int) resp;
					textAreaResult.setText (String.valueOf(respint));
				}
				else
				{
					textAreaResult.setText (String.valueOf(resp));
				}
			}
		});
		
		//LOGARITMO NEPERIANO
				btn_loge=  new JButton("loge(n)");
				btn_loge.setForeground(Color.white);
				btn_loge.setBackground(new Color(0, 0, 153));
				btn_loge.setFont(new Font("Courier New", Font.BOLD, 16));
				btn_loge.setBorder(new LineBorder(new Color(0, 0, 0), 1));
				btn_loge.setBounds(40, 250, 100, 30);
				panel.add(btn_loge);
				btn_loge.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						num1 = Double.parseDouble(textField1.getText());
						resp = Math.log(num1);
						//NUMERO INTEIRO SERÁ SETADO INTEIRO E DOUBLE SERÁ PRINTADO SETADO
						if((int) resp==resp)
						{
							respint = (int) resp;
							textAreaResult.setText (String.valueOf(respint));
						}
						else
						{
							textAreaResult.setText (String.valueOf(resp));
						}
					}
				});
		
		//LOGARITMO BASE n
		btn_logn =  new JButton("logx(n)");
		btn_logn.setForeground(Color.white);
		btn_logn.setBackground(new Color(0, 0, 153));
		btn_logn.setFont(new Font("Courier New", Font.BOLD, 16));
		btn_logn.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		btn_logn.setBounds(40, 150, 100, 30);
		panel.add(btn_logn);
		btn_logn.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField1.getText());
				textField1.setText("");
				operacao = "logn";
			}
		});
		//APAGAR TODOS OS NUMEROS
		btn_apagatudo = new JButton("C");
		btn_apagatudo.setForeground(Color.white);
		btn_apagatudo.setBackground(new Color(51,153,255));
		btn_apagatudo.setFont(new Font("Courier New", Font.BOLD, 17));
		btn_apagatudo.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		btn_apagatudo.setBounds(270,142, 70, 20);
		panel.add(btn_apagatudo);
		btn_apagatudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = 0;
				num2 = 0;
				textField1.setText("");
				textAreaResult.setText("");
				}
		});	
		//CALCULO
		btn_igual = new JButton("=");
		btn_igual.setForeground(Color.white);
		btn_igual.setBackground(new Color(51,153,255));
		btn_igual.setFont(new Font("Courier New", Font.BOLD, 17));
		btn_igual.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		btn_igual.setBounds(193, 100, 70, 20);
		panel.add(btn_igual);
		btn_igual.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
					num2 = Double.parseDouble(textField1.getText());
					if(operacao =="logn")
					{
						//ONDE 'NUM1' É O 'n' E 'NUM2'É A BASE
						 resp = Math.log(num1) / Math.log(num2);
					}
					//NUMERO INTEIRO SERÁ SETADO INTEIRO E DOUBLE SERÁ PRINTADO SETADO
					if((int) resp==resp)
					{
						respint = (int) resp;
						textAreaResult.setText (String.valueOf(respint));
					}
					else
					{
						textAreaResult.setText (String.valueOf(resp));
					}
				}
	});
}

		public void actionPerformed(ActionEvent e) {
			
			
		}
}