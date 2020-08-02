package com.example.newsblog.storage;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

import com.example.newsblog.model.BlogUnit;

@Component
public class Storage {
	private ArrayList<BlogUnit> blogList;
	
	public Storage() {
		this.blogList = new ArrayList<BlogUnit>() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 805160717983105246L;

			{
				add(new BlogUnit(
						"15 культовых франшиз, которые стоит пересмотреть этим летом",
						"sa"));
				add(new BlogUnit(
						"От «Друзей» до «Утреннего шоу»: Как Дженнифер Энистон стала любимицей Америки",
						"sa"));
			}
		};
	}
	
	public void addBlogUnit(BlogUnit blogUnit) {
		this.blogList.add(blogUnit);
	}
	public ArrayList<BlogUnit> getBlogList() {
		return blogList;
	}


}
