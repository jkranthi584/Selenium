package guru;

import java.util.ArrayList;

public class RecycleGeneric {
	
	public static void main(String[] args) {
		
		Recycle paper = new Paper(5);
		Recycle glass = new Glass(7);
		Recycle plastic = new Plastic(9);
		Recycle alu = new Aluminum();
		Recycle papr = new Paper(1);
		//ArrayList<Object> cycle = new ArrayList<Object>();
		ArrayList<Recycle> cycle = new ArrayList<Recycle>();
		cycle.add(paper);
		//guru.Plastic cannot be cast to guru.Paper
		//cycle.add(plastic);
	  // cycle.add(glass);
	 //  cycle.add(alu);
	   cycle.add(papr);
	   
	   
		
		
	   for(int i=0; i<cycle.size(); i++){
		   Recycle r = cycle.get(i);
		    if(r.isRecyclable())
		  //below if clause is part 1 
		//if(cycle.get(i).isRecyclable()){
			cycle.get(i).recycle();
		    ((Paper) r).cut();
			
		//}
		
	   }//for loop
	}
	

}
