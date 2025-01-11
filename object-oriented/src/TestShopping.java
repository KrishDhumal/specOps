import com.zubair.shop.Product;
import com.zubair.shop.ShoppingCart;

public class TestShopping {
	
	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem(new Product("Natraj Pencil", 3));
		cart.addItem(new Product("Raynolds 0.5", 5));
		cart.addItem(new Product("Doms Sketchpen", 15));
		cart.addItem(new Product("Apsara Eraser", 2));
		cart.addItem(new Product("Cello Gripper", 5));
		
		cart.checkout();
		
		cart.addItem(new Product("Whatever", 30));
	}
}
