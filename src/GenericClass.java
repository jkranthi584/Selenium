
public class GenericClass <T> {

	   private T t;
	   public void add(T t) {
		   this.t = t;
	   }
	   public T get() {
		   return t;
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		        GenericClass<Integer> integer = new GenericClass<Integer>();
		        GenericClass<String> string = new GenericClass<String>();
		        integer.add(new Integer(5));
		        string.add(new String("Hello You"));
		        System.out.printf("Integer Value :%d\n\n", integer.get());
		        System.out.printf("String Value :%s\n", string.get());
	}

}
