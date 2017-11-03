class Maca extends Produto {
	public Maca ( ) {
        super(1.10,"Maça");
    }

	@Override
	public double getPreco ( ) {
	 	return this.getPrecoUnitario ( ) * this.getQtde ( );
	}
}

// OK