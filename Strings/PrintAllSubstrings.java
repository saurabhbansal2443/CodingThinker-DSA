package Strings;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        String str = "RADAR"; // R , A , D , RADAR , ADA

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                boolean isPlaindrome = CheckPlaindrome(sub);
                if (isPlaindrome) {
                    System.out.println(sub);
                }
            }
        }
    }

    public static boolean CheckPlaindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        boolean flag = true;

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char stCh = str.charAt(start);
            char edCh = str.charAt(end);

            if (stCh != edCh) {
                flag = false;
                break;
            }

            start++;
            end--;
        }

        return flag;
    }

}
