import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> listaBrojeva = new ArrayList<>();

        System.out.println("Unesite broj elemenata u listi: ");
        int brojElemenata = scanner.nextInt();

        for (int i=0; i<brojElemenata; i++) {
            System.out.print("Unesite " + (i + 1) + ". broj: ");
            listaBrojeva.add(scanner.nextInt());
        }

        boolean duplikat = false;
        for (int i =0; i<listaBrojeva.size(); i++){
            for(int j=i+1; j<listaBrojeva.size(); j++) {
                if(listaBrojeva.get(i).equals(listaBrojeva.get(j))){
                    duplikat = true;
                    break;
                }
            }
            if (duplikat) {
                break;
            }
        }

        if (duplikat) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}