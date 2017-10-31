import java.util.Scanner;
public class Hortifruti {
		public static void main(String[]args){
			int opcao=0;
			@SuppressWarnings("resource")
			Scanner input= new Scanner (System.in);
			Cesta cestaDeProdutos = new Cesta();
			Hortifruti hortifruti = new Hortifruti();
			do{
				System.out.println(hortifruti.imprimirCabecalhoMenuPrincipal());
				System.out.print("digite a opção desejada: ");
				opcao=input.nextInt();
				
				switch (opcao) {
				
				case 1:
					System.out.println(hortifruti.imprimirCabecalhoSubMenu());
					System.out.println("escolha uma das frutas:");
					int opcaoDeFruta = input.nextInt();
					
					if(hortifruti.escolherFruta(opcaoDeFruta, cestaDeProdutos)==false)
					{
						System.out.println("a cesta de produtos encontra-se cheia");
					}
					else
					{
						System.out.println("produto(s) inserido(s) com sucesso");
					}
					break;
					
				case 2: 
					cestaDeProdutos.listarCesta();
					System.out.println("Total da Cesta: "+cestaDeProdutos.calcularTotal()+"\n\n");
					break;
					
				case 3: 
					cestaDeProdutos.limparCesta();
					break;
					
				case 4: 
					break;
					
				default: 
					System.out.println("\nopção inválida");
				break;
				}	
			  }while(opcao!=4);
		}
		
		private String imprimirCabecalhoSubMenu(){
			return ("Frutas disponíveis\n\n1-banana\n2-pera\n3-maçã\n4-uva\n5-morango\n6-limão\n7-mamão");
		}
		
		private String imprimirCabecalhoMenuPrincipal() {
			return ("***Menu de Opções do Hortifruti***\n\n1-Colocar produto na cesta\n2-Mostrar conteudo da cesta\n3-Limpar cesta\n4-Sair\n");
		}
		
		private boolean escolherFruta(int opc, Cesta cestaDeProdutos ){
			@SuppressWarnings("resource")
			Scanner input= new Scanner (System.in);
			switch (opc) {
			
			 case 1:
				 
				 Produto banana = new Banana("banana");
				 if(cestaDeProdutos.adicionarItem(banana)==false) 
				 {
					 return false;
				 }
				 else
				 {
					 
					 System.out.println("digite a quantidade do produto escolhido");
						int quantidade=input.nextInt();
						banana.setQtde(quantidade);
				 }
				 break;
				 
			 case 2:
				 Produto pera = new Pera("pêra");
				 if(cestaDeProdutos.adicionarItem(pera)==false) 
				 {
					 return false;
				 }
				 else
				 {
					 
					 System.out.println("digite a quantidade do produto escolhido");
						int quantidade=input.nextInt();
						pera.setQtde(quantidade);
				 }
				 break;
				 
			 case 3:
				 Produto maca = new Maca("maçã");
				 if(cestaDeProdutos.adicionarItem(maca)==false) 
				 {
					 return false;
				 }
				 else
				 {
					 
					 System.out.println("digite a quantidade do produto escolhido");
						int quantidade=input.nextInt();
						maca.setQtde(quantidade);
				 }
				 break;
				 
			 case 4:
				 Produto uva = new Uva("uva");
				 if(cestaDeProdutos.adicionarItem(uva)==false) 
				 {
					 return false;
				 }
				 else
				 {
					 
					 System.out.println("digite a quantidade do produto escolhido");
						int quantidade=input.nextInt();
						uva.setQtde(quantidade);
				 }
				 break;
				 
			 case 5:
				 Produto morango = new Morango("morango");
				 if(cestaDeProdutos.adicionarItem(morango)==false) 
				 {
					 return false;
				 }
				 else
				 {
					 
					 System.out.println("digite a quantidade do produto escolhido");
						int quantidade=input.nextInt();
						morango.setQtde(quantidade);
				 }
				 break;
				 
			 case 6:
				 Produto limao = new Limao("limão");
				 if(cestaDeProdutos.adicionarItem(limao)==false) 
				 {
					 return false;
				 }
				 else
				 {
					 
					 System.out.println("digite a quantidade do produto escolhido");
						int quantidade=input.nextInt();
						limao.setQtde(quantidade);
				 }
				 break;
				 
			 case 7:
				 Produto mamao = new Mamao("mamão");
				 if(cestaDeProdutos.adicionarItem(mamao)==false) 
				 {
					 return false;
				 }
				 else
				 {
					 
					 System.out.println("digite a quantidade do produto escolhido");
						int quantidade=input.nextInt();
						mamao.setQtde(quantidade);
				 }
				 break;
			 
				default: 
					System.out.println("opção inválida");
				break;
			}
			return true;
		}
}		
