package zooAnimales;
import java.util.ArrayList;

public class Pez {
	private ArrayList listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		this(0, 0, null, 0);
	}
	
	public Pez(int salmones, int bacalaos, String colorEscamas, int cantidadAletas) {
		this.salmones = salmones;
		this.bacalaos = bacalaos;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
}
