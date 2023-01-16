package arrayListTask3;

public class Food {

//���� ������ ���� Ŭ���� ����(Food)
//   - ���� �̸�
//   - ���� ����
//   - ���� ����(�ѽ�, �߽�, �Ͻ�, ���)
//
//CRUD���� ����� ��Ƴ��� Ŭ���� ����(Restaurant)
//   - ���� �߰�
//   - ���� �̸����� ���� ���� ��ȸ
//   - ����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
//   - ���� ���� ���� �� ���� 10% ���
//   - ����ڰ� ���ϴ� ������ ���� ���� ��ȸ
	private String name;
	private int price;
	private String kind;
	
	public Food() {;}
	
	
	public Food(String name, int price, String kind) {
		super();
		this.name = name;
		this.price = price;
		this.kind = kind;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", kind=" + kind + "]";
	}
	
	
	
	
}
