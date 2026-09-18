// Exercicio 05 - Sensor
// No exercicio pede a classe Sensor e o teste em outro pacote
package sensores;

public class Sensor {
    private double leituraBruta;

    public void lerValor(double valor) {
        this.leituraBruta = valor;
        calibrar();
    }

    private void calibrar() {
        this.leituraBruta = this.leituraBruta * 1.05; // calibracao simples
    }

    public double getLeituraBruta() {
        return leituraBruta;
    }
}

// Em outro pacote (ex: teste/TesteSensor.java):
/*
package teste;
import sensores.Sensor;

public class TesteSensor {
    public static void main(String[] args) {
        Sensor s = new Sensor();
        s.lerValor(100.0);
        // s.calibrar(); // erro: metodo privado
        System.out.println("Valor lido: " + s.getLeituraBruta());
    }
}
*/
