class Solution {
    public int countBattleships(char[][] board) {
        int x,y,i,j,count=0;
        if(board[0][0]=='X')
            count++;
        for(i=0; i<board.length; i++){
            for(j=0; j<board[0].length; j++){
                if(board[i][j]=='X' ){
                    if(i-1>=0 && j-1>=0){
                        if((board[i-1][j]!='X') && (board[i][j-1]!='X'))
                            count++;
                        continue;
                    }
                    if(i-1>=0){
                        if(board[i-1][j]=='.')
                            count++;
                        continue;
                    }
                    if(j-1>=0){
                        if(board[i][j-1]=='.')
                            count++;
                    }
                }
            }
        } 
        return count;
    }
}