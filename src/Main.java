import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> bjork = List.of(1977, 1990, 1993, 1995, 1997, 2001, 2004, 2007, 2011, 2015, 2017, 2022);
        List<Integer> radiohead = List.of(1993, 1995, 1997, 2000, 2001, 2003, 2007, 2011, 2016);
        List<Integer> kanyeWest = List.of(2004, 2005, 2007, 2008, 2010, 2011, 2013, 2016, 2018, 2019, 2021);

        int bjorkMaxRange = maxRange(bjork);
        int radioheadMaxRange = maxRange(radiohead);
        int kanyeWestMaxRange = maxRange(kanyeWest);

        List<Integer> bjorkRange = findRange(bjork);
        List<Integer> radioheadRange = findRange(radiohead);
        List<Integer> kanyeWestRange = findRange(kanyeWest);

        printArtistInfo("Bjork", bjorkRange, bjorkMaxRange, chronology(bjorkRange));
        printArtistInfo("RadioHead", radioheadRange, radioheadMaxRange, chronology(radioheadRange));
        printArtistInfo("Kanye West", kanyeWestRange, kanyeWestMaxRange, chronology(kanyeWestRange));


    }


    public static int maxRange(List<Integer> list) {
        int maxRange = Integer.MIN_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            int range = list.get(i + 1) - list.get(i);
            if (range > maxRange) {
                maxRange = range;
            }
        }
        return maxRange;
    }

    public static List<Integer> findRange(List<Integer> list) {
        List<Integer> listOfRanges = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            int range = list.get(i + 1) - list.get(i);
            listOfRanges.add(range);
        }
        return listOfRanges;
    }

    public static String chronology(List<Integer> list) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append("*");
            for (int j = 0; j < list.get(i); j++) {
                builder.append("-");
            }
        }
        builder.append("*");
        return builder.toString();
    }
//    метод printArtistInfo для выведения печати вместо повторения System.out.println:

// System.out.println("Bjork");
//System.out.println("\"Интервалы между выпусками альбомов (в годах):" + bjorkRange);
//System.out.println("Самый продолжительный период без альбомов: "  + bjorkMaxRange);
//System.out.println("Хронология альбомов:");
//System.out.println(finalDisplay(bjorkRange));

//
//System.out.println("RadioHead");
//System.out.println("\"Интервалы между выпусками альбомов (в годах):" + radioheadRange);
//System.out.println("Самый продолжительный период без альбомов: "  + radioheadMaxRange);
//System.out.println("Хронология альбомов:");
//System.out.println(finalDisplay(radioheadRange));

//
//System.out.println("Kanye West");
//System.out.println("\"Интервалы между выпусками альбомов (в годах):" + kanyeWestRange);
//System.out.println("Самый продолжительный период без альбомов: "  + kanyeWestMaxRange);
//System.out.println("Хронология альбомов:");
//System.out.println(finalDisplay(kanyeWestRange));

    public static void printArtistInfo(String artist, List<Integer> artistRanges, int maxRange, String printSign) {
        System.out.println(artist);
        System.out.println("\"Интервалы между выпусками альбомов (в годах):" + artistRanges);
        System.out.println("Самый продолжительный период без альбомов: " + maxRange);
        System.out.println("Хронология альбомов:");
        System.out.println(printSign);
        System.out.println();
    }
}