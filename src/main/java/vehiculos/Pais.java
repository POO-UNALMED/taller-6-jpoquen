package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private static List<Pais> listPais = new ArrayList<Pais> ();
	private String nombre;
	private int fabricas;
	
	public Pais() {}
	
	public Pais(String nombre) {
		this.nombre = nombre;
		listPais.add(this);
	}
	
	public void aumFabricas() { ++fabricas; }
	
	public static Pais paisMasVendedor() {
		
		int cantidad = 0;
		Pais pais = new Pais();
		
		for (int i = 0; i < listPais.size(); i++) {
			if(listPais.get(i).getFabricas() > cantidad) {
				cantidad = listPais.get(i).getFabricas();
				pais = listPais.get(i);
			}
		}
		
		return pais;
	}
	
	public String getNombre() { return nombre; }
	
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	public int getFabricas() { return fabricas; }
}
