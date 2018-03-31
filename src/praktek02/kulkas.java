package praktek02;
public class kulkas {
       String merek;
       double harga;
       double jumlah;
       
       void pendingin(){
           System.out.println("=================");
           System.out.println("merek : "+merek);
           System.out.println("harga : "+harga);
           System.out.println("jumlah : "+jumlah);
           System.out.println("=================");
       }
       
       double hitungnilai(){
           double nilai;
           nilai=harga*jumlah;
           return nilai;
        
}
}