package pooej2guia;

import java.util.Scanner;

public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
        public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        this.radio=leer.nextDouble();
    }
        
        public void MetodoArea(){
        double area;
        area = Math.PI * Math.pow(radio,2) ;
        area = Math.round((area)*1000.0d)/1000.0d;
        System.out.println("El area es: "+area);

    }
    public void MetodoPerimetro(){
        double perimetro;
    perimetro = 2 * Math.PI * radio ;
    perimetro = Math.round((perimetro)*1000.0d)/1000.0d;
        System.out.println("El perimetro es: "+perimetro);

}
 
}
  
