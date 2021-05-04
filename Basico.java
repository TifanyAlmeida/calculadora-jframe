//IMPORTACOES NECESSARIAS PARA UTILIZAR OS METODOS DENTRO DA CLASSE	
import java.awt.BorderLayout;
	import java.awt.EventQueue;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.Scanner;
	import javax.swing.JTextField;
	import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextArea;
	import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.border.LineBorder;

						//HERDA TODOS OS ATRIBUTOS E METODOS DA CLASSE JFRAME
	public class Basico extends JFrame implements ActionListener  {

		/**
		 * 
		 */
		// NECESSÃ�RIO PARA JFRAME TRABALHAR COM BYTE
		private static final long serialVersionUID = 1L;
		
		// DECLARACAO ESPACO DE TEXTO(JTextField) E BOTOES NUMERICOS(JButton)
		private JPanel panel;
		private JTextField textField1 = new JTextField();
		private JButton btn_9, btn_8, btn_7, btn_6, btn_5, btn_4, btn_3, btn_2, btn_1, btn_0;
		
		// : OPERACOES BASICAS(JButton)
		private JButton btn_igual, btn_div, btn_vez, btn_menos, btn_mais, btn_apagatudo, btn_voltar,
		btn_apaga,btn_pot, btn_ra, btn_ponto;
		
		// : VARIAVEIS PARA REALIZAR AS OPERACOES
		private double num1,num2,resp;
		private String operacao;
		private int respint;
		
		//: CALCULOS COMBINATORIOS E LOGARITMOS(JButton)
		//private JButton btn_combinacao, btn_arranjo,btn_fat;
	
		public Basico() {
				
			//INTERFACE INICIAL :
			
			// DEFINE O TITULO DA JANELA
			setTitle("Basico");
			setResizable(false);
			// DEFINE O QUE ACONTECE QUANDO CLICA NO BOTÃƒO FECHAR OU MINIMIZAR
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// DIMENSÃ•ES DA JANELA X,Y,LARGURA E ALTURA
			setBounds(100, 100, 440, 412); 
			// PANEL PARA ADICIONAR OS ELEMENTOS NA JANELA
			panel = new JPanel();
			// ESCOLHENDO A COR DE FUNDO DA JANELA
			panel.setBackground(new Color(51, 204, 255));
			// SETANDO O PANEL NA JANELA
			setContentPane(panel);
			panel.setLayout(null);
		
			// CRIACAO TEXT FIELD1(JTextField)"TIPO UMA CAIXA DE TEXTO"
			textField1 = new JTextField();
			//ESCOLHENDO A FONTE DO TEXTO E TAMANHO
			textField1.setFont(new Font("Courier New", Font.PLAIN, 20));
			textField1.setBounds(20, 60, 387, 40);
			//ESCOLHENDO O LARGURA DA BORDA E SUA COR
			textField1.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			panel.add(textField1);
			// DEFININDO O TANTO DE COLUNAS DA CAIXA DE TEXTO
			textField1.setColumns(10); 

			//CRIACAO DOS BOTOES
			
			//1
			btn_1 = new JButton("1");
			//COR DE DO TEXTO
			btn_1.setForeground(Color.white);
			//COR DE FUNDO DE UM BOTÃƒO
			btn_1.setBackground(new Color(0, 0, 153));
			btn_1.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_1.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_1.setBounds(22, 290, 95, 40);
			panel.add(btn_1);
			btn_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField1.setText(textField1.getText()+"1");
					}
			});	
			//2
			btn_2 = new JButton("2");
			btn_2.setForeground(Color.white);
			btn_2.setBackground(new Color(0, 0, 153));
			btn_2.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_2.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_2.setBounds(117, 290, 95, 40);
			panel.add(btn_2);
			btn_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField1.setText(textField1.getText()+"2");
					}
			});	
			//3
			btn_3 = new JButton("3");
			btn_3.setForeground(Color.white);
			btn_3.setBackground(new Color(0, 0, 153));
			btn_3.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_3.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_3.setBounds(212, 290, 95, 40);
			panel.add(btn_3);
			btn_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField1.setText(textField1.getText()+"3");
					}
			});	
			//4
			btn_4 = new JButton("4");
			btn_4.setForeground(Color.white);
			btn_4.setBackground(new Color(0, 0, 153));
			btn_4.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_4.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_4.setBounds(22, 250, 95, 40);
			panel.add(btn_4);
			btn_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField1.setText(textField1.getText()+"4");
					}
			});	
			
			//5
			btn_5 = new JButton("5");
			btn_5.setForeground(Color.white);
			btn_5.setBackground(new Color(0, 0, 153));
			btn_5.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_5.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_5.setBounds(117, 250, 95, 40);
			panel.add(btn_5);
			btn_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField1.setText(textField1.getText()+"5");
					}
			});	
			
			//6
			btn_6 = new JButton("6");
			btn_6.setForeground(Color.white);
			btn_6.setBackground(new Color(0, 0, 153));
			btn_6.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_6.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_6.setBounds(212, 250, 95, 40);
			panel.add(btn_6);
			btn_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField1.setText(textField1.getText()+"6");
					}
			});	
			
			//7
			btn_7 = new JButton("7");
			btn_7.setForeground(Color.white);
			btn_7.setBackground(new Color(0, 0, 153));
			btn_7.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_7.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_7.setBounds(22, 210, 95, 40);
			panel.add(btn_7);
			btn_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField1.setText(textField1.getText()+"7");
					}
			});	
			
			//8
			btn_8 = new JButton("8");
			btn_8.setForeground(Color.white);
			btn_8.setBackground(new Color(0, 0, 153));
			btn_8.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_8.setBounds(117, 210, 95, 40);
			btn_8.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			panel.add(btn_8);
			btn_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField1.setText(textField1.getText()+"8");
					}
			});	
			
			//9
			btn_9 = new JButton("9");
			btn_9.setForeground(Color.white);
			btn_9.setBackground(new Color(0, 0, 153));
			btn_9.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_9.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_9.setBounds(212, 210, 95, 40);
			panel.add(btn_9);
			btn_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField1.setText(textField1.getText()+"9");
					}
			});	
			
			//0
			btn_0 = new JButton("0");
			btn_0.setForeground(Color.white);
			btn_0.setBackground(new Color(0, 0, 153));
			btn_0.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_0.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_0.setBounds(117, 330, 95, 40);
			panel.add(btn_0);
			btn_0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField1.setText(textField1.getText()+"0");
					}
			});
			
			
			//BOTOES DAS OPERACOES BASICAS
		    //DIVISAO
			btn_div = new JButton("÷");
			btn_div.setForeground(Color.white);
			btn_div.setBackground(new Color(51,153,255));
			btn_div.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_div.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_div.setBounds(315, 170, 95, 40);
			panel.add(btn_div);
			btn_div.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1= Double.parseDouble(textField1.getText());
					textField1.setText("");
					operacao = "divisao";
					}
			});		
			//MULTIPLICACAO
			btn_vez = new JButton("x");
			btn_vez.setForeground(Color.white);
			btn_vez.setBackground(new Color(51,153,255));
			btn_vez.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_vez.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_vez.setBounds(315, 210, 95, 40);
			panel.add(btn_vez);
			btn_vez.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1= Double.parseDouble(textField1.getText());
					textField1.setText("");
					operacao = "vezes";
					}
			});	
			//SUBTRACAO
			btn_menos = new JButton("-");
			btn_menos.setForeground(Color.white);
			btn_menos.setBackground(new Color(51,153,255));
			btn_menos.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_menos.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_menos.setBounds(315, 250, 95, 40);
			panel.add(btn_menos);
			btn_menos.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					//VERIFICANDO SE O TEXTFIELD ESTÃ� VAZIO

					if(textField1.getText().length()==0)
					{
						textField1.setText("0");
						num1= Double.parseDouble(textField1.getText());
					}
					
					else
						num1= Double.parseDouble(textField1.getText());
						textField1.setText("");
						operacao = "menos";
						
					}
			});	
			//ADICAO
			btn_mais = new JButton("+");
			btn_mais.setForeground(Color.white);
			btn_mais.setBackground(new Color(51,153,255));
			btn_mais.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_mais.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_mais.setBounds(315, 290, 95, 40);
			panel.add(btn_mais);
			btn_mais.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1= Double.parseDouble(textField1.getText());
					textField1.setText("");
					operacao = "mais";
					
					}
			});	
			//PONTO
			btn_ponto = new JButton(".");
			btn_ponto.setForeground(Color.white);
			btn_ponto.setBackground(new Color(51,153,255));
			btn_ponto.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_ponto.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_ponto.setBounds(212, 330, 95, 40);
			panel.add(btn_ponto);
			btn_ponto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField1.setText(textField1.getText()+".");
					}
			});	
			
			//APAGAR TODOS OS NUMEROS
			btn_apagatudo = new JButton("C");
			btn_apagatudo.setForeground(Color.white);
			btn_apagatudo.setBackground(new Color(51,153,255));
			btn_apagatudo.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_apagatudo.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_apagatudo.setBounds(212,170, 95, 40);
			panel.add(btn_apagatudo);
			btn_apagatudo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = 0;
					num2 = 0;
					resp = 0;
					respint = 0;
					textField1.setText("");
					}
			});	
			//RAIZ QUADRADA
			btn_ra = new JButton("√x");
			btn_ra.setForeground(Color.white);
			btn_ra.setBackground(new Color(51,153,255));
			((JComponent) btn_ra).setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_ra.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_ra.setBounds(117, 170, 95, 40);
			panel.add(btn_ra);
			btn_ra.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(textField1.getText());
					resp = Math.sqrt(num1);
					//NUMERO INTEIRO SERÃ� SETADO INTEIRO E DOUBLE SERÃ� PRINTADO SETADO
					if((int) resp==resp)
					{
						respint = (int) resp;
						textField1.setText (String.valueOf(respint));
					}
					else
					{
						textField1.setText (String.valueOf(resp));
					}
				}
			});	
			//POTENCIA
			btn_pot = new JButton("xʸ");
			btn_pot.setForeground(Color.white);
			btn_pot.setBackground(new Color(51,153,255));
			btn_pot.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_pot.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_pot.setBounds(22, 170, 95, 40);
			panel.add(btn_pot);
			btn_pot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(textField1.getText());
					textField1.setText("");
					operacao = "potencia";
					}
			});	
			//DELETAR E VOLTAR
			btn_apaga = new JButton("<DEL>");
			btn_apaga.setForeground(Color.white);
			btn_apaga.setBackground(new Color(51,153,255));
			btn_apaga.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_apaga.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_apaga.setBounds(22, 330, 95, 40);
			panel.add(btn_apaga);
			btn_apaga.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String valor_do_textField1 = textField1.getText();
					valor_do_textField1 = valor_do_textField1.substring(0, valor_do_textField1.length()-1);
					textField1.setText(valor_do_textField1);
					}
			});	
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
			
			//COMBINATORIO COMBINACAO
			/*
			btn_combinacao = new JButton("COMBINACAO");
			btn_combinacao.setForeground(Color.white);
			btn_combinacao.setBackground(new Color(51,153,255));
			btn_combinacao.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_combinacao.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_combinacao.setBounds(145, 110, 120, 30);
			panel.add(btn_combinacao);
			btn_combinacao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					num1 = Double.parseDouble(textField1.getText());
					textField1.setText("");
					operacao = "combinacao";
					}
			});	
			
			//ARRANJO
			btn_arranjo = new JButton("ARRANJO");
			btn_arranjo.setForeground(Color.white);
			btn_arranjo.setBackground(new Color(51,153,255));
			btn_arranjo.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_arranjo.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_arranjo.setBounds(275,110, 120, 30);
			panel.add(btn_arranjo);
			btn_arranjo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(textField1.getText());
					textField1.setText("");
					operacao = "arranjo";
					}
			});
			//FATORACAO CALCULO BOTAO
			btn_fat = new JButton("PERMUTACAO");
			btn_fat.setForeground(Color.white);
			btn_fat.setBackground(new Color(51,153,255));
			btn_fat.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_fat.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_fat.setBounds(15, 110, 120, 30);
			panel.add(btn_fat);
			btn_fat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(textField1.getText());
					int valor=1;
					if(num1>=0) 
					{
						for(int i = 2;i<=num1;i++)
						{
							valor *= i;
						}
						resp = valor;
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Digite um numero positivo");
					}
					//NUMERO INTEIRO SERÃ� SETADO INTEIRO E DOUBLE SERÃ� SETADO DOUBLE
					if((int) resp==resp)
					{
						respint = (int) resp;
						textField1.setText (String.valueOf(respint));
					}
					else
					{
						textField1.setText (String.valueOf(resp));
					}
				}
			});
			*/
			/*LOGARITMO BASE10
			btn_log10 =  new JButton("log10(n)");
			btn_log10.setForeground(Color.white);
			btn_log10.setBackground(new Color(51,153,255));
			btn_log10.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_log10.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_log10.setBounds(240, 10, 85, 30);
			panel.add(btn_log10);
			btn_log10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(textField1.getText());
					resp = Math.log10(num1);
					//NUMERO INTEIRO SERÃ� SETADO INTEIRO E DOUBLE SERÃ� PRINTADO SETADO
					if((int) resp==resp)
					{
						respint = (int) resp;
						textField1.setText (String.valueOf(respint));
					}
					else
					{
						textField1.setText (String.valueOf(resp));
					}
				}
			});
			
			//LOGARITMO BASE n
			btn_logn =  new JButton("logx(n)");
			btn_logn.setForeground(Color.white);
			btn_logn.setBackground(new Color(51,153,255));
			btn_logn.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_logn.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_logn.setBounds(330, 10, 80, 30);
			panel.add(btn_logn);
			btn_logn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(textField1.getText());
					textField1.setText("");
					operacao = "logn";
				}
			});
			//LOGARITMO NEPERIANO
			btn_loge=  new JButton("loge(n)");
			btn_loge.setForeground(Color.white);
			btn_loge.setBackground(new Color(51,153,255));
			btn_loge.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_loge.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_loge.setBounds(155, 10, 80, 30);
			panel.add(btn_loge);
			btn_loge.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(textField1.getText());
					resp = Math.log(num1);
					//NUMERO INTEIRO SERÃ� SETADO INTEIRO E DOUBLE SERÃ� PRINTADO SETADO
					if((int) resp==resp)
					{
						respint = (int) resp;
						textField1.setText (String.valueOf(respint));
					}
					else
					{
						textField1.setText (String.valueOf(resp));
					}
				}
			});	
			*/
			//CALCULO
			btn_igual = new JButton("=");
			btn_igual.setForeground(Color.white);
			btn_igual.setBackground(new Color(51,153,255));
			btn_igual.setFont(new Font("Courier New", Font.BOLD, 17));
			btn_igual.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			btn_igual.setBounds(315, 330, 95, 40);
			panel.add(btn_igual);
			btn_igual.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
						num2 = Double.parseDouble(textField1.getText());
				//CALCULOS BASICOS :
						//DIVISAO
				if(operacao.equals("divisao")) {
					
					resp = num1/num2;
					//
					if(((int) resp==resp))
					{
						respint = (int) resp;
						textField1.setText (String.valueOf(respint));
					}
					else
					{
						textField1.setText (String.valueOf(resp));
					}	
				}
					//MULTIPLICACAO
				if(operacao.equals("vezes")) {
					resp = num1*num2;
					//
					if((int) resp==resp)
					{
						respint = (int) resp;
						textField1.setText (String.valueOf(respint));
					}
					else
					{
						textField1.setText (String.valueOf(resp));
					}	
				}
							//ADICAO
				if(operacao.equals( "mais")) {
						resp = num1+num2;
						//resp = num1+num2;
						//
						if((int) resp==resp)
						{
							respint = (int) resp;
							textField1.setText (String.valueOf(respint));
						}
						else
						{
							textField1.setText (String.valueOf(resp));
						}	
				}
						//SUBTRACAO
				if(operacao.equals("menos")) {
						resp = num1-num2;
						//
						if((int) resp==resp)
						{
							respint = (int) resp;
							textField1.setText (String.valueOf(respint));
						}
						else
						{
							textField1.setText (String.valueOf(resp));
						}	
				}
							//POTENCIA
				if(operacao.equals("potencia")){
					resp = Math.pow(num1, num2);
					//
					if((int) resp==resp)
					{
						respint = (int) resp;
						textField1.setText (String.valueOf(respint));
					}
					else
					{
						textField1.setText (String.valueOf(resp));
					}	
				}
				//CALCULOS COMBINATORIOS:
				
				//COMBINACAO
				/*
				int fatoracao1= 1;
				int fatoracao2 = 1;
				int fatoracao3 = 1;
				int denominador;
				float multi;
				
				
				if(operacao.equals( "combinacao"))
				{
					if(num1 >= 0) {
						for(int i = 1; i <= num1; i++) {
							fatoracao1 = fatoracao1 * i; 
						}
						
						denominador = (int) (num1 - num2);
						
						for(int i = 1; i <= num2; i++) {
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
				}
					/*
					if(operacaosituacao == false) {//inicio operacaosituacao
						textField1.setText (String.valueOf(resp));
					}
				
					else {
							if(operacao.equals( "mais"))
							{
								resp = num1 + resp;
								textField1.setText (String.valueOf(resp));
							}
									
					   }*/
				/*
					
					if((int) resp==resp)
					{
						respint = (int) resp;
						
						textField1.setText (String.valueOf(respint));
					}
					else
					{
						textField1.setText (String.valueOf(resp));
					}

				//ARRANJO
				if(operacao.equals("arranjo"))
				{
					int subtracao = 0;
					int fatorial1 = 1;  
					int fatorial2 = 1;
					

					if(num1 >= 0){
						for(int i = 1; i <= num1; i++) {
							fatorial1 = fatorial1 * i;
						}
						subtracao = (int) (num1 - num2);
						for(int i = 1; i <= subtracao; i++) {
							fatorial2 = fatorial2 * i;
						}
						
						resp = fatorial1 / fatorial2;	
				    }
					else {
						JOptionPane.showMessageDialog(null, "Digite um numero positivo");
					  }
						if((int) resp==resp)
						{
							respint = (int) resp;
							textField1.setText (String.valueOf(respint));
						}
						else
						{
							textField1.setText (String.valueOf(resp));
						}
					}
				*/
					/*if(operacao.equals("logn"))
					{
						/*ONDE 'NUM1' Ã‰ O 'n' E 'NUM2'Ã‰ A BASE
						OPERACOES COM LOG */
						
						/*resp = Math.log(num1) / Math.log(num2);
					
					 if((int) resp==resp)
					 {
						respint = (int) resp;
						textField1.setText (String.valueOf(respint));
					 }
					 else
					 { 
						textField1.setText (String.valueOf(resp));
					 }
				  }*/
					
			}
	});
}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
}