import java.util.Scanner;
import java.util.ArrayList;
public class tarefas{

    public static void main(String[] args) {
    
        Scanner sc  = new Scanner(System.in);
        int qntmaquinas;
        int qnttarefas;
        
        System.out.println("Digite o número de máquinas que serão utilizadas: ");
        qntmaquinas = sc.nextInt();
        System.out.println("Digite o número de tarefas que serão acionadas às máquinas: ");
        qnttarefas = sc.nextInt();
        ArrayList<Integer> pesos = new ArrayList<>();

        for (int j=1;j<=qnttarefas;j++){
            System.out.println("Digite o tempo que a tarefa " + j + " irá demorar: ");
            int peso = sc.nextInt();
            pesos.add(peso);
        }

        ArrayList<ArrayList<Integer>> filas = new ArrayList<>(); //array dos arrays das máquinas
        int[] tempos = new int[qntmaquinas]; //array dos tempos de cada máquina
        for (int i = 0; i < qntmaquinas; i++) {
            filas.add(new ArrayList<>()); //criando um array pra cada maquina
            tempos[i] = 0; //inicializando o tempo de cada máquina como 0
        }

        // distribuindo as tarefas
        for (int t = 0; t < qnttarefas; t++) { //uma iteração pra cada tarefa
            int peso = pesos.get(t); //pegando o peso da tarefa atual

            // encontrando a máquina com menor tempo acumulado
            int minIndex = 0;
            for (int m = 1; m < qntmaquinas; m++) { //percorrendo as máquinas
                if (tempos[m] < tempos[minIndex]) { //comparando os tempos
                    minIndex = m; //atualizando o índice para a máquina com menor tempo
                }
            }

            // adiciona a tarefa na máquina escolhida
            filas.get(minIndex).add(peso);
            tempos[minIndex] += peso;
        }

        // mostra as filas de cada máquina
        for (int i = 0; i < qntmaquinas; i++) {
            System.out.println("Máquina " + (i+1) + ": " + filas.get(i) + " | Tempo total: " + tempos[i]);
        }

        int custoTotal = tempos[0];
        for (int i = 1; i < qntmaquinas; i++) {
            if (tempos[i] > custoTotal) {
                custoTotal = tempos[i];
            }
        }
        System.out.println("Custo total (makespan): " + custoTotal);


        sc.close();
        

}
}
