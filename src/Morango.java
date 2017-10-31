
public class Morango extends Produto {

private final double preco=15;
public Morango(String nome) {
	this.nome=nome;
}
	
	@Override
	public double getPreco() {
		return preco;
	}

}
