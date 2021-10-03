public class Method77 
{
    public static void main(String[] args)
    {
        // Cara panggil method fraction & cetak output
        printFraction(); 
    }
    
    // Method untuk penjumlahan kedua pecahan
    static void sumFraction(int e1, int d1, int e2, int d2)
    {
        // inisialisasi var es dan es disimpan dlm tipe data int
        int es = (e1 * d2 + e2 *d1);
        int ds = (d1 * d2);
        
        // (percabangan) memilah hasil akhir penjumlahan pecahan
        if (es%ds == 0)
        {
            System.out.println(es/ds);
        }
        else
        {
            System.out.println(es+ "/" +ds);
        }
           
    }
    
    // Method untuk perkalian kedua pecahan
    static void productFraction(int e1, int d1, int e2, int d2)
    {
        // inisalisasi var ep dan dp disimpan dlm tipe data int
        int ep = (e1 * e2);
        int dp = (d1 * d2);
        
        // (percabangan) memilah hasil akhir perkalian pecahan
        if (ep%dp == 0)
        {
            System.out.println(ep/dp);
        }
        else
        {
            System.out.println(ep+ "/" +dp);
        }   
    }
    
    // Method cetak output hasil penjumlahan ataupun perkalian
    static void printFraction()
    {
        // cetak output penjumlahan kedua pecahan
        sumFraction(1, 2 ,2, 3);
        sumFraction(1, 3, 3, 4);
        
        // cetak output perkalian kedua pecahan
        productFraction(1, 2 ,2, 3);
        productFraction(1, 4, 2, 3);    
    }
}
