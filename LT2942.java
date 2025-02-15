class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        List<Integer> ch = new ArrayList<>();
        for(int i=0;i<n;i++){
            String word = words[i];
            for(int j=0;j<word.length();j++){
                if(word.charAt(j) == x){
                    ch.add(i);
                    break;
                }
            }
        }
        return ch;
    }
}