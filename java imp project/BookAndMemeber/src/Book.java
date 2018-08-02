import java.util.ArrayList;

public class Book {
	private String bookName;
	ArrayList listOfMembers = new ArrayList();

	Book() {

	}

	Book(String bookName) {
		this.bookName = bookName;
	}

	public void getMember() {
		if (listOfMembers.size() == 0) {
			System.out.println("No members have issued this book");
		} else {
			System.out.println(listOfMembers);
		}

	}

	public void issueBook(Member m1) {
		m1.listOfBooks.add(bookName);
		listOfMembers.add(m1.memberName);
		System.out.println(m1.memberName + " you have issued " + bookName);
	}

	public void returnBook(Member m1) {
		if (m1.listOfBooks.size() == 0) {
			System.out.println("You don't have this book issued");
		} else {
			m1.listOfBooks.remove(bookName);
			listOfMembers.remove(m1.memberName);
			System.out.println(m1.memberName + " you have returned " + bookName);
		}

	}
}