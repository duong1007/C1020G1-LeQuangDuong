package dsa_stack_queque.bai_tap.map;

import java.util.Scanner;
import java.util.TreeMap;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 1 chuỗi:");
        String S = scanner.nextLine();
        TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>();
        S = S.toLowerCase();
        for (int i = 0; i < S.length() ; i++) {
            char c = S.charAt(i);
            boolean check = treeMap.containsKey(c);
            if (c == ' '){
                continue;
            } else if (check){
                Integer value = treeMap.get(c) + 1;
                treeMap.put(c, value);
            } else {
                treeMap.put(c, 1);
            }
        }
        System.out.println(treeMap);
    }
}
