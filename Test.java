package Ejercicio4;

import java.util.*;

public class Test {
	
	public static void main(String [] args) {
		ArrayList <Producto> producto = new ArrayList <Producto>();
		producto.add(new Producto ("mochila", 13, 21.50 , "12/05/21"));
		producto.add(new Producto ("cuaderno", 50, 3.00, "09/04/21"));
		producto.add(new Producto ("polo", 27, 15.00, "13/05/21"));
		producto.add(new Producto ("cartuchera", 34, 10.00, "04/04/21"));
		
		OperacionesArray <Producto> arr = new OperacionesArray <Producto>(producto);
		System.out.println("POSICION DEL ELEMENTO: "+ arr.posicionArray(new Producto("polo", 27, 15.00, "13/05/21")));
		System.out.println("ORDENADO: "+ arr.Ordenar());
		System.out.println("ELIMINAR: "+ arr.remove(new Producto("cuaderno", 50, 3.00, "09/04/21")));
		
	}

}

