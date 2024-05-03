package IFSC;

public class Carro {
	
	private int numerodavaga;
	private String marca;
	private String modelo;
	private int anodefabricação;
	private float preçodocarro;
	private int numerodeportas;
	private String cor;

	public int getNumerodavaga() {
	return numerodavaga;

	}

	public void setNumerodavaga(int numerodavaga) {
	this.numerodavaga = numerodavaga;

	}

	public String getMarca() {
	return marca;

	}

	public void setMarca(String marca) {
	this.marca = marca;

	}

	public String getModelo() {
	return modelo;

	}

	public void setModelo(String modelo) {
	this.modelo = modelo;

	}

	public int getAnodefabricação() {
	return anodefabricação;

	}

	public void setAnodefabricação(int anodefabricação) {
	this.anodefabricação = anodefabricação;

	}

	public float getPreçodocarro() {
	return preçodocarro;

	}

	public void setPreçodocarro(float preçodocarro) {
	this.preçodocarro = preçodocarro;

	}

	public int getNumerodeportas() {
	return numerodeportas;

	}

	public void setNumerodeportas(int numerodeportas) {
	this.numerodeportas = numerodeportas;

	}

	public String getCor() {
	return cor;

	}

	public void setCor(String cor) {
	this.cor = cor;

	}

	  @Override

	    public String toString() {

	        return "Número da vaga: " + numerodavaga +

	               ", Marca: " + marca +

	               ", Modelo: " + modelo +

	               ", Ano de Fabricação: " + anodefabricação +

	               ", Preço do Carro: " + preçodocarro +

	               ", Número de Portas: " + numerodeportas +

	               ", Cor: " + cor;
	        
	    }

	}