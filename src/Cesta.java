
public class Cesta {
 private int quantProdutos=0;
 Produto arrayProdutos[] = new Produto[12];
 
 public boolean  adicionarItem(Produto item) {
	 if(quantProdutos<12) {
		 arrayProdutos[quantProdutos]=item;
		 quantProdutos++;
		 return true;
	 }
	 else
	 {
		 return false;
	 }
 }
 public double calcularTotal(){
	 double totalPrecos = 0;
	 
	 for(int i=0;i<quantProdutos;i++)
	 {
		 totalPrecos +=arrayProdutos[i].getPreco() * arrayProdutos[i].qtde; 
	 }
	 
	 return totalPrecos;
 }
 public void listarCesta() {
	 for(int i=0;i<quantProdutos;i++) {
		 System.out.println(arrayProdutos[i].nome+"- quantidade:"+arrayProdutos[i].qtde+" preço:"+arrayProdutos[i].getPreco());
	 }
 }
 public void limparCesta(){
	 quantProdutos=0;
 }
}