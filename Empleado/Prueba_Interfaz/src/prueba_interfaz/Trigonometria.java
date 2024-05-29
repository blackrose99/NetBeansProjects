package prueba_interfaz;

class Trigonometria implements Matematicas {

// convierte grados sexagesimales en radianes
    public double radianes(double angulo) {
        return (PI * angulo / 180);
    }
// convierte radianes en grados
    public double grados(double angulo) {
        return (180 * angulo / PI);
    }
//calcula la función seno en grados sexagesimales
    public double seno(double angulo) {
        return Math.sin(radianes(angulo));
    }
    public double coseno(double angulo) {
        return Math.cos(radianes(angulo));
    }
}
