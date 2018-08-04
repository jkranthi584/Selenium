package guru;

public interface Recycle {

	public boolean isRecyclable();
	
	public void recycle();
}

  class Paper implements Recycle{
     private int num;// 1 means recycable, 2 or other numbers means it not
     
     
     public Paper(int num){
    	 
    	 this.num = num;
    	 
     }
	@Override
	public boolean isRecyclable() {
		// TODO Auto-generated method stub
		
		if(num != 1){
			
			System.out.println("paper is not recyclable");
		}
		
		return num == 1;
	}

	@Override
	public void recycle() {
		// TODO Auto-generated method stub
		System.out.println("paper has been recycled");
	}
	
public void cut(){
		
		System.out.println("the cut cut i do nothing");
	}
  }
	  
  class Aluminum implements Recycle{
	  
	  
  

@Override
public boolean isRecyclable() {
	// TODO Auto-generated method stub
	return true;
}

@Override
public void recycle() {
	// TODO Auto-generated method stub
	System.out.println("Aluminum has been recycled");
}
	  
  }
  
  class Plastic implements Recycle{
   private int num;
	  Plastic(int num){
		  
		  this.num = num;
		  
	  }
	  
	  
	@Override
	public boolean isRecyclable() {
		// TODO Auto-generated method stub
		
		if(num!=2 && num !=5 && num != 7){
			
			System.out.println("Plastic is not recyclable");
		}
		return num==2 || num == 5|| num == 7;
	}

	@Override
	public void recycle() {
		// TODO Auto-generated method stub
		
		System.out.println("plastic has been recycled");
	}
	  
	
	  
	  
  }
  class Trash{}
  
  class Glass implements Recycle{
   int num =5;
	    Glass(int num){
	    	this.num =num;
	    	
	    }
	    
	    
	@Override
	public boolean isRecyclable() {
		// TODO Auto-generated method stub
		if(num!=5 && num!=9){
			System.out.println("Glass is not Recyclable");
		}
		return num ==5 || num ==7;
	}

	@Override
	public void recycle() {
		// TODO Auto-generated method stub
		System.out.println("Glass has been Recycle");
		
	}
	  
	  
  }