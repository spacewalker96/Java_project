import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        System.out.println("Combien avez-vous recu d'argent (MAD) ?");

        Scanner sc = new Scanner(System.in);



        int tot;

        while(!sc.hasNextInt()) {
            System.out.println("Entrer correcte nombre");
            sc.next();
        }

        tot = sc.nextInt();

        int rest = tot/4;

        int livreF = tot*3;
        int div = rest/3;
        int cafe = div/10;
        int rech = div/10;
        int tram = div/8;

        int flow = (div%cafe*10) + (div%rech*10) + (div%tram*8);

        System.out.println("Le prix des livres et fournitures en MDH  : " + livreF+"MDH");
        System.out.println("Le prix des cafés en MDH : "+cafe);
        System.out.println("Le prix des cartes de recharge en MDH : "+rech );
        System.out.println("Le prix des billets de TRAME en MDH : "+tram);
        System.out.println("Le rests pour acheter le bouquet de fleur : "+flow);

    }
}
