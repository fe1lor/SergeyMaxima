package Arrays;

public class Player {

    String playerName = "New name";
    int score;

    /*   public static void main(String[] args) {

           int[][] seaFightArray = new int[11][11];
           for (int i = 1; i < 11; i++) {
               seaFightArray[i][0] = i;
           }
           for (int i = 1; i < 11; i++) {
               seaFightArray[0][i] = i;
           }
           for (int i = 0; i < seaFightArray.length; i++) {
               for (int j = 0; j < seaFightArray[0].length; j++) {
                   System.out.print(" " + seaFightArray[i][j] + " ");
               }
               System.out.println();
           }
       }*/
    public void changeName(String playerName) {
        playerName = "New player";
    }

    public String shot(int horizont, int vertical) {
        return playerName + "решил ударить по ячейке" + horizont + ", " + vertical;
    }

    //3) Метод начисления очков. Нет входных параметров и нет возвращаемых, он типа void.
    //При вызове метода он должен взять текущее значение параметра очки игрока и добавить ещё 1 очко.
    public void gift() {
        int score = +1;
    }
}

