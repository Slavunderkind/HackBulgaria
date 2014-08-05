public class Furniture {
	public static void main(String[] args) {
		BuildingMaterials materials = BuildingMaterials.Wood;
		Furniture f = new Furniture("chair", materials, 15);
		System.out.println(f.getDescription() + " " + f.price());
		f.price();
	}

	private final String furnitureType;
	private final BuildingMaterials materials;

	private double amount = 0;

	public Furniture(String ftype, BuildingMaterials materials, double amount) {
		this.furnitureType = ftype;
		this.materials = materials;
		this.amount = amount;
	}

	public String getDescription() {
		return "A " + furnitureType + " made of " + materials;
	}

	public double price() {
		return materials.getPrice(this.amount);
	}
}
