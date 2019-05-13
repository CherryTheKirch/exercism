class Twofer {
    String twofer(String name) {
        final String msg = "One for %s, one for me.";
        if(name != null) return String.format(msg, name); 
        return String.format(msg, "you");
    }
}
