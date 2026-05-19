# Exercício 04 — Sistema de Produtos

No seu pacote de exercícios, crie a classe `Product.java` e uma classe `MainProduct.java`.

A classe `Product` deve ter os atributos privados: `name` (String), `price` (double) e `quantity` (int).

- Crie um **Construtor Completo** que receba `name`, `price` e `quantity` para iniciar o produto com estoque
- Crie um **Segundo Construtor (Sobrecarga)** que receba apenas `name` e `price`. Nesse construtor, `quantity` deve ser definida automaticamente como `0` (indicando que o produto foi cadastrado, mas não tem estoque inicial)
- Crie apenas os **Getters** para todos os atributos
- Crie um método `addStock(int quantity)` para dar entrada no estoque depois

No arquivo `MainProduct.java`, instancie dois produtos:

- Um usando o primeiro construtor (ex: Playstation, R$ 4000, 5 unidades)
- Outro usando o segundo construtor (ex: Xbox, R$ 3500, sem passar a quantidade)

Imprima os dados de ambos no console para ver a diferença de comportamento.

---

## Verificação

**Se eu criar um construtor customizado na minha classe, o que acontece com aquele construtor padrão vazio (`new MinhaClasse()`) que o Java nos dava antes?**

O java deixa de cria-lo de forma dinâmica e passa a usar apenas o seus criados.

**Qual a principal vantagem arquitetural de usar um Construtor em vez de criar o objeto vazio e usar vários métodos `set` em seguida?**

Isso bloqueia situações onde uma conta possa ser criada sem referência nenhuma no seu sistema. Usuário pode criar a conta e logo depois sair.
