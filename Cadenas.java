import java.util.Scanner  ;
public class Cadenas {
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Ingresa una palabra o cadena");
        String resp = scan.nextLine();
      System.out.println("""
      Escoge que hacer con tu palabra o cadena
      1.Mostrar longitud
      2.Mostrar caracteres en lineas distintas
      3.Mostrar cadena en orden inverso
      4.Ver cuantas veces aparece un caracter por ingresar
      5.Ver si una subcadena por ingresar se encuentra dentro de la original
      6.Ver si es anagrama con otra palabra o cadena 
      """);
      int opcion = scan.nextInt ();

      if (opcion ==1) {
        System.out.println("Longitud de cadena:" + resp.length());
      }
      if (opcion ==2) {
        for (int i = 0; i < resp.length(); i++) {
          System.out.println(resp.charAt(i));
   }
  }
      if (opcion ==3) {
        for (int i = resp.length() -1; i>=0; i-- ) {
            System.out.println (resp.charAt(i));
        }
      }
      
      if (opcion ==4) {
        System.out.print("Que caracter contar?");
        char caracter = scan.next().charAt(0) ;
        int contador = 0;
       for (int j=0 ; j < resp.length(); j++ ){
       if (resp.charAt (j) == caracter ){ 
        contador++;
       }
      }
      System.out.println ("El caracter "+ caracter + " aparece " + contador + " veces ");
      }
      if (opcion ==5) {
        System.out.println("Que subcadena buscar?");
        scan.nextLine ();
        String subcad= scan.nextLine();
       if (resp.contains (subcad)){
        System.out.println("La subcadena "+ subcad + " si esta");
       }
       else {
        System.out.println("La subcadena "+ subcad + " no esta");
      }
      }
      if (opcion ==6) {
       System.out.println("Ingresa que anagrama comprobar");
       scan.nextLine();
       String anagr = scan.nextLine();
       boolean anagrama = true ;
       if (resp.length() != anagr.length()){
        anagrama = false;
       } else {
        for(int k =0; k> resp.length(); k++ ) {

            char caracter = resp.charAt(k);

            int contador_uno= 0;
            int contador_dos= 0;
            for (int l = 0; l < resp.length(); l++) {
                if (resp.charAt(l) == caracter) {
                    contador_uno++;
                }
            }

            for (int l = 0; l < anagr.length(); l++) {
                if (anagr.charAt(l) == caracter) {
                    contador_dos++;
                }
            }

            if (contador_uno != contador_dos) {
                anagrama = false;
            }
        }
    }

    if (anagrama) {
        System.out.println("Si son anagramas");
    } else {
        System.out.println("No son anagramas");
    }
}
        }
       }
       
