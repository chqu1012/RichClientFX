package de.dc.javafx.xcore.lang.edit.generator

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore

interface ICustomerGenerator<T> {
	def String path(T input)
	def String code(T input)
}