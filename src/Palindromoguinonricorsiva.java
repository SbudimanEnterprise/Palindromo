
	/**
	Copyright by Sbudiman Enterprise (Gabriele Torrisi, Federico Genovese, Francesco Tomarchio)
**/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Palindromoguinonricorsiva
{
	int i = 0;
	String parola;
	char v[], v2[];
	private JFrame frame;
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JTextField tfparola;
	JLabel lblmsg = new JLabel("");
	
	Palindromoguinonricorsiva() 
	{
		
		frame = new JFrame("Funzione non ricorsiva");
		frame.setBounds(100, 100, 434, 286);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 434, 130);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		lblmsg.setForeground(Color.BLACK);
		lblmsg.setFont(new Font("Dialog", Font.ITALIC, 33));
		lblmsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblmsg.setBounds(0, 0, 434, 130);
		
		panel.add(lblmsg);
		
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setBounds(0, 130, 434, 130);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		tfparola = new JTextField("Inserisci la parola...");
		tfparola.setFont(new Font("Monospaced", Font.BOLD, 16));
		tfparola.setBackground(Color.LIGHT_GRAY);
		tfparola.setHorizontalAlignment(SwingConstants.CENTER);
		tfparola.setBounds(15, 16, 399, 28);
		panel1.add(tfparola);
		tfparola.setColumns(10);
		
		frame.setVisible(true);
		
		tfparola.addMouseListener(new MouseAdapter()
		{
			
			public void mousePressed(MouseEvent e) 
			{
				tfparola.setText(null);
				panel.setBackground(Color.LIGHT_GRAY);
				lblmsg.setText(null);
				
			}
			
		});
		
		JButton btnNewButton = new JButton("Verifica");
		btnNewButton.setFont(new Font("Monospaced", Font.BOLD, 16));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				parola = tfparola.getText();
				palindroma(parola);
				
			}
		});
		btnNewButton.setBounds(15, 67, 399, 28);
		panel1.add(btnNewButton);
	}
	
	void palindroma(String parola)
	{
		int l = parola.length();
		int k = l - 1;
		v = parola.toCharArray();
		v2 = new char[l];
		
		for(i = 0; i < l; i++)
		{
			v2[i] = v[k];
			k--;
		}
		
		String string = new String(v2);
		System.out.println(string);
		
		if(string.equals(parola))
		{
			lblmsg.setFont(new Font("Dialog", Font.BOLD, 25));
			lblmsg.setText("Parola verificata come palindroma");
			System.out.println("Questa parola è stata verificata come palindroma dal nostro precisissimo algoritmo.");
			panel.setBackground(Color.green);
		
		}
		else
		{
			lblmsg.setFont(new Font("Dialog", Font.BOLD, 25));
			lblmsg.setText("Questa parola non è palindroma");
			System.out.println("Codesta parola non è palindroma, riprova.");
			panel.setBackground(Color.red);
			
		}
		
	}
	
}
/**
	Copyright by Sbudiman Enterprise (Gabriele Torrisi, Federico Genovese, Francesco Tomarchio)
**/

