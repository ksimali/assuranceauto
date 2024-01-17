import java.util.Scanner;
public class Main {
    /*
    * Method obtenirValeurString(Scanner scanner, String message) qui retourne la chaine saise par l'utilisateur
    * */
    public static String obtenirValeurString(Scanner scanner, String message){
        System.out.println(message);
        String str = scanner.nextLine();
        return str;
    }
    public static void main(String[] args) {
        //Création du scanner pour lire depuis le clavier
        Scanner scanner = new Scanner(System.in);

        //Saisi du prénom
        obtenirValeurString(scanner,"Entrez votre prénom: ");

        //Saisi du  nom
        obtenirValeurString(scanner, "Entrez votre nom: ");

    }
}