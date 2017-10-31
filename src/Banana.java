
public class Banana extends Produto{

private final double preco=25.4;
public Banana(String nome) {
	this.nome=nome;
}
	
	@Override
	public double getPreco() {
		return preco;
	}
    
}
