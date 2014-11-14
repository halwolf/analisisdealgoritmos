package arboles_avl;

import javax.swing.JOptionPane;


public class arboles_avl{
	nodo Padre;
	nodo Raiz;

	//Constructor
	public arboles_avl(){
		Raiz = null;
	}

	//Insercion de un datoento en el arbol
	public void insertaNodo(int dato){
		if(Raiz == null)
			Raiz = new nodo(dato);
		else
			Raiz.insertar(dato);
	}

	//Preorden Recursivo del arbol
	public void preorden (nodo Nodo){
		if(Nodo == null)
			return;
		else{
			System.out.print (Nodo.dato + " ");
			preorden (Nodo.izq);
			preorden (Nodo.der);
		}
	}

	//PostOrden recursivo del arbol
	public void postorden (nodo Nodo){
		if(Nodo == null)
			return;
		else{
			postorden (Nodo.izq);
			postorden (Nodo.der);
			System.out.print (Nodo.dato + " ");
		}
	}

	//Inorden Recursivo del arbol
	public void inorden (nodo Nodo){	
		if(Nodo == null)
			return;
		else{
			inorden (Nodo.izq);
			System.out.print(Nodo.dato + " ");
			inorden (Nodo.der);
		}
	}

	//cantidad de niveles q	ue posee el arbol
	public int altura (nodo Nodo){ 
		if (Nodo==null)
			return -1;
		else
			return 1+Math.max(altura(Nodo.izq),altura(Nodo.der));
	}
	//cantidad de datoentos que posee el arbol	
	public int tamaño (nodo Nodo){
		if (Nodo==null)
			return 0;
		else
			return 1+tamaño(Nodo.izq)+tamaño(Nodo.der);
	}
	//Busca un datoento en el arbol
	public void buscar (int dato, nodo A){
		if(A == null | A.dato == dato){
			System.out.print(A.dato + " ");
			return;
		}
		else{
			if(dato>A.dato)
				buscar(dato, A.der);
			else
				buscar( dato, A.izq);
		}
	}


}

