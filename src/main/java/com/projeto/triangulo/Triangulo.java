package com.projeto.triangulo;

public class Triangulo {
	public int ld1;
	public int ld2;
	public int ld3;

	public Triangulo(int ld1, int ld2, int ld3) {
		super();
		this.ld1 = ld1;
		this.ld2 = ld2;
		this.ld3 = ld3;
	}

	public  boolean validadorEquilatero(){ 
		if (ld1 == ld2 && ld2 == ld3 && ld1>0 && ld2>0 && ld3>0) {
			return true;
		}else {
			return false;
		}
		}

		public  boolean validadorIsosceles(){
			if(ld1 == ld2 && ld2 != ld3 || ld3 == ld2 && ld2 != ld1 || ld3==ld1 && ld1!=ld2 && ld1>0 && ld2>0 && ld3>0) {
				return true;		
			}else {
				return false;
			}
		}
		
		public boolean validadorEscaleno() {
			if(ld1 != ld2 && ld1!=ld3 && ld3!=ld2 && ld1>0 && ld2>0 && ld3>0) {
				return true;
			}else {
				return false;
			}
			
		}
	

	}