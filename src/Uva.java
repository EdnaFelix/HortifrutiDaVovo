
public class Uva extends Produto{

private final double preco=19;
public Uva(String nome) {
	this.nome=nome;
}

	
	@Override
	public double getPreco() {
		return preco;
	}
}
