import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    /*
    * Method obtenirValeurString(Scanner scanner, String message) qui retourne la chaine saise par l'utilisateur
    * */
    public static String obtenirValeurString(Scanner scanner, String message){
        //Declaration de variable String saisi
        String saisie = "";
        try{
            System.out.println(message);
            saisie = scanner.nextLine();
        }catch(InputMismatchException e){
            System.out.println("Votre saisi n'est pas valide ! Veuillez recommencer!");
        }
        return saisie;
    }
    /*
     * Method obtenirDate(Scanner scanner, String message) qui retourne une LocalDate à partir de la saisie
     * */
    public static LocalDate obtenirDate(Scanner scanner, String message){
        boolean bool;
        LocalDate dateNaissance = LocalDate.of(2005, 9, 1);
        do{
            try{
                System.out.println(message);
                String dateSaisi = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                dateNaissance = LocalDate.parse(dateSaisi, formatter);
                bool = false;
            }catch(DateTimeParseException e){
                System.out.println("format de date invalide. Entrez la date au format AAAA-MM-JJ.");
                bool = true;
            }
        }while(bool == true);

        return dateNaissance;
    }
    /*
     * Method obtenirValeurInt(Scanner scanner, String message),
     * qui retourne le nombre entier saisi par l'utilisateur
     * */
    public static int obtenirValeurInt(Scanner scanner, String message){
        int saisie;
        while(true){
            try{
                System.out.println(message);
                saisie = scanner.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("Vous devez saisir un nombre entier!");
            }
            scanner.nextLine();
        }
        return saisie;
    }
    /*
     *  Method calculerDevis(int prixDeBase, LocalDate dateNaissance,
     *  String marqueVoiture, int anneeVoiture, int nbAccidents) :
     *  - Prend les informations saisies.
     *  - Calcule et retourne le montant du devis.
     * */
    public static int calculerDevis(int prixDeBase, LocalDate dateNaissance, String marqueVoiture, int anneeVoiture, int nbAccidents){
        /**
         * Calculer le devis d'assurance :
         * Prix de base : 50 $
         * Si l'année de la voiture est avant 2010, soustraire 20 $.
         * Si la marque est Mercedes, BMW, Audi ou Porsche, ajouter 25 $.
         * Ajouter 10 $ pour 1 accident, 20 $ pour plus d'un.
         * Si l'utilisateur a moins de 25 ans, ajouter 20 $.
         */
        LocalDate today = LocalDate.now();
        Period period = Period.between(dateNaissance, today);
        int age = period.getYears();
        System.out.println(age);
        int devis = prixDeBase;
        if(age < 25){
            devis += 20;
        }
        if(anneeVoiture < 2010){
            devis -= 20;
        }
        if(marqueVoiture.equals("Mercedes")||marqueVoiture.equals("Audi")||marqueVoiture.equals("Porsche")||marqueVoiture.equals("BMW")){
            devis += 25;
        }
        if(nbAccidents > 1){
            devis += 20;
        } else if (nbAccidents == 1) {
            devis += 10;
        }else{
            devis += 0;
        }
        return devis;
    }

    /*
    *   Method afficherDevis(String prenom, String nom, String marqueVoiture,
    *   int anneeVoiture, int devis):
    *   -Formate et affiche le message final avec le devis calculé.
    *   -Format : "Bonjour [Prénom] [Nom], nous avons un devis de [Montant]$ pour votre [Marque] [Année]."
    * */
    public static String afficherDevis(String prenom, String nom, String marquevoiture, int anneeVoiture, int devis){
        return("Bonjour "+prenom+" "+nom+","+" nous avons un devis de "+ devis+ " $" + " pour votre "+marquevoiture+" "+anneeVoiture+".");
    }
    public static void main(String[] args) {
        //Création du scanner pour lire depuis le clavier
        Scanner scanner = new Scanner(System.in);

        //Saisi du prénom
        String prenom = obtenirValeurString(scanner,"Entrez votre prénom: ");

        //Saisi du  nom
        String nom = obtenirValeurString(scanner, "Entrez votre nom: ");

        //Saisi de la date de naissance
         LocalDate dateNaissance = obtenirDate(scanner,"Entrez votre date de naissance au format AAAA-MM-JJ (ex:2024-01-22): ");

        //Saisi du code postal
        String codePostal = obtenirValeurString(scanner, "Entrez votre code postal (ex:H9H5K8) : ");

        //Saisi de la marque de la voiture
        String marqueVoiture = obtenirValeurString(scanner, "Entrez la marque de la voiture: ");

        //Saisi de l'année de la voiture
        int anneeVoiture = obtenirValeurInt(scanner, "Entrez l'année de la voiture: ");

        //Saisi du nombre d'accident
        int nbAccidents = obtenirValeurInt(scanner, "Entrez le nombre d'accidents durant les 5 dernières années: ");

        //Appel fonction calculerDevis
        int prixDeBase = 50;
        int devis = calculerDevis(prixDeBase, dateNaissance, marqueVoiture, anneeVoiture,nbAccidents);

        //Appel fonction afficherDevis et Affichage devis
        String message = afficherDevis(prenom, nom, marqueVoiture, anneeVoiture, devis );
        System.out.println(message);
    }
}