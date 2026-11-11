package presentacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal  extends JFrame implements ActionListener{
	
	public Principal() {
		
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		this.setTitle("DPOO Calculadora");
		this.setBounds((int) pantalla.getWidth() / 2 - 200, (int) pantalla.getHeight() / 2 - 300, 400, 600);
		
		JLabel label = new JLabel();
		this.add(label, BorderLayout.NORTH);
		label.setText("prueba");
		
		
		
		
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new Principal();
	}
	
	
}
