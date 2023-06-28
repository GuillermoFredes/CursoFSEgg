/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son: 
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta .
b) Agregar los métodos getters y setters correspondientes 
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0. 
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Entidades;

/**
 *
 * @author Admin
 */
public class cuentaBancariaClass {

    public int numeroCuenta, saldo;
    public long DNI;

    public cuentaBancariaClass() {
    }

    public cuentaBancariaClass(int numeroCuenta, int saldo, long DNI) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.DNI = DNI;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public long getDNI() {
        return DNI;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "cuentaBancariaClass{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", DNI=" + DNI + '}';
    }

}
