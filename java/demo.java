class polygon{
	public void display(){
		System.out.println("super class display method:");
	}	
}
class demo{
	void message(){
		polygon p1=new polygon(){
			public void display(){
				System.out.println("Anynoymous class method");
			}
		};
		p1.display();
	}
	public static void main(String args[]){
	polygon p =new polygon();
	p.display();
	demo obj = new demo();
	obj.message();
	}
	
}



