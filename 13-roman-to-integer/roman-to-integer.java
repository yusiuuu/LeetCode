class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanmap = new HashMap<>();
        romanmap.put('I',1);
        romanmap.put('V',5);
        romanmap.put('X',10);
        romanmap.put('L',50);
        romanmap.put('C',100);
        romanmap.put('D',500);
        romanmap.put('M',1000);
        int result =0;
        int n = s.length();
        for(int i=0; i<n;i++){
            int value= romanmap.get(s.charAt(i));
            if(i+1< n && value < romanmap.get(s.charAt(i+1))){
                result -=value;
            }
            else
                result +=value;
        }
        return result;
    }
}