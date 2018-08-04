package guru;

public class ObjectComparison {
private String name;
private int grade;
private double gpa;

   public ObjectComparison(String name, int grade, double gpa){
	   
	   this.name = name;
	   this.grade=grade;
		this.gpa=gpa;	   
   }

protected String getName() {
	return name;
}

protected void setName(String name) {
	this.name = name;
}

protected int getGrade() {
	return grade;
}

protected void setGrade(int grade) {
	this.grade = grade;
}

protected double getGpa() {
	return gpa;
}

protected void setGpa(double gpa) {
	this.gpa = gpa;
}
   public boolean equals(ObjectComparison obj){
	   
	   return this.getGrade()==obj.getGrade();
   }
   
   public String toString(){
	   
	   return "{Name:: "+getName() + 
			   "\n Grade:: "+getGrade()+
			   "\n Gpa:: "+getGpa()+"}";
   }
   public static void main(String[] args) {
	
	   ObjectComparison sam= new ObjectComparison("Sam",6, 9.9);
	   ObjectComparison  randy = new ObjectComparison("Randy",7,9.9);
	          boolean status =    randy.equals(sam);
	          System.out.println(status);
	          
	          
	         int result =     sam.compareTo(randy);
	         
	         if(result > 0)
	        	 System.out.println(sam.getName()+" grade is greater than "+randy.getName());
	        	 else
	        		 if(result<0)
	        			 System.out.println(randy.getName()+"'s grade is greater than "+sam.getName());
	        		 else
	        			 
	        		  System.out.println(sam.getName()+" grade is equal to the "+randy.getName()+"'s Grade");
              sam.stringCrap(sam, "Sam");   
              randy.stringCrap(randy, "samuel");
              randy.stringCrap2(randy);
	               
   }
   public int compareTo(Object crap){
	   
	   ObjectComparison objc = (ObjectComparison) crap;
	   //if(getGrade()> ((ObjectComparison) crap).getGrade())
	   if(getGrade()>objc.getGrade())
		   return 1;
	   else
		   if(getGrade()<objc.getGrade())
	             return -1;
		   else
			   return 0;
   }
   public void stringCrap(Object obj,String name){
	   
	   ObjectComparison obj1 = (ObjectComparison) obj;
	   if(obj1.getName().equalsIgnoreCase(name)){
		   String crap = obj.toString();
          System.out.println(crap);
             }
	   else{
		  System.out.println("No record is Found");
	   }
	 
   }
   public void stringCrap2(Object wrap){
	   
	   ObjectComparison obj =(ObjectComparison) wrap;
	   
	   if(getName().equalsIgnoreCase(obj.getName())){
		  String crap =   obj.toString();
	   System.out.println(crap);
       }else
    	   System.out.println("No Object or Record is Found");
    	   
       
      }   
   }
