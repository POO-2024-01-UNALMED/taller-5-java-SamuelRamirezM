package zooAnimales;
import java.util.ArrayList;

public class Ave {
	private ArrayList listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave() {
		this(0, 0, null);
	}
	
	public Ave(int halcones, int aguilas, String colorPlumas) {
		this.halcones = halcones;
		this.aguilas = aguilas;
		this.colorPlumas = colorPlumas;
	}
}
