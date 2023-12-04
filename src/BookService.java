mport javax.xml.validation.Validator;

public class BookService {

Validator validator = new Validator();
List<Book> books= new ArrayList();

@Override
public void addBook() {
	String bookid= validator.validateId();
	String Author=validator.validateAuthorTitle(input:"Author");
	String Title=validator.validateAuthorTitle(input: "Title");
	String Year=validator.validatePublishYear();
	Book book=new Book(bookid, Author, Title, year, status:"Available");
	books.add(book);
	System.out.println(GREEN+ "Book Added Successfully !!! " + RESET);
}
@Override


}
