package org.lessons.java.security;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);

        //dare un valore alle variabili
        System.out.println("what's your name ?");
        name = scanner.nextLine();
        System.out.println("what's your surname");
        surname = scanner.nextLine();
        System.out.println("what's your favorite color ?");
        favoriteColor = scanner.nextLine();
        System.out.println("what day were you born ?");
        dayNumber = scanner.nextInt();
        System.out.println("what month were you born ? (write it in number please)");
        monthNumber = scanner.nextInt();
        System.out.println("what year were you born ?");
        yearNumber = scanner.nextInt();


        //chiusura scanner (quando finisci di usare uno scanner va chiuso per smettere di consumare spazio)
        scanner.close();

        //creo la variabile della data di nascita basandomi sulle variabili dayNumber, monthNumber e yearNumber
        int dateOfBirth = dayNumber + monthNumber + yearNumber;

        //genero la password
        String insecurePassword = "your insecure password is: " + name + surname + favoriteColor + dateOfBirth;

        System.out.println("your name is: " + name);
        System.out.println("your surname is: " + surname);
        System.out.println("your favorite color is: " + favoriteColor);
        System.out.println("your random number is: " + dateOfBirth);
        System.out.println(insecurePassword + "i suggest you to DO NOT use it");






    }
}
