public class MethodReturnValue {
    public static void main(String[] args) {
        var a = 100;
        var b = 200;
        var c = sum(a,b);

        System.out.println(c);

        System.out.println(hitung(100,"+" , 100));
        System.out.println(hitung(300,"-" , 100));
    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return  total;
    }

    static int hitung (int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return  value1 - value2;
            default:
                return 0;
        }
    }
}
