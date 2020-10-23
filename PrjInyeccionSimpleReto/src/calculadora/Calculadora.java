package calculadora;

public class Calculadora implements ICalculadora {

	@Override
	public void sumar(int numero1, int numero2) {
		System.out.println("El resultado es: " + (numero1 + numero2));
	}

}
