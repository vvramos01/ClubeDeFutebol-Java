import java.util.*;


public class ProgramaClube {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Map<Integer, Jogador> jogadores = new HashMap<>();


       System.out.print("Quantos jogadores deseja cadastrar? ");
       int n = sc.nextInt();
       sc.nextLine();


       for (int i = 0; i < n; i++) {
           System.out.println("\nJogador #" + (i + 1));


           System.out.print("Número da camisa: ");
           int camisa = sc.nextInt();
           sc.nextLine();


           if (jogadores.containsKey(camisa)) {
               System.out.println(" Já existe um jogador com essa camisa! Cadastro ignorado.");
               i--;
               continue;
           }


           System.out.print("Nome: ");
           String nome = sc.nextLine();


           System.out.print("Salário: ");
           double salario = sc.nextDouble();
           sc.nextLine();


           jogadores.put(camisa, new Jogador(camisa, nome, salario));
       }


       System.out.print("\nDigite o número da camisa para aplicar aumento: ");
       int numCamisa = sc.nextInt();


       System.out.print("Digite o percentual de aumento: ");
       double percentual = sc.nextDouble();


       Jogador j = jogadores.get(numCamisa);


       if (j != null) {
           j.aumentarSalario(percentual);
           System.out.println("\n Aumento aplicado com sucesso!");
           System.out.println("Novo salário do jogador " + j.getNome() + ": R$ " + String.format("%.2f", j.getSalario()));
       } else {
           System.out.println("\n Jogador não encontrado. Aumento cancelado.");
       }


       System.out.println("\n Lista atualizada de jogadores:");
       for (Jogador jogador : jogadores.values()) {
           System.out.println(jogador);
       }


       sc.close();
   }
}

