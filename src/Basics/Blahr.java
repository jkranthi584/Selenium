package Basics;

public class Blahr {
		public static void main(String[] args) {
		
		}
	
	public enum Blah {
		  A("text1"),
		  B("text2"),
		  C("text3"),
		  D("text4");

		  private String text;

		  Blah(String text) {
		    this.text = text;
		  }

		  public String getText() {
		    return this.text;
		  }

		  public static Blah fromString(String text) {
		    for (Blah b : Blah.values()) {
		      if (b.text.equalsIgnoreCase(text)) {
		        return b;
		      }
		    }
		    return null;
		  }
		}

}
