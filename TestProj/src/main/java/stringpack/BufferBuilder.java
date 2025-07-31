package stringpack;

public class BufferBuilder {

	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Hello");
	System.out.println(sb);
	StringBuilder su = new StringBuilder ("hi");
	System.out.println(su);
	//insert( ) insert a particular string based on index
	System.out.println(sb.insert(0,"hey"));
	System.out.println(sb.append("Mukund"));
	//replace : to  replace the particular value from index
	System.out.println(sb.replace(0, 5, "rock"));
	//reverse () to reverse the string
    System.out.println(sb.reverse());
	// delete () -delete a part of the string based on the index
    System.out.println(sb.delete(0, 5));
	
	}

}
