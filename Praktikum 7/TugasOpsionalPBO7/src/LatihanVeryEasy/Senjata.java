/*Nama : Rosa Yohana Sinaga
NIM  : 24060122120009
 */

package LatihanVeryEasy;


public class Senjata {
    private String bunyi;
    private int peluru;    
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    public String getBunyi(){
        return bunyi;
    }
    public int getPeluru(){
        return peluru;
    }
    public void menembak(){
        System.out.println(getBunyi()+"");
        setPeluru(getPeluru()-1);
        System.out.println("Sisa peluru: "+ getPeluru());
    }
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    
}
