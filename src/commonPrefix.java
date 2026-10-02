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
    char[] c = new char[str[0].length()];
    if (str[0].charAt(0) != str[1].charAt(0)) {
      return "\"\"";
    } else {
      for(int i=0,n=0;i<str.length && n < str.length;i++,n++){
        if((n+1) == str.length){
          break;
        }
        for(int j=0;j<(str[n].length()<str[n+1].length()?str[n].length():str[n+1].length());j++){
          if(str[n].charAt(j) == str[n+1].charAt(j)){
            continue;
          } else {
            break;
          }
        }
        c[i] = str[n].charAt(i);
      }
    }
    
    return c.toString();
  }

}