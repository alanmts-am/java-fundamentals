# Exercício 02 — Sistema de Vendas

Crie um arquivo chamado `Exercicio02.java`.

Você vai simular o checkout de um sistema de vendas:

- Crie um `ArrayList<String>` para armazenar os nomes dos produtos que o cliente comprou. Adicione pelo menos 4 produtos nele.
- Crie um loop (for-each) para listar todos os produtos do carrinho, imprimindo uma mensagem como: "Item: [Nome do Produto]".
- Use o método `.remove(0)` para simular que o cliente desistiu do primeiro item da lista.
- Imprima a lista atualizada para garantir que o item sumiu.

---

## Verificação

**Se eu precisar de uma estrutura para armazenar os 12 meses do ano, qual seria a escolha mais eficiente em termos de performance e semântica: um Array simples ou um ArrayList? Por quê?**

O array simples porque ele aloca exatamente o valor que eu precisaria e dificilmente os meses do ano vão mudar. 


**O que acontece se eu tentar acessar a posição `carrinho.get(10)` em uma lista que só tem 3 elementos?**

Ele vai disparar um erro de IndexOutOfBounds