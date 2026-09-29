import java.util.*;

class commonPrefix {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    scn.nextLine();
    String[] strs = new String[n];
    for (int i = 0; i < n; i++) {
      strs[i] = scn.nextLine();
    }
    Solution sol = new Solution();
    String s = sol.longestCommonPrefix(strs);
    System.out.println(s);
  }
}

class Solution {
  public String longestCommonPrefix(String[] str) {
    if (str[0].charAt(0) != str[1].charAt(0)) {
      return "\"\"";
    } else {
      char[] c = new char[str[0].length()];
      int j = 1;
      for(int i=0;i<str[0].length();i++,j++){
        if(j > str[i].length()){
          continue;
        }
        if(str[i].charAt(i) == str[j].charAt(i)){
          c[i] = str[i].charAt(i);
        } else {
          break;
        }
      }
      return c.toString();
    }

  }

}