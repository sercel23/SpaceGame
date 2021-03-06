//-----------------------------------UZAY OYUNU 2-----------------------------------------
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class OyunEkranı extends JFrame {

	public OyunEkranı(String title) {
		super(title);
		
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		OyunEkranı ekran=new OyunEkranı("uzay Oyunu");
		ekran.setResizable(false);
		ekran.setFocusable(false);
		ekran.setSize(800,600);
		ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		oyun oyun=new oyun();
		oyun.requestFocus();
		oyun.addKeyListener(oyun);
		oyun.setFocusable(true);
		oyun.setFocusTraversalKeysEnabled(false);
		
		ekran.add(oyun);
		ekran.setVisible(true);
	}
}

