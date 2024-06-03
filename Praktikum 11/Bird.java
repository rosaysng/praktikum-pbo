//Nama : Rosa Yohana Sinaga
//NIM  : 24060122120009


public class Bird extends Animal implements IFlyer {
    public void takeOff(){
        System.out.println("Burung lepas landas menggunakan dorongan sayapnya");
    }
    public void land(){
        System.out.println("Burung mendarat dengan kedua kakinya");
    }
    public void fly(){
        System.out.println("Burung terbang dengan kedua sayapnya");
    }
    public void buildNest(){
        System.out.println("Burung dapat membangun sarangnya sendiri");
    }
    public void layEggs(){
        System.out.println("Burung adalah hewan yang bertelur");
    }
    public void eat(){
        System.out.println("Makanan burung");
    }
    
}
