programa
{
	
	funcao inicio()
	{
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.
		*/

		
		inteiro  m[3][3], somaValor=0 , diagonal=0, x=0, y=01
		

		para (x=0; x<3; x++){
			para (y=0; y<3; y++) {
			escreva (" Digite o valor das matrizes na linha " ,x, " e na coluna",y, ":" )
				leia(m[x][y])
				somaValor = somaValor + m[x][y]

				se (x==y){
					diagonal= diagonal+m[x][y]
				}
			}
		}
		escreva ("\nA soma total das matrizes é: " +somaValor)
		escreva ("\nA soma das diagonais é: "+diagonal)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 664; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */