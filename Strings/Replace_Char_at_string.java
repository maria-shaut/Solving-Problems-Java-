	public static String replaceStr (String str) {
		
		String res = "";
		for (int i =0; i<str.length(); i++) {
			if(str.charAt(i)=='l') {
				res+="%";
			} else {
				res+=str.charAt(i);
			}
		}//System.out.println(res);
		return res;
	}