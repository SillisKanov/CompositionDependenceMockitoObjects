import java.util.Arrays;

public class ManagerPoster {

    private String[] posters = new String[0];
    private int countLastPosters;

    public ManagerPoster() {
        countLastPosters = 5;
    }

    public ManagerPoster(int countLastPosters) {
        this.countLastPosters = countLastPosters;
    }

    public void add(String newPoster) {
        String[] posters = new String[this.posters.length + 1];
        for (int i = 0; i < this.posters.length; i++) {
            posters[i] = this.posters[i];
        }
        posters[posters.length - 1] = newPoster;
        this.posters = posters;
    }

    public String[] findAll() {
        System.out.println(Arrays.toString(posters));
        return posters;
    }

    public String[] findLast() {
        int lastCount = (posters.length < countLastPosters)? posters.length:countLastPosters;
        String[] lastPosters;
        lastPosters = new String[lastCount];

        for (int i = 0; i < lastPosters.length; i++) {
            lastPosters[i] = posters[posters.length - 1 - i];
        }

        System.out.println(Arrays.toString(lastPosters));
        return lastPosters;
    }
}
