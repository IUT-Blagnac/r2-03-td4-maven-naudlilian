import java.util.Scanner;

public class Sauts
{
    public static int saisieIntMinMax(int min, int max){
        int saisie = min - 1 ;
        Scanner clavier = new Scanner(System.in) ;
        while (saisie < min || saisie > max){
            System.out.println("Donnez une valeur comprise entre " + min + " et " + max + " :") ;
            saisie = clavier.nextInt() ;
        }
        return saisie;
    }

    public static int saisieIntMin(int min){
        int saisie = min - 1 ;
        Scanner clavier = new Scanner(System.in) ;
        while (saisie < min){
            System.out.println("Donnez une valeur au moins égale à " + min + " :") ;
            saisie = clavier.nextInt() ;
        }
        return saisie ;
    }

    public static double saisieDoubleMin(double min){
        double saisie = min - 1 ;
        Scanner clavier = new Scanner(System.in) ;
        while (saisie < min){
            System.out.println("Donnez une valeur au moins égale à " + min + " :") ;
            saisie = clavier.nextDouble() ;
        }
        return saisie ;
    }

    public static void saisieTabD (int nbSaisies, double tab[]) {
        int i ;
        Scanner clavier = new Scanner(System.in) ;
        for (i = 0 ; i < nbSaisies ; i++) {
            System.out.println("Valeur n°" + (i+1) + " :") ;
            tab[i] = saisieDoubleMin(0) ;
        }
    }

    public static double moyenneSauts(int nbSauts, double tab[]) {
        int i ;
        double somme = 0;
        for (i = 0 ; i < nbSauts ; i++) {
            somme += tab[i] ;
        }
        double moyenne = 0;
        moyenne = somme / nbSauts;
        return moyenne ;
    }

    public static void principale() {
        int nbSauts = saisieIntMinMax(0, 15);

        double tab [];
        tab = new double [15];
        saisieTabD (nbSauts, tab);

        double moyenne;
        moyenne = moyenneSauts (nbSauts, tab);
        System.out.println("la moyenne des sauts est : " + moyenne) ;

        meilleurSaut(nbSauts, tab);
        pireSaut(nbSauts, tab);
    }

    public static void meilleurSaut(int nbSauts, double tab []) {
        int i ;
        double max ; 
        max = tab [0];
        for (i = 0 ; i < nbSauts ; i++) {
            if (max < tab [i]) {
                max = tab [i];
            }
        }
        System.out.println("le meilleur saut est : " + max) ;
    }

    public static void pireSaut(int nbSauts, double tab []) {
        int i ;
        double min ; 
        min = tab [0];
        for (i = 0 ; i < nbSauts ; i++) {
            if (min > tab [i]) {
                min = tab [i];
            }
        }
        System.out.println("le pire saut est : " + min) ;
    }
}