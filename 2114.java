class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            int spaces=0;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    spaces++;
                }
            }
            int words=spaces+1;
            max=Math.max(max,words);
        }
        return max;
    }
}