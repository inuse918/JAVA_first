class Wine{
	private String manufacturer,name,country,region,kind;
	private int year,grade;
	
	public Wine(String manufacturer,String name,String country,String region,String kind,int year,int grade){
		this.manufacturer=manufacturer;
		this.name=name;
		this.country=country;
		this.region=region;
		this.kind=kind;
		this.year=year;
		this.grade=grade;
	}
	public Wine(String manufacturer,String name){
		this.manufacturer=manufacturer;
		this.name=name;
	}

	public String toString(){
		return "[������] "+manufacturer+" [�̸�] "+name+" [����] " +country+" [����] "+kind+" [�⵵] "+year+" [grade] "+grade;
	}
}