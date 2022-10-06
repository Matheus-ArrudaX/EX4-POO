import java.util.Scanner;

public class TesteJogadoresFutebol {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome1 = sc.nextLine();
       System.out.println("Time: ");
       String time1 = sc.nextLine();
        System.out.println("Número: ");
        int numero1 = sc.nextInt();


        sc.nextLine();

        System.out.println("Nome: ");
        String nome2 = sc.nextLine();
       System.out.println("Time: ");
       String time2 = sc.nextLine();
        System.out.println("Número: ");
        int numero2 = sc.nextInt();


        JogadoresFutebol jogador1 = new JogadoresFutebol(nome1, numero1, time1);
        sc.nextLine();
        JogadoresFutebol jogador2 = new JogadoresFutebol(nome2, numero2, time2);

        jogador1.exibirMensagem();
        sc.nextLine(); jogador2.exibirMensagem();

    }
}