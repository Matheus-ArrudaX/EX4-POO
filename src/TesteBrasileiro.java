import java.util.Scanner;

public class TesteBrasileiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome1 = sc.nextLine();
        System.out.println("Estádio: ");
        String estadio1 = sc.nextLine();
        System.out.println("Craque: ");
        String craque1 = sc.nextLine();

        sc.nextLine();

        System.out.println("Nome: ");
        String nome2 = sc.nextLine();
        System.out.println("Estádio: ");
        String estadio2 = sc.nextLine();
        System.out.println("Craque: ");
        String craque2 = sc.nextLine();

        sc.nextLine();

        System.out.println("Local: ");
        String local = sc.nextLine();
        System.out.println("Campeonato: ");
        String campeoanto = sc.nextLine();
        System.out.println("Juiz: ");
        String juiz = sc.nextLine();

        TimeBrasileiro time1 = new TimeBrasileiro(nome1, estadio1, craque1);
        sc.nextLine(); TimeBrasileiro time2 = new TimeBrasileiro(nome2, estadio2, craque2);
        sc.nextLine(); PartidaBrasileiro jogo = new PartidaBrasileiro(local, campeoanto, juiz);
        time1.exibirTimes();
        sc.nextLine(); time2.exibirTimes();
        sc.nextLine(); jogo.exibirPartida();


        }

    }


