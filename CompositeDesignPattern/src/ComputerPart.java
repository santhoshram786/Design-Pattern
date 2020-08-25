import java.util.ArrayList;
import java.util.List;

	
	interface Computer
	{
		void showprice();
	}
	
	class Leaf implements Computer
	{
		int price;
		String name;

		public Leaf(int price, String name) {
			super();
			this.price = price;
			this.name = name;
		}

		@Override
		public void showprice() {
		
			System.out.println(name + " : " +price);
			
		}
		
	}
	class Composite implements Computer
	{
		String name;
		
		
		public Composite(String name) {
			super();
			this.name = name;
		}

		List<Computer> cp=new ArrayList<>();
		
		public void add(Computer c)
		{
			cp.add(c);
		}
		
		@Override
		public void showprice() {
			System.out.println(name);
			for(Computer m:cp)
			{
				m.showprice();
			}
			
		}


}
