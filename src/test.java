public class test {
    public static void main(String[] args) {
//        String a1 = "123|";
//        String[] b1 = a1.split("\\|");
//        for (String s : b1) {
//            System.out.print(s + " ");
//        }
        String a = "02";
        chose(a);
    }

    private static void chose(String canshu) {
        switch (canshu) {
            case "01": {
                System.out.println("01口");
                break;
            }
            case "02": {
                System.out.println("02口");
                chose("01");
                break;
            }
            default: {
                System.out.println("啥也不是");
            }
        }
    }
}
