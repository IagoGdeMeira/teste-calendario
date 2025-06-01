# Testes Unitários com JUnit

Este é um repositório desenvolvido para a disciplina de ***Teste de Software do curso superior de Engenharia de Software do IFPR*** no qual fazemos alguns testes utilizando o standalone do JUnit e o JAR desenvolvido pelo professor da disciplina Marcelo Terenciani.

Um dos critério utilizados para o desenvolvimento dos testes foi o conceito do **Particionamento de Equivalência**, que constitui a definição de classes que particionam os testes em classes de equivalência, assumindo que um teste adequado a esta classe a cobre por completo.

Seguem abaixo as classes de equivalência definidas por mim, tendo em vista o funcionamento do calendário. Para mais informações, acessem: https://github.com/marceloTerencianiIFPR/teste-es-2025/tree/main/lib/calendario.

## Classes do Particionamento de Equivalência
```
Classe 1: A função getCalendario não recebe parâmetros.
Saída Esperada: Exibe o calendário de 2025, o ano atual.

Classe 2: A função getCalendario recebe um parâmetro.
Parâmetro 1: 2020
Saída Esperada: Exibe o calendário de 2020.

Classe 3: A função getCalendario recebe dois parâmetros.
Parâmetro 1: 4
Parâmetro 2: 2020
Saída Esperada: Exibe o calendário do mês de abril de 2020.

Classe 4: A função getCalendario recebe os parâmetros 10 e 1752, respectivamente.
Parâmetro 1: 10
Parâmetro 2: 1752
```

