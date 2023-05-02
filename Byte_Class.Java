package misc;

public class Byte {
	
	private int[] bits = {0,0,0,0,0,0,0,0};
	
	public Byte(){
	}
	
	public void flip_bits(int i,int j){
		for(int k = i;k <=j;k++){
			bits[k] = 1;
		}
	}
	
	public void flip_all(){
		for(int i = 0;i < 8;i++){
			bits[i] = 1;
		}
	}
	
	public String toString(){
		StringBuilder x = new StringBuilder();
		for(int i = 0;i < bits.length;i++) {
			x.append(bits[i]);
		}
		return x.toString();
	}

}
