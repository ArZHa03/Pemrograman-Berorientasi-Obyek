public class TestStack {
    public static void main(String[] args) {
        try {
            Stack stack = new Stack(5);
            stack.push("satu");
            stack.push("dua");
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            stack.push("satu");
            stack.push("dua");
            stack.push("tiga");
            stack.push("empat");
            stack.push("lima");
            stack.push("enam");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }
    }
}
