package Task3_Nasledovanie;

public class Pensil extends Novichek {

	public String pen  = "";

	public String getPen() {
		return pen;
	}

	public void setPen(String pen) {
		this.pen = pen;
	}

	public void outpen (){
		System.out.println(pen);
	}
}
