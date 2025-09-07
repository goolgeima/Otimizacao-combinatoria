# Otimizacao-combinatoria

## Problema 1: Escalonamento de tarefas em Máquinas Paralelas

Consiste em distribuir um conjunto de tarefas, cada uma com um tempo de execução específico, entre várias máquinas de modo que o tempo total necessário para concluir todas as tarefas seja minimizado.

No arquivo "Problema1Tarefas", o algoritmo implementado utiliza uma abordagem gulosa: a cada tarefa, ela é atribuída à máquina que, naquele momento, possui o menor tempo acumulado de execução. Embora não garanta a solução ótima para todos os casos, essa estratégia costuma produzir resultados satisfatórios e é eficiente para problemas de tamanho moderado.

No arquivo "Problema1TarefasOrdenadas", o algoritmo segue a mesma lógica, porém antes de distribuir as tarefas, as ordena de modo decrescente. Essa abordagem é conhecida como algoritmo de LPT (Longest Processing Time First).

O LPT tende a produzir um custo total de execução menor do que a distribuição sem ordenação, pois evita que tarefas longas fiquem agrupadas em uma única máquina, melhorando o balanceamento da carga entre todas as máquinas.
