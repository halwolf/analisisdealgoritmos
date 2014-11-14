package arboles_avl;

import javax.swing.*;

public class main {
	public static arboles_avl avl=new arboles_avl();
		public static void main(String m[]){
			arboles_avl avl=new arboles_avl();
			String dato=null;
			int a=0;
			boolean flag=false;
			while (!flag){
				dato=JOptionPane.showInputDialog("Que accion desea realizar:\n 1. Insertar datos \n 2. Conocer altura \n 3. Buscar dato \n 4. Recorrer el arbol \n 5. Tamano del arbol \n 0.Salir" );
				int des=Integer.parseInt(dato);
			switch(des){
			case 1:
				dato=JOptionPane.showInputDialog("Ingresar el dato:");
				a=Integer.parseInt(dato);
				avl.insertaNodo(a);
				break;
			case 2:
				System.out.println("La altura del arbol es: "+ avl.altura(avl.Raiz));
				break;
			case 3:
				dato=JOptionPane.showInputDialog("Cual es el dato a buscar:");
				a=Integer.parseInt(dato);
				avl.buscar(a, avl.Raiz);
			case 4:
				dato=JOptionPane.showInputDialog("En que recorrido lo desea ver: \n 1. Preorden \n 2. Inorden \n 3. Postorden \n 0. Atras");
				a=Integer.parseInt(dato);
				switch(a){
				case 1:
					System.out.println("Preorden:");
					avl.preorden(avl.Raiz);
					System.out.println("");
					break;
				case 2:
					System.out.println("Inorden:");
					avl.inorden(avl.Raiz);
					System.out.println("");
					break;
				case 3:
					System.out.println("Postorden:");
					avl.postorden(avl.Raiz);
					System.out.println("");
					break;
				case 0:
					break;
				}
			case 5:
				System.out.println("La cantida de nodos que posee el arbol es: "+ avl.tamaño(avl.Raiz));
				break;
			case 0:
				flag=true;
			}
				
			}
		
		
	}
}
