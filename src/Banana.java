
public class Banana extends Produto{

	public Banana() {
        super(2.10,"Banana");
    }
	@Override
	public double getPreco() {
	 return this.getPrecoUnitario()*this.getQtde();	
	}    
}
