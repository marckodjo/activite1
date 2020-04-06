package testunitaire;
public final class TabAlgos {
protected TabAlgos() {
}
/**
*@param tab est un tableau d'entier
*@return valeur la plus grande d'un tableau
*/
public static int plusGrand(final int[] tab) {
//TODO
int value = tab[0];
for (int i = 0; i < tab.length; i++) {
if (value < tab[i]) {
value = tab[i];
}
}
return value;
}
/**
*@param tab est un tableau de double
*@return moyenne des valeurs du tableau
*@throw IllegalArgumentException si tab et null ou vide
**/
public static double moyenne(final int[] tab) {
//TODO
int value = 0;
if (tab.length < 0 | tab == null) {
throw new IllegalArgumentException("Le tableau est vide ou null");
} else {
for (int i = 0; i < tab.length; i++) {
value += tab[i];
}
}
return value / tab.length;
}
/**
*@param tab1 est un tableau d'entier
*@param tab2 est un tableau d'entier
*Compare le contenu de 2 tableaux en tenant compte de l'ordre.
*@return true si les 2 tableaux contiennent les mêmes éléments avec
*les mêmes nombres d'occurences (avec les elements dans le meme ordre)
**/
public static boolean egaux(final int[] tab1, final int[] tab2) {
//TODO
boolean b = false;
int cpt = 0;

for (int j = 0; j < tab1.length; j++) {
if (tab1[j] == tab2[j]) {
cpt++;
}
}
if (cpt == tab1.length) {
b = true;
}
return b;
}

/**
*@param tab1 est un tableau d'entier
*@param tab2 est un tableau d'entier
*Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
*@return true si les 2 tableaux contiennent les mêmes éléments
**avec les mêmes nombres d'occurrence
*(pas forcément dans le meme ordre)
**/
public static boolean similaires(final int[] tab1, final int[] tab2) {
//TODO
boolean b = false;
int cpt = 0;
for (int i = 0; i < tab1.length; i++) {
b = false;
for (int j = 0; j < tab1.length; j++) {
if (tab1[i] == tab2[j]) {
cpt++;
}
}
}
if (cpt == tab1.length) {
b = true;
}
return b;
}
}
