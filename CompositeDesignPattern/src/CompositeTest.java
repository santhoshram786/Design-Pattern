

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer mouse=new Leaf(30,"mouse");
		Computer ram=new Leaf(4000,"ram");
		Computer hd=new Leaf(8000,"Harddrive");
		
		Composite peri=new Composite("Peripherial");
		Composite cabinet=new Composite("Cabinet");
		Composite com=new Composite("Computer");
		
		peri.add(mouse);
		cabinet.add(hd);
		com.add(peri);
		com.add(ram);
		com.add(cabinet);
		
		
		com.showprice();
	}

}
