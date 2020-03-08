class EnumTest{
	enum days{
		MONDAY,
		TUESDAY,
		WEDNESSDAY,
		THURSADAY,
		FRIDAY,
		SATURDAY,
		SUNDAY;
	}
	public static void main(String[] args){
		for(days d:days.values()){
			System.out.println(d);
		}
	}

}