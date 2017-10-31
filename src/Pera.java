
public class Pera extends Produto {

private final double preco=12.5;
public Pera(String nome) {
	this.nome=nome;
}

	@Override
	public double getPreco() {
		return preco;
	}

}
