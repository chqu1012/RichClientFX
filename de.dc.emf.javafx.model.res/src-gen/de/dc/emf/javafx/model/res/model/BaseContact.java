	package de.dc.emf.javafx.model.res.model;
	
	public abstract class BaseContact<T>{
	
		private String name;
		private Integer age;
		private Boolean gender;
		
		public BaseContact(){
		}
		
		public BaseContact(T t) {
			map(t);
		}
		
		public BaseContact(String name, Integer age, Boolean gender){
			this.name=name;
			this.age=age;
			this.gender=gender;
		}
		
		protected abstract void map(T t);
		
		public String getName(){
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge(){
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}
		public Boolean getGender(){
			return gender;
		}

		public void setGender(Boolean gender) {
			this.gender = gender;
		}
	}
