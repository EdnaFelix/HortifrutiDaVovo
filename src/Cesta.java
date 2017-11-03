public class Cesta {
    private int quantProdutos=0;
    private Produto arrayProdutos[] = new Produto[12];
 
    public boolean  adicionarItem(Produto item) {
	    if (quantProdutos < 12) {
		    arrayProdutos[quantProdutos]=item;
		    quantProdutos++;
		    return true;
	    }
	    else {
		    return false;
	    }
    }

    public double calcularTotal ( ){
	    double totalPrecos = 0;
	 
	    for(int i=0;i<quantProdutos;i++) {
		    totalPrecos +=arrayProdutos[i].getPreco ( );
	    }
	 
	    return totalPrecos;
    }

    public void listarCesta ( ) {
	    if(quantProdutos == 0) {
            System.out.println ("Nenhum produto na cesta!");
        }
	    else {
	        for (int i=0;i<quantProdutos;i++) {
	    	    System.out.println (
	    	        arrayProdutos[i].getNome ( ) +
                    " - Quantidade: " +
                    arrayProdutos[i].getQtde ( ) +
                    " Preço Unitario: " +
                    arrayProdutos[ i ].getPrecoUnitario ( ) +
                    " R$"
                );
	        }
	    }
    }

     public void limparCesta ( ) {
	    for (int i = 0; i < quantProdutos; i++) {
            arrayProdutos[i] = null;
        }
	    quantProdutos = 0;
    }
}

// OK