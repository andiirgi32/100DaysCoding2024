package SeratusHariJava;

public class Day51 {

    public static void main(String[] args) {
        //Percabangan : Switch Case

        String nilai = "B";

        switch (nilai) {
            case "A":
                System.out.println("Mendapatkan nilai sangat baik");
                break;
            case "B":
                System.out.println("Mendapatkan nilai baik");
                break;
            case "C":
                System.out.println("Mendapatkan nilai cukup baik");
                break;
            default:
                System.out.println("Angka Belum ada dalam data");
                break;
        }
    }
}
