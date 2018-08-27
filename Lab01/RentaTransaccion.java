public class RentaTransaccion {

    private String id, fecha,pickDate,returnDate, valorHora,valorTotal;

    public RentaTransaccion(String id,String fecha,String pickDate,String returnDate
    ,String valorHora, String valorTotal, String idCli, String placa) {
        this.id=id;
        this.fecha=fecha;
        this.pickDate=pickDate;
        this.returnDate=returnDate;
        this.valorHora=valorHora;
        this.valorTotal=valorTotal;     
        System.out.println("se ha registrado una nueva transaccion");
    }

    public String getId(){
        return id;
    }

    public String getFecha(){
        return fecha;
    }  
    
    public String getPickDate(){
        return pickDate;
    }

    public String getReturnDate(){
        return returnDate;
    }

    
    public void setId(String id){
        this.id=id;
    }


    public void setFecha(String fecha){
        this.fecha=fecha;
    }

    
    public void setPickDate(String pickDate){
        this.pickDate=pickDate;
    }

    public void setReturnDate(String returnDate){
        this.returnDate= returnDate;
    }

    public void setValorHora(String valorHora){
        this.valorHora= valorHora;
    }
    public void setValorTotal(String valorTotal){
        this.valorTotal=valorTotal;
    }   
}