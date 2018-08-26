import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DeleteDublicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String str ="politemanishere";
               /*char[] st = str.toCharArray();
               ArrayList<Character> ch= new ArrayList<Character>();
             for(char s:st) {
            	 if(!ch.contains(s))
            		 ch.add(s);
             }
               System.out.println(ch.toString());*/
              Set<Character> set = new LinkedHashSet<Character>();
               StringBuilder st = new StringBuilder();
              char []c=   str.toCharArray();
              for(char chr: c) {
            	  if(!set.contains(chr)) 
            		  set.add(chr);
             }
              System.out.println(set.toString());
              for(char s: set)
            	System.out.print(s);  
              System.out.println();
              String words="rightorwrong";
              String you="";
              for(int i=words.length()-1; i>=0; i--)
            	  you+=words.charAt(i);
              
              System.out.println(you);
              
             for(int i=0; i<6; i++) {
            	 for(int j=0; j<=i; j++)
            		 System.out.print("*");
            	 System.out.println();
             }
             String tr="the rock is on";
               String[] vr = tr.split(" ");
             StringBuilder stro  = new StringBuilder();
           /*  for(String v:vr) 
            	 stro.append(v+"%20");*/
             for(int i=0; i<vr.length; i++) {
            	 stro.append(vr[i]);
            	  if(vr[i]!=vr[vr.length-1])
            		  stro.append("%20");
             }
             System.out.println(stro.toString());
             
               String crap ="rightyouns";
              Map<Character, Integer> maps = new HashMap<Character,Integer>();
               boolean isUnique=false;
               char[] me = crap.toCharArray();
               //for(int i=0; i<me.length; i++) {
               for(char co:me) {
            	   System.out.println(crap.lastIndexOf(co));
            	  if(crap.indexOf(co)==crap.lastIndexOf(co))
            		  isUnique=true;
            	  else {
            		  isUnique =false;
            		  break;
            	  }
               }
               if(isUnique)
            	   System.out.println("String is unique");
               else
            	   System.out.println("string is not unique");
               
                       
               
	}

}
