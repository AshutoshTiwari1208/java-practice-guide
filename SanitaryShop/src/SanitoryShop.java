
public class SanitoryShop {
	
	public static Pipe[] createPcs(Pipe obj, int noOfPieces) {
		
		Pipe arr[] = new Pipe[noOfPieces];
		double commonLength = obj.getLength()/noOfPieces;
		int commonDiameter = obj.getDiameter();
		for(int i=0;i<noOfPieces;i++) {
			arr[i] = new Pipe(commonLength, commonDiameter);
		}
		return arr;
	}
}
