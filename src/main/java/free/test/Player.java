package free.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Player p1 = new Player("messi");
        Player p2 = new Player("messi");
        System.out.println(p1.equals(p2));

        Set<Player> uniquePlayer = new HashSet<>();
        uniquePlayer.add(new Player("messi"));
        uniquePlayer.add(new Player("messi"));
        System.out.println(uniquePlayer.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return 4;
    }
}
