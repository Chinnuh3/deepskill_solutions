package dataStructures;
import java.util.Arrays;
import java.util.Comparator;
	class Product{
	    private int productId;
	    private String productName;
	    private String category;

	    public Product(int productId, String productName, String category) {
	        this.productId = productId;
	        this.productName = productName;
	        this.category = category;
	    }

	    public int getProductId() {
	        return productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public String getCategory() {
	        return category;
	    }

	    @Override
	    public String toString() {
	        return "Product(ID: " + productId + ", Name: " + productName + ", Category: " + category + ")";
	    }
	}

public class Productsearch {
	    // Linear search
	    public static Product linearSearch(Product[] arr, int searchId) {
	        for (Product i : arr) {
	            if (i.getProductId() == searchId) {
	                return i;
	            }
	        }
	        return null;
	    }

	    // Binary search
	    public static Product binSearch(Product[] arr, int searchId) {
	        int l= 0;
	        int r = arr.length - 1;

	        while (l <= r) {
	            int m = l + (r - l) / 2;

	            if (arr[m].getProductId() == searchId) {
	                return arr[m];
	            } else if (arr[m].getProductId() < searchId) {
	                l = m + 1;
	            } else {
	                r = m - 1;
	            }
	        }
	        return null;
	    }

public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Product[] arr = {
		            new Product(1, "Shelf", "Furniture"),
		            new Product(2, "Earbuds", "Electronics"),
		            new Product(3, "LED bulb", "Electronics"),
		            new Product(4, "Electric Guitar", "Musical Instrument"),
		            new Product(5, "Piano", "Musical Instrument")
		        };

		        int searchId = 4;
		        Product res = linearSearch(arr, searchId);
		        System.out.println("Applied Linear Search: " + res);

		        Arrays.sort(arr, Comparator.comparingInt(Product::getProductId));
		        searchId = 3;
		        res = binSearch(arr, searchId);
		        System.out.println("Applied Binary Search: " + res);
		    }
		
	    }
		

