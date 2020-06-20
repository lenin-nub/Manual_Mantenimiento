/*
Diseñe e implemente una clase Manual_Mantenimiento que contenga los siguientes atributos: código de tipo entero,
servicio de tipo String, mantenimiento de tipo String, numMantenimiento de tipo entero.
Diseñe e implemente sus respectivos métodos get() y set() correspondientes para cada atributo; además,
implemente el método toString() para mostrar la información relativa a la clase Manual_Mantenimiento
En la clase principal main(), diseñe e implemente 2 objetos Manual_Mantenimiento, con valores que considere
necesarios y muestre por pantalla.
Por ultimo, imprimir cuál de los 2 objetos tiene más numMantenimiento

*/
package manual_mantenimientoapp;

/**
 *
 * @author Lenin Paul
 */
class Manual_Mantenimiento{
 /*Atributos*/
private int codigo;
private String servicio;
private String mantenimiento;
private int numMantenimiento;

    /*Constructor*/

 public Manual_Mantenimiento(int pCodigo, String pServicio ,String pMantenimiento ,int pNumMantenimiento) {
    codigo=pCodigo;
    servicio=pServicio;
    mantenimiento=pMantenimiento;
    numMantenimiento=pNumMantenimiento;
}
/*Metodos*/

public int getCodigo (){
    return codigo;
}
public void setCodigo(int codigo){
    this.codigo= codigo ;/*this,puntero que invocaa al atrivuto private codigo*/
}
public String getServicio(){
    return servicio;
}
public void setServicio(String servicio){
    this.servicio= servicio ;
}
public String getMantenimiento(){
    return mantenimiento;
}
public void setMantenimiento(String mantenimiento){
    this.mantenimiento= mantenimiento ;
}
public int getNumMantenimiento(){
    return numMantenimiento;
}
public void setNumMantenimiento(int numMantenimiento){
    this.numMantenimiento= numMantenimiento ;
}
@Override
public String  toString(){
    return "El Manual de Mantenimiento "+servicio+" con CODIGO : "+codigo+" --"
           + " Inspeccionado por el Supervisor de "+mantenimiento
           + " tiene registrados : "+numMantenimiento+" mantenimientos";
}
}

public class Manual_MantenimientoApp{

    public static void main(String[] args) {
        // Creamos los objetos
        Manual_Mantenimiento manual1=new Manual_Mantenimiento(111,  "Servicio1", "Mantenimiento1",  30);
        Manual_Mantenimiento manual2=new Manual_Mantenimiento(112,  "Servicio2", "Mantenimiento2",  60);

        // Mostramos su estado
        System.out.println(manual1.toString());
        System.out.println(manual2.toString());

        //Modificamos el atributo NumMantenimiento del manual1
        manual1.setNumMantenimiento(70);

        //Comparamos quien tiene mas mantenimientos
        if(manual1.getNumMantenimiento()<manual2.getNumMantenimiento()){
            System.out.println(manual1.getMantenimiento()+" tiene mas mantenimientos");
        }else{
            System.out.println(manual2.getMantenimiento()+" tiene mas mantenimientos");
        }
    }

}
