	public static String reverseStr (String str) {
		
		int beg =0;
		int end = str.length()-1;
		char [] mystr = str.toCharArray();
		for(int i =0; i<str.length()/2; i++) {
			char temp = mystr[end];
			mystr[end]=mystr[beg];
			mystr[beg] =temp;
			beg++;
			end--;
		}// System.out.println(String.valueOf(mystr));
		return String.valueOf(mystr);
	}
	