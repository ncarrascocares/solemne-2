
package negocio;

/**
 *
 * @author ncarrasco
 */
public class Escritorio extends Computador{
    
     //Atributo de la clase
    private int ramAdicional;
    
    public Escritorio(){
        
    }
    
    public Escritorio(int ramAdicional, String sistemaOperativo, String marca, String modelo, int peso, int id) {
        super(sistemaOperativo, marca, modelo, peso, id);
        this.ramAdicional = ramAdicional;
    }

    public int getRamAdicional() {
        return ramAdicional;
    }

    public void setRamAdicional(int ramAdicional) {
        this.ramAdicional = ramAdicional;
    }
    
    //Metodo para mostar informacion por pantalla
    @Override
     public void mostrarDatos(){
        System.out.println("\nPC");
        super.mostrarDatos();
        System.out.println("Ram adicional     : " + getRamAdicional());
    }
    
}
