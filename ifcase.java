 

import javax.swing.JOptionPane;

public class ifcase{

public static void main(String[] args){

int dato;
 
dato = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN NUMERO  "));

switch(dato){
 
case 1: JOptionPane.showMessageDialog(null,"ESTE ES EL NUMERO 1"); 
	break;
case 2: JOptionPane.showMessageDialog(null,"ESTE ES EL NUMERO 2");
	break;
case 3: JOptionPane.showMessageDialog(null,"ESTE ES EL NUMERO 3");
	break;
case 4: JOptionPane.showMessageDialog(null,"ESTE ES EL NUMERO 4");
	break;
case 5: JOptionPane.showMessageDialog(null,"ESTE ES EL NUMERO 5");
	break;

default: JOptionPane.showMessageDialog(null, "EL NUMERO NO ESTA EN EL RANGO ESTABLECIDO");
	break; 




}

}

}
