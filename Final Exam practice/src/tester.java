package labTest2;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LT2UnitTests {

	@Test
	public void test_01_NonPrivateFields_10pts() {
		Field[] fields = Product.class.getDeclaredFields();
		//System.out.println(fields.length);
		for (Field field : fields) {
			assertTrue("Product class: fields should be private or final", Modifier.isPrivate(field.getModifiers()) 
					|| Modifier.isFinal(field.getModifiers()));
		}
		fields = Invoice.class.getDeclaredFields();
		//System.out.println(fields.length);
		for (Field field : fields) {
			assertTrue("Invoice: fields should be private or final", Modifier.isPrivate(field.getModifiers()) 
					|| Modifier.isFinal(field.getModifiers()));
		}
		fields = InvoiceItem.class.getDeclaredFields();
		//System.out.println(fields.length);
		for (Field field : fields) {
			assertTrue("InvoiceItem: fields should be private or final", Modifier.isPrivate(field.getModifiers()) 
					|| Modifier.isFinal(field.getModifiers()));
		}
	}

	@Test
	public void test_02_ProductGetSetPrice_10pts() {
		Product cookies = new Product("Oatmeal Cookies", 1.99);
		assertTrue("Product getPrice() fail", cookies.getPrice() == 1.99);
		cookies.setPrice(2.49);
		assertTrue("Product setPrice() fail", cookies.getPrice() == 2.49);
	}

	@Test
	public void test_03_ProductToString1_5_pts() {
		Product cake = new Product("Chocolate Cake", 21.90);
		assertTrue("Product toString incorrect1: " + cake.toString(), cake.toString().contains("Chocolate Cake"));
		assertTrue("Product toString incorrect2: " + cake.toString(), cake.toString().contains("21.90"));
	}

	
	@Test
	public void test_04_InvoiceItemComposition_10pts() {
		Product cookies = new Product("Oatmeal Cookies", 1.99);
		InvoiceItem invoiceItem = new InvoiceItem(cookies, 3);
		cookies.setPrice(2.49);
		
		assertTrue("InvoiceItem should own Product",
				cookies.getPrice() == 2.49 && invoiceItem.getProduct().getPrice() == 1.99);
	}

	@Test
	public void test_05_InvoiceItemGetSetPrice_10pts() {
		Product cookies = new Product("Oatmeal Cookies", 1.99);
		InvoiceItem invoiceItem = new InvoiceItem(cookies, 3);
		assertTrue("Product getPrice() fail", invoiceItem.getQuantity() == 3);
		invoiceItem.setQuantity(0);
		assertTrue("Product setPrice() fail", invoiceItem.getQuantity() == 0);
	}

	@Test
	public void test_06_InvoiceItemToString_5_pts() {
		Product cookies = new Product("Oatmeal Cookies", 1.99);
		InvoiceItem invoiceItem = new InvoiceItem(cookies, 3);
		assertTrue("Product toString incorrect1: " + invoiceItem.toString(), invoiceItem.toString().contains("Oatmeal Cookies"));
		assertTrue("Product toString incorrect2: " + invoiceItem.toString(), invoiceItem.toString().contains("3"));
	}


	@Test
	public void test_07_InvoiceToString1_10_pts() {
		Product cake = new Product("Chocolate Cake", 21.99);
		Product cookies = new Product("Oatmeal Cookies", 1.99);
		Product chocolates = new Product("Tasty Chocolates", 0.98);

		Invoice invoice = new Invoice();
		invoice.addItem(cake, 1);
		invoice.addItem(cookies, 3);
		invoice.addItem(chocolates, 30);
		
		invoice.addItem(cookies, 44);
		System.out.println(invoice);
		assertTrue("Invoice toString incorrect1: " + invoice.toString(), invoice.toString().contains("Chocolate Cake"));
		assertTrue("Invoice toString incorrect2: " + invoice.toString(), invoice.toString().contains("Oatmeal Cookies"));
		assertTrue("Invoice toString incorrect3: " + invoice.toString(), invoice.toString().contains("Tasty Chocolates") 
				&& invoice.toString().contains("30"));
	}

	
	@Test
	public void test_08_InvoiceToString2_5_pts() {
		Product cake = new Product("Chocolate Cake", 21.99);
		Product cookies = new Product("Oatmeal Cookies", 1.99);
		Product chocolates = new Product("Tasty Chocolates", 0.98);

		Invoice invoice = new Invoice();
		invoice.addItem(cake, 1);
		invoice.addItem(cookies, 3);
		invoice.addItem(chocolates, 30);
		
		invoice.addItem(cookies, 44);

		assertTrue("Invoice toString incorrect1: " + invoice.toString(), invoice.toString().contains("21.99"));
		assertTrue("Invoice toString incorrect2: " + invoice.toString(), invoice.toString().contains("1.99"));
		assertTrue("Invoice toString incorrect3: " + invoice.toString(), invoice.toString().contains(".98"));
	}

	@Test
	public void test_09_InvoiceAddItemGetItems1_size_10pts() {
		Product cake = new Product("Chocolate Cake", 21.99);
		Product cookies = new Product("Oatmeal Cookies", 1.99);
		Product chocolates = new Product("Tasty Chocolates", 0.98);

		Invoice invoice = new Invoice();
		invoice.addItem(cake, 1);
		invoice.addItem(cookies, 3);
		invoice.addItem(chocolates, 30);
		
		invoice.addItem(cookies, 1);
		//System.out.println(invoice.getItems());
		assertTrue("Invoice getList: wrong size", invoice.getItems().size() == 4);
	}

	@Test
	public void test_10_InvoiceGetItems2_notAlias_5pts() {
		Product cake = new Product("Chocolate Cake", 21.99);
		Product cookies = new Product("Oatmeal Cookies", 1.99);

		Invoice invoice = new Invoice();
		invoice.addItem(cake, 1);
		invoice.addItem(cookies, 3);
		
		assertTrue("Invoice getList: no defensive copies", invoice.getItems() != invoice.getItems());
	}

	@Test
	public void test_11_InvoiceGetItems3_deepCopy_10pts() {
		Product cookies = new Product("Oatmeal Cookies", 1.99);

		Invoice invoice = new Invoice();
		invoice.addItem(cookies, 3);
		
		invoice.getItems().get(0).setQuantity(1000);

		assertTrue("Invoice getList: client can change quantity; deep copy required",
				invoice.getItems().get(0).getQuantity() == 3);
	}

	@Test
	public void test_12_InvoiceGetTotal_10pts() {
		Product cake = new Product("Chocolate Cake", 21.99);
		Product cookies = new Product("Oatmeal Cookies", 1.99);
		Product chocolates = new Product("Tasty Chocolates", 0.98);

		Invoice invoice = new Invoice();
		invoice.addItem(cake, 1);
		invoice.addItem(cookies, 3);
		invoice.addItem(chocolates, 30);
		
		assertEquals("Invoice getTotal: wrong value", 57.36, invoice.getTotal(), 0.05);
	}



}