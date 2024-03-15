package model;

public class LineItem {
	private int id;
	private int requestId;
	private int productId;
	private int quantity;

	public LineItem() {

	}

	public LineItem(int id, int requestId, int productId, int quantity) {
		super();
		id = id;
		requestId = requestId;
		productId = productId;
		quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		requestId = requestId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		quantity = quantity;
	}

}
