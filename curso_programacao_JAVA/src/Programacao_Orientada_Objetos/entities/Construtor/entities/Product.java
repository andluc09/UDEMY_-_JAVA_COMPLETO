package Programacao_Orientada_Objetos.entities.Construtor.entities;

public class Product {

	// Atributos Públicos 
	
	/*public String name;
	public double price;
	public int quantity;*/
	
	/*private String name;
	private double price;
	private int quantity;*/
	
	// Modificadores de acesso
	String name;           // Nada = o membro só pode ser acessado nas classes do mesmo pacote, uma classe enxerga a outra em um mesmo pacote
	private double price;
	private int quantity;
	
	// Construtores
	
	public Product() { // Construtor Padrão - Pode haver a necessidade de mantê-lo - Sobrecarga
	}
		
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { // Sobrecarga
		this.name = name;
		this.price = price;
	}
	
	// Métodos Get e Set
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() { // Apenas consultar a quantidade de itens em estoque 
		return quantity;
	}
	
	/*public void setQuantity(int quantity) { // Não se realiza uma inserção ou alteração 
		this.quantity = quantity;             // na quantidade manualmente se deve o fazê-lo		
	}*/                                       // através de métodos que adicionam ou subtraem itens.
											  // Portanto só modifica-se a quantidade através de entradas
										      // ou saídas do estoque
	
	// Métodos de Classe
	
    public double totalValueInStock() {
    	return price * quantity;
    }
    
    public void addProducts(int quantity) { // Não possuí retorno (vazio)
    	this.quantity += quantity;
    }
    
    public void removeProducts(int quantity) { // Não possuí retorno (vazio)
    	this.quantity -= quantity;
    }
    
    public String toString() { // sobreposição a um método existente
    	return name 
    			+ ", $ "  
    			+ String.format("%.2f", price, null) 
    			+ ", " 
    			+ quantity 
    			+ " units, Total: $ " 
    			+ String.format("%.2f", totalValueInStock(), null);
    }
}
