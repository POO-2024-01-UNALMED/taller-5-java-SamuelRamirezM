package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
	private ArrayList listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		this(0, 0, false, 0);
	}
	
	public Mamifero(int caballos, int leones, boolean pelaje, int patas) {
		this.caballos = caballos;
		this.leones = leones;
		this.pelaje = pelaje;
		this.patas = patas;
	}
}
