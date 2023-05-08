package myobj2;

public class MyFactory<T1, T2> {
	
	T1 material;
	T2 product;
	
	public void putMaterial(T1 metarial) {
		System.out.println("재료가 들어왔습니다: " + material);
		this.material = metarial;
	}
	
	public T2 getProduct() {
		return product;
	}
	
}
