public class ConfidentialText {
    public static void main(String[] args) {
        confidential("Ana are mere multe mere bune", new String[]{"mere", "Ana"});
    }

    public static int countChar(String i , char j){
        int b = 0;
        for (int a = 0; a<i.length(); a++){
            if (i.charAt(a) == j){
                b++;
            }
        }
        return b;
    }

    public static String replaceChar(String i){
        String j = new String();
        for (int a = 0; a<i.length(); a++){
            j+= "*";
            }
        return j;
    }

    public static boolean containsStrings(String [] i, String j){
        boolean a = false;
        for (String b:i){
            if (b.equals(j) == true){
                a = true;
                return a;
            }
        }
        return a;
    }

    public static String [] wordsArray(String i){
       return i.split(" ");
    }

    public static void confidential ( String i, String [] j){
        String [] result = wordsArray(i);
        for (String a:result) {
            if (containsStrings(j,a)){
                System.out.printf (replaceChar(a)+ " ");
            } else System.out.printf(a + " ");
        }
    }

}

