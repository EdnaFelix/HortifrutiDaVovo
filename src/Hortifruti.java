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
						
						if(hortifruti.comprarFrutas(opcaoDeFruta, cestaDeProdutos)==false)
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
		
		private boolean comprarFrutas(int opc, Cesta cestaDeProdutos ){
			@SuppressWarnings("resource")
			Scanner input= new Scanner (System.in);
			
			int quantidade;
			
			switch (opc) {
			 
			 case 1:
				 
				 System.out.println("digite a quantidade do produto escolhido");
				 quantidade=input.nextInt();
				 if(quantidade>0) {
					 Banana banana = new Banana();
					 banana.setQtde(quantidade);
					 return(cestaDeProdutos.adicionarItem(banana));
				 }
				 else 
				 { 
					System.out.println("quantidade invalida");
				 	break;
				 }
			 case 2:
				 System.out.println("digite a quantidade do produto escolhido");
				 quantidade=input.nextInt();
				 if(quantidade>0) {
					 Pera pera = new Pera();
					 pera.setQtde(quantidade);
					 return(cestaDeProdutos.adicionarItem(pera));
				 }
				 else 
				 { 
					 System.out.println("quantidade invalida");
					 break;
				 }
			 case 3:
				 System.out.println("digite a quantidade do produto escolhido");
				 quantidade=input.nextInt();
				 if(quantidade>0) {
					 Maca maca = new Maca();
					 maca.setQtde(quantidade);
					 return(cestaDeProdutos.adicionarItem(maca)); 
				 }else 
				 { 
					 System.out.println("quantidade invalida");
					 break;
				 }
			 case 4:
				 System.out.println("digite a quantidade do produto escolhido");
				 quantidade=input.nextInt();
				 
				 if(quantidade>0) {
					 Uva uva = new Uva();
					 uva.setQtde(quantidade);
					 return(cestaDeProdutos.adicionarItem(uva));
				 }
				 else 
				 { 
					 System.out.println("quantidade invalida");
					 break;
				 }
			 case 5:
				 System.out.println("digite a quantidade do produto escolhido");
				 quantidade=input.nextInt();
				 
				 if(quantidade>0) {
					 Morango morango = new Morango();
					 morango.setQtde(quantidade);
					 return(cestaDeProdutos.adicionarItem(morango));
				 }
				 else 
				 { 
					 System.out.println("quantidade invalida");
					 break;
				 }
			 case 6:
				 System.out.println("digite a quantidade do produto escolhido");
				 quantidade=input.nextInt();
				 if(quantidade>0) {
					 Limao limao = new Limao();
					 limao.setQtde(quantidade);
					 return(cestaDeProdutos.adicionarItem(limao));
				 }
				 else 
				 { 
					 System.out.println("quantidade invalida");
					 break;
				 }
			 case 7:
				 
				System.out.println("digite a quantidade do produto escolhido");
				quantidade=input.nextInt();
				
				if(quantidade>0) {
					 Mamao mamao = new Mamao();
					 mamao.setQtde(quantidade);
					 return(cestaDeProdutos.adicionarItem(mamao));
				 }
				 else 
				 { 
					 System.out.println("quantidade invalida");
					 break;
				}
			 default: 
					System.out.println("opção inválida");
				break;
			}
			return true;
		}
}		
