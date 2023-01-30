import java.io.BufferedReader;
import java.nio.Buffer;

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
		
		for(int i = 0; i < imageData.length; i++){
			int r = (imageData[i] & 0x00110000) >> 16;
			int g = (imageData[i] & 0x00002200) >> 8;
		}	int b =	(imageData[i] & 0x00000033) >> 0;

		if(null){
			//modify
		} else {
			// dont modify
		}

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

}
