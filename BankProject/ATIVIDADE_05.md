# Trabalho Bimestral

## Atividade 05

# 5) Considere uma classe chamada BankingAccount, e duas classes filhas desta, CheckingAccount e SavingsAccount. 
##### BankingAccount -> Conta 
##### CheckingAccount -> ContaCorrente 
##### SavingsAccount -> ContaPoupanca 
### Na classe BankingAccount existem os seguintes métodos: 
- extractByPeriod(Date initialDate, Date finalDate), que pode lançar uma Exception (Caso uma das datas sejam nulas). 

- getBankBalanceByDate(Date date) (saldo da Conta no dia informado, também lança exceção caso a data seja nula.) 

- cashOut(Double value) (Sacar Dinheiro, Deve Lançar exceção caso o valor do saque seja menor do que zero ou maior do que o saldo + limite cheque especial, caso em conta corrente.) 

- cashDeposit(Double value) (Depositar Dinheiro, Deve Lançar Exceção caso o valor do depósito seja menor do que zero.) 
- 
- Também existe o método abaixo, que deve ser adicionado em CheckingAccount. getOverdraftLimit() -> retorna o limite do especial para as contas correntes. 

Escreva e represente as classes de acordo com o que foi informado nas descrições acima. Implemente as funcionalidades propostas. Também escreva exceções personalizadas para cada ação. 
