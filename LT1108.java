class Solution {
    public String defangIPaddr(String address) {
        String res = address.replace(".","[.]");

        // second method

         String res = "";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i) == '.'){
                res += "[.]";
            }
            else{
                res += address.charAt(i);
            }
        }
        return res;
        
    }
}