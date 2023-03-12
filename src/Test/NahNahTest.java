package Test;

public class NahNahTest {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=10-i;j++) {
                System.out.print("   ");
            }
            for(int a=1;a<=(2*i-1);a++){
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }
}
