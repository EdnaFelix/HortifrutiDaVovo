class Maca extends Produto {
 
	public Maca() {
        super(1.10,"Maçã");
    }
	@Override
	public double getPreco() {
	 return this.getPrecoUnitario()*this.getQtde();	
	}
}
