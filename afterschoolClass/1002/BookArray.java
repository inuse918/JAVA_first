import java.util.Scanner;

class Book {
	String title,author;
	
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
}
public class BookArray {
	public static void main(String[] args) {
		Book[] b=new Book[2];
		
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<b.length;i++) {
			System.out.println("���� > ");
			String title=sc.nextLine();
			System.out.println("���� > ");
			String author=sc.nextLine();
			b[i]=new Book(title,author);
		}
		
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i].title);
			System.out.println(b[i].author);
		}
		
	}

}
