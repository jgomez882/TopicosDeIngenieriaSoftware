import java.util.ArrayList;
import java.util.Scanner;
public class AppRentaCar{
    static boolean running=true;
    public static Carro carroFactory(String in,String[] in2){
        switch (in) {
            case "d":
                return new CarroDeportivo(in2[0], in2[1], in2[2], in2[3], in2[4], in2[5], in2[6], in2[7], Integer.parseInt(in2[8]));
            case "e":
                return new CarroStandar(in2[0], in2[1], in2[2], in2[3], in2[4], in2[5], in2[6], in2[7], Integer.parseInt(in2[8])); 
            case "f":
                return new CarroFamiliar(in2[0], in2[1], in2[2], in2[3], in2[4], in2[5], in2[6], in2[7], Integer.parseInt(in2[8]));
            default:
            return new CarroStandar(in2[0], in2[1], in2[2], in2[3], in2[4], in2[5], in2[6], in2[7], Integer.parseInt(in2[8]));                
        }
        
    }
    public static void main(String[] args){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Carro> carros = new ArrayList<Carro>();
        ArrayList<RentaTransaccion> rent =new ArrayList<RentaTransaccion>();
        Scanner sc = new Scanner(System.in);
        Cliente cli;

        RentaTransaccion rt;
        Carro car;
        String in="";
        String[] in2;
        do{
            System.out.println("1 para registrar carro, 2 usuario, 3 transacciones, exit para salir");
            in=sc.nextLine();
            if(in.equals("exit"))System.exit(0);
            if(in.equals("1")){
                System.out.println("elige el tipo de carro");
                System.out.println("d: deportivo, e: estandar y f: familiar");
                in=sc.nextLine();
                System.out.println("ingrese los siguientes datos");
                System.out.println("placa, cilindraje, marca, color, transmision, puestos, valH, seguro, stock");
                in2=sc.nextLine().split(" ");
                carros.add(carroFactory(in, in2));
            }
            else if(in.equals("2")){
                System.out.println("Ingrese id, nombre, genero[M,F],tipo[VIP,normal]");
                in2=sc.nextLine().split(" ");
                clientes.add(new Cliente(in2[0], in2[1], in2[2], in2[3]));
            }else if(in.equals("3")){
                System.out.println("Ingrese id, fecha, pickDate, ReturnDate, valorHora, valorTotal");
                in2=sc.nextLine().split(" ");
                for(int i=0;i<carros.size();i++){
                    if(carros.get(i).getPlaca().equals(in2[7]) && clientes.get(i).getId().equals(in2[6])){
                        rent.add(new RentaTransaccion(in2[0], in2[1], in2[2], in2[3],in2[4],in2[5],in2[6],in2[7]));                                                                        );
                        rt=new RentaTransaccion(in2[0], in2[1], in2[2], in2[3],in2[4],in2[5],in2[6],in2[7]);
                    }
                }
                
            }

            System.out.println("elige el tipo de carro");
            System.out.println("deportivo, estandar y familiar");



            
            
        }while(running);
        
    }
}