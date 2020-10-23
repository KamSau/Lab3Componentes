package calculadora;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraConcatenar implements ICalculadora {

	@Override
	public void sumar(int numero1, int numero2) {
		System.out.print("El resultado es: " + numero1 + "" + numero2);
	}
	
}
