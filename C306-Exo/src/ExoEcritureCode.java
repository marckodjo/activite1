/**
* Test d'ecriture, ExoEcritureCode.java .
*
* @author Marc
*/
public class ExoEcritureCode {
/**
* Constructeur protected avec exception
* pour empecher l'instantiation de la classe.
 * @throws Exception 
*/
protected ExoEcritureCode() throws Exception {
throw new Exception("cette classe ne peut pas être instanciée");
}
/**
* @param valeurs
* @return valeurs
*/
public static double moyenne(final double[] valeurs) {
double somme = 0;
for (int i = 0; i < valeurs.length; i = i + 1) {
somme += valeurs[i];
}
return (somme / valeurs.length);
}
}
