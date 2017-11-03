public class Limao extends Produto {
	public Limao ( ) {
        super (4.10,"Limão");
    }

	@Override
	public double getPreco ( ) {
	    return this.getPrecoUnitario ( ) * this.getQtde ( );
	}
}

// OK