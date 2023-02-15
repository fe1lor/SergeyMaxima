package Arrays;

public class Player {

    String playerName = "New name";
    int score;
    public void changeName(String playerName) {
        playerName = "New player";
    }

    public String shot(int horizont, int vertical) {
        return playerName + "решил ударить по ячейке" + horizont + ", " + vertical;
    }
    public void gift() {
        int score = +1;
    }
}

