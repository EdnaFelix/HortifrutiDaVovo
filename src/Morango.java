
public class Morango extends Produto {

	public Morango() {
        super(7.10,"Morango");
    }
	@Override
	public double getPreco() {
	 return this.getPrecoUnitario()*this.getQtde();	
	}
}
