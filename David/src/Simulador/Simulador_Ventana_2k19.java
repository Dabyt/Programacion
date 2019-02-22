package Simulador;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

public class Simulador_Ventana_2k19 {

	static JFrame menu = new JFrame("Window Simulator v.Alpha");
	static JList lista = new JList();
	static DefaultListModel<String> modelo = new DefaultListModel();
	static JLabel texto = new JLabel();	
	
	public static void jframe_menu(){
				
	menu.setSize(500,500);
	menu.setBackground(Color.orange);
	
	menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	menu.setVisible(true);
	
		
	}
	
	public static void jlist(){
		
		lista.setSize(400, 400);
		lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		lista.setLayoutOrientation(JList.VERTICAL);
		lista.setVisible(true);
		lista.setForeground(new java.awt.Color(23, 89, 134));
		lista.setBackground(Color.WHITE);
		lista.setSelectionBackground(new java.awt.Color(101, 112, 249));
		lista.setSelectionForeground(new java.awt.Color(219, 220, 236));
		
		BotonAceptar();
		
		
		}

	public static void llenarLista() {
		
		modelo.addElement("Hermà");
		modelo.addElement("PutoDios");
		modelo.addElement("PIPO_MUERE");
		modelo.addElement("dj");
		modelo.addElement("Enfermo2");
		modelo.addElement("SuperEnfermo3");
		modelo.addElement("x");
		modelo.addElement("!(Programador)");
		modelo.addElement("Pechito");
		modelo.addElement("Paz");
		
		lista.setModel(modelo);	
		
		menu.add(lista);
		

		
	}
	
	public static void inicio() {
		
	JOptionPane.showMessageDialog (menu, "Bienvenido al simulador de ventana.");
		
	JOptionPane.showMessageDialog (menu,
			    "Jugar acompañado, siempre sera mejor que solo.",
			    "Recuerda!",
			    JOptionPane.WARNING_MESSAGE);	
	
	
		
		
	}

	public static void JLabel() {
	
	texto = new JLabel ("Indica el numero de jugadores:",
                JLabel.CENTER);	
	
	menu.add(texto);
				
	}
	
	public static void BotonAceptar() {
		
		JButton aceptar = new JButton();
		
		aceptar.setText("Aceptar");
		aceptar.setSize(100, 100);
		aceptar.setBackground(Color.WHITE);
		aceptar.setBorderPainted(true);
		
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			System.out.println("Selecciona el valor");
			
			int [] indices = lista.getSelectedIndices();
			
			for (int i = 0;i<indices.length;i++) {
				
				System.out.println("Item: " +  indices[i]);
				
			}
				
				
			}
		});
			
		lista.add(aceptar);
		
	}
	
	
	public static void main(String[] args) {
	
	inicio();
	
	JLabel();
	
	llenarLista();
	
	jlist();
	
	jframe_menu();
	

		

	}

}
