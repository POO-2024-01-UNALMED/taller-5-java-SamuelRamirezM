package zooAnimales;
import java.util.ArrayList;

public class Reptil {
	private ArrayList listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private String largoCola;
	
	public Reptil() {
		this(0, 0, null, null);
	}
	
	public Reptil(int iguanas, int serpientes, String colorEscamas, String largoCola) {
		this.iguanas = iguanas;
		this.serpientes = serpientes;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
}
