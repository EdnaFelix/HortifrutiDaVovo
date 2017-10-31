
public class Mamao extends Produto{

private final double preco=30;
public Mamao(String nome) {
	this.nome=nome;
}

	@Override
	public double getPreco() {
		return preco;
	}

}
