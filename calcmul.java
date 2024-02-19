public class Calculadora {
    // Atributos
    private int num1;
    private int num2;

    // Constructor
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Método para realizar la operación
    public int realizarOperacion(String operacion) {
        if (operacion.equals("suma")) {
            return suma();
        }
        // Aquí puedes agregar más operaciones en el futuro
        else {
            System.out.println("Operación no reconocida");
            return 0;
        }
    }

    // Método para sumar
    private int suma() {
        return this.num1 + this.num2;
    }
}public class PruebaCalculadora {
    public static void main(String[] args) {
        // Crear una instancia de Calculadora
        Calculadora calculadora = new Calculadora(5, 3);

        // Realizar una operación de suma y mostrar el resultado
        int resultadoSuma = calculadora.realizarOperacion("suma");
        System.out.println("El resultado de la suma es: " + resultadoSuma);

        // Prueba con una operación no reconocida
        int resultadoDesconocido = calculadora.realizarOperacion("desconocido");
        System.out.println("El resultado de la operación desconocida es: " + resultadoDesconocido);
    }
    // Método para restar
    public int resta() {
        return this.num1 - this.num2;
    }

     // Método para multiplicar
     public int multiplicar() {
        return this.num1 * this.num2;
    }
}