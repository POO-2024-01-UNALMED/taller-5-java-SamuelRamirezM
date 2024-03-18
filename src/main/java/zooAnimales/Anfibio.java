package zooAnimales;
import java.util.ArrayList;

public class Anfibio {
	private ArrayList listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		this(0, 0, null, false);
	}
	
	public Anfibio(int ranas, int salamandras, String colorPiel, boolean venenoso) {
		this.ranas = ranas;
		this.salamandras = salamandras;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
}
