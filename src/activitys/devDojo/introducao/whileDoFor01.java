package activitys.devDojo.introducao;

public class whileDoFor01 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10){
            System.out.println(++count);
        }

        for (count = 0 ; count < 10 ; count++){
            System.out.println("For" + count);
        }

        String[] nomes = new String[3];
        nomes[0] = "Player 1";
        nomes[1] = "Player 2";
        nomes[2] = "Player 3";

        for (int i = 0; i <nomes.length; i++){
            System.out.println(nomes[i]);
        }

        int[] numero = new int[3];
        numero[0] = 1;
        numero[1] = 2;
        numero[2] = 3;

        for (int num : numero){
            System.out.println(numero[num]);
        }
    }
}
