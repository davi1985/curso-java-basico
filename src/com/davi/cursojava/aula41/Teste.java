package com.davi.cursojava.aula41;

public class Teste {

    public static void main(String[] args) {

    	//Person person = new Person();
    	Person student = new Student();
    	Person teacher = new Teacher();
    	
    	//person.setAdress("Street One, number 1");
    	student.setAdress("Street Two, number 2");
    	teacher.setAdress("Street Three, number 3");
    	
//    	System.out.println(student.getAdressTicket());
//      System.out.println(teacher.getAdressTicket());
    
    	student.showTicketAddress();
    	teacher.showTicketAddress();

    }
}
