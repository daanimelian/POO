//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) {
        /*Contexto: Una empresa dedicada a movilidad sustentable quiere hacer un regalo personalizado a sus
empleados por su aniversario en Argentina, para esto cuenta con la información de sus empleados:
nombre, y el medio de movilidad más utilizado.
La empresa le regalará:
● $50.000 en un voucher de combustible para utilizar en estaciones de servicio a las personas
que utilizan auto particular o moto.
● $80.000 en carga de tarjeta SUBE a los empleados que utilizan colectivo o tren.
● Un kit de seguridad compuesto por un chaleco fluorescente y un casco para las personas que
se muevan en bicicleta.

Consigna:
A. Modelá las clases que considera necesarias para que cada empleado pueda tener registrado
que movilidad utiliza. Este dato puede ser cambiado en un futuro, es decir un empleado
puede pasar de moverse en auto a moverse en bicicleta cuando desee. Armá el código y el
diagrama de clases con sus relaciones utilizando herencia si considerás necesario.
B. Imprimí en pantalla el premio que obtendrá cada empleado. Tené en cuenta que todas las
personas que utilizan un tipo de movilidad recibirán el mismo premio.
C. La empresa decidió modificar el premio para las personas que utilicen un auto, no les dará
nada de premio. También decidió incorporar la modalidad monopatín eléctrico que recibirá
como premio una entrada para un evento a elección. Modificá todo lo necesario para que el
programa siga funcionando con los nuevos cambios.
*/

                Empleado ana = new Empleado("Banquetita", new Auto());
                Empleado lucas = new Empleado("Perchita", new Bicicleta());
                Empleado juan = new Empleado("Gati", new Colectivo());

                ana.mostrarPremio();
                lucas.mostrarPremio();
                juan.mostrarPremio();


                juan.cambiarMovilidad(new Bicicleta());
                juan.mostrarPremio();
            }
        }




