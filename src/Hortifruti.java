import java.util.Scanner;

public class Hortifruti {
		public static void main (String[ ] args) {
			int opcao;

            @SuppressWarnings("resource")
			Scanner    input           = new Scanner (System.in);
			Cesta      cestaDeProdutos = new Cesta ( );
			Hortifruti hortifruti      = new Hortifruti ( );

			do {
				System.out.println (hortifruti.imprimirCabecalhoMenuPrincipal ( ));
				System.out.print ("Digite a opção desejada: ");
				opcao = input.nextInt ( );
				
				switch (opcao) {
					case 1:
						System.out.println (hortifruti.imprimirCabecalhoSubMenu ( ));
						System.out.println ("Escolha uma das frutas: ");
						int opcaoDeFruta = input.nextInt ( );
						
						if (! hortifruti.comprarFrutas(opcaoDeFruta, cestaDeProdutos)) {
							System.out.println("A cesta de produtos encontra-se cheia!");
						}
						else {
							System.out.println ("Produto(s) inserido(s) com sucesso!");
						}

						break;
					case 2: 
						cestaDeProdutos.listarCesta ( );
						System.out.println ("Total da Cesta: "+cestaDeProdutos.calcularTotal ( )+"\n\n");
						break;
					case 3: 
						cestaDeProdutos.limparCesta ( );
						break;
					case 4: 
						break;
					default: 
						System.out.println ("\nOpção inválida!");
					break;
				}	
			} while (opcao != 4);
		}
		
		private String imprimirCabecalhoSubMenu ( ) {
			return (
				"Frutas disponíveis:\n\n" +
				"1 - banana\n" +
				"2 - pera\n" +
				"3 - maçã\n" +
				"4 - uva\n" +
				"5 - morango\n" +
				"6 - limão\n" +
				"7 - mamão"
			);
		}
		
		private String imprimirCabecalhoMenuPrincipal ( ) {
			return (
				"***Menu de Opções do Hortifruti***\n\n" +
				"1 - Colocar produto na cesta\n" +
				"2 - Mostrar conteudo da cesta\n" +
				"3 - Limpar cesta\n" +
				"4 - Sair\n"
			);
		}
		
		private boolean comprarFrutas (int opc, Cesta cestaDeProdutos ) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner (System.in);
			
			int quantidade;
			
			switch (opc) {
			    case 1:  return inserirProduto (Banana.class,  input, cestaDeProdutos);
			    case 2:  return inserirProduto (Pera.class,    input, cestaDeProdutos);
			    case 3:  return inserirProduto (Maca.class,    input, cestaDeProdutos);
			    case 4:  return inserirProduto (Uva.class,     input, cestaDeProdutos);
			    case 5:  return inserirProduto (Morango.class, input, cestaDeProdutos);
			    case 6:  return inserirProduto (Limao.class,   input, cestaDeProdutos);
			    case 7:  return inserirProduto (Mamao.class,   input, cestaDeProdutos);
			    default: System.out.println ("Opção inválida!");
			}
			return true;
	    }

    private boolean inserirProduto (Class<? extends Produto> tipo, Scanner input, Cesta cestaDeProdutos) {
        try {
            System.out.println ("Digite a quantidade do produto escolhido!");
            int quantidade=input.nextInt();

            if(quantidade>0) {
                Produto produto = tipo.newInstance ( );
                produto.setQtde (quantidade);
                return (cestaDeProdutos.adicionarItem (produto));
            }
            else {
                System.out.println ("Quantidade inválida!");
            }
        } catch (Exception e) {
            e.printStackTrace ( );
        }

        return true;
    }
}		

// OK