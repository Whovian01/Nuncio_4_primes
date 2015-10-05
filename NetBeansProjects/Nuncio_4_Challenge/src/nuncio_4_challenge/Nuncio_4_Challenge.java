package nuncio_4_challenge;

public class Nuncio_4_Challenge {

    public static void main(String[] args) {

        for (int i = 0; i < 500; i++) {

            if (isFive(i) & isEleven(i)) {
                System.out.println("Animate this!");
            } else if (isThree(i) & isEleven(i)) {
                System.out.println("Herr Direktor");
            } else if (isTwo(i) & isEleven(i)){
                System.out.println("ninja");
            } else if (isTwo(i) & isThree(i) & isFive(i)){
                System.out.println("Team Building");
            } else if (isTwo(i) & isThree(i)) {
                System.out.println("chismé");
            } else if (isThree(i) & isFive(i)){
                System.out.println("Old School");
            } else if (isTwo(i)){
                System.out.println("Davis");
            } else if (isThree(i)){
                System.out.println("Claughton");
            } else if (isFive(i)){
                System.out.println("Vidal");
            } else {
                System.out.println(i);
            }
        }
    }

    static boolean isThree(int a) {
        return (a % 3 == 0);
    }

    static boolean isTwo(int a) {
        return (a % 2 == 0);
    }

    static boolean isFive(int a) {
        return (a % 5 == 0);
    }

    static boolean isEleven(int a) {
        return (a % 11 == 0);
    }

}
