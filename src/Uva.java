
public class Uva extends Produto{

	public Uva() {
        super(2.10, "Uva");
    }
	@Override
	public double getPreco() {
	 return this.getPrecoUnitario()*this.getQtde();	
	}
}
