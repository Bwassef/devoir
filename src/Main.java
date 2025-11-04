import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        int choix = 0;
        do {
            do {
                System.out.println("1 : Exercice 1");
                System.out.println("2 : Exercice 2");
                System.out.println("3 : Exercice 3");
                System.out.println("4 : Exercice 4");
                System.out.println("0 : Quitter le programme");
                System.out.print("Votre choix : ");
                choix = input.nextInt();
            } while (choix < 0 || choix > 4);

            switch (choix) {
                case 1: {
                    double kms;
                    do {
                        System.out.print("saisir kms: ");
                        kms = input.nextDouble();
                    } while (kms < 0);

                    double volume;
                    do {
                        System.out.print("saisir volume en m3 : ");
                        volume = input.nextDouble();
                    } while (volume < 0);

                    double poids;
                    do {
                        System.out.print("saisir le poids : ");
                        poids = input.nextDouble();
                    } while (poids < 0);
                    double frais = 50;
                    if (poids > 60) {
                        frais = frais + (poids - 60) * 1;
                    }

                    if (volume >= 1) {
                        frais = frais + 20;
                    }

                    if (kms > 100) {
                        frais = frais + (kms - 100) * 0.5;
                    }
                    System.out.println("Les frais de port sont:" + frais + " euros.");
                    break;
                }
                case 2: {
                    double stade = 150;
                    double recette = 31;
                    double totalRecette = 0;
                    int annee = 0;

                    while (totalRecette < stade) {
                        annee = annee + 1;
                        totalRecette = totalRecette + recette;
                        System.out.println("Année " + annee + " : recette = " + recette + " total = " + totalRecette + " millions");
                        recette = recette * 0.8;
                    }

                    System.out.println("Le stade sera bénéficiaire après " + annee + " années.");
                    break;
                }
                case 3: {
                    int gains = 50;
                    int mise;
                    while (mise <= 0) {
                        System.out.print(" votre mise SVP ?: ");
                        mise = input.nextInt();
                    }




                    break;
                }
                case 4: {
                    int ligne;
                    do {
                        System.out.print("Nombre de lignes : ");
                        ligne = input.nextInt();
                    } while (ligne <= 0);

                    for (int i = 1; i <= ligne; i++) {
                        for (int j = i; j <= ligne; j++) {
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                    break;
                }
            }
        } while (choix != 0);
    }
}
