programa
{
	
	funcao inicio()
	{
		inteiro nFilhos, tFilhos=0
		real salario, totalSalario=0.0, mSalario, maiorSalario=0.0, percSalario, mFilhos, salariomenor=0.0

		para (inteiro x=1; x<=20;x++){
			escreva("Digite o salario do participante ",x,": \n")
			leia(salario)
			escreva("Digite o numero de filhos do participante ",x," : \n")
			leia(nFilhos)
			tFilhos=tFilhos+nFilhos
			se (salario>maiorSalario){
				maiorSalario=salario
			}
			totalSalario=totalSalario+salario
			se (salario <=100){
				salariomenor=salariomenor+1
			}
		}
		mSalario=totalSalario/20.0
		escreva("\nA Média de salário da população é de :",mSalario)

		mFilhos=tFilhos/20.0
		escreva("\nA Média de filhos da população é de :",mFilhos)

		escreva("\nO maior salário é de ", maiorSalario)

		percSalario=(salariomenor/20)*100
		escreva("\n A quantidade de pessoas com salário menor que 100,00 é de :",percSalario,"%")
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 907; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */