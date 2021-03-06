package test_driven_development.bai_tap.fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzz {
    private static final String KHONG = "không";
    private static final String MOT = "một";
    private static final String HAI = "hai";
    private static final String BA = "ba";
    private static final String BON = "bốn";
    private static final String NAM = "năm";
    private static final String SAU = "sáu";
    private static final String BAY = "bảy";
    private static final String TAM = "tám";
    private static final String CHIN = "chín";
    private static final String LAM = "lăm";
    private static final String LE = "lẻ";
    private static final String MUOI = "mươi";
    private static final String MUOIF = "mười";
    private static final String MOTS = "mốt";
    private static final String TRAM = "trăm";
    private static final String NGHIN = "nghìn";
    private static final String TRIEU = "triệu";
    private static final String TY = "tỷ";


    private static final String [] number = {KHONG, MOT, HAI, BA, BON, NAM, SAU, BAY, TAM, CHIN};
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static ArrayList<String> readNum(String a) {
        ArrayList<String> kq = new ArrayList<String>();

        int intA = Integer.parseInt(a);

        if ( intA % 3 == 0 && intA % 5 == 0 ){
            kq.add(FIZZ_BUZZ);
            return kq;
        }

        if (intA % 3 == 0) {
            kq.add(FIZZ);
            return kq;
        }

        if (intA % 5 == 0){
            kq.add(BUZZ);
            return kq;
        }

        if (checkFizzBuzz(a) != null) {
            kq.add(checkFizzBuzz(a));
            return kq;
        }

        ArrayList<String> List_Num = Split(a, 3);


        while (List_Num.size() != 0) {

            switch (List_Num.size() % 3) {
                case 1:
                    kq.addAll(read_3num(List_Num.get(0)));
                    break;
                case 2:
                    ArrayList<String> nghin = read_3num(List_Num.get(0));
                    if(!nghin.isEmpty()){
                        kq.addAll(nghin);
                        kq.add(NGHIN);
                    }
                    break;
                case 0:
                    ArrayList<String> trieu = read_3num(List_Num.get(0));
                    if(!trieu.isEmpty()) {
                        kq.addAll(trieu);
                        kq.add(TRIEU);
                    }
                    break;
            }

            if (List_Num.size() == (List_Num.size() / 3) * 3 + 1 && List_Num.size() != 1) kq.add(TY);

            List_Num.remove(0);
        }

        return kq;
    }

    private static ArrayList<String> read_3num(String a) {
        ArrayList<String> kq = new ArrayList<String>();
        int num = -1;
        try{ num = Integer.parseInt(a); } catch(Exception ex){}
        if (num == 0) return kq;




        int hang_tram = -1;
        try{ hang_tram = Integer.parseInt(a.substring(0, 1)); } catch(Exception ignored){}
        int hang_chuc = -1;
        try{ hang_chuc = Integer.parseInt(a.substring(1, 2)); } catch(Exception ex){}
        int hang_dv = -1;
        try{ hang_dv = Integer.parseInt(a.substring(2, 3)); } catch(Exception ex){}


        if (hang_tram != -1){
            kq.add(number[hang_tram]);
            kq.add(TRAM);
        }


        switch (hang_chuc) {
            case -1:
                break;
            case 1:
                kq.add(MUOIF);
                break;
            case 0:
                if (hang_dv != 0) kq.add(LE);
                break;
            default:
                kq.add(number[hang_chuc]);
                kq.add(MUOI);
                break;
        }


        switch (hang_dv) {
            case -1:
                break;
            case 1:
                if ((hang_chuc != 0) && (hang_chuc != 1) && (hang_chuc != -1))
                    kq.add(MOTS);
                else kq.add(number[hang_dv]);
                break;
            case 5:
                if ((hang_chuc != 0) && (hang_chuc != -1))
                    kq.add(LAM);
                else kq.add(number[hang_dv]);
                break;
            case 0:
                if (kq.isEmpty()) kq.add(number[hang_dv]);
                break;
            default:
                kq.add(number[hang_dv]);
                break;
        }
        return kq;
    }

    private static ArrayList<String> Split(String str, int chunkSize) {
        int du = str.length() % chunkSize;
        if (du != 0) {
            StringBuilder strBuilder = new StringBuilder(str);
            for (int i = 0; i < (chunkSize - du); i++) strBuilder.insert(0, "#");
            str = strBuilder.toString();
        }
        return splitStringEvery(str, chunkSize);
    }


    private static ArrayList<String> splitStringEvery(String s, int interval) {
        ArrayList<String> arrList = new ArrayList<String>();
        int arrayLength = (int) Math.ceil(((s.length() / (double) interval)));
        String[] result = new String[arrayLength];
        int j = 0;
        int lastIndex = result.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            result[i] = s.substring(j, j + interval);
            j += interval;
        }
        result[lastIndex] = s.substring(j);


        arrList.addAll(Arrays.asList(result));
        return arrList;
    }

    private static String checkFizzBuzz(String a) {
        for (String c : a.split("")) {
            if (c.equals("3")) {
                return FIZZ;
            }
            if (c.equals("5")) {
                return BUZZ;
            }
        }
        return null;
    }
}
