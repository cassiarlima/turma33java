package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import entities.Produtos;

public class Projeto {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		List<Produtos> listaCarrinho = new ArrayList<Produtos>();

		List<Produtos> listaProdutos = new ArrayList<Produtos>();
		listaProdutos.add(new Produtos("G3-01", "Mindset		               ", 30.00, 10));
		listaProdutos.add(new Produtos("G3-02", "Poder do h�bito               ", 30.00, 10));
		listaProdutos.add(new Produtos("G3-03", "O segredo                     ", 50.00, 10));
		listaProdutos.add(new Produtos("G3-04", "O corpo fala                  ", 30.00, 10));
		listaProdutos.add(new Produtos("G3-05", "Pai rico pai pobre            ", 40.00, 10));
		listaProdutos.add(new Produtos("G3-06", "O milagre da manh�            ", 20.00, 10));
		listaProdutos.add(new Produtos("G3-07", "Comunica��o n�o violenta      ", 60.00, 10));
		listaProdutos.add(new Produtos("G3-08", "O poder do agora              ", 30.00, 10));
		listaProdutos.add(new Produtos("G3-09", "O homem mais rico da babil�nia", 15.00, 10));
		listaProdutos.add(new Produtos("G3-10", "Quem mexeu no meu queijo      ", 15.00, 10));

		int QUANTIDADE = 1;

		// Vari�veis
		double valorTotal = 0.0, valorFinal = 0.0;
		int x = 0, estoqueEscolhido = 0;
		char continuarCompra = 'x', opcaoPgto = 'x';
		String codigoEscolhido = "x", desejaComprar = " ";

