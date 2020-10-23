package testbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import calculadora.ICalculadora;

@Service
public class MySpringWriterBeanWithDependency {
	private ICalculadora calculadora;
	
	@Autowired
	public void setCalculadora(ICalculadora pCalculadora) {
		this.calculadora = pCalculadora;
	}
	
	public void run() {
		int numero1 = 20;
		int numero2 = 5;
		calculadora.sumar(numero1, numero2);
	}
	
}
