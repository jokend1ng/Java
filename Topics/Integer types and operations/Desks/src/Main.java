import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int x=0;
        int y;
        int z;
        if (a%2!=0){
            x=a/2+1;
        }else {
            x=a/2;
        }
        if (b%2!=0){
            y=b/2+1;
        }else {
            y=b/2;
        }
        if (c%2!=0){
            z=c/2+1;
        }else {
            z=c/2;
        }
        System.out.println(x+y+z);
    }
}