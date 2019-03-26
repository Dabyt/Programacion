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
				
	menu.setSize(300,250);
	menu.setBackground(Color.orange);
	
	menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	menu.setVisible(true);
	
		
	}
	
	public static void jlist(){
		
		lista.setSize(200, 200);
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
		
		modelo.removeAllElements();
		
		modelo.addElement("1 - Jugar");
		modelo.addElement("2 - Cambiar a modo oscuro");
		modelo.addElement("3 - Opciones");
		modelo.addElement("4 - Creditos");
		modelo.addElement("5 - Salir");
		
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

	public static void BotonAtras() {
		
		JButton atras = new JButton("Atras");
		
		//aceptar.setText("Aceptar");
		//aceptar.setSize(100, 100);
		atras.setBackground(Color.WHITE);
		atras.setBorderPainted(true);
		atras.setBounds(150, 100, 5, 55);
		atras.setBackground(new java.awt.Color(22, 121, 198));
		atras.setForeground(new java.awt.Color(219, 220, 236));
		//aceptar.setEnabled(true);
		
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			menu.remove(atras);
				
			llenarLista();
			
			jlist();
			
			}
		});
	
		
	}

	public static void Texto() {
	
	texto = new JLabel ("Creado por Dabyt",
                JLabel.CENTER);	
	
	texto.setSize(200, 200);

	menu.add(texto);
				
	}
	
	public static void BotonAceptar() {
		
		JButton aceptar = new JButton("Click");
		
		//aceptar.setText("Aceptar");
		//aceptar.setSize(100, 100);
		aceptar.setBackground(Color.WHITE);
		aceptar.setBorderPainted(true);
		aceptar.setBounds(170, 140, 100, 50);
		aceptar.setBackground(new java.awt.Color(22, 121, 198));
		aceptar.setForeground(new java.awt.Color(219, 220, 236));
		//aceptar.setEnabled(true);
		
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			//aceptar.setBackground(new java.awt.Color(60, 31, 128));	
			
			int color = 0;
			int contador = -1;
			int [] indices = lista.getSelectedIndices();
			
			for (int i = 0;i<indices.length;i++) {
				
				color++;
				contador = indices[i];
			
				}
			
			if (color>0) {
				aceptar.setBackground(new java.awt.Color(99, 242, 106));		
				}
				else {
					
				aceptar.setBackground(new java.awt.Color(253, 85, 85));		
					
				}
			
			switch (contador) {
			
			case 0:
	
				break;
			
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				menu.remove(lista);
				menu.remove(aceptar);
				Texto();
				BotonAtras();
				jframe_menu();
				break;
				
			case 4:

				break;
		
				
			} 
			
			
			
			//if (color>=3) {
				
				//menu.remove(lista);
			//	menu.add(aceptar);
			//}
			
			
			color = 0;
			
			}
				
		});
			
		lista.add(aceptar);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
	
	inicio();

	llenarLista();
	
	jlist();
	
	jframe_menu();
	
	}

}
