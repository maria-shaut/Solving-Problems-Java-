public static String reverseWordinStr(String str) {
    String [] words = str.split(" ");
    StringBuilder res = new StringBuilder();
    for(String word :words) {
        String revWord = new StringBuilder(word).reverse().toString();
        res.append(revWord + " ");
    }// System.out.println(res.toString().trim());
    
    return res.toString().trim();
} 