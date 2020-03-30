
public class Losango extends Poligono {

	public Losango(double altura, double base) {
		super(altura, base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		
		return super.getAltura()*super.getBase();
	}

	
}
