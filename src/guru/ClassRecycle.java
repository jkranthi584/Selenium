package guru;

import java.util.ArrayList;

public class ClassRecycle {
	
	
	public static void main(String[] args) {
		
		
		Paper p1 = new Paper(1);
		 Paper p2 = new Paper(2);
		 Paper p3 = new Paper(3);
		 
		Plastic pla = new Plastic(5);
		Plastic pls = new Plastic(2);
		Plastic plst = new Plastic(9);
		
		Aluminum al = new Aluminum();
		
		Trash tr = new Trash();
		
		Glass gl = new Glass(5);
		Glass gl2 = new Glass(32);
		
		ArrayList <Object> cycle = new ArrayList<Object>();
		
		cycle.add(p1);
		cycle.add(p2);
		cycle.add(p3);
		cycle.add(pla);
		cycle.add(pls);
		 cycle      .add(plst);
		 cycle.add(al);
		 
		 cycle.add(tr);
		 cycle.add(gl);
		 cycle.add(gl2);
		 
		 
		 for(int i=0; i<cycle.size(); i++){
			 
			 if(cycle.get(i) instanceof Paper){
				 
				 Paper pa = (Paper) cycle.get(i);
				 
				 if(pa.isRecyclable())
					 pa.recycle();
				 
			 
			 }
			
			 
		  	 
			 else if(cycle.get(i) instanceof Aluminum){
				 Aluminum can = (Aluminum) cycle.get(i);
				 if(can.isRecyclable())
					 can.recycle();
				 
			 }	 
				 else if(cycle.get(i) instanceof Plastic)
				 {
					 Plastic plast = (Plastic) cycle.get(i);
					 if(plast.isRecyclable())
						 plast.recycle();
						 
						
					 
				 } 
				 else if(cycle.get(i) instanceof Glass){
					 
					 Glass glass = (Glass) cycle.get(i);
					 if(glass.isRecyclable()){
						 glass.recycle();
					 }
					    
					 
					 
				 }
					 else{
						 System.out.println("is not recyclable");
					
					 }
				 
				 
			 }//forloop
		 
		    System.out.println("*****************");
		         for(int i=0; i<cycle.size(); i++){
		        	 
		        	 if(cycle.get(i) instanceof Recycle){
		        		 
		        		 Recycle item = (Recycle) cycle.get(i);
		        		 
		        		     if(item.isRecyclable()){
		        		    	 
		        		    	 item.recycle();
		        		     }
		        	     
		         }else{
		        	 
		        	 System.out.println("item is not recyclable");
		         }
	}  
		 		   
		 		   
		 	   }//for loop       
	
	}


