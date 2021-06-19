
import java.util.Scanner;

public class matrisTranspozu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, j;  
        System.out.println("Kac satır kac sütun olacak : ");  
        int satir = s.nextInt();  
        int sutun = s.nextInt();  
        int dizi[][] = new int[satir][sutun];  
        System.out.println("Soldan sağa matrisi yaz :");  
        for(i = 0; i < satir; i++)  
        {  
           for(j = 0; j < sutun; j++)   
              {  
              dizi[i][j] = s.nextInt();  
              System.out.print(" ");  
            }  
      }  
        System.out.println("Girdiğin Matris ");  
        for(i = 0; i < satir; i++)  
         {  
            for(j = 0; j < sutun; j++)  
            {  
            System.out.print(dizi[i][j]+" ");  
            }  
            System.out.println(" ");  
        }  
        System.out.println("Transpoz Matris ");  
        for(i = 0; i < sutun; i++)  
        {  
            for(j = 0; j < satir; j++)  
            {  
                System.out.print(dizi[j][i]+" ");  
            }  
            System.out.println(" ");  
        }  
    }
}
