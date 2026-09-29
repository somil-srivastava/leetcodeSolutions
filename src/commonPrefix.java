import java.util.*;

class commonPrefix {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    scn.nextLine();
    String[] str = new String[n];
    for (int i = 0; i < n; i++) {
      str[i] = scn.nextLine();
    }
    Solution sol = new Solution();
    String s = sol.longestCommonPrefix(str);
    System.out.println(s);
  }
}

class Solution {
  public String longestCommonPrefix(String[] str) {
    if (str[0].charAt(0) != str[1].charAt(0)) {
      return "\"\"";
    } else {
      int j=1;
      for(int i=0;i<str.length;i++,j++){
        if(j==str.length){
          break;
        }
        for(int k=0;k<((str[i].length() < str[j].length()) ? str[i].length() : str[j].length());k++){
          if(str[i].charAt(k) == str[j].charAt(k)){
            char c = str[i].charAt(k);
            System.out.println(c);
          } else {
            break;
          }
        }
      }
    }
    
    return null;
  }

}