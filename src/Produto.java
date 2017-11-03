
abstract class Produto {
	private int qtde;	
	private String nome;
	private double precoUnitario;
	
	public abstract double getPreco();
    
	Produto(double u,String n){
        precoUnitario = u;
        nome = n;
    }
	public int getQtde() {
        return qtde;
    }
	public double getPrecoUnitario() {
        return precoUnitario;
    }
	public String getNome() {
        return nome;
    }
	public void setQtde (int quantidade) {
    	 qtde=quantidade;
    }
    
}