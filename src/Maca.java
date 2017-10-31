
class Maca extends Produto {

private final double preco=10;
public Maca(String nome) {
	this.nome=nome;
}

	@Override
	public double getPreco() {
		return preco;
	}

}
