public class Cliente {

    private String id, nombre,genero,tipo;

    public Cliente(String id,String nombre,String genero,String tipo) {
        this.id=id;
        this.tipo=tipo;
        this.nombre=nombre;
        this.genero=genero;
    }

    public String getNombre(){
        return nombre;
    }

    public String getId(){
        return id;
    }  
    
    public String getGenero(){
        return genero;
    }

    public String getTipo(){
        return tipo;
    }

    

    public void setId(String id){
        this.id=id;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    
    public void setGenero(String genero){
        this.genero=genero;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }
}