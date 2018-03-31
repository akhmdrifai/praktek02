package praktek02;
public class kulkasaksi {
    
    public static void main(String[] args) {
        kulkas t1 = new kulkas ();
        t1.merek = "samsung";
        t1.harga = 6000000;
        t1.jumlah = 1;  
        
        
        t1.hitungnilai();
        System.out.println("nilai kulkas : "+t1.hitungnilai());
        t1.hitungnilai();
        
        kulkas t2 = new kulkas();
        t2.pendingin();
        
        kulkas t3 = new kulkas("LG ",4000000,1);
        t3.pendingin();
        
        
    }
}
