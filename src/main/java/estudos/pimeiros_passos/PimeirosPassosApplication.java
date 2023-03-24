package estudos.pimeiros_passos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PimeirosPassosApplication {

	public static void main(String[] args) {

		SpringApplication.run(PimeirosPassosApplication.class, args);
		//Calculadora calculadora = new Calculadora();
		//System.out.println("Resulado é "  + calculadora.somar(2,7)); Não utiliza mais essa forma pelo spring
	}

}
