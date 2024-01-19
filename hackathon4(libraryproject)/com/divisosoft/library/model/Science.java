package com.divisosoft.library.model;

public class Science extends Book
 {
    private String general;

    public Science(String title, String author, String isbn, int price, String general) 
	{
        super(title, author, isbn, price);
        this.general = general;
    }

    public String getFieldOfStudy()
	{
        return general;
    }

    public void setFieldOfStudy(String general) 
	{
        this.general = general;
    }
	
	public String toString()
	{
		return super.toString()+"\n"+"general name is:"+general;
	}
}
