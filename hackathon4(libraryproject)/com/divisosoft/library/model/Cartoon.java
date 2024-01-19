package com.divisosoft.library.model;

public class Cartoon extends Book
 {

    private String cartoonCharacter;

    public Cartoon(String title, String author, String isbn, int price, String cartoonCharacter) 
	{
        super(title, author, isbn, price);
        this.cartoonCharacter = cartoonCharacter;
    }

    public String getCartoonCharacter() 
	{
        return cartoonCharacter;
    }

    public void setCartoonCharacter(String cartoonCharacter)
	{
        this.cartoonCharacter = cartoonCharacter;
    }
	
	public String toString()
	{
		return super.toString()+"\n"+"cartoonCharacteris :"+cartoonCharacter;
	}
}