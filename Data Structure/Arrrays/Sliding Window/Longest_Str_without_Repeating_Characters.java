
/* 

**Problema**: Longest substring without repeating characters.

🧩 Enunciado tipo entrevista:

> Dado un string, encuentra la longitud de la subcadena más larga 
que no contiene caracteres repetidos.
> */

import java.util.HashSet;
import java.util.Set;

public int lengthOfLlongestSubstring(String s) {
    //  significa que almacena letras (chars) sin duplicados.
    Set<Character> seen = new HashSet<>(); 
    // puntero izquierdo y longitud maxima encontrada
    int left = 0, maxLen = 0;
    // Puntero derecho recorre el string
    for ( int right 0; right < s.length(); right++ ){
    // Si ya vimos el carácter...    
        while (seen.contains(s.charAt(right))) {
        // lo sacamos del set          
            seen.remove(s.charAt(left))
            // y movemos al inicio de la ventana
            left++;                                         
        }
    // Agregamos el carácter actual
        seen.add(s.charAt(right)); 
    // Actualizamos longitud máxima                       
        maxLen = Math.max(maxLen, right - left + 1);
    }
    // devolvemos la maxima longitud encontrada
    return maxLen; 
}


