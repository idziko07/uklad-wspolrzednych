import java.util.Scanner;

public class wspolrzedne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj X:");
        int wspolrzednaX = input.nextInt();
        System.out.println("Podaj Y:");
        int wspolrzednaY = input.nextInt();

        if(wspolrzednaX > 0 && wspolrzednaY > 0){
            System.out.println("Punkt (" + wspolrzednaX + "," + wspolrzednaY + ") leży w I cwiartce układu współrzednych. ");
        }else if(wspolrzednaX < 0 && wspolrzednaY > 0){
            System.out.println("Punkt (" + wspolrzednaX + "," + wspolrzednaY + ") leży w II cwiartce układu współrzednych. ");
        }else if(wspolrzednaX < 0 && wspolrzednaY < 0){
            System.out.println("Punkt (" + wspolrzednaX + "," + wspolrzednaY + ") leży w III cwiartce układu współrzednych. ");
        }else if(wspolrzednaX > 0 && wspolrzednaY < 0){
            System.out.println("Punkt (" + wspolrzednaX + "," + wspolrzednaY + ") leży w IV cwiartce układu współrzednych. ");
        }else if(wspolrzednaX == 0 && wspolrzednaY < 0){
            System.out.println("Punkt (" + wspolrzednaX + "," + wspolrzednaY + ") leży na osi y miedzy III i IV cwiartką układu współrzednych. ");
        }else if(wspolrzednaX == 0 && wspolrzednaY > 0){
            System.out.println("Punkt (" + wspolrzednaX + "," + wspolrzednaY + ") leży na osi y miedzy I i II cwiartką układu współrzednych. ");
        }else if(wspolrzednaX > 0 && wspolrzednaY == 0){
            System.out.println("Punkt (" + wspolrzednaX + "," + wspolrzednaY + ") leży na osi x miedzy I i IV cwiartką układu współrzednych. ");
        }else if(wspolrzednaX < 0 && wspolrzednaY == 0){
            System.out.println("Punkt (" + wspolrzednaX + "," + wspolrzednaY + ") leży na osi x miedzy II i III cwiartką układu współrzednych. ");
        }else if(wspolrzednaX == 0 && wspolrzednaY == 0){
            System.out.println("Punkt (" + wspolrzednaX + "," + wspolrzednaY + ") jest początkiem układu współrzednych. ");
        }

    }
}
