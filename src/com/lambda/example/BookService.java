package com.lambda.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookService {
	
	public static List<Book> getBooksInSorted(){
		
		List<Book> l=new BookDao().getenrateBooks();
		
		System.out.println("UnSorted Books"+l);
		
//		Tradition Ways1
//		Collections.sort(l, new MyComparator() {
//		});

//		Tradition Ways2
//		Collections.sort(l, new Comparator<Book>() {
//			@Override
//			public int compare(Book o1, Book o2) {
//					return o2.getName().compareTo(o1.getName());
//			}
//		});
		
		
//		Lambda Expression 1
//		Comparator<Book> bk=(c1,c2)->c1.getName().compareTo(c2.getName());
//		Collections.sort(l,bk);

//		Lambda Expression 2	-> Only in 1 Line	
//		Collections.sort(l,(o1,o2) -> ((Book) o1).getName().compareTo(((Book) o2).getName()));

//		stream API:
		l.stream().sorted(Comparator.comparing(Book::getName)).collect(Collectors.toList());
		
		return l;
	}
	
	public static void main(String[] args) {
		List<Book> sl=BookService.getBooksInSorted();
		
		System.out.println("Sorted List: "+sl);
		
		Map<Integer,String> map =new HashMap<>();
		map.put(1, "Sunil");
		map.put(2, "Navin");
		map.put(3, "Sandeep");
		map.put(4, "Ramu");
		map.forEach((k,v)->System.out.println(k+" : "+v));
		map.entrySet().stream().forEach(obj->System.out.println(obj));
	}

}

//Traditional Way1
//class MyComparator implements Comparator<Book>{
//
//	@Override
//	public int compare(Book b1, Book b2) {
//		return b2.getName().compareTo(b1.getName());
//	}
	//}
