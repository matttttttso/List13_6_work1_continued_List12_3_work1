//具象クラスTriangle
public class Triangle extends Polygon {
	//フィールドメンバ
	private Point p1;
	private Point p2;
	private Point p3;

	//メソッドメンバ
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
		super.getInternalAngle(3);
	}

	public void draw() {
		System.out.println("[三角形を描画] " +
				"点1(" + p1.getX() + "," + p1.getY() + ")から" +
				"点2(" + p2.getX() + "," + p2.getY() + ")、" +
				"点3(" + p3.getX() + "," + p3.getY() + ")の三角形");
	}

	public double perimeter(int x1, int y1, int x2, int y2, int x3, int y3) {
		double length1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		double length2 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
		double length3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		double length = length1 + length2 + length3;
		return length;
	}
}
