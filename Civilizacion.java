public class Civilizacion {
    public static void main(String args[]) {}

    public class Civilizaciones {
       //* atributis *//
       private String nombre = "";
       private String era = "";
       private int poblacion = 0;
       private int alimento = 0;
       private int madera = 0;
       private int oro = 0;
    //* Constructor *//
    public Civilizaciones(String nombre, String era, int poblacion, int alimento, int madera, int oro) {
    this.nombre = nombre;
    this.era = era;
    this.poblacion = poblacion;
    this.alimento = alimento;
    this.madera = madera;
    this.oro = oro;
}
//** getters y setters *//
       public int getAlimento() {
       return alimento;
     }
       public void setAlimento(int alimento) {
       if (alimento >= 0) {
       this.alimento = alimento;
    }
       } 
       public int getMadera() {
       return madera;
  }

       public void setMadera(int madera) {
       if (madera >= 0) {
       this.madera = madera;
    }

       public int getOro() {
       return oro;
  }

       public void setOro(int oro) {
       if (oro >= 0) {
       this.oro = oro;
    }
   }
}    //** metodos */
       public void obtenerAlimento(int cantidad) {
       if (cantidad > 0) {
        alimento += cantidad;
    }
}
       public void obtenerMadera(int cantidad) {
       if (cantidad > 0) {
       madera += cantidad;
    }
}
       public void obtenerOro(int cantidad) {
       if (cantidad > 0) {
       oro += cantidad;
    }
}
       public void crearAldeano() {
    
       if (alimento >= 50) {
        alimento -= 50;
        poblacion++;
    }
}
  
  } 
   Civilizaciones cules = new Civilizaciones ("cules","III", 10, 80, 130, 15);
   System.out.println (cules);
    }
