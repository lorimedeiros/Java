[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/9H23GAE7)
**Universidade Federal da Paraíba - UFPB** \
**Centro de Ciências Exatas e Educação - CCAE** \
**Departamento de Ciências Exatas - DCX**

**Professor:** [Rodrigo Rebouças de Almeida](http://rodrigor.dcx.ufpb.br)

# Atividade Banco - Saldo - Transações - Aberta

Implemente as classes necessárias para as seguintes funcionalidades de um 
sistema bancário:

- Criar uma conta corrente;
- Fazer o crédito de um valor em uma conta corrente;
- Fazer o débito de um valor em uma conta corrente;
- Obter o saldo de uma conta corrente;
- Tanto a conta corrente quanto o correntista pertencem a um Banco.
- Um Banco possui um nome e um código.
- Listar as transações de crédito e débito da conta.
- Uma conta não deve permitir o saque se não houver saldo suficiente.
  - A conta deve lançar uma exceção.

Um Correntista possui nome, cpf e data de nascimento. Uma conta corrente possui um número e um ou 
mais correntistas.


Observação: os valores financeiros devem usar a classe BigDecimal.