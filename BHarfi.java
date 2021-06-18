
public class BHarfi {
    public static void main(String[] args) {
        int yukseklık = 5;
        int genislik = (2 * yukseklık) - 1;
        int i, j, yariYukseklik = (yukseklık / 2);
        for (i = 0; i < yukseklık; i++) {
            System.out.print("*");
            for (j = 0; j < genislik; j++) {
                if ((i == 0 || i == yukseklık - 1 || i == yariYukseklik)
                    && j < (genislik - 2))
                    System.out.print("*");
                else if (j == (genislik - 2)
                         && !(i == 0 || i == yukseklık - 1
                              || i == yariYukseklik))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
    

