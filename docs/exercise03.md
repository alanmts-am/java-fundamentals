# Exercício 03 — Sistema Bancário

Crie uma estrutura com dois arquivos: `ContaBancaria.java` (classe de modelo) e `MainBanco.java` (onde você vai testar).

Na classe `ContaBancaria`, crie três atributos privados: `titular` (String), `numeroConta` (String) e `saldo` (double).

- Crie os métodos Getters e Setters para `titular` e `numeroConta`
- Para o `saldo`, crie apenas o Getter
- No lugar do Setter do saldo, crie dois métodos específicos:
  - `public void depositar(double valor)` — adiciona o valor ao saldo (se o valor for positivo)
  - `public void sacar(double valor)` — subtrai o valor do saldo (se o valor for positivo e se o saldo for suficiente)

No arquivo `MainBanco.java`, instancie uma conta, configure o titular, faça um depósito, tente fazer um saque maior que o saldo (para testar a validação) e imprima o saldo final na tela usando o getter.

---

## Verificação

**Por que a palavra-chave `this` é usada dentro de métodos como `this.nome = nome;`? Qual o propósito dela?**
Ela referencia o própio atributo da classe para diferenciar do atributo recebido no método

**Em termos de arquitetura e segurança de dados, qual a vantagem de deixar o saldo de uma conta sem um método `setSaldo` direto?**
Evita com que qualquer outra classe tenha acesso direto a modificar o saldo do cliente sem permissão
