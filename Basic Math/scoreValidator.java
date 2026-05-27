// 3921. Score Validator
class Solution {
    public int[] scoreValidator(String[] events) {
        int n = events.length ;
        int score = 0 , counter = 0 ;

        int i = 0 ;
        while(counter < 10 && i < n){
            String s = events[i] ;
            if(s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("6")){
                score += Integer.parseInt(s) ;
            }
            else if(s.equals("W")){
                counter++ ;
            }
            else if(s.equals("WD")){
                score++ ;
            }
            else if(s.equals("NB")){
                score++ ;
            }

            i++ ;
        }

        return new int[]{score, counter};
    }
}
