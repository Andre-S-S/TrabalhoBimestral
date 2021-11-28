# Trabalho Bimestral

## Exercícios Sequenciais: 06 a 10

# 6) Crie uma classe chamada Pessoa. 
- Uma pessoa possui um nome e uma idade. 
- Crie 2 construtores: 1 que recebe o nome e a idade como parâmetros de entrada e um que não recebe parâmetros e inicializa os atributos com um valor padrão (“indefinido” para Strings e 0 para inteiros).
- Crie os métodos de acesso para os atributos (GET e SET).

# 7) Crie uma classe Amigo, que herda Pessoa, e possui uma data de aniversário. 
- Crie um construtor que não recebe parâmetros de entrada, e inicializa o atributo com um valor padrão (“indefinido”, por exemplo). 
- Crie os métodos de acesso para o atributo data de nascimento. 

# 8) Crie uma classe Conhecido, que herda Pessoa, e possui um e-mail. 
- Crie um construtor que não recebe parâmetros de entrada, e inicializa o e-mail com um valor padrão (“indefinido”, por exemplo). 
- Crie os métodos de acesso para este atributo.

# 9) Crie agora, uma classe Agenda, que possui pessoas (em um array) e dois atributos que controlam: a quantidade de amigos e a quantidade de conhecidos. 
- Crie um construtor que recebe por parâmetro a quantidade de pessoas que a agenda terá, e inicializa o array de Pessoa. 
Neste construtor, inicialize todas as posições do array criando ALEATORIAMENTE um Conhecido ou um Amigo 
(utilize o comando: 1 + (int) (Math.random() * 2) para sortear valores entre 1 e 2. Se o valor encontrado for 1, crie um Amigo. Se o valor encontrado for 2, crie um Conhecido). 
- Crie os métodos GET para todos os atributos da classe Agenda. 
- Crie um método chamado addInformacoes, que não recebe parâmetros de entrada. Para cada Pessoa na agenda, peça para o usuário digitar (via teclado) as informações cabíveis para cada tipo de Pessoa, e acesse os métodos SET para atribuir as informações. 
- Crie um método chamado imprimeAniversarios(), que imprime os aniversários de todos os amigos que estão armazenados na agenda. 
- Crie um método chamado imprimeEmail(), que imprime os e-mails de todos os conhecidos que estão armazenados na agenda.

# 10) Crie uma classe de teste para a Agenda. 
- Peça para o usuário informar (via teclado) quantas pessoas ele deseja colocar na agenda, e crie uma Agenda com esta informação. 
- Imprima na tela a quantidade de amigos e de conhecidos na agenda. 
- Adicione informações à agenda.
- Imprima todos os aniversários dos amigos presentes na agenda. 
- Imprima todos os e-mails dos conhecidos armazenados na agenda.
