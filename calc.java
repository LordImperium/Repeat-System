import java.util.ArrayList;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> somas = new ArrayList<>();
        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();
        String opc = "S";

        while (opc.equals("S") || opc.equals("s")) {
            System.out.println("Digite um valor");
            n1.setValor(scan.nextInt());
            System.out.println("Digite um valor");
            n2.setValor(scan.nextInt());
            res.setValor(n1.getValor() + n2.getValor());
            somas.add(res.getValor());
            System.out.println("A soma é " + res.getValor());
            System.out.println("Deseja somar outro valor?");
            opc=scan.next();
        }
        if (opc.equals("N") || opc.equals("n")){
            System.out.println(somas);
        }

    }
}
