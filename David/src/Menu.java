

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer.UIResource;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import java.awt.Cursor;
import javax.swing.DropMode;

public class Menu extends JPanel {


private static DefaultListModel<String> opciones = new DefaultListModel();	
private static JList lista = new JList();
JLabel img = new JLabel();
static UIResource posicion = new UIResource();

private String jugar = "Jugar";
private String creditos = "Creditos";
private String salir = "Salir";

	
protected Menu() {
		
	opciones.addElement(jugar);
	opciones.addElement(creditos);
	opciones.addElement(salir);
	
	
	
	this.setBackground(new java.awt.Color(152, 119, 103));
	this.setLayout(null);
	
	
	jlist();
	lista.setModel(opciones);	
	this.add(lista);
	
	
}


	
private static void jlist(){
	
	// Tipo de lista.
	
	lista.setSize(new Dimension(700,250));
	lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
	lista.setLayoutOrientation(JList.VERTICAL);
	
	// Colores y fuente.
	
	lista.setFont(new Font("04b",Font.BOLD,80));
	lista.setForeground(new java.awt.Color(58, 58, 58));
	lista.setSelectionForeground(new java.awt.Color(114, 18, 18));
	lista.setSelectionBackground(new java.awt.Color(152, 119, 103));
	lista.setBackground(new java.awt.Color(152, 119, 103));
	lista.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	UIManager.put("List.focusCellHighlightBorder", BorderFactory.createEmptyBorder());
	
	// Los textos se alinean al centro.
	
	posicion.setHorizontalAlignment(SwingConstants.CENTER);
	lista.setCellRenderer(posicion);
	
	// Hacer visible.
	
	lista.setLocation(267, 355);
	lista.setVisible(true);
	
	}	
	
	
	
}
