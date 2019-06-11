package de.dc.spring.bootstrap.blog.model.gen;

import de.dc.spring.bootstrap.blog.model.Blog;

public class BlogGeneratorMain {

	public static void main(String[] args) {
		BlogGenerator generator = new BlogGenerator();
		BlogFile file = new BlogFile();
		Blog blog = file.load("resources/FAW.blog");
		generator.doSwitch(blog);
		
		System.out.println("Blog successfully generated!");
	}

}
