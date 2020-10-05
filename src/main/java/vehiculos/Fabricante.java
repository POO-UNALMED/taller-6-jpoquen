package vehiculos;

import java.util.ArrayList;
import java.util.List;


public class Fabricante {
	private static List<Fabricante> listFab = new ArrayList<Fabricante> ();
	private String nombre;
	private Pais pais;
	private int fabricados;
	
	public Fabricante() {};
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		pais.aumFabricas();
		listFab.add(this);
	}
	
	public void aumFabricados() { ++fabricados; }
	
	public String getNombre() { return nombre; }
	
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	public Pais getPais() { return pais; }
	
	public void setPais(Pais pais) { this.pais = pais; }
	
	public int getFabricados() { return fabricados; }
	
	
	public static Fabricante fabricaMayorVentas() {
		
		int cantidad = 0;
		Fabricante fabricante = new Fabricante();
		
		for (int i = 0; i < listFab.size(); i++) {
			if(listFab.get(i).getFabricados() > cantidad) {
				cantidad = listFab.get(i).getFabricados();
				fabricante = listFab.get(i);
			}
		}
		
		return fabricante;
	}
}
