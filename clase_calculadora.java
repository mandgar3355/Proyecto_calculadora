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
}