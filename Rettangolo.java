package test3;

public class Rettangolo implements IMetodoGeometrico {
	private double base;
	private double altezza;
	

	public Rettangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}
	

	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltezza() {
		return altezza;
	}


	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}


	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		double perimetro = 2*base+2*altezza;
		return perimetro;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
