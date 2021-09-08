package gen_ecommerce_JAVA;

	import java.util.Scanner;
	import java.util.concurrent.TimeUnit;

	public class gen_ecommerce_Java {

		public static void main(String[] args) {

	
			Scanner leia = new Scanner(System.in);

			String nomeProdutos[] = new String[10];
			nomeProdutos[0] = "Mindset                       ";
			nomeProdutos[1] = "Poder do hábito               ";
			nomeProdutos[2] = "O segredo                     ";
			nomeProdutos[3] = "O corpo fala                  ";
			nomeProdutos[4] = "Pai rico pai pobre            ";
			nomeProdutos[5] = "O milagre da manhã            ";
			nomeProdutos[6] = "Comunicação não violenta      ";
			nomeProdutos[7] = "O poder do agora              ";
			nomeProdutos[8] = "O homem mais rico da babilônia";
			nomeProdutos[9] = "Quem mexeu no meu queijo      ";

			String codigoProdutos[] = new String[10], codigoEscolhido = "x";
			codigoProdutos[0] = "G3-1";
			codigoProdutos[1] = "G3-2";
			codigoProdutos[2] = "G3-3";
			codigoProdutos[3] = "G3-4";
			codigoProdutos[4] = "G3-5";
			codigoProdutos[5] = "G3-6";
			codigoProdutos[6] = "G3-7";
			codigoProdutos[7] = "G3-8";
			codigoProdutos[8] = "G3-9";
			codigoProdutos[9] = "G3-10";

			int estoque[] = new int[10];
			estoque[0] = 10;
			estoque[1] = 10;
			estoque[2] = 10;
			estoque[3] = 10;
			estoque[4] = 10;
			estoque[5] = 10;
			estoque[6] = 10;
			estoque[7] = 10;
			estoque[8] = 10;
			estoque[9] = 10;

			int estoqueEscolhido[] = new int[10];
			estoqueEscolhido[0] = 0;
			estoqueEscolhido[1] = 0;
			estoqueEscolhido[2] = 0;
			estoqueEscolhido[3] = 0;
			estoqueEscolhido[4] = 0;
			estoqueEscolhido[5] = 0;
			estoqueEscolhido[6] = 0;
			estoqueEscolhido[7] = 0;
			estoqueEscolhido[8] = 0;
			estoqueEscolhido[9] = 0;

			double valoresdosProdutos[] = new double[10];
			valoresdosProdutos[0] = 30.00;
			valoresdosProdutos[1] = 30.00;
			valoresdosProdutos[2] = 50.00;
			valoresdosProdutos[3] = 30.00;
			valoresdosProdutos[4] = 40.00;
			valoresdosProdutos[5] = 20.00;
			valoresdosProdutos[6] = 60.00;
			valoresdosProdutos[7] = 30.00;
			valoresdosProdutos[8] = 15.00;
			valoresdosProdutos[9] = 15.00;

			String carrinho[] = new String[10];
			carrinho[0] = " ";
			carrinho[1] = " ";
			carrinho[2] = " ";
			carrinho[3] = " ";
			carrinho[4] = " ";
			carrinho[5] = " ";
			carrinho[6] = " ";
			carrinho[7] = " ";
			carrinho[8] = " ";
			carrinho[9] = " ";

			int QUANTIDADE = 1; // Controla o laço de compra

			// Variáveis
			// -----------------------------------------------------------------------------
			double valorTotal = 0.0, valorFinal = 0.0;
			int x = 0;
			char desejaComprar = 'x', continuarCompra = 'x', opcaoPgto = 'x';
			// ---------------------------------------------------------------------------------------

			// ----------------------------------------PARTE
			// LEILA-------------------------------------------------------------

			// TELA INICIAL DO E-COMMERCE
			// ------------------------------------------------------------
			while (opcaoPgto == 'x') {
				System.out.print("..::|Livraria Gen|::..\n"); // nome da loja
				System.out.print("Leia um livro e vá além\n\n");// nome do slogan

				System.out.print("Olá, deseja fazer uma compra ? Sim(S)/Não(N): ");
				desejaComprar = leia.next().charAt(0);

				limpaTela();

				while (desejaComprar != 'S' && desejaComprar != 's' && desejaComprar != 'N' && desejaComprar != 'n') {
					System.out.print("<Opção Inválida, escreva (S) ou (N)>\n\n");
					System.out.print("Olá, deseja fazer uma compra ? Sim(S)/Não(N): ");
					leia.nextLine();
					desejaComprar = leia.next().charAt(0);

					limpaTela();
				}

			

				for (int y = 0; y < QUANTIDADE; y++) {

					// MOSTRA A LISTA DE PRODUTOS
					if (desejaComprar == 's' || desejaComprar == 'S') {
						System.out.print("Código:\tLivros:\t                       Valores:\tEstoque:\n");

						for (x = 0; x < 10; x++) {
							System.out.print(codigoProdutos[x] + "\t" + nomeProdutos[x] + "\t" + valoresdosProdutos[x]
									+ "\t" + estoque[x] + "\n");
						}

						System.out.print("\n");
					} else {
						System.out.print("\n\nATÉ BREVE!!!!");
						opcaoPgto = '0'; // Finaliza o laço ENQUANTO
						break;
					}

					
					System.out.print("Selecione o código do produto que você deseja: ");
					leia.nextLine();
					codigoEscolhido = leia.next();

					// MOSTRA O PRODUTO SELECIONADO SELECIONA A QUANTIDADE E ADICIONA NO CARRINHO

					for (x = 0; x < 10; x++) {
						if (codigoEscolhido.equals(codigoProdutos[x])) {
							limpaTela();
							System.out.print("<LIVRO ESCOLHIDO>\n\n");
							System.out.print("Código:\tLivro:\t                        Valores:\tEstoque:\n");
							System.out.print(codigoProdutos[x] + "\t" + nomeProdutos[x] + "\tR$" + valoresdosProdutos[x]
									+ "\t         " + estoque[x] + "\n");
							System.out.print("\n");

							System.out.print("Digite a quantidade necessária: ");
							leia.nextLine();
							estoqueEscolhido[x] = leia.nextInt();

							if (estoqueEscolhido[x] <= estoque[x] && carrinho[x].equals(" ") && estoqueEscolhido[x] > 0) {
								limpaTela();

								System.out.print("<CARRINHO>\n\n");
								System.out.print("Código:\tLivro:\t                      Valor:\tQuantidade:\n");
								carrinho[x] = codigoProdutos[x] + "\t" + nomeProdutos[x] + "\tR$"
										+ (valoresdosProdutos[x] * estoqueEscolhido[x]) + "\t   " + estoqueEscolhido[x]
										+ "\n";

								for (int c = 0; c < 10; c++) {
									if (!carrinho[c].equals(" ")) {
										System.out.print(carrinho[c]);
										valorTotal = valoresdosProdutos[x] * estoqueEscolhido[x];
									}
								}
								System.out.print("\n");

								valorFinal = valorTotal + valorFinal;

								System.out.print("Continuar a compra ? Sim(S)/Não(N): ");
								continuarCompra = leia.next().charAt(0);
								limpaTela();// Limpa para a lista de produtos
								while (continuarCompra != 'S' && continuarCompra != 's' && continuarCompra != 'N'
										&& continuarCompra != 'n') {
									System.out.print("<Opção Inválida, escreve (S) ou (N)>\n\n");
									System.out.print("Continuar a compra ? Sim(S)/Não(N): ");
									continuarCompra = leia.next().charAt(0);
									limpaTela();
								}
								while (!carrinho[0].equals(" ") && !carrinho[1].equals(" ") && !carrinho[2].equals(" ")
										&& !carrinho[3].equals(" ") && !carrinho[4].equals(" ") && !carrinho[5].equals(" ")
										&& !carrinho[6].equals(" ") && !carrinho[7].equals(" ") && !carrinho[8].equals(" ")
										&& !carrinho[9].equals(" ")) {
									System.out.print("Carrinho cheio, finalize sua compra");

									System.out.print("\nContinuar a compra ? Sim(S)/Não(N) ");
									continuarCompra = leia.next().charAt(0);
									limpaTela();
									if (continuarCompra == 'n' || continuarCompra == 'N') {
										break;
									}
								}
							} else if (estoqueEscolhido[x] > estoque[x]) {
								limpaTela();
								System.out.print("\n\n<Desculpe, estoque indisponível - Escolha novamente!!>\n\n");
								// para (x=0; x<10; x++){
								// estoqueEscolhido[x]=0
								// }

								// contagem(5) //contagem regressiva de 5 segundos/ Já tem o "limpa()" no final
								contador(5);
								QUANTIDADE++; // roda o para de novo
								estoqueEscolhido[x]=0;
								break;
							} else if (!carrinho[x].equals(" ")) {
								limpaTela();
								System.out
										.print("\n\n<Não é possível adicionar dois produtos iguais. Escolha outro!!>\n\n");

								// contagem(5) //contagem regressiva de 5 segundos/ Já tem o "limpa()" no final
								contador(5);
								QUANTIDADE++; // roda o para de novo
								break;
							} else if (estoqueEscolhido[x] <= 0) {
								limpaTela();
								System.out.print("\nQuantidade inválida - Escolha novamente!!\n\n");

								// contagem(5) //contagem regressiva de 5 segundos/ Já tem o "limpa()" no final
								contador(5);
								QUANTIDADE++; // roda o para de novo
								break;

							}
						} else if (!codigoEscolhido.equals(codigoProdutos[0]) && !codigoEscolhido.equals(codigoProdutos[1])
								&& !codigoEscolhido.equals(codigoProdutos[2]) && !codigoEscolhido.equals(codigoProdutos[3])
								&& !codigoEscolhido.equals(codigoProdutos[4]) && !codigoEscolhido.equals(codigoProdutos[5])
								&& !codigoEscolhido.equals(codigoProdutos[6]) && !codigoEscolhido.equals(codigoProdutos[7])
								&& !codigoEscolhido.equals(codigoProdutos[8])
								&& !codigoEscolhido.equals(codigoProdutos[9])) {
							limpaTela();
							QUANTIDADE++; // roda o para de novo
							System.out.print("\nProduto inválido\n\n");
							// contagem(5) //contagem regressiva de 5 segundos / Já tem o "limpa()" no final
							contador(5);
							break;

						}

					}

					if (continuarCompra == 's' || continuarCompra == 'S') {
						QUANTIDADE++; // roda o para de novo
						System.out.println("ENTROU");

					} else if (continuarCompra == 'n' || continuarCompra == 'N') {

						System.out.print("..::|Livraria Gen|::..\n\n");
						System.out.print("\nValor a pagar: R$" + valorFinal);
						System.out.printf("\nEsse produto teve 9%% de tributos = R$%.2f", valorFinal * 0.09);

						// opção de pagamento
						System.out.print("\n\n<Opções de pagamento>");
						System.out.print(
								"\nOPÇÃO (1) - A vista com 10% de desconto: R$" + (valorFinal - (valorFinal * 0.10)));
						System.out.print(
								"\nOPÇÃO (2) - No cartão com acrescimento de 10%: R$" + (valorFinal + (valorFinal * 0.10)));
						System.out.print("\nOPÇÃO (3) - Em 2x(acrescimento de 15%): R$" + (valorFinal + (valorFinal * 0.15))
								+ " 2 vezes de R$ " + ((valorFinal + (valorFinal * 0.15)) / 2));
						System.out.print("\n\nDigite a opção que você prefere: ");
						leia.nextLine();
						opcaoPgto = leia.next().charAt(0);

						while (opcaoPgto != '1' && opcaoPgto != '2' && opcaoPgto != '3') {
							limpaTela();//()----------------FAZER O LIMPA NO JAVA
							System.out.print("<Opção Inválida, digite (1),(2) ou (3)>\n\n");
							System.out.print("<Opções de pagamento>");
							System.out.print(
									"\nOPÇÃO (1) - A vista com 10% de desconto: R$" + (valorFinal - (valorFinal * 0.10)));
							System.out.print("\nOPÇÃO (2) - No cartão com acrescimento de 10%: R$"
									+ (valorFinal + (valorFinal * 0.10)));
							System.out.print(
									"\nOPÇÃO (3) - Em 2x(acrescimento de 15%): R$" + (valorFinal + (valorFinal * 0.15))
											+ " 2 vezes de R$ " + ((valorFinal + (valorFinal * 0.15)) / 2));
							System.out.print("\n\nDigite a opção que você prefere: ");
							leia.nextLine();
							opcaoPgto = leia.next().charAt(0);
						}

						
						if (opcaoPgto == '1') {
							limpaTela();//() entender uma maneira de fazer
							System.out
									.print("!!!!!PARABÉNS PELA COMPRA - APROVEITE O(S) LIVRO(S) - VOLTE SEMPRE!!!!!!\n\n");
							System.out
									.print("==========================================================================\n");
							System.out.print("CUPOM FISCAL\n");
							System.out.print("ITEM:\t                        CÓDIGO\t  VL UNIT\t QUANT\t TOTAL UNIT\n");
							for (x = 0; x < 10; x++) {
								if (estoqueEscolhido[x] != 0 && (estoque[x] - estoqueEscolhido[x]) >= 0
										&& estoqueEscolhido[x] > 0) {

									System.out.println(nomeProdutos[x] + "\t" + codigoProdutos[x] + "\t   R$"
											+ valoresdosProdutos[x] + "\t   " + estoqueEscolhido[x] + "\t  R$"
											+ (valoresdosProdutos[x] * estoqueEscolhido[x]) + "\n");
								}
							}
							System.out.print("\n");
							System.out.print("IMPOSTO\t FORMA DE PAGAMENTO\n");
							System.out.print("9%\t   A/V (-10%)\n\n");
							System.out.print("VALOR TOTAL\n");
							System.out.print("R$" + (valorFinal - (valorFinal * 0.10)) + "\n");
							System.out.print(
									"==========================================================================\n\n");

							// contagem(15) //contagem regressiva de 10 segundos/ Já tem o "limpa()" no
							contador(15);
							// final

							for (x = 0; x < 10; x++) {
								estoque[x] = estoque[x] - estoqueEscolhido[x];
								if (estoque[x] < 0 || estoque[x] > 10) {
									estoque[x] = estoque[x] + estoqueEscolhido[x];
								}
								estoqueEscolhido[x] = 0;
								carrinho[x] = " ";
								continuarCompra = 'x';
								QUANTIDADE = 2;
								valorFinal = 0;
								opcaoPgto = 'x';
							}

						}

						else if (opcaoPgto == '2') {

							limpaTela();//() entender como faz
							System.out
									.print("!!!!!PARABÉNS PELA COMPRA - APROVEITE O(S) LIVRO(S) - VOLTE SEMPRE!!!!!!\n\n");
							System.out
									.print("==========================================================================\n");
							System.out.print("CUPOM FISCAL\n");
							System.out.print("ITEM:\t                        CÓDIGO\t  VL UNIT\t QUANT\t TOTAL UNIT\n");

							for (x = 0; x < 10; x++) {
								if (estoqueEscolhido[x] != 0 && (estoque[x] - estoqueEscolhido[x]) >= 0
										&& estoqueEscolhido[x] > 0) {

									System.out.println(nomeProdutos[x] + "\t" + codigoProdutos[x] + "\t   R$"
											+ valoresdosProdutos[x] + "\t   " + estoqueEscolhido[x] + "\t  R$"
											+ (valoresdosProdutos[x] * estoqueEscolhido[x]) + "\n");
								}
							}
							System.out.print("\n");
							System.out.print("IMPOSTO\t FORMA DE PAGAMENTO\n");
							System.out.print("9%\t   C/C (+10%)\n\n");
							System.out.print("VALOR TOTAL\n");
							System.out.print("R$" + (valorFinal + (valorFinal * 0.10)) + "\n");
							System.out.print(
									"==========================================================================\n\n");

							// contagem(15) //contagem regressiva de 5 segundos/ Já tem o "limpa()" no final
							contador(15);
							
							for (x = 0; x < 10; x++) {
								estoque[x] = estoque[x] - estoqueEscolhido[x];
								if (estoque[x] < 0 || estoque[x] > 10) {
									estoque[x] = estoque[x] + estoqueEscolhido[x];
								}
								estoqueEscolhido[x] = 0;
								carrinho[x] = " ";
								continuarCompra = 'x';
								QUANTIDADE = 2;
								valorFinal = 0;
								opcaoPgto = 'x';
							}
						}

						else if (opcaoPgto == '3') {
							limpaTela();
							System.out
									.print("!!!!!PARABÉNS PELA COMPRA - APROVEITE O(S) LIVRO(S) - VOLTE SEMPRE!!!!!!\n\n");
							System.out
									.print("==========================================================================\n");
							System.out.print("CUPOM FISCAL\n");
							System.out.print("ITEM:\t                        CÓDIGO\t  VL UNIT\t QUANT\t TOTAL UNIT\n");
							for (x = 0; x < 10; x++) {
								if (estoqueEscolhido[x] != 0 && (estoque[x] - estoqueEscolhido[x]) >= 0
										&& estoqueEscolhido[x] > 0 && estoqueEscolhido[x] > 0) {
									System.out.print(nomeProdutos[x] + "\t" + codigoProdutos[x] + "\t   R$"
											+ valoresdosProdutos[x] + "\t   " + estoqueEscolhido[x] + "\t  R$"
											+ (valoresdosProdutos[x] * estoqueEscolhido[x]) + "\n");
								}
							}
							System.out.print("\n");
							System.out.print("IMPOSTO\t FORMA DE PAGAMENTO\n");
							System.out.print("9%\t   2x C/C (+15%)\n\n");
							System.out.print("VALOR TOTAL\n");
							System.out.print("R$" + (valorFinal + (valorFinal * 0.15)) + " - Duas vezes de (R$"
									+ ((valorFinal + (valorFinal * 0.15)) / 2) + ")\n");
							System.out.print(
									"==========================================================================\n\n");

							// contagem(15) //contagem regressiva de 5 segundos/ Já tem o "limpa()" no final
							contador(15);
							
							for (x = 0; x < 10; x++) {
								estoque[x] = estoque[x] - estoqueEscolhido[x];
								if (estoque[x] < 0 || estoque[x] > 10) {
									estoque[x] = estoque[x] + estoqueEscolhido[x];
								}
								estoqueEscolhido[x] = 0;
								carrinho[x] = " ";
								continuarCompra = 'x';
								QUANTIDADE = 2;
								valorFinal = 0;
								opcaoPgto = 'x';
							}

						} else {
							limpaTela();
							System.out.print("\nEntrar com opção válida\n.");
						}

						break;
					}

				} // fecha o para geral
			} // fecha enquanto geral
		}
		
		//LIMPA A TELA EMPURRANDO O TEXTO PRA CIMA
		public static void limpaTela() {
			for(int x=1; x<10000; x++) {
				System.out.println(" ");
			}
		}
		
		public static void contador(int segundos) {
			
			int contador = segundos;
			
			System.out.print("Você será redirecionado em ");
			while(contador>0) {
				System.out.print(".."+contador); //Escreve os números enquanto o laço roda
				contador = contador - 1;
				
				
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			limpaTela();// limpa o conteúdo no final da contagem
			
		}
		
	}


