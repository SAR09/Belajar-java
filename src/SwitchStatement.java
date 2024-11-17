public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "E";
        switch (nilai){
            case "A":
                System.out.println("Wow, Anda lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
        }

        switch (nilai){
            case "A" -> System.out.println("Wow, Anda lulus Dengan Baik");
            case "B", "C" -> System.out.println("Nilai anda cukup baik");
            case  "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Wow, Anda lulus Dengan Baik";
            case "B", "C" -> ucapan= "Nilai anda cukup baik";
            case  "D" -> ucapan = "Anda tidak lulus";
            default -> {
                ucapan = "Mungkin anda salah jurusan";
            }
        }
        System.out.println(ucapan);

        ucapan = switch (nilai){
            case "A":
                yield "Wow, Anda lulus Dengan Baik";
            case "B", "C":
                yield  "Nilai anda cukup baik";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Mungkin anda salah jurusan";
        };

        System.out.println(ucapan);
    }
}
