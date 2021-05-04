import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Dicas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// DECLARACOES
	private JPanel panel;
	private JLabel lbCabecalho;
	private JButton btn_voltar;
	
	// INTERFACE INICIAL
	public Dicas() {
		setForeground(new Color(0, 0, 102));
		setResizable(false);
		setTitle("Dicas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 600);
		setBackground(Color.black);
		panel = new JPanel();
		panel.setToolTipText("");
		setContentPane(panel);
		panel.setLayout(null);
		
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

		// CRIANDO O LABEL CABECALHO
		lbCabecalho = new JLabel("\s\s\s\s\s\s\s DICAS DE USO DA CALCULADORA");
		lbCabecalho.setBounds(10, 20, 800, 20);
		lbCabecalho.setFont(new Font("Courier New", Font.BOLD, 18));
		panel.add(lbCabecalho);

		// CRIANDO OS LABELS CONTEÃšDOS
		
		// CRIANDO OS LABELS CONTEÃšDOS
		//EXCEÃ‡ÃƒO DE INICIALIZAR COM NÃšMERO NEGATIVO
		JLabel labelcomb = new JLabel("<html>INICIALIZAR COM NUMERO NEGATIVO :Clique em menos, escolha o numero, clique em igual.</html>");
		labelcomb.setForeground(new Color(0, 0, 0));
		labelcomb.setFont(new Font("Courier New", Font.PLAIN, 14));
		labelcomb.setBounds(22, 80, 400, 35);
		panel.add(labelcomb);
				
		//PARA CLASSES E OPERAÃ‡Ã•ES PARA ARRANJO, PERMUTAÃ‡ÃƒO E  COMBINAÃ‡ÃƒO
		JLabel labelcomb1 = new JLabel("<html><br>PARA ARRANJO, PERMUTACAO E  COMBINACAO<br>-Escolha o N e o P da operacao, clique em calcular e ele retornara o resultado.</html>");
		labelcomb1.setForeground(new Color(0, 0, 0));
		labelcomb1.setFont(new Font("Courier New", Font.PLAIN, 14));
		labelcomb1.setBounds(22, 120, 400, 65);
		panel.add(labelcomb1);
		
		//PARA CLASSE BASICO
		JLabel labelcomb2 = new JLabel("<html><br>PARA BASICO<br>-Escolha o numero a ser calculado, em seguida a operacao desejada,<br> escolha o segundo numero e clique em = para se obter o resultado da conta.</html>");
		labelcomb2.setForeground(new Color(0, 0, 0));
		labelcomb2.setFont(new Font("Courier New", Font.PLAIN, 14));
		labelcomb2.setBounds(22, 170, 500, 130);
		panel.add(labelcomb2);
		
		//PARA CLASSE LOGARITMO :  labelcomb4,  labelcomb5,  labelcomb6
		
		JLabel labelcomb3 = new JLabel("<html>PARA LOGARITMO : BASE 10<br>Escolha o log que deseja na base 10, clique no botao log10, assim ira¡ obter o resultado da operacao.</html>");
		labelcomb3.setForeground(new Color(0, 0, 0));
		labelcomb3.setFont(new Font("Courier New", Font.PLAIN, 14));
		labelcomb3.setBounds(22,215, 500, 240);
		panel.add(labelcomb3);
		
		//PARA LOGARITMO : X NA BASE N
		JLabel labelcomb5 = new JLabel("<html>PARA LOGARITMO : X NA BASE N<br> Escolha o log que deseja , clique no botao logx(n),<br>escolha a base desejada, clique em = para se obter o resultado.</html>");
		labelcomb5.setForeground(new Color(0, 0, 0));
		labelcomb5.setFont(new Font("Courier New", Font.PLAIN, 14));
		labelcomb5.setBounds(22,300, 500, 240);
		panel.add(labelcomb5);
		
		//PARA LOGARITMO : NEPERIANO DE N
		JLabel labelcomb6 = new JLabel("<html>PARA LOGARITMO : NEPERIANO DE N<br> Escolha o log que deseja , clique no botao loge(n),<br>escolha a base desejada, clique em igual para se obter o resultado.</html>");
		labelcomb6.setForeground(new Color(0, 0, 0));
		labelcomb6.setFont(new Font("Courier New", Font.PLAIN, 14));
		labelcomb6.setBounds(22, 380, 500, 240);
		panel.add(labelcomb6);
		
	}
}