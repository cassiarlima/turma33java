programa
{
	
			//*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
			//apresente no final o total do somatório, a média e o total de valores lidos. O programa
			//deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
			//positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
			//negativo.
			

    funcao inicio()
    {
        real somatorio=0.0, media, total=0.0, n=0.0

        enquanto (n>=0){
            escreva("Digite o numero a ser somado:")
            leia(n)
            se (n<0){
                pare
            }
            somatorio=somatorio+n
            total=total+1

        }
        escreva("A somatória dos numeros digitados é de: ",somatorio)
        media=somatorio/total
        escreva("\nA média dos valores digitados é de: ", media)
        escreva("\nO total de numeros digitados é de: ", total)
    }
}
	


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */