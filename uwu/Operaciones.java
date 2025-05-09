public class Operaciones {
public static void main(String[] args) {
    double a =  JoptionPane.showConfirmDialog(null, "Ingrese el primer numero: ");
    int b =  JoptionPane.showConfirmDialog(null, "Ingrese el segundo numero: ");
    double resultado = a+b;
    JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
    resultado = a-b;
    JOptionPane.showMessageDialog(null, "La resta es: " + resultado);
    resultado = a*b;
    JOptionPane.showMessageDialog(null, "La multiplicacion es: " + resultado);
    resultado = a/b;
    JOptionPane.showMessageDialog(null, "La division es: " + resultado);




}