/* Esta clase realiza las operaciones para calcular los litros que posee los galones, costos por litro, 
totales a pagar, entre otras operaciones.

*/
package Gas;


public class Operaciones {
    //Variables miembro de la clase
    private int cantGalones; //Galones a cargar
    private double litrosGalon = 3785.41; // Mililitros que posee un galon
    private double costoLitros; // Costo por litro
    private double total; // Total a pagar
    private double costoGalon; // Costo por galon
    private double litrosCargados; // Litros cargados (galones a litros)

    
    
    //Constructor por default de la clase Operaciones
    public  Operaciones()
    {
      
    }
    
    //Constructor Operaciones con sobrecarga 
    public Operaciones(int galones, double costoGalon) {
        setCantGalones(galones);
        setCostoGalon(costoGalon);
    }
    
    //Cantidad de galones a cargar
    private int getCantGalones() {
        return cantGalones;
    }
    
    //Asignacion de galones a cantGalones
    private void setCantGalones(int cantGalones) {
        this.cantGalones = cantGalones;
    }
    
    //Método para obtener los litros de un galon
    private double getLitrosGalon() {
        return litrosGalon;
    }
    
    //Método que nos permite reasignar los litros que puede tener un galon
    private void setLitrosGalon(double litrosGalon) {
        this.litrosGalon = litrosGalon;
    }
    
    //Método para calcular el costo por litro
    public double getCostoLitros() {
        costoLitros = (getCostoGalon() / getLitrosGalon()) * 1000;
        return costoLitros;
    }
    
    //Método para reasignar otro costo a los litros
    private void setCostoLitros(double costoLitros) {
        this.costoLitros = costoLitros;
    }
    
    //Método que nos da el total a pagar en litros
    public double getTotal() {
        total = getLitrosCargados() * getCostoLitros();
        return total;
    }
    
    //Método para cambiar el total a pagar
    private void setTotal(double total) {
        this.total = total;
    }
    
    //Método para obtener el costo del galon 
    private double getCostoGalon() {
        return costoGalon;
    }

    //Método para asignar el costo del galon
    private void setCostoGalon(double costoGalon) {
        this.costoGalon = costoGalon;
    }

    //Método para calcular los litros cargados
    public double getLitrosCargados() {
        litrosCargados = (getLitrosGalon()* getCantGalones()) / 1000;
        return litrosCargados;
    }

    private void setLitrosCargados(double litrosCargados) {
        this.litrosCargados = litrosCargados;
    }
    

}

