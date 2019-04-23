package de.dc.javafx.xcore.lang.edit.generator

interface ICustomerGenerator<T> {
	def String path(T input)
	def String code(T input)
}