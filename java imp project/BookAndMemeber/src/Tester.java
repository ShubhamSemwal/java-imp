public class Tester {
	public static void main(String args[]) {
		Member m1 = new Member("Deep");
		Member m2 = new Member("Sarthak");
		Book alc = new Book("The alchemist");
		Book kite = new Book("Kite");
		alc.getMember();
		m1.getBook();
		alc.issueBook(m1);
		alc.getMember();
		alc.issueBook(m2);
		alc.getMember();
		kite.issueBook(m1);
		m1.getBook();

	}
}