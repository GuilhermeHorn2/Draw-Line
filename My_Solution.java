package misc;

import java.util.ArrayList;

public class main_misc2 {
	
	
	
	public static void main(String[] args) {
	//(a+b)%k = ((a % k)+(b % k)) % k    || ||
	
		Byte[] screen = new Byte[7];
		for(int i = 0;i < 7;i++){
			Byte bt = new Byte();
			screen[i] = bt;
		}
		draw_line(screen,24,1,17,1);
		
		/*for(int i = 0;i < screen.length;i++){
			System.out.println(i+ ":" + screen[i]);
		}*/
	 
	}
	
	private static void draw_line(Byte[] screen,int w,int x1,int x2,int y){
		
		int k = w/8;
		
		int strt = k*y;//Start of the layer with height = y
	
		
		//First i will check the bytes that will be totally flipped to draw the line
		
		int a = (x1/8)+strt;
		int b = (x2/8)+strt;
		
		if(a != b){
			
			for(int i = a;i <= b;i++){
				Byte bt = screen[i];
				if(i == a) {
					bt.flip_bits(x1, 7);
					continue;
				}
				if(i == b){
					int idx_b = x2 % 8;//index inside the byte
					bt.flip_bits(0, idx_b);
					continue;
				}
				bt.flip_all();
				
			}		
		}
		else if(a == b){
			Byte bt = screen[a];
			bt.flip_bits(x1, x2);
		}
		
		//printing the screen
		
		for(int i = 0;i < screen.length;i += k){
			for(int j = i;j < i+k;j++) {
				if(j < screen.length){
					System.out.print(screen[j]);
				}
			}
			System.out.println();
		}
		
		
		
	}
		
	
	}
	
	
