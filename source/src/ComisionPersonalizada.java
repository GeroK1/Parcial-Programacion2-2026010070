public class ComisionPersonalizada implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * 0.12; // 12% por ser Gerardo (7 letras)
    }
}