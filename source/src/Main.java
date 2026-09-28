public class Main {
    public static void main(String[] args) {
        //modificando para causar conflicto
        Empleado vendedor = new Vendedor("Gerardo Moran", 1500.0, new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}
