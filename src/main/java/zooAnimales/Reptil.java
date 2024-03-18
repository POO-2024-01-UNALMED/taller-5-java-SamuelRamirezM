package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado=new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
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
