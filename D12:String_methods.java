public class Main {
    public static void main(String[] args){
        String  test = "Test";
        int res1 = test.length();
        System.out.println(res1);
        boolean res2 = test.equals("test");
        System.out.println(res2);
        char res3 = test.charAt(2);
        System.out.println(res3);
        int res4 = test.indexOf("e");
        System.out.println(res4);
        String res5 = test.toUpperCase();
        System.out.println(res5);
        String res6 = test.toLowerCase();
        System.out.println(res6);
        String test2 = "     Test     ";
        String res7 = test2.trim();
        System.out.println(res7);
        String res8 = test.replace("T", "B");
        System.out.println(res8);
    }
}
