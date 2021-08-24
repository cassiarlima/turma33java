programa
{
	
	funcao inicio()
	{
		cadeia nome
		cadeia resposta
		real auxilioEmergencial, chefe

		escreva("Digite o seu nome : ")
		leia(nome)

		escreva( "Você é a chefe de familia ? ")
		leia(resposta) 

		//cálculo
		auxilioEmergencial = 600.00
		chefe = (600.00*2.00)

		
		se (resposta == "sim") {
			escreva ("Olá " +nome+ "voce vai receber" +chefe+ "reais.")
		
		}
		senao {
			escreva ("Olá" +nome+ "você vai receber" +auxilioEmergencial+ "reais.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 476; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */