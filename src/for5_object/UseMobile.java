package for5_object;

public class UseMobile {
	public static void main(String[] args)
	{
		Mobile mob1=new Mobile();
		mob1.brand="Redmi";
		mob1.price=10000;
		mob1.model="Note3";
		mob1.isWirelessCharger=true;
		
		Mobile mob2=new Mobile();
		mob2.brand="Samsung";
		mob2.price=15000;
		mob2.model="M32";
		mob2.isWirelessCharger=true;
		
		Mobile mob3=new Mobile();
		mob3.brand="Nokia";
		mob3.price=17000;
		mob3.model="G20";
		mob3.isWirelessCharger=false;
		
		Mobile mobiles[]= {mob1,mob2,mob3};
		
		int max=mobiles[0].price;
		Mobile maxMobile=mobiles[0];
		for(Mobile x:mobiles)
		{
			if(x.price>max) {
				max=x.price;
				maxMobile=x;
			}
		}
		System.out.println(maxMobile.brand+" "+maxMobile.price+" "+maxMobile.model+" "+maxMobile.isWirelessCharger);;
	}
}
				
