class Solution {
    public int minCostToMoveChips(int[] position) {
        // int len = position.length;
        int Ecost = 0;
        int Ocost = 0;
        for(int i: position){
            if(i%2==0){
                Ecost++;
            }
            else{
                Ocost++;
            }
        }
        return Math.min(Ocost,Ecost);
    }
}