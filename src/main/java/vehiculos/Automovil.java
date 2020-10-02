package vehiculos;
import fabricantes.Fabricante;
public class Automovil extends Vehiculo {
	private int puestos;
	private boolean movilizar;
	private static int automoviles;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos, boolean movilizar) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.movilizar = movilizar;
		++automoviles;
	}
	
	public int getPuestos() { return puestos; }
	
	public void setPuestos(int puestos) { this.puestos = puestos; }
	
	public boolean isMovilizar() { return movilizar; }
	
	public void setMovilizar(boolean movilizar) { this.movilizar = movilizar; }
	
	public static int getAutomoviles() { return automoviles; }
}
