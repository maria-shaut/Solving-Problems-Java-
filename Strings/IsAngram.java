    public static boolean isAnagram(String s, String t) {

    	if(s.length()!=t.length()) {
    		return false;
    	}
    	String str1 = sortStr(s);
        String str2 = sortStr(t);
        
        return str1.equals(str2);

        
        
    } 