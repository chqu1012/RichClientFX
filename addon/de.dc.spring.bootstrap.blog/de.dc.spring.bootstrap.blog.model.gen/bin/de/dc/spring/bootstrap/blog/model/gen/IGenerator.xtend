package de.dc.spring.bootstrap.blog.model.gen

interface IGenerator<T> {

	def String gen(T t)	
}