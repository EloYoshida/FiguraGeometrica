import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		
		ArrayList<Figura> lista = new ArrayList<Figura>(); // Criei uma Array do tipo Figura (classe Pai) com o nome Lista;
		
		Figura circ = new Circulo(3); // Tipo + nome da sua escolha = new construtor que deseja instanciar (valor que vai ser inserido) ;
		lista.add(circ); // uma forma de colocar na array
		lista.add(new Losango (5,19)); // segunda forma, mais compacta e exigindo menos recurso da máquina
		lista.add(new Quadrado(4));
		lista.add(new Retangulo (5,10));
		lista.add(new Triangulo (10,5));
		

		for (Figura fig:lista) { // Roda toda Array posição por posição e puxa o objeto pra variável que nomeamos como "fig"
			
			System.out.println(fig);
		}
		
	}

}
