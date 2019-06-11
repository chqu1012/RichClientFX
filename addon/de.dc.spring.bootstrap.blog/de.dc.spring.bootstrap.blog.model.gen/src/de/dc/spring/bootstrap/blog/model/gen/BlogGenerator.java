package de.dc.spring.bootstrap.blog.model.gen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;

import de.dc.spring.bootstrap.blog.model.Blog;
import de.dc.spring.bootstrap.blog.model.TileSmallSection;
import de.dc.spring.bootstrap.blog.model.util.ModelSwitch;

public class BlogGenerator extends ModelSwitch<Void> {

	BlogTemplate blog = new BlogTemplate();
	TileSmallSectionTemplate tileSmall = new TileSmallSectionTemplate();
	
	public BlogGenerator() {
		new File("generated").mkdirs();
		new File("generated/fragments").mkdirs();
	}
	
	@Override
	public Void caseBlog(Blog object) {
		String code = blog.gen(object);
		writeFile("index.html",code);
		object.getSections().stream().forEach(e -> doSwitch(e));
		return super.caseBlog(object);
	}

	@Override
	public Void caseTileSmallSection(TileSmallSection object) {
		String code = tileSmall.gen(object);
		writeFile("fragments/"+object.getUuid()+".html",code);
		return super.caseTileSmallSection(object);
	}
	
	private void writeFile(String path, String code) {
		try {
			FileUtils.write(new File("generated/"+path), code, Charsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
