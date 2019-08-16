package com.davi.cursojava.aula36;

public class TestContact {

	public static void main(String[] args) {

		Contact contact = new Contact();
		contact.setName("Davi Silva");
		// contact.setAdress("Serra de Peroba, S/N");
		// contact.setPhone("(88) 9 8874 6494");

		// new adress object
		Adress adress = new Adress();
		adress.setStreet("Serra de Peroba");
		adress.setHouseNumber("S/N");
		adress.setComplements("none");
		adress.setCity("Icapuí");
		adress.setState("CE");
		adress.setZipCode("62810-000");

		contact.setAdress(adress);

		// new phone object
		Phone phone1 = new Phone();
		phone1.setType("celular");
		phone1.setDdd("88");
		phone1.setNumber("98888 8888");

		Phone phone2 = new Phone();
		phone2.setType("home");
		phone2.setDdd("88");
		phone2.setNumber("98888 1234");
		
		Phone[] phones = new Phone[2];
		phones[0] = phone1;
		phones[1] = phone2;
		
		contact.setPhones(phones);
		
		System.out.println(contact.getName());

		if (contact != null && contact.getAdress() != null) {
			System.out.println(contact.getAdress().getCity());
		}

		/*
		if (contact != null && contact.getPhone() != null) {
			System.out.println(contact.getPhone().getDdd() + " - " + contact.getPhone().getNumber());
		}*/
		
		if (contact != null && contact.getPhones() != null) {
			for (Phone phone : contact.getPhones()) {
				System.out.println(phone.getDdd() + " - " + phone.getNumber());
			}
		}
	}

}
