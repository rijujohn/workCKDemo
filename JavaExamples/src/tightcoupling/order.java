package tightcoupling;

public class order {
	private cartcontents cart;
	private float salestax;
	
	public order(cartcontents cart,float salestax)
	{
		this.cart = cart;
		this.salestax = salestax;
		
	}
	
	public float OrderTotal()
	{
		float cartTotal = 0;
		for (int i = 0; i < cart.items.length; i++)
        {
            cartTotal += cart.items[i].price * cart.items[i].Quantity;
        }
        cartTotal += cartTotal* salestax;
        return cartTotal;
	}
	

}
