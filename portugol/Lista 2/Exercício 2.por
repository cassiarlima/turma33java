programa
{
	
	funcao inicio()
	{
		//2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
		//horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
		//por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
		//armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
		//trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
		//excedente.

		real C,N,E,valorTotal,valorExcesso,valorFinal

	     escreva("Informe seu código: ")
		leia(C)
		escreva ("Quantas horas você trabalhou ? ")
		leia(N)
		se (N<50.00){
			valorTotal = (N*10.00)
			escreva ("Querida(o) funcionário seu salário será de R$ " +valorTotal+ " você não possui horas extras/excedentes.")
		}

		senao{ 
		    E= (N-50.00)
		    valorExcesso = (E*20.00)
		    valorTotal = (50*10.00)
		    valorFinal = (valorTotal + valorExcesso)
		    escreva ("Querida(o) funcionário  seu salário é de R$ " +valorTotal+ " reais. Você possui horas excedentes no total de R$ " +valorExcesso+ " reais. Seu salário final é de R$ " +valorFinal+ "reais.")
		}
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1101; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */