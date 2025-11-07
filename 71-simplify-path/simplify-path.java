class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack();
        for(String str : arr){
            if(str.equals("..") && !st.empty()){
                st.pop();
            }
            else if(!str.equals("") && !str.equals(".") && !str.equals("..")){
                st.push(str);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String str : st){
            sb.append("/");
            sb.append(str);
        }
        return sb.length()==0 ? "/" : sb.toString();
    }
}