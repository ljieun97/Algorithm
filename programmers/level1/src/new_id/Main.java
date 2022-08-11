package new_id;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(s.solution(new_id));
    }
}

class Solution {
    public String solution(String new_id) {
        new_id=new_id.toLowerCase();
        new_id=new_id.replaceAll("[^0-9a-z-_.]", "");
        new_id=new_id.replaceAll("[.]{2,}", ".");
        new_id=new_id.replaceAll("^[.]|[.]$", "");

        if(new_id.equals("")) new_id="a";

        if(new_id.length()>=16) {
            new_id=new_id.substring(0, 15).replaceAll("[.]$", "");
        }

        if(new_id.length()<=2){
            for (int i=1; i<3; i++) {
                if(new_id.length()<=i) new_id+=new_id.charAt(new_id.length()-1);
            }
        }

        return new_id;
    }
}