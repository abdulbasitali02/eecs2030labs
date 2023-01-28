import javax.imageio.ImageIO;

/**
 * @author Andriy Pavlovych
 * The class is meant to illustrate a couple of image-processing algorithms:
 * three R-G-B channel extraction methods
 */
public class ImageFilter{
	/**
	 * private constructor, by design
	 */
	private ImageFilter() {		
	}

	//TODO create proper JavaDoc comments
	public static int [] getRed(int[] imageData, int width) {
		File file = null;
		BufferedImage bufferedImage = null;

		file = new file("Flower.png");
		bufferedImage = ImageIO.read(f);

		for (int y = 0; y < imageData.length; y++){
			for (int x = 0; x < width; x++){

			}
		}
		//TODO
		return imageData;
	}

	//TODO create proper JavaDoc comments
	public static int [] getGreen(int[] imageData, int width) {
		//TODO
		return imageData;
	}

	//TODO create proper JavaDoc comments
	public static int [] getBlue(int[] imageData, int width) {
		//TODO
		return imageData;
	}

	public grayscale(){
		for (int y = 0; y < )
	}

}
