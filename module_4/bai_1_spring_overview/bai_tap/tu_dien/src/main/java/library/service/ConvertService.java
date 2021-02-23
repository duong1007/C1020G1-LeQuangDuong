package library.service;

import library.reponsive.Data;

public class ConvertService {
    private  String[] vietNam = Data.vietNam;
    private  String[] english = Data.english;

    public String chance(String word){
        String result;
        int i;
        for (i = 0; i < vietNam.length ; i++) {
            String answer = vietNam[i];
            if (word.equals(answer)) {
              return result = english[i];
            }
        }
        
        for (i = 0; i < english.length ; i++) {
            String answer = vietNam[i];
            if (word.equals(answer)) {
              return result = vietNam[i];
            }
        }

        return result = "không có kết quả";
    }
}
