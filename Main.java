
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                double[] apoeni = {500,200,100,50,20,10,5,2,1,
                        0.5,0.2,0.1,0.05,0.02,0.01};

                System.out.println("Unesite željeni iznos: ");
                int iznos = scanner.nextInt();
                int brojac = 0;

                for (double apoen : apoeni){
                    double novcanica = iznos / apoen;
                    if (novcanica >= 1) {
                        System.out.println((int)novcanica + " x " + apoen);
                        iznos -= (int)novcanica * apoen;
                    }
                }
            }
        }