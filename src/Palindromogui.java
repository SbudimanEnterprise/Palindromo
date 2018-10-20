/**
	Copyright by Sbudiman Enterprise (Gabriele Torrisi, Federico Genovese, Francesco Tomarchio)
**/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Palindromogui
{
	int i = 0;
	String parola;
	String subString;
	private JFrame frame;
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JTextField tfparola;
	JLabel lblmsg = new JLabel("");
	static int pulsanti = JOptionPane.YES_NO_OPTION; // Pulsanti si/no
	static int rispulsanti = JOptionPane.showConfirmDialog (null, "Ciao, è da tanto che ti aspettavo.\nVuoi utilizzare la funzione ricorsiva?", "Benvenuto", pulsanti);
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) 
	{
		Palindromogui window = new Palindromogui();
		
		if (rispulsanti == JOptionPane.YES_OPTION)
		{

			System.out.println("hai scelto la funzione ricorsiva");
		}
		else
		{
			Palindromoguinonricorsiva window2 = new Palindromoguinonricorsiva();
			System.out.println("hai scelto la funzione non ricorsiva");
			
		}
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public Palindromogui() 
	{
		
		frame = new JFrame("Funzione ricorsiva");
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
		panel1.setBounds(0, 130, 434, 128);
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
	
	/**
	 * @wbp.parser.entryPoint
	 */
	boolean palindroma(String parola)
	{
		int l = parola.length();
		System.out.println(parola);
		if(l <= 1) 
		{
			lblmsg.setFont(new Font("Dialog", Font.BOLD, 25));
			lblmsg.setText("Parola verificata come palindroma");
			System.out.println("Questa parola è stata verificata come palindroma dal nostro precisissimo algoritmo.");
			panel.setBackground(Color.green);
		
			
			return true;
			
		}
		else
		{
			if(parola.substring(0, 1).equals(parola.substring(l-1))) 
			{
				palindroma(parola.substring(1,l-1));
			}
			else 
			{
				lblmsg.setFont(new Font("Dialog", Font.BOLD, 25));
				lblmsg.setText("Questa parola non è palindroma");
				System.out.println("Codesta parola non è palindroma, riprova.");
				panel.setBackground(Color.red);
				return false;
			}
		}
		
		return false;
	
		
	}
	
}
/**
	Copyright by Sbudiman Enterprise (Gabriele Torrisi, Federico Genovese, Francesco Tomarchio)
**/
