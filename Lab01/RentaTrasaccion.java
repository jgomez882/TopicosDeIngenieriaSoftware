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

    
    public String setId(String id){
        this.id=id;
    }


    public String setFecha(String fecha){
        this.fecha=fecha;
    }

    
    public String setPickDate(String pickDate){
        this.pickDate=pickDate;
    }

    public String setReturnDate(String returnDate){
        this.returnDate= returnDate;
    }

    public String setValorHora(String valorHora){
        this.valorHora= valorHora;
    }
    public String setValorTotal(String valorTotal){
        this.valorTotal=valorTotal;
    }   
}