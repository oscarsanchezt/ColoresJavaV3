package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		objeto objeto1 = new objeto("\u001B[31m", "\u001B[32m", "\u001B[34m", "\u001B[0m");

		System.out.println("El color es" + objeto1.rojo + " rojo" + objeto1.reset);
		System.out.println("El color es" + objeto1.verde + " verde" + objeto1.reset);
		System.out.println("El color es" + objeto1.azul + " azul" + objeto1.reset);

	}
}
