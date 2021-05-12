
import java.util.*;

public class OperacionesArray<T extends Producto> {
	private ArrayList <T> arr = new ArrayList<T> ();
	
	public OperacionesArray(ArrayList <T> a) {
		arr.addAll(a);
	}
	public int posicionArray( T elem) {
		for(int i = 0; i < arr.size(); i++) {
			if(elem.compareToBusqueda(arr.get(i)) == 1) 
				return (i);
		}
		return -1;
	}
	
	public ArrayList <T> remove( T elem) {
		for(int i = 0; i < arr.size(); i++) {
			if(elem.compareToBusqueda(arr.get(i)) == 1)  
				arr.remove(i);
		}
		return arr;
	}
	
	public ArrayList Ordenar (){
		for(int i=0; i < arr.size(); i++) {
			int j = i;
			while(j > 0 && arr.get(j).compareToOrdenar(arr.get(j-1)) > 0) {
				T a = arr.get(j);
				arr.set(j, arr.get(j-1));
				arr.set(j-1, a);
				j--;
			}
		}
		return arr;
	}

}

class Producto {
	private String descripcion;
	private int stock;
	private double precio;
	private String fechaProd;
	public Producto(String d, int s, double p, String f) {
		this.descripcion = d;
		this.stock = s;
		this.precio = p;
		this.fechaProd = f;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public int getStock() {
		return stock;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String getFechaProd() {
		return fechaProd;
	}
	
	public int compareToBusqueda(Producto elem) {
		if(descripcion.equals(elem.getDescripcion()) && fechaProd.equals(elem.getFechaProd()) ) 
			return 1;
		return 0;
	}
	
	public int compareToOrdenar(Producto elem) {
		if(stock < elem.getStock())
			return 1;
		return 0;
	}
	
}
