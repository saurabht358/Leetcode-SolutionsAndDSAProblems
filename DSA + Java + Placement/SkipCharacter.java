public static void main(String[] args) {
		String str="sasdat";
		str = skipChar(str,'d',0);
		System.out.print(str);
	}
	public static String skipChar(String str,char ch,int index){
	    if(str.length()==index) return "";
	    if(str.charAt(index)==ch) return skipChar(str,ch,index+1);
	    else return (String.valueOf(str.charAt(index)) + skipChar(str,ch,index+1));
	}
