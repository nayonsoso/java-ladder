package domain;

import java.util.Objects;

public class Player {

    private final Name name;

    public Player(String name) {
        this.name = new Name(name);
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
        return Objects.hash(name);
    }

    //todo: 여차하면 삭제
    public String getName(){
        return this.name.getName();
    }
}
