package com.davi.cursojava.aula40;

public class Teste {
    public static void main(String[] args) {

        Person person = new Person();
        Person student = new Student();
        Person teacher = new Teacher();

        person.setAdress("Street One, num 1");
        student.setAdress("Street Two, num 2");
        teacher.setAdress("Street Three, num 3");

        System.out.println(person.getAdressTicket());
        System.out.println(student.getAdressTicket());
        System.out.println(teacher.getAdressTicket());
    }
}
