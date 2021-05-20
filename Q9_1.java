/**
 * @author Hansen Li
 *
 * @date Jun 18, 2019
 */
public class Q9_1 {

	public static void main(String[] args) {
		
		//creates the two test rectangle objects
		Rectangle firstRect = new Rectangle(4, 40);
		Rectangle secondRect = new Rectangle(3.5, 35.9);
		
		System.out.printf("Rectangle A's width is %.2f\n", firstRect.getWidth());
		System.out.printf("Rectangle A's height is %.2f\n", firstRect.getHeight());
		System.out.printf("Rectangle A's area is %.2f\n", firstRect.getArea(firstRect.getWidth(), firstRect.getHeight()));
		System.out.printf("Rectangle A's perimeter is %.2f\n", firstRect.getArea(firstRect.getWidth(), firstRect.getHeight()));

		System.out.printf("Rectangle B's width is %.2f\n", secondRect.getWidth());
		System.out.printf("Rectangle B's height is %.2f\n", secondRect.getHeight());
		System.out.printf("Rectangle B's area is %.2f\n", secondRect.getArea(secondRect.getWidth(), secondRect.getHeight()));
		System.out.printf("Rectangle B's perimeter is %.2f\n", secondRect.getArea(secondRect.getWidth(), secondRect.getHeight()));

		
		
	}
	
}
