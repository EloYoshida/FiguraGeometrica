
public class Triangulo extends Poligono {

	public Triangulo(double altura, double base) {
		super(altura, base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {

		return super.getAltura() * super.getBase() / 2;
	}

	@Override
	public double perimetro() {
		double cateto = super.getBase() / 2;
		double hipotenusa = Math.pow(super.getAltura(), 2) + Math.pow(cateto, 2);
		double fimSera = Math.sqrt(hipotenusa);
		
		return super.getBase()*fimSera + super.getBase()*fimSera + fimSera * fimSera;
	}

	@Override
	public String toString() {
		return "Triangulo [area()=" + area() + ", perimetro()=" + perimetro() + "]";
	}

	
	
}

