import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.google.common.primitives.Ints;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class PrintingNumbersandAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String doubles ="ddlleeefook";
             /*char temp = doubles.charAt(0);
             int count =0;
            for(int i=0; i<doubles.length(); i++) {
            	
            	if(doubles.charAt(i)==temp)
            	 count++;
            	else {
            	   System.out.print(temp+" "+count);
            	   count =1;
            	   temp = doubles.charAt(i);
            	
            	}
            }
            System.out.print(temp);
            System.out.print(count);*/
            
            String one = "mcdea";
            String two = "amcddkef";
            StringBuilder sb = new StringBuilder(one);
             String arr[]= {};
            int i=two.length();
            int k=0;
            for(Character ch: two.toCharArray()) {
            	 
            	
                int index = sb.indexOf(""+ch);
                
                if(index != -1){
                	sb.deleteCharAt(index);
                	i--;
                	
                
                }
                if(index == -1)
                	System.out.println(ch+" is not there in the one");
                	//arr[k++]=ch.toString();
              
            	}
            
            if(sb.length()==0)
            	System.out.println("anagram");
          /* for(int j=0;j<=arr.length; j++) {
             
            	  System.out.println("remaining elmenets are: "+arr[j]);
            }*/
            System.out.println("total numbers of elements "+i);
            
            
            int n=0;
            int pair=0;
            int ii=1;
        	 /*
        	  * foreach pair n=n=2;
        	  * if(1 person remains)
        	  * n=n+1;
        	  * 
        	  * 
        	  * */
            String ar[]= {"couple","single","couple","single","single",
            		"couple","single","single","single","couple","single","couple","single","single",
            		"couple","single","single","single"	,"couple","single","couple","single","single",
            		"couple","single","single","single"	,"couple","single","couple","single","single",
            		"couple","single","single","single"			
            
            };
            int m=0;
            int c=0,s=0;
            int o=0;
           int total =0;
            System.out.println(ar.length-1);
            for(int l=0; l<ar.length; l++) {
            	
            	if(ar[l].equals("couple")) {
            		m+=1;
                //System.out.println(l);
            		//total+=2;
            		//System.out.println(total+" "+m);
            	}	 
            	else {
            		o+=1;
            		//total+=1;
            	 
            	}
            }
              total =  m*2+o;
            	System.out.println(total);
            	System.out.println("Singles:  "+o);
            	System.out.println("no of couples: "+m);
            int at [] = {55,5,9,8,38,105,105,7,3,105,11,-1,105,1};
            //System.out.println(at[at.length-1]);
            int crap=0;
             for(int y=0;y<at.length; y++) {
            	 
            	for(int z=y+1; z<at.length; z++) {
            		//int temp =0;
            		if(at[y]>at[z]) 
            		{
            		 /*  temp=at[z];
            		   at[z]=at[y];
            		   at[y]=temp;
            		   */ //y=10, z=15;
            			
            			 
            			at[y]=at[y]+at[z];//y= 10+15; 25;
            			at[z]=at[y]-at[z];// z = 25 - 15; 10;
            			at[y]=at[y]-at[z]; //y=25-10=15;
            			
            	
            		}
            		
            	}
            	
            	try {
            	 
            		 if(at[y]==at[y+1])
                         continue;
                     
            	 
            	 else {
            	System.out.print(at[y]);
            	//lastIndex = at.length-1;
            	     if(y<at.length)
            			System.out.print(", ");
            	
            	
              }
             }
            	catch(ArrayIndexOutOfBoundsException e)
            	{
            		//e.printStackTrace();
            		System.out.println("error occured");
            	}
            	
             }
             System.out.print(at[at.length-1]);
              /* List<int[]>list =   Arrays.asList(at);
               for(int u=0; u<list.size(); u++)
            	   System.out.println(list.get(u));
                    */
            
             
           //System.out.print(crap);
        

	}

}
