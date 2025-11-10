public class Jogador {
   private int camisa;
   private String nome;
   private double salario;


   public Jogador(int camisa, String nome, double salario) {
       this.camisa = camisa;
       this.nome = nome;
       this.salario = salario;
   }


   public int getCamisa() {
       return camisa;
   }


   public String getNome() {
       return nome;
   }


   public double getSalario() {
       return salario;
   }




   public void aumentarSalario(double percentual) {
       salario += salario * percentual / 100.0;
   }


   @Override
   public String toString() {
       return "Camisa: " + camisa + " | Nome: " + nome + " | Salário: R$ " + String.format("%.2f", salario);
   }
}

