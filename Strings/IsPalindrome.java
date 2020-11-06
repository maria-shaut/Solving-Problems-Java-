    public static boolean isPalinfrome (String str) {
    	
    	int start =0;
    	int end = str.length()-1;
    	boolean check = true;
    	
    	for (int i=0; i< str.length()/2; i++)
    			{
    		if(str.charAt(start)!= str.charAt(end)) {
    			check = false;
    			
    		}
    		
    		start++;
    		end--;
    		
    			}
    	
    	 //System.out.println(check);
    	return check;
    }