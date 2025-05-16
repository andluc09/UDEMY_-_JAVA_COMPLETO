package Programacao_Orientada_Objetos.entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
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
