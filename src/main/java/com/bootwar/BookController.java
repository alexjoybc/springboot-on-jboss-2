package com.bootwar;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class BookController {
	
	@RequestMapping(value = "/books",method = RequestMethod.GET)
	@ResponseBody
    public Book getBook() {
    	Book book = new Book();
    	book.setBookId(109);
    	book.setBookName("book1");
    	book.setBookPrice("100");
    	return book;
	}
	
}