    public static String sortStr (String str) {
    	
    	char [] sorted = str.toCharArray();
    	java.util.Arrays.sort(sorted);
    	return new String(sorted) ;
    }