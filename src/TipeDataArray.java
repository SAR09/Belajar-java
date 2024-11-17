public class TipeDataArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Saiful";
        arrayString[1] = "Amin";
        arrayString[2] = "Rizki";

        System.out.println(arrayString[1]);


        int[] arrayInt = {
                10,20,30,40,50
        };
        System.out.println(arrayInt.length);

        String[][] members = {
                {"Saiful", "Amin", "Rizki"},
                {"Agus", "Setiawan"},
                {"Bambang"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][1]);
    }
}
