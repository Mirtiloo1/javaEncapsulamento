package br.edu.fatecpg.veiculo.view;

import br.edu.fatecpg.veiculo.model.Carro;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Carro carroCr7 = new Carro("DST123", "CHEVROLET", "ONIXxax", 3.0, 54.00);
		
		System.out.print("Valor do Litro da Gasolina: ");
		double v = scan.nextDouble();
		
		carroCr7.setVlGasolina(v); 
		double vlgs = carroCr7.getVlGasolina();
		
		carroCr7.encherTanque();
		
		carroCr7.setChassi("\nBSM123");
		String chassi = carroCr7.getChassi();
		System.out.println(chassi);
		System.out.println(carroCr7.getChassi());
		
		
	}

}
