package buoi6;

public class ConHeo {
	private String name;
	private double weight;
	private int old;
	
	public ConHeo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConHeo(String name) {
		super();
		this.name = name;
	}
	public ConHeo(int old) {
		super();
		this.old = old;
	}
	public ConHeo(double weight) {
		super();
		this.weight = weight;
	}
	public ConHeo(String name, double weight, int old) {
		super();
		this.name = name;
		this.weight = weight;
		this.old = old;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	
	public void ShowInfo() {
		System.out.println("-----------------");
		System.out.println("Name: "+ this.getName() + ", Old: "+ this.getOld() + ", Weight: "+ this.getWeight());
	}
}
