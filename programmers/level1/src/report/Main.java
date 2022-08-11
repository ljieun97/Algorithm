package report;

import java.util.Arrays;
import java.util.HashSet;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        HashSet<String> hashSet = new HashSet<>();
        for(String item : report){
            hashSet.add(item);
        }
        String[] strArr = hashSet.toArray(new String[0]);

        String[][] str = new String[strArr.length][];
        int[] count = new int[id_list.length];
        int[] result = new int[id_list.length];


        for(int i=0; i<strArr.length; i++){
            str[i] = strArr[i].split(" ");
        }

        for(int i=0; i<str.length; i++){
            for(int j=0; j<id_list.length; j++){
                if(str[i][1].equals(id_list[j])) {
                    count[j]++;
                }
            }
        }

        for(int i=0; i<count.length; i++){
            if(count[i]>=k){
                for(int j=0; j<str.length; j++){
                    if(str[j][1].equals(id_list[i])) {
                        for (int n=0; n<id_list.length; n++){
                            if(str[j][0].equals(id_list[n])) {
                                result[n]++;
                            }
                        }
                    }
                }
            }
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(s.solution(id_list, report, k)));
    }
}
