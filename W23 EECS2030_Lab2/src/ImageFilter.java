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


/** 
 * @param imageData provides a 1D array containing color data for each pixel of the image
 * @param width integer value width
 * @return int[]
 */
public static int [] getRed(int[] imageData, int width) {
	for (int i = 0; i < imageData.length;i++) {
		int red = (imageData[i] & 0x00FF0000);
		int green = (imageData[i] & 0x00FF0000) >> 8;
		int blue = (imageData[i] & 0x00FF0000) >> 16;
		int transparent = (imageData[i] & 0xFF000000);
	
	imageData[i] = red | green | blue | transparent;
	}
	return imageData;
}


/** 
 * @param imageData provides a 1D array containing color data for each pixel of the image
 * @param width integer value width
 * @return int[]
 */
public static int [] getGreen(int[] imageData, int width) {
	for (int i = 0; i < imageData.length;i++) {
		int red = (imageData[i] & 0x0000FF00) << 8;
		int green = (imageData[i] & 0x0000FF00);
		int blue = (imageData[i] & 0x0000FF00) >> 8;
		int transparent = (imageData[i] & 0xFF000000);
	
	imageData[i] = red | green | blue | transparent;
	}
	return imageData;
}


/** 
 * @param imageData provides a 1D array containing color data for each pixel of the image
 * @param width integer width value
 * @return int[]
 */
public static int [] getBlue(int[] imageData, int width) {
	for (int i = 0; i < imageData.length;i++) {
		int red = (imageData[i] & 0x000000FF) << 16;
		int green = (imageData[i] & 0x000000FF) << 8;
		int blue = (imageData[i] & 0x000000FF);
		int transparent = (imageData[i] & 0xFF000000);
	
	imageData[i] = red | green | blue | transparent;
	}
	return imageData;
}

}
