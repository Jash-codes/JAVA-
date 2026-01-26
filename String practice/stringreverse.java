public class stringreverse {

    static String reversestring(String s){

        int left = 0, right = s.length() - 1;

        StringBuilder str = new StringBuilder(s);

        while (left < right){
            char temp = str.charAt(left);
            str.setCharAt(left, str.charAt(right));
            str.setCharAt(right, temp);
            left++;
            right--;
        }

        return str.toString();
    }
    
    public static void main(String[] args) {
        
        String name = "jashwanth";

        System.out.println(reversestring(name));
    }
}
