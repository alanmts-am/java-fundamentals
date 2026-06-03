# Exercício 06 — Generics

Crie uma classe chamada `Par<K, V>`. Ela deve usar dois tipos genéricos diferentes (comumente chamados de `K` para Key e `V` para Value, igual no `HashMap`!).

- A classe deve ter dois atributos privados: `chave` (do tipo `K`) e `valor` (do tipo `V`)
- Um construtor que receba e inicialize esses dois atributos
- Métodos getters simples para ambos

No `main`, instancie essa classe passando uma `String` como chave (ex: `"ID_USER"`) e um `Integer` como valor (ex: `99`). Mostre os valores no console.

---

## Verificação

**Qual é a principal vantagem de pegar um erro em tempo de compilação comparado ao tempo de execução (runtime)?**

O erro não vai disparar na "cara" do usuário. Na verdade, a aplicação não funciona, exigindo correção

**Se eu criar uma classe `Caixa<T>`, posso passar tipos primitivos como `int` ou `double` dentro do `<>`? (Ex: `Caixa<int>`)**

Tipos primitivos não herdam de Object para ser tratado como Generics
