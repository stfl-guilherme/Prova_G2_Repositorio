## Prova G2 de Programação Orientada a Objetos
//Aluno - Guilherme Stefanello Lima
// aqui estão presentes a estrutura , organização e explicção da avaliação
// leia o documento como código

//modelo
Remetente
- Nome
- Telefone
# getNome


Encomenda
- Descricao
- Peso
- Remetente
# getPeso

Abstrata - Envio
- Encomenda
- data
- precoBase
# metodo abstrato - calcularTotal
# metodo getPrecoBase
# metodo getEncomenda

Envio/Expresso
# calcularTotal, quando o peso passar de 10 kg, cobra 15 por kg excedente + precoBase

Envio/Economico
# calcularTotal, frete é o preco base puro

Envio/Internacional
# calcularTotal, precoBase é multiplicado por 2,5

//controle
Central
- ArrayList envios
# adicionarEnvio
# getEnvios


//relatorio
-alto_Nivel
FechamentoDoDia
# faturamentoDoDia
# envioMaisCaro

Interface - DestinoRelatorio
# void enviar(String conteudo)

-baixo_Nivel
ArquivoDestino
# SalvarArquivo

ConsoleDestino
# System.out.println(String Conteudo)


//app
- Principal


//exceptions
- EnvioSemEncomendaException
- PrecoNegativoException
- PesoNegativoException


Regras de Negócio
# Envio sem Encomenda não pode existir, EnvioSemEncomendaException
# Preco e Peso negativos não podem existir, PrecoNegativoException, PesoNegativoException
# Nenhum dado pode ser alterado por fora da classe


    // S - Resposabilidade Unica
    // O - Aberto Fechado
    // L - A filha pode substituir a mãe
    // I - não deve ter metodos que não estão sendo utilizados
    // D - Alto nivel e Baixo nivel não devem depender de uma a outra, devem ter uma interface como intermediador

-------------------------------------------

## Explicação de Onde cada Pilar de SOLID é aplicado

S - Resposabilidade Unica 
- Cada classe criada tem uma função e apenas um motivo para mudar

O - Aberto Fechado
- Como solicitado na prova, para novos tipos de envio nenhum arquivo pode ser editado para a criação de um novo
respeitando o principio Aberto para expansão e fechado para modificação

L - A filha pode substituir a mãe
- Toda classe 'Filha' Envio - Expresso, Economico e Internacional entra em Envios da Central, sendo assim possivel a substituição

I - O Remetente não deve ser obrigado a ter métodos e interfaces que não usa, 
- a interface tem apenas um metodo o de enviar

D - Alto nivel e Baixo nivel não devem depender de uma a outra, devem ter uma interface como intermediador
- O baixo nivel prescrito acima não tem contato direto com o alto nivel, o baixo nivel só tem a função de mostrar, o intermediador vulgo interface apenas envia a construção do documento para o Baixo nivel, e o alto nivel apenas monta o Relatorio.

# porque usar um interface?
- como foi dito na avaliação o dono não quer que a central escolha então significa que essa saida pode modar, a interface apenas manda oq a classe de alto nivel fazer, sem saber que classe que é para o baixo nivel.

# porque o Envio é Abstrato?
- cada tipo de envio molda a sua classe conforme as especs