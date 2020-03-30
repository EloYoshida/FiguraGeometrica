
public class Triangulo extends Poligono {

	public Triangulo(double altura, double base) {
		super(altura, base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		
		return super.getAltura()*super.getBase()/2;
	}

	@Override
	public String toString() {
		return "Triangulo [area()=" + area() + "]";
	}

	
	
}
