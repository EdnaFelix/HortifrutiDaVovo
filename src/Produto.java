
abstract class Produto {
	protected int qtde;	
	protected String nome;
	public abstract double getPreco();
    
	public void setQtde (int qtde) {
    	this.qtde=qtde;
    }
}