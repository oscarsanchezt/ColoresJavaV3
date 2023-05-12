package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		objeto objeto1 = new objeto("\u001B[31m", "\u001B[32m", "\u001B[34m", "\u001B[0m");
		objeto objeto2 = new objeto("objetoRojo", "objetoVerde", "objetoAzul", "objetoReset");

		System.out.println("El color es" + objeto1.rojo + " rojo" + objeto1.reset);
		System.out.println("El color es" + objeto1.verde + " verde" + objeto1.reset);
		System.out.println("El color es" + objeto1.azul + " azul" + objeto1.reset);

		System.out.println("El objeto es: " + objeto1.rojo + objeto2.rojo + objeto1.reset);
		System.out.println("El objeto es: " + objeto1.verde + objeto2.verde + objeto1.reset);
		System.out.println("El objeto es: " + objeto1.azul + objeto2.azul + objeto1.reset);
		System.out.println("El objeto es: " + objeto2.reset);

	}
}