		// TELA INICIAL DO E-COMMERCE
		while (opcaoPgto == 'x') {
			System.out.print("..::|Livraria Gen|::..\n"); // nome da loja
			System.out.print("Leia um livro e v� al�m\n\n");// nome do slogan

			System.out.print("Ol�, deseja fazer uma compra ? Sim(S)/N�o(N): ");
			desejaComprar = leia.next().toUpperCase();

			limpaTela();

			// ENTRA NO MENU ADMIN
			if (desejaComprar.equals("ADMIN")) {
				admin(listaProdutos);
			}

			// corrige se digitar errado na tela inicial
			while (!desejaComprar.equals("S") && !desejaComprar.equals("N") && !desejaComprar.equals("ADMIN")) {
				System.out.print("<Op��o Inv�lida, escreva (S) ou (N)>\n\n");
				System.out.print("Ol�, deseja fazer uma compra ? Sim(S)/N�o(N): ");
				leia.nextLine();
				desejaComprar = leia.next().toUpperCase();

				limpaTela();
			}

			for (int y = 0; y < QUANTIDADE; y++) { // LA�O PRINCIPAL DE COMPRAS

				if (desejaComprar.equals("S")) {

					System.out.print("..::|Livraria Gen|::..\n"); // nome da loja
					System.out.print("Leia um livro e v� al�m\n\n\n");// nome do slogan
					System.out.print("<Produtos dispon�veis>\n");
					System.out.print("C�digo:\tLivros:\t\t\t\t\tValores:\tEstoque:\n");

					for (Produtos produto : listaProdutos) { // La�o que roda a listaProdutos
						if (produto.getEstoque() > 0) {
							System.out.println(produto); // Mostra a lista de produtos
						}

					}

					// Mostrar o carrinho ainda dentro da lista de produtos
					System.out.print("\n");
					System.out.print("<Escolhas no seu carrinho> ");
					System.out.print("\n");
					System.out.print("C�digo:\tLivros:\t\t\t\t\tValores:\tQuantidade:\n");
					for (Produtos carrinho : listaCarrinho) {
						System.out.println(carrinho);
					}

					System.out.print("\n");

				} else if (desejaComprar.equals("ADMIN")) {
					limpaTela();
					QUANTIDADE++; // roda o para de novo
					System.out.println("Modifica��es aplicadas com sucesso!!!\n");

					contador(5);
					limpaTela();
					break;
				} else {
					System.out.print("\n\nAT� BREVE!!!!");
					opcaoPgto = '0'; // Finaliza o la�o ENQUANTO
					break;
				}

				// Cliente seleciona o c�digo do produto que deseja.
				System.out.print("Selecione o c�digo do produto que voc� deseja: ");
				leia.nextLine();
				codigoEscolhido = leia.next().toUpperCase();

				// MOSTRA O PRODUTO SELECIONADO, SELECIONA A QUANTIDADE E ADICIONA NO CARRINHO
				for (x = 0; x < listaProdutos.size(); x++) {

					if (codigoEscolhido.equals(listaProdutos.get(x).getCodigoProduto())) {
						limpaTela();
						System.out.print("<LIVRO ESCOLHIDO>\n\n");
						System.out.print("C�digo:\tLivros:\t\t\t\t\tValores:\tEstoque:\n");
						System.out.println(listaProdutos.get(x) + "\n");

						System.out.print("Digite a quantidade necess�ria: ");
						leia.nextLine();
						estoqueEscolhido = leia.nextInt();

						// CARRINHO----------------------------------------------------------------------------
						if (estoqueEscolhido <= listaProdutos.get(x).getEstoque() && estoqueEscolhido > 0) {
							limpaTela();

							System.out.print("<CARRINHO FINAL>\n\n");
							System.out.print("C�digo:\tLivros:\t\t\t\t\tValores:\tQuantidade:\n");

							int car = 0; // percorre o carrinho
							for (Produtos carrinho : listaCarrinho) {

								if (carrinho.getCodigoProduto().equals(codigoEscolhido)) {
									break;
								}

								car++;
							}

							if (car == listaCarrinho.size()) {
								valorTotal = listaProdutos.get(x).getValorProduto() * estoqueEscolhido; // soma o valor
																										// da
																										// quantidade
																										// escolhida de
																										// um produto
																										// espec�fico
								listaCarrinho.add(new Produtos(listaProdutos.get(x).getCodigoProduto(),
										listaProdutos.get(x).getNomeProduto(), valorTotal, estoqueEscolhido));

								for (Produtos carrinho : listaCarrinho) {
									System.out.println(carrinho);
								}
							} else {

								for (Produtos carrinho : listaCarrinho) {
									System.out.println(carrinho);
								}

								limpaTela();
								System.out.print(
										"\n\n<N�o � poss�vel adicionar dois produtos iguais. Escolha outro!!>\n\n");

								contador(5);

								QUANTIDADE++;
								break;

							}

							System.out.print("\n");

							valorFinal = valorTotal + valorFinal; // Pega todos os itens do carrinho e soma o valor
																	// final em uma vari�vel

							System.out.print("Continuar a compra ? Sim(S)/N�o(N): ");
							continuarCompra = leia.next().charAt(0);
							limpaTela();// Limpa para a lista de produtos

							// verifica se o usu�rio digitou corretamente
							while (continuarCompra != 'S' && continuarCompra != 's' && continuarCompra != 'N'
									&& continuarCompra != 'n') {
								System.out.print("<Op��o Inv�lida, escreve (S) ou (N)>\n\n");
								System.out.print("Continuar a compra ? Sim(S)/N�o(N): ");
								continuarCompra = leia.next().charAt(0);
								limpaTela();
							}

							// verifica se o carrinho esta cheio e obriga o usuario a finalizar a compra
							while (listaCarrinho.size() == listaProdutos.size()) {
								System.out.print("Carrinho cheio, finalize sua compra");

								System.out.print("\nContinuar a compra ? Sim(S)/N�o(N) ");
								continuarCompra = leia.next().charAt(0);
								limpaTela();
								if (continuarCompra == 'n' || continuarCompra == 'N') {
									break;
								}
							}

						} else if (estoqueEscolhido > listaProdutos.get(x).getEstoque()) {
							limpaTela();
							System.out.print("\n\n<Desculpe, estoque indispon�vel - Escolha novamente!!>\n\n");
							// para (x=0; x<10; x++){
							// estoqueEscolhido[x]=0
							// }

							contador(5);
							QUANTIDADE++; // roda o para de novo
							// estoqueEscolhido[x] = 0;
							break;
						} else if (estoqueEscolhido <= 0) {
							limpaTela();
							System.out.print("\nQuantidade inv�lida - Escolha novamente!!\n\n");

							contador(5);
							QUANTIDADE++; // roda o para de novo
							break;

						}
					} else if (!codigoEscolhido.equals(listaProdutos.get(0).getCodigoProduto())
							&& !codigoEscolhido.equals(listaProdutos.get(1).getCodigoProduto())
							&& !codigoEscolhido.equals(listaProdutos.get(2).getCodigoProduto())
							&& !codigoEscolhido.equals(listaProdutos.get(3).getCodigoProduto())
							&& !codigoEscolhido.equals(listaProdutos.get(4).getCodigoProduto())
							&& !codigoEscolhido.equals(listaProdutos.get(5).getCodigoProduto())
							&& !codigoEscolhido.equals(listaProdutos.get(6).getCodigoProduto())
							&& !codigoEscolhido.equals(listaProdutos.get(7).getCodigoProduto())
							&& !codigoEscolhido.equals(listaProdutos.get(8).getCodigoProduto())
							&& !codigoEscolhido.equals(listaProdutos.get(9).getCodigoProduto())) {
						limpaTela();
						QUANTIDADE++; // roda o para de novo
						System.out.print("\nProduto inv�lido\n\n");

						contador(5);
						limpaTela();
						break;

					}

				}

				if (continuarCompra == 's' || continuarCompra == 'S') {
					QUANTIDADE++; // roda o para de novo
					// System.out.println("ENTROU");
				} else if (continuarCompra == 'n' || continuarCompra == 'N') {

					System.out.print("..::|Livraria Gen|::..\n\n");
					System.out.print("\nValor a pagar: R$" + valorFinal);
					System.out.printf("\nEsse produto teve 9%% de tributos = R$%.2f", valorFinal * 0.09);

					// op��o de pagamento
					System.out.print("\n\n<Op��es de pagamento>");
					System.out.print(
							"\nOP��O (1) - A vista com 10% de desconto: R$" + (valorFinal - (valorFinal * 0.10)));
					System.out.print(
							"\nOP��O (2) - No cart�o com acrescimento de 10%: R$" + (valorFinal + (valorFinal * 0.10)));
					System.out.print("\nOP��O (3) - Em 2x(acrescimento de 15%): R$" + (valorFinal + (valorFinal * 0.15))
							+ " 2 vezes de R$ " + ((valorFinal + (valorFinal * 0.15)) / 2));
					System.out.print("\n\nDigite a op��o que voc� prefere: ");
					leia.nextLine();
					opcaoPgto = leia.next().charAt(0);
					limpaTela();

					// Se usu�rio digitar errado pede de novo
					while (opcaoPgto != '1' && opcaoPgto != '2' && opcaoPgto != '3') {
						limpaTela();// ()----------------FAZER O LIMPA NO JAVA
						System.out.print("<Op��o Inv�lida, digite (1),(2) ou (3)>\n\n");
						System.out.print("<Op��es de pagamento>");
						System.out.print(
								"\nOP��O (1) - A vista com 10% de desconto: R$" + (valorFinal - (valorFinal * 0.10)));
						System.out.print("\nOP��O (2) - No cart�o com acrescimento de 10%: R$"
								+ (valorFinal + (valorFinal * 0.10)));
						System.out.print(
								"\nOP��O (3) - Em 2x(acrescimento de 15%): R$" + (valorFinal + (valorFinal * 0.15))
										+ " 2 vezes de R$ " + ((valorFinal + (valorFinal * 0.15)) / 2));
						System.out.print("\n\nDigite a op��o que voc� prefere: ");
						leia.nextLine();
						opcaoPgto = leia.next().charAt(0);
						limpaTela();

					}

					if (opcaoPgto == '1') {

						for (int i = 0; i < listaCarrinho.size(); i++) { // PERCORRE O CARRINHO
							for (int a = 0; a < listaProdutos.size(); a++) { // PERCORRE A LISTA DE PRODUTOS
								if (listaProdutos.get(a).getCodigoProduto() == listaCarrinho.get(i)
										.getCodigoProduto()) {
									listaProdutos.get(a).retirarEstoque(listaCarrinho.get(i).getEstoque());

								}
							}
						}

						// limpa o carrinho depois da compra

						System.out
								.print("!!!!!PARAB�NS PELA COMPRA - APROVEITE O(S) LIVRO(S) - VOLTE SEMPRE!!!!!!\n\n");
						System.out
								.print("==========================================================================\n");
						System.out.print("CUPOM FISCAL\n");
						System.out.print("ITEM:\t                        C�DIGO\t\t QUANT\t TOTAL UNIT\n");
						for (Produtos carrinho : listaCarrinho) {
							System.out.println(carrinho.getNomeProduto() + "\t" + carrinho.getCodigoProduto() + "\t    "
									+ "\t    " + carrinho.getEstoque() + "\t   R$"
									+ carrinho.getValorProduto());
						}
						System.out.print("\n");
						System.out.print("IMPOSTO\t FORMA DE PAGAMENTO\n");
						System.out.print("9%\t   A/V (-10%)\n\n");
						System.out.print("VALOR TOTAL\n");
						System.out.print("R$" + (valorFinal - (valorFinal * 0.10)) + "\n");
						System.out.print(
								"==========================================================================\n\n");

						listaCarrinho.clear();
						contador(15);
						limpaTela();

						continuarCompra = 'x';
						QUANTIDADE = 1;
						valorFinal = 0;
						opcaoPgto = 'x';

					} else if (opcaoPgto == '2') {
						for (int i = 0; i < listaCarrinho.size(); i++) {
							for (int a = 0; a < listaProdutos.size(); a++) {
								if (listaProdutos.get(a).getCodigoProduto() == listaCarrinho.get(i)
										.getCodigoProduto()) {
									listaProdutos.get(a).retirarEstoque(listaCarrinho.get(i).getEstoque());
								}
							}
						}

						// limpa o carrinho depois da compra

						System.out
								.print("!!!!!PARAB�NS PELA COMPRA - APROVEITE O(S) LIVRO(S) - VOLTE SEMPRE!!!!!!\n\n");
						System.out
								.print("==========================================================================\n");
						System.out.print("CUPOM FISCAL\n");
						System.out.print("ITEM:\t                        C�DIGO\t\t QUANT\t TOTAL UNIT\n");
						for (Produtos carrinho : listaCarrinho) {
							System.out.println(carrinho.getNomeProduto() + "\t" + carrinho.getCodigoProduto() + "\t    "
									+ "\t    " + carrinho.getEstoque() + "\t   R$"
									+ carrinho.getValorProduto());
						}
						System.out.print("\n");
						System.out.print("IMPOSTO\t FORMA DE PAGAMENTO\n");
						System.out.print("9%\t   C/C  (+10%)\n\n");
						System.out.print("VALOR TOTAL\n");
						System.out.print("R$" + (valorFinal + (valorFinal * 0.10)) + "\n");
						System.out.print(
								"==========================================================================\n\n");

						listaCarrinho.clear();
						contador(15);
						limpaTela();

						continuarCompra = 'x';
						QUANTIDADE = 1;
						valorFinal = 0;
						opcaoPgto = 'x';

					} else if (opcaoPgto == '3') {
						for (int i = 0; i < listaCarrinho.size(); i++) {
							for (int a = 0; a < listaProdutos.size(); a++) {
								if (listaProdutos.get(a).getCodigoProduto() == listaCarrinho.get(i)
										.getCodigoProduto()) {
									listaProdutos.get(a).retirarEstoque(listaCarrinho.get(i).getEstoque());
								}
							}

						}

						// limpa o carrinho depois da compra

						System.out
								.print("!!!!!PARAB�NS PELA COMPRA - APROVEITE O(S) LIVRO(S) - VOLTE SEMPRE!!!!!!\n\n");
						System.out
								.print("==========================================================================\n");
						System.out.print("CUPOM FISCAL\n");
						System.out.print("ITEM:\t                        C�DIGO\t\t QUANT\t TOTAL UNIT\n");
						for (Produtos carrinho : listaCarrinho) {
							System.out.println(carrinho.getNomeProduto() + "\t" + carrinho.getCodigoProduto() + "\t    "
									+ "\t    " + carrinho.getEstoque() + "\t   R$"
									+ carrinho.getValorProduto());
						}
						System.out.print("\n");
						System.out.print("IMPOSTO\t FORMA DE PAGAMENTO\n");
						System.out.print("9%\t   2x C/C (+15%)\n\n");
						System.out.print("VALOR TOTAL\n");
						System.out.print("Em 2x(acrescimento de 15%): R$" + (valorFinal + (valorFinal * 0.15))
								+ " 2 vezes de R$" + ((valorFinal + (valorFinal * 0.15)) / 2 + "\n"));
						System.out.print(
								"==========================================================================\n\n");

						listaCarrinho.clear();
						contador(15);
						limpaTela();

						continuarCompra = 'x';
						QUANTIDADE = 1;
						valorFinal = 0;
						opcaoPgto = 'x';

					} else {
						limpaTela();
						System.out.print("\nEntrar com op��o v�lida\n.");
					}

					break;
				}
			}
		}
	} // fecha enquanto geral

	// LIMPA A TELA EMPURRANDO O TEXTO PRA CIMA
	public static void limpaTela() {
		for (int x = 1; x < 10000; x++) {
			System.out.println(" ");
		}
	}

	public static void contador(int segundos) {

		int contador = segundos;

		System.out.print("Voc� ser� redirecionado em ");
		while (contador > 0) {
			System.out.print(".." + contador); // Escreve os n�meros enquanto o la�o roda
			contador = contador - 1;

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// limpaTela();// limpa o conte�do no final da contagem

	}

	public static void admin(List<Produtos> produto) {
		limpaTela();

		char op = 'x';
		String codEscolhido = "";
		int inserir = 0, retirar = 0;

		Scanner leia = new Scanner(System.in);

		while (true) {
			limpaTela();
			System.out.println("BEM VINDE, QUERIDE ADMIN. AQUI VOC� PODE ALTERAR O ESTOQUE!\n");
			System.out.print("DIGTE > 1 - Inserir estoque | > 2 - Retirar estoque: ");
			op = leia.next().charAt(0);
			limpaTela();
			if (op == '1') {
				System.out.print("C�digo:\tLivros:\t\t\t\t\tValores:\tEstoque:\n");
				for (int y = 0; y < produto.size(); y++) {
					System.out.println(produto.get(y));
				}
				System.out.println("");
				System.out.println("");
				System.out.print("Digite o c�digo do produto que deseja inserir no estoque: ");
				codEscolhido = leia.next().toUpperCase();
				limpaTela();
				for (int x = 0; x < produto.size(); x++) {
					if (codEscolhido.equals(produto.get(x).getCodigoProduto())) {
						System.out.print("Quanto produtos deseja inserir no estoque?: ");
						inserir = leia.nextInt();
						limpaTela();
						produto.get(x).inserirEstoque(inserir);

					}
				}
			}

			else if (op == '2') {
				System.out.print("C�digo:\tLivros:\t\t\t\t\tValores:\tEstoque:\n");
				for (int y = 0; y < produto.size(); y++) {
					System.out.println(produto.get(y));
				}
				System.out.println("");
				System.out.println("");
				System.out.print("Digite o c�digo do produto que deseja retirar do estoque: ");
				codEscolhido = leia.next().toUpperCase();
				limpaTela();
				for (int x = 0; x < produto.size(); x++) {
					if (codEscolhido.equals(produto.get(x).getCodigoProduto())) {
						System.out.print("Quanto produtos deseja retirar do estoque?: ");
						retirar = leia.nextInt();
						limpaTela();
						produto.get(x).retirarEstoque(retirar);

					}
				}
			}

			
			System.out.println("Deseja continuar alterando o estoque?");
			System.out.print("> 1 - sim | > 2 - n�o: ");
			op = leia.next().charAt(0);
			if (op == '2') {
				break;
			}
		}

	}
}
			
	
		






	

