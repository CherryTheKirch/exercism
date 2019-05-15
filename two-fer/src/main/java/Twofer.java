import java.util.Objects;

class Twofer {
    String twofer(String name) {
        final String msg = "One for %s, one for me.";
        String who = Objects.toString(name, "you");
        return String.format(msg, who);
    }
}
