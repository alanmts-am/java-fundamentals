# Exercício 05 — Interfaces, Herança e Polimorfismo

Crie uma interface chamada `Tributavel` com um único método: `double calcularImposto();`.

Refatore a classe `Product` (ou crie uma nova para esse exercício) para que ela implemente a interface `Tributavel`. A regra de imposto do `Product` padrão será de **10% sobre o preço**.

Crie uma classe filha `ProductImported` que herda (`extends`) de `Product`:

- Adicione um atributo privado `customsFee` (taxa de importação, ex: R$ 50,00)
- Faça o `@Override` do método `calcularImposto()` com a regra: **10% do preço + a taxa de importação**

No `main`, crie um `ArrayList<Product>` com um produto normal e um importado. Rode um loop `for-each` na lista e imprima o imposto de cada um chamando `.calcularImposto()`.

> **Reflexão:** o loop trata tudo como `Product`, mas o Java sabe exatamente qual método chamar em tempo de execução — isso é Polimorfismo.

---

## Verificação

**Qual a diferença conceitual entre Herança (`extends`) e Interface (`implements`)? Quando escolher uma em vez da outra?**

Herança é quando vc precisa criar subgrupos dentro de um conceito de objeto que vc criou como Animais e dentro dele Aves, por exemplo. Já a interface serve para lidar com contratos. Eu exijo que um Animal ele comer(), independente de como eles façam isso nas filhas.

**Para que serve a anotação `@Override` em cima de um método?**

Serve pra você sobrescrever a criação de um método de sua classe mãe
