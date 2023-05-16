package activitys.devDojo.introducao;

public class multidimentionalArray {
    public static void main(String[] args) {
        String[][] produto = new String[3][3];

        produto[0][0] = "Canetas esferográficas";
        produto[0][1] = "Lápis de cor";
        produto[0][2] = "Adesivos decorados";

        produto[1][0] = "Marcadores de quadro branco";
        produto[1][1] = "Pastas com aba elástica";
        produto[1][2] = "Envelopes";

        produto[2][0] = "Papel sulfite";
        produto[2][1] = "Mochilas";
        produto[2][2] = "Cartilhas";




        // SEM FOREACH
//        for (int i = 0; i < produto.length; i++){
//            System.out.println("Loja " + i);
//            for (int j = 0; j < produto[0].length; j++){
//                System.out.println(produto[i][j]);
//            }
//        }

        for (String[] loj : produto){
            for (String lojProd : loj){
                System.out.println(lojProd);
            }
        }


    }
}
