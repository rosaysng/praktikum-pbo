//Nama : Rosa Yohana Sinaga
//NIM  : 24060122120009

public class Airport {
    private Airplane airplane;
    private String name;
    public Airport(String name){
        this.name = name;
    }
    public String givePermissionToLand(IFlyer flyer){
        if (flyer instanceof Airplane){
            return "Izin mendarat diberikan";
        }
        else{
            return "Izin mendarat ditolak";
        }
    }
    
}
