public class Pera extends Produto {
	public Pera ( ) {
        super (10.50, "Pêra");
    }

	@Override
	public double getPreco ( ) {
	 return this.getPrecoUnitario ( ) * this.getQtde ( );
	}
}

// OK