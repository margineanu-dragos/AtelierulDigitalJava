import java.util.Scanner;

public class FirstProgram {

    public static void main (String[] args){
        int number;
        Scanner sc = new Scanner(System.in);
        int[] NumbArray=new int[6];
        System.out.printf("Inserati 6 numere naturale:\n");
        for(int i=0;i<6;i++){
          number = sc.nextInt();
          NumbArray[i]=number;
        }

        for( Integer n: NumbArray){
            System.out.printf("%d ",n);
        }
    }
}
