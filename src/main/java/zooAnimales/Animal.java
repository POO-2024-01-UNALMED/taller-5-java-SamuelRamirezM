package zooAnimales;
import java.util.ArrayList;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList zona;
	
	public Animal() {
		this(0, null, 0, null, null);
	}
	
	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
}
