package hiding;

public class MethodHidingApplication {
    public static void main(String[] args) {
            Parent obj = new Child();
            obj.main(new String[]{"Amol", "Saudar"});
    }
}
