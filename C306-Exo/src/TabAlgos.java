public final class TabAlgos {

  /**                                                                           
   * @return valeur la plus grande d'un tableau.                                
   */
  public static int plusGrand(final int[] tab) {
    // TODO 
	  int value = tab[0];
	  for(int i = 0; i < tab.length; i++) {
		  if(value < tab[i]) {
			  value = tab[i];
		  }
	  }
	  return value ;
  }

  /**                                                                           
   * @return moyenne des valeurs du tableau.                                    
   * @throw IllegalArgumentException si tab et null ou vide.                    
   **/
  public static double moyenne(final int[] tab) {
	  // TODO  
	  int value = 0;
	  if(tab.length < 0 | tab == null) {
		  throw new IllegalArgumentException("Le tableau est vide ou null");
	  }else {
		  for(int i = 0; i < tab.length; i++) {
			  value += tab[i];
		  }
	  }
	  return value / tab.length;
  }

  /**                                                                           
   * Compare le contenu de 2 tableaux en tenant compte de l'ordre.              
   * @return true si les 2 tableaux contiennent les mêmes éléments              
   *         avec les mêmes nombres d'occurences                                
   *         (avec les elements dans le meme ordre).                            
   **/
  public static boolean egaux(final int[] tab1,final int[] tab2) {
	  // TODO 
	  boolean b = false;
	  if(tab1.length == tab2.length) {  
		  int i = 0;
		  do {
			  i++;
			  if(tab1[i] == tab2[i]) {
				  b =  true;
			  }else {
				  b = false;
			  }

		  } while ((i <= tab1.length) & (b = true));
	  }
	  return b;
  }

  /**                                                                           
   * Compare le contenu de 2 tableaux sans tenir compte de l'ordre.             
   * @return true si les 2 tableaux contiennent les mêmes éléments              
   *         avec les mêmes nombres d'occurrence                                
   *         (pas forcément dans le meme ordre).                                
   **/
  public static boolean similaires(final int[] tab1,final int[] tab2) {
	  // TODO      

	  boolean b = false;
	  if(tab1.length == tab2.length) {  
		  int value = tab1[0];
		  int j = 0;
		  do {
			  for(int i = 0; i < tab1.length; i++) {
				  if(value == tab2[i]) {
					  b = true;
				  }else {
					  b = false;
				  }
			  } 
			  j++;
			  value = tab1[j];
		  } while ((j <= tab1.length) & (b = true));
	  }
	  return b;
  }
}
