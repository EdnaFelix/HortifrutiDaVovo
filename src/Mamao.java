
public class Mamao extends Produto{

	public Mamao() {
        super(4.40,"Mamão");
    }
	@Override
	public double getPreco() {
	 return this.getPrecoUnitario()*this.getQtde();	
	}
}
