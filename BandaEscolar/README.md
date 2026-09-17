# Exercício POO - Banda Escolar

*Nome:* Ellen Lopes

## Sobre o exercício

O sistema representa os instrumentos de uma banda escolar usando Programação Orientada a Objetos.

Foi criada uma classe abstrata chamada InstrumentoMusical, que possui os atributos e métodos comuns aos instrumentos.

As classes Violao e Bateria herdam da classe abstrata e implementam o método tocar() de formas diferentes.

O método afinar() fica na classe mãe porque funciona da mesma forma para todos os instrumentos.

A classe TesteBanda utiliza uma List<InstrumentoMusical> para percorrer os instrumentos no mesmo laço, sem usar instanceof ou cast.

No final, os dois instrumentos são afinados e a quantidade de instrumentos afinados é *2 de 2*.