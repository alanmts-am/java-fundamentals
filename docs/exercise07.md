# Exercício 07 — Collections

Crie uma classe chamada `GerenciadorPedidos` com um método `main`.

Simule a entrada de itens no carrinho de compras usando uma `Collection` adequada para armazenar o nome dos produtos. As regras de negócio dizem que não pode haver produtos repetidos nesse carrinho — o cliente tentou clicar duas vezes no botão de adicionar o produto `"Teclado Mecânico"`.

- Escolha e instancie a `Collection` correta (`List`, `Set` ou `Map`)
- Adicione os produtos, incluindo pelo menos um repetido
- Imprima a lista final para provar que a duplicata foi evitada sem usar nenhum `if`

---

## Verificação

**Se o `Set` barra elementos duplicados, o que acontece por baixo dos panos ao chamar `.add()` com um elemento que já existe? Ele lança uma `Exception` ou retorna `false`?**

Por de baixo dos panos, o HashSet tem um HasMap, onde o nome ou objeto passado vira a key, e o value é sua referência. Ele não dispara erro, apenas sobrescreve

**Em um `HashMap`, posso ter duas chaves iguais apontando para valores diferentes? E duas chaves diferentes apontando para o mesmo valor?**

Não, ele sobrescreve a primeira. Chaves diferentes com o mesmo valor pode ter
