package Tugas;

import java.util.*;

public class Tugas1_1 {
    public static void main(String[] args) {
        TreeMap<String, String> map1 = new TreeMap<String, String>();
        TreeMap<String, String> map2 = new TreeMap<String, String>();

        map1.put("Jawa", "Jawa Barat, Jawa Tengah, Jawa Timur"); map1.put("Sumatera", "Sumatera Barat, Sumatera Selatan, Sumatera Utara"); map1.put("Kalimantan", "Kalimantan Barat, Kalimantan Selatan, Kalimantan Tengah"); map1.put("Sulawesi", "Sulawesi Barat, Sulawesi Selatan, Sulawesi Tengah"); map1.put("Papua", "Papua Barat, Papua");

        map2.put("Jawa Barat", "Bandung"); map2.put("Jawa Tengah", "Semarang"); map2.put("Jawa Timur", "Surabaya"); map2.put("Sumatera Barat", "Padang"); map2.put("Sumatera Selatan", "Palembang"); map2.put("Sumatera Utara", "Medan"); map2.put("Kalimantan Barat", "Pontianak"); map2.put("Kalimantan Selatan", "Banjarmasin"); map2.put("Kalimantan Tengah", "Palangkaraya"); map2.put("Sulawesi Barat", "Mamuju"); map2.put("Sulawesi Selatan", "Makassar"); map2.put("Sulawesi Tengah", "Palu"); map2.put("Sulawesi Tenggara", "Kendari"); map2.put("Sulawesi Utara", "Manado"); map2.put("Papua Barat", "Manokwari"); map2.put("Papua", "Jayapura"); map2.put("Bali", "Denpasar"); map2.put("Nusa Tenggara Barat", "Mataram"); map2.put("Nusa Tenggara Timur", "Kupang"); map2.put("Maluku", "Ambon"); map2.put("Maluku Utara", "Ternate"); map2.put("Banten", "Serang"); map2.put("Gorontalo", "Gorontalo"); map2.put("Riau", "Pekanbaru"); map2.put("Riau Kepulauan", "Tanjung Pinang"); map2.put("Jambi", "Jambi"); map2.put("Bangka Belitung", "Pangkal Pinang"); map2.put("Lampung", "Bandar Lampung"); map2.put("DKI Jakarta", "Jakarta");

        System.out.print("Ibukota propinsi di pulau sumatera: ");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            if (entry.getKey().contains("Sumatera")) {
                System.out.print(entry.getValue());
                if(entry.getKey() != "Sumatera Utara") {
                    System.out.print(", ");
                } else {
                    System.out.println(".");
                }
            }
        }
        System.out.print("Ibukota provinsi di pulau jawa: ");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            if (entry.getKey().contains("Jawa")) {
                System.out.print(entry.getValue());
                if(entry.getKey().contains("Jawa Timur")) {
                    System.out.println(".");
                } else {
                    System.out.print(", ");
                }
            }
        }
        System.out.print("Ibukota propinsi yang berawalan S: ");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            if (entry.getValue().startsWith("S")) {
                System.out.print(entry.getValue());
                if(entry.getValue().startsWith("Surabaya")) {
                    System.out.println(".");
                } else {
                    System.out.print(", ");
                }
            }
        }
    }
}