import java.util.Scanner;
public class Main {
    /*
    * Method obtenirValeurString(Scanner scanner, String message) qui retourne la chaine saise par l'utilisateur
    * */
    public static String obtenirValeurString(Scanner scanner, String message){
        System.out.println(message);
        return scanner.nextLine();
    }
    /*
     * Method obtenirDate(Scanner scanner, String message) qui retourne une LocalDate à partir de la saisie
     * */
    public static String obtenirDate(Scanner scanner, String message){
        System.out.println(message);
        return scanner.nextLine();
    }
    /*
     * Method obtenirValeurInt(Scanner scanner, String message) qui retourne le nombre entier saisi par l'utilisateur
     * */
    public static int obtenirValeurInt(Scanner scanner, String message){
        System.out.println(message);
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        //Création du scanner pour lire depuis le clavier
        Scanner scanner = new Scanner(System.in);

        //Saisi du prénom
        String firstName = obtenirValeurString(scanner,"Entrez votre prénom: ");

        //Saisi du  nom
        String lastName = obtenirValeurString(scanner, "Entrez votre nom: ");

        //Saisi de la date de naissance
        String birthDate = obtenirDate(scanner,"Entrez votre date de naissance (AAAA-MM-JJ): ");

        //Saisi du code postal
        String postCode = obtenirValeurString(scanner, "Entrez votre code postal: ");

        //Saisi de la marque de la voiture
        String carBrand = obtenirValeurString(scanner, "Entrez la marque de la voiture: ");

        //Saisi de l'année de la voiture
        int year = obtenirValeurInt(scanner, "Entrez l'année de la voiture: ");

        //Saisi du nombre d'accident
        int accidentNumber = obtenirValeurInt(scanner, "Entrez le nombre d'accidents durant les 5 dernières années: ");

    }
}