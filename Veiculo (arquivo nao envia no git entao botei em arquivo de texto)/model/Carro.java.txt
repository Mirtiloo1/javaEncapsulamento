package br.edu.fatecpg.veiculo.model;

public class Carro {
	private String chassi;
	private String marca;
	private String modelo;
	private String placa;
	private double motor;
	private double capacidadeTanque;
	private boolean ligado = false;
	private double vlGasolina;

	
	public Carro(String ch, String mrc, String mod, double motor, double ct) {
		this.chassi = ch;
		this.marca = mrc;
		this.modelo = mod;
		this.motor = motor;
		this.capacidadeTanque = ct;
	}
	
		public String getChassi() {
			return this.chassi;
		}
		
		public void setChassi(String ch) {
			this.chassi = ch;
		}
		//
		public String getMarca() {
			return this.marca;
		}
		
		public void setMarca(String mrc) {
			this.marca = mrc;
		}
		//
		public String getModelo() {
			return this.modelo;
		}
		
		public void setModelo(String mod) {
			this.modelo = mod;
		}
		//
		public double getMotor() {
			return this.motor;
		}
		
		public void setMotor(double motor) {
			this.motor = motor;
		}
		//
		
		public double getVlGasolina() {
			return this.vlGasolina;
		}
		public void setVlGasolina(double vlg) {
			this.vlGasolina = vlg;
		}
		
			public void encherTanque() {
				System.out.print("Tanque Cheio! \nValor: ");
				double vlTG = this.capacidadeTanque * this.vlGasolina;
				System.out.print(vlTG);
			}
		
	public void ligar() {
		System.out.println("Ligou");
		this.ligado = true;
	}
	public void desligado() {
		System.out.println("Desligou!");
		this.ligado = false;
	}
	public void andar() {
		if(this.ligado == true) {
		System.out.println("Andou");
		}
		else {
			System.out.println("Ligue o carro!");
		}
	}
}
