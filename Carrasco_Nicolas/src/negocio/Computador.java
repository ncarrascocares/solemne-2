
package negocio;

/**
 *
 * @author ncarrasco
 */
public class Computador {
    
      //Atributos
    private String sistemaOperativo;
    private String marca;
    private String modelo;
    private int peso;
    static final int RAM = 4;
    
    //Constructor sin parametros
    public Computador(){
        
    }
    
     //Constructor con parametros
    public Computador(String sistemaOperativo, String marca, String modelo, int peso) {
        this.sistemaOperativo = sistemaOperativo;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        //this.ram = 4;
        
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getRam() {
        return RAM;
    }

    //Metodo de la clase Padre
    public void mostrarDatos(){
        System.out.println("Sistema Operativo : " + sistemaOperativo);
        System.out.println("Marca             : " + marca);
        System.out.println("Modelo            : " + modelo);
        System.out.println("Peso              : " + peso + " kilos");
        System.out.println("Ram original      : " + RAM);
    }
}
