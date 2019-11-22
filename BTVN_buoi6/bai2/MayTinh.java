package buoi6;


public class MayTinh {
	
	public float TinhTong(float a, float b){
		System.out.println(a+b);
		return a+b;
	}
	public float TinhTong(float a,float b,float c){
		System.out.println(a+b+c);
		return a+b+c;
	}
	public float TinhTong(float a[]){
		
		float s = 0;
		for(float aa : a) {
			s += aa;
		}
		System.out.println(s);
		return s;
	}
	
}
