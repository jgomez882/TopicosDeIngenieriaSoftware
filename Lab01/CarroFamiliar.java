public class CarroFamiliar implements Carro{
    private String placa,cilindraje,marca,color,transmision,puestos;
    private String valH,seguro;
    private int stock;

    public CarroFamiliar(String placa,String cilindraje,String marca,String color,
    String transmision,String puestos,String valH,String seguro,int stock){
        this.placa=placa;
        this.stock=stock;
        this.seguro=seguro;
        this.valH=valH;
        this.puestos=puestos;
        this.transmision=transmision;
        this.color=color;
        this.marca=marca;
        this.cilindraje=cilindraje;
    }

    @Override
    public String getPlaca(){
        return placa;
    }
    @Override
    public String getCilindraje(){
        return cilindraje;
    }
    @Override
    public String getMarca(){
        return marca;
    }
    @Override
    public String getcolor(){
        return color;
    }
    @Override
    public String getTransmision(){
        return transmision;
    }
    @Override
    public String getPuestos(){
        return puestos;
    }
    public String getValH(){
        return valH;
    }
    public int getStock(){
        return stock;
    }
    public String getSeguro(){
        return seguro;
    }

    @Override
    public void setPlaca(String placa){
        this.placa=placa;
    }
    @Override
    public void setCilindraje(String cilindraje){
        this.cilindraje=cilindraje;
    }
    @Override
    public void setMarca(String marca){
        this.marca=marca;
        
    }
    @Override
    public void setcolor(String color){
        this.color=color;    
    }
    @Override
    public void setTransmision(String transmision){
        this.transmision=transmision;
    }
    @Override
    public void setPuestos(String puestos){
        this.puestos=puestos;
    }
    public void setValH(String valH){
        this.valH=valH;
    }
    public void setSeguro(String seguro){
        this.seguro=seguro;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
}