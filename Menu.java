//IMPORTACOES
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class Menu extends JFrame {

	//DECLARACOES
	private JPanel contentPanel;

	//INTERFACE INICIAL : MENU
	public Menu() {
		setForeground(new Color(0, 0, 102));
		setResizable(false);
		setTitle("Calculadora Combinat\u00F3ria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 412);
		setBackground(Color.black);
		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(51, 204, 255));
		contentPanel.setToolTipText("");
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		//CRIACAO BOTOES PARA CHAMAR AS OUTRAS CLASSES
		JButton arranjo = new JButton("ARRANJO");
		arranjo.setFont(new Font("Courier New", Font.ITALIC, 19));
		arranjo.setForeground(Color.white);
		arranjo.setBackground(new Color(0, 0, 153));
		arranjo.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		arranjo.setBounds(230, 50, 159, 47);
		contentPanel.add(arranjo);
		
		//FATORAÇÃO
		JButton fat = new JButton("FATORAÇÃO");
		fat.setFont(new Font("Courier New", Font.ITALIC, 19));
		fat.setForeground(Color.white);
		fat.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		fat.setBackground(new Color(0, 0, 153));
		fat.setBounds(32, 50, 159, 47);
		contentPanel.add(fat);
		
		//DICAS
		JButton dicas = new JButton("DICAS");
		dicas.setFont(new Font("Courier New", Font.ITALIC, 19));
		dicas.setForeground(Color.white);
		dicas.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		dicas.setBackground(new Color(0, 0, 153));
		dicas.setBounds(230, 221, 159, 47);
		contentPanel.add(dicas);
		
		//SAIR
		JButton sair = new JButton("SAIR");
		sair.setFont(new Font("Courier New", Font.ITALIC, 19));
		sair.setForeground(Color.white);
		sair.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		sair.setBackground(new Color(0, 0, 153));
		sair.setBounds(144, 305, 130, 47);
		contentPanel.add(sair);
		
		//COMBINAÇÃO
		JButton combinacao = new JButton("COMBINAÇÃO");
		combinacao.setFont(new Font("Courier New", Font.ITALIC, 19));
		combinacao.setForeground(Color.white);
		combinacao.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		combinacao.setBackground(new Color(0, 0, 153));
		combinacao.setBounds(230, 132, 159, 47);
		contentPanel.add(combinacao);
		
		//BÁSICO
		JButton basico = new JButton("BÁSICO");
		basico.setFont(new Font("Courier New", Font.ITALIC, 19));
		basico.setForeground(Color.white);
		basico.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		basico.setBackground(new Color(0, 0, 153));
		basico.setBounds(32, 132, 159, 47);
		contentPanel.add(basico);
		
		//LOGARITMO
		JButton calculatudo = new JButton("LOGARITMO");
		calculatudo.setFont(new Font("Courier New", Font.ITALIC, 19));
		calculatudo.setForeground(Color.white);
		calculatudo.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		calculatudo.setBackground(new Color(0, 0, 153));
		calculatudo.setBounds(32, 221, 159, 47);
		contentPanel.add(calculatudo);
		
		
		//ACOES AOS BOTOES
		ButtonHandler handler = new ButtonHandler();
		arranjo.addActionListener(handler);
		fat.addActionListener(handler);
		sair.addActionListener(handler);
		combinacao.addActionListener(handler);
		basico.addActionListener(handler);
		calculatudo.addActionListener(handler);
		dicas.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener{
		@Override
		
		//EVENTO DOS BOTOES PARA CHAMAR E ABRIR AS OUTRAS CLASSES
		public void actionPerformed(ActionEvent event) {
			
			//ARRANJO
			if (event.getActionCommand().equals("ARRANJO")) {
				Arranjo a = new Arranjo();
				a.setVisible(true);
			}
			//FATORAÇÃO
			else if(event.getActionCommand().equals("FATORAÇÃO")) {
				Permutacao p = new Permutacao();
				p.setVisible(true);
			}
			//SAIR
			else if(event.getActionCommand().equals("SAIR")) {
				dispose();
			}
			//COMBINAÇÃO
			else if(event.getActionCommand().equals("COMBINAÇÃO")) {
				Combinacao com = new Combinacao();
				com.setVisible(true);
			}
			//BÁSICO
			else if(event.getActionCommand().equals("BÁSICO")) {
				Basico bas = new Basico();
				bas.setVisible(true);
			}
			//LOGARITMO
			else if(event.getActionCommand().equals("LOGARITMO")) {
				Logaritmo ctd = new Logaritmo();
				ctd.setVisible(true);
				
			}
			//DICAS
			else if(event.getActionCommand().equals("DICAS")) {
				Dicas d = new Dicas();
				d.setVisible(true);
			}
		}
	}
}