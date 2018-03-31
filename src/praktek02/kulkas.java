package praktek02;
public class kulkas {
       String merek;
       double harga;
       double jumlah;

    public kulkas() {
        merek="samsung";
        harga=6000000;
        jumlah=1;
    }
       
       
       
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
        void cetakinfo(){
            System.out.println("nilainya adalah : "+hitungnilai());
          
}
}