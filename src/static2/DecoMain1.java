package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        // 위의 코드와 다를게 없다.
        DecoUtil1 utils2 = new DecoUtil1();
        utils2.deco(s);

        System.out.println("before: "+ s);
        System.out.println("afer: "+ deco);
    }
}
