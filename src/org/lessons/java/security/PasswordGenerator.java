package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {
/*Create un nuovo progetto java chiamato java-password-generator
Aggiungete un package org.lessons.java.security
Aggiungete una classe PasswordGenerator che contiene un metodo main
Il programma deve fare quanto segue:
salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno (in numero)
generare (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere
Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta La sua password sarà Pinco-Pallo-magenta-2011
BONUS: utilizzare la classe java.util.Scanner per leggere i dati dell’utente da tastiera
 */
//salvo le variabili
        String name;
        String surname;
        String favoriteColor;
        int dayNumber;
        int monthNumber;
        int yearNumber;

        //dare un valore alle variabili
        name = "Matteo Luciano";
        surname = "Casale";
        favoriteColor = "Crimson";
        dayNumber = 22;
        monthNumber = 4;
        yearNumber = 1997;

        //creo la variabile della data di nascita basandomi sulle variabili dayNumber, monthNumber e yearNumber
        String dateOfBirth = dayNumber + "/" + monthNumber + "/" +  yearNumber;

        //genero la password
        String insecurePassword = "your insecure password is: " + name + surname + favoriteColor + dateOfBirth;

        System.out.println("your name is: " + name);
        System.out.println("your surname is: " + surname);
        System.out.println("your favorite color is: " + favoriteColor);
        System.out.println("you're born in: " + dateOfBirth);
        System.out.println(insecurePassword);






    }
}
