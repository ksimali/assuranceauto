# CALCULATEUR DE DEVIS D'ASSURANCE AUTOMOBILE

Objectif:

Créer un programme Java qui demande à l'utilisateur de saisir des
informations personnelles et relatives à sa voiture pour ensuite calculer un
devis d'assurance selon des critères spécifiques.

Tâches à Réaliser:

Saisir les informations utilisateur :
  - Prénom
  - Nom de famille
  - Date de naissance (format AAAA-MM-JJ)
  - Code postal (espaces retirés)
  - Marque de la voiture (ex. : Mercedes, BMW, Audi, Porsche, Autre)
  - Année de la voiture
  - Nombre d'accidents dans les 5 dernières années

Calculer le devis d'assurance :

  - Prix de base : 50 $
  - Si l'année de la voiture est avant 2010, soustraire 20 $.
  - Si la marque est Mercedes, BMW, Audi ou Porsche, ajouter 25 $.
  - Ajouter 10 $ pour 1 accident, 20 $ pour plus d'un.
  - Si l'utilisateur a moins de 25 ans, ajouter 20 $.

Afficher le devis :

  -  Format : "Bonjour [Prénom] [Nom], nous avons un devis de [Montant]$
     pour votre [Marque] [Année]."

Méthodes à Implémenter :

obtenirValeurString(Scanner scanner, String message) :
  - Affiche le message.
  - Retourne la chaîne saisie par l'utilisateur.

obtenirDate(Scanner scanner, String message) :
  - Affiche le message.
  - Retourne une LocalDate à partir de la saisie.

obtenirValeurInt(Scanner scanner, String message) :
  - Affiche le message.
  - Retourne un entier saisi par l'utilisateur.

calculerDevis(int prixDeBase, LocalDate dateNaissance, String
marqueVoiture, int anneeVoiture, int nbAccidents) :
  - Prend les informations saisies.
  - Calcule et retourne le montant du devis.

afficherDevis(String prenom, String nom, String marqueVoiture, int
anneeVoiture, int devis) :
  - Formate et affiche le message final avec le devis calculé.

Considérations Supplémentaires :

  - Gérer les exceptions liées à la saisie des données (ex. : format de date
    incorrect, saisie non-numérique pour les entiers).
  - Utiliser des manipulations de chaînes telles que trim(), equals(), et
    format() pour traiter les entrées et sorties.
  - Implémenter des structures conditionnelles (if, switch) pour la logique
    de calcul du devis.
