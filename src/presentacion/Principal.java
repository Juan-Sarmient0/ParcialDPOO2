package presentacion;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import logica.Parcial;

public class Principal  extends JFrame implements ActionListener{
	private JLabel la;
	private JLabel lb;
	private JLabel lc;
	private JLabel resultado;
	private Parcial parcial;
	private JTextField ba;
	private JTextField bb;
	private JTextField bc;
	
	public Principal() {
		this.parcial = new Parcial();
		
		this.setLayout(new GridLayout(4,2,10,10));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		this.setTitle("EXAMEN HECTOR FLOREZ");
		this.setBounds((int) pantalla.getWidth() / 2 - 200, (int) pantalla.getHeight() / 2 - 300, 400,200);
		
		
		 la = new JLabel("a:  ");
		 this.la.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.la);
		ba = new JTextField();
		this.add(ba);
		lb = new JLabel("b:  ");
		this.lb.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.lb);
		bb = new JTextField();
		this.add(bb);
		lc = new JLabel("c:  ");
		this.lc.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.lc);
		bc = new JTextField();
		this.add(bc);
		
		JButton Calc = new JButton();
		Calc.setText("Calcular");
		Calc.addActionListener(this);
		this.add(Calc);
		
		resultado = new JLabel();
		resultado.setText("X=0, X=0");
		this.add(resultado);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double a = Double.parseDouble(this.ba.getText());
		double b = Double.parseDouble(this.bb.getText());
		double c = Double.parseDouble(this.bc.getText());
		
		try {
			String calculado = this.parcial.raices(a,b,c);
			resultado.setText(calculado);
		}
		catch(Exception e1) {
			JOptionPane.showMessageDialog(this, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new Principal();
	}
	
	
}
