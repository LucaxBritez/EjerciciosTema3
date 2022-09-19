class Coche{
  public int puertas = 0;

  public void AgregarPuerta(){
	  this.puertas++;
	  
    }  
  public static void main(String args[]){
	  Coche miCoche = new Coche();
	  miCoche.AgregarPuerta();
	  System.out.println("El numero de puertas actual del coche es " + miCoche.puertas);
	  
  }
}