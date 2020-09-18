package org.mehrabi;

public class RestaurantMenuItem {
	
	private final String menuItemName;
	
	
	public RestaurantMenuItem(String menuItemName, String description, int price) {
		super();
		this.menuItemName = menuItemName;
		this.description = description;
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMenuItemName() {
		return menuItemName;
	}
	private String description;
	private int price;
	
	@Override
    public boolean equals(Object obj) {
         if ((obj == null)
        		 || (getClass() != obj.getClass())) {
             return false;
         }
         
         RestaurantMenuItem otherMenuItem = (RestaurantMenuItem) obj;

         return (otherMenuItem.getMenuItemName()).equals(this.menuItemName);

    }
	
	@Override
    public int hashCode() 
    { 
          
        // We are returning the Geek_id  
        // as a hashcode value. 
        // we can also return some  
        // other calculated value or may 
        // be memory address of the  
        // Object on which it is invoked.  
        // it depends on how you implement  
        // hashCode() method. 
        return this.hashCode(); 
    } 
}
