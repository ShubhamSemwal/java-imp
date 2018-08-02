import java.util.ArrayList;

public class Member {
	String memberName;
	boolean bookIssued = false;
	String memberBookName;
	ArrayList listOfBooks = new ArrayList();

	Member() {

	}

	Member(String memberName) {
		this.memberName = memberName;
	}

	public void getBook() {
		if (listOfBooks.size() == 0) {
			System.out.println("0 Books issued ");
		} else {
			System.out.println(listOfBooks);
		}

	}
}