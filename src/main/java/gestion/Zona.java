package gestion;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private ArrayList zoo;
	private ArrayList animales;
	
	public Zona() {
		this(null);
	}
	
	public Zona(String nombre) {
		this.nombre = nombre;
	}
}
