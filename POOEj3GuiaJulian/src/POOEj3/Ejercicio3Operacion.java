package POOEj3;

//Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
//A) Método constructor con todos los atributos pasados por parámetro.
//B) Método constructor sin los atributos pasados por parámetro.
//C) Métodos get y set.
//D) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
//E) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//F) Método restar(): calcular la resta de los números y devolver el resultado al main
//G) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
//el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
//H) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0
//y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.



public class Ejercicio3Operacion {

    private int num1;
    private int num2;

    public int suma() {
        int suma = num1 + num2;
        return suma;
    }

    public int resta() {
        int resta = num1 - num2;
        return resta;
    }

    public double multiplicacion() {
        int multiplicacion = num1 * num2;
        if (multiplicacion == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return multiplicacion;
        }
    }

    public double division() {
        double division = num1 / num2;
        if (num1 == 0 || num2==0) {
            System.out.println("Error");
            return 0;
        } else {
            return division;
        }
    }

    public Ejercicio3Operacion() {
    }

    public Ejercicio3Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    @Override
    public String toString() {
        return "Ejercicio3Operacion{" + "num1= " + num1 + ", num2= " + num2 + ", suma= " + suma() + ", resta= "
                + resta() + ", multiplicacion= " + multiplicacion() + ", division= " + division() + '}';
    }

}
