import java.util.Scanner;
public class Main {
    /*
    * Method obtenirValeurString(Scanner scanner, String message) qui retourne la chaine saise par l'utilisateur
    * */
    public static String obtenirValeurString(Scanner scanner, String message){
        System.out.println(message);
        return scanner.nextLine();
    }
    public static void main(String[] args) {
        //Création du scanner pour lire depuis le clavier
        Scanner scanner = new Scanner(System.in);

        //Saisi du prénom
        String firstName = obtenirValeurString(scanner,"Entrez votre prénom: ");

        //Saisi du  nom
        String lastName = obtenirValeurString(scanner, "Entrez votre nom: ");

    }
}