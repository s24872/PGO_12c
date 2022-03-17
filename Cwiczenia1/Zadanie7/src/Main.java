import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*
	    * Odczytaj liczbę od użytkownika i zapisz ją w zmiennej o nazwien.Npowinno być co najmniej 5 i  liczbą nieparzystą.Jeśli użytkownik wprowadzi błędnie,poproś, aby spróbował ponownie, aż warunek zostanie spełniony.Wydrukuj rysunek używając znaku * o rozmiarzen. Naprzykład, jeślinwynosi 5:
	    */

        Scanner scanner = new Scanner(System.in);
        int n = 5;

        do {
            n = scanner.nextInt();
            scanner.nextLine();

            if(n < 5) System.out.println("N musi być większe lub równe 5");
            if(n % 2 != 0) System.out.println("N musi być liczbą nieparzystą");
        } while (n < 5 || n % 2 != 0);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 ||  i == n-1 || j == 0 || j == n-1 || i == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
