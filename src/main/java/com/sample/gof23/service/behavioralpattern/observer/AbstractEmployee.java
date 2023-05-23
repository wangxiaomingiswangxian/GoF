package com.sample.gof23.service.behavioralpattern.observer;

/**
 * @author 王贤
 */
public abstract class AbstractEmployee {
	
	protected AbstractAddressBook addressBook ;
	protected String addressBookContents;

	public AbstractAddressBook getAddressBook() {
		return addressBook;
	}

	public void setAddressBook(AbstractAddressBook addressBook) {
		this.addressBook = addressBook;
	}
	
	public void update( AbstractAddressBook book ){
		setAddressBook(book);
		addressBookContents = addressBook.getAddressBook();
		
	}

}
