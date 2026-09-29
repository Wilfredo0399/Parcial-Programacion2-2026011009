public class Main {
    public static void main(String[] args) {
        Empleado vendedor = new Vendedor("Wilfredo", 1000.0, new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}