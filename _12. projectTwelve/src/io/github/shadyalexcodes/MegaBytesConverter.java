package io.github.shadyalexcodes;

public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1244);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remKilo = kiloBytes % 1024;

        if(kiloBytes <= 0) {
            System.out.println("Invalid Value");
        }
        System.out.println(kiloBytes + "KB = " + megaBytes + "MB and " + remKilo + "KB");
    }
}
