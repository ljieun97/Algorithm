package moves;

import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i=0; i<moves.length; i++) {
            for (int j=0; j<board.length; j++) {
                if (board[j][moves[i]-1]!=0) {
                    arr.add(board[j][moves[i]-1]);
                    if (arr.size()>1 && board[j][moves[i]-1]==arr.get(arr.size()-2)) {
                        arr.remove(arr.size()-1);
                        arr.remove(arr.size()-1);
                        answer+=2;
                    }
                    board[j][moves[i]-1]=0;
                    break;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(s.solution(board, moves));
    }
}