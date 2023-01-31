public class Testing{
    public static void main(String[] args) {
        public static BufferedImage exampleForSO(BufferedImage image) {
            BufferedImage imageIn = "/Users/aali02/desktop/image.png";
            BufferedImage imageOut = "/Users/aali02/desktop/image9.png"
            new BufferedImage(imageIn.getWidth(), imageIn.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
            int width = imageIn.getWidth();
            int height = imageIn.getHeight();
            int[] imageInPixels = imageIn.getRGB(0, 0, width, height, null, 0, width);
            int[] imageOutPixels = new int[imageInPixels.length];
            for (int i = 0; i < imageInPixels.length; i++) {
                int inR = (imageInPixels[i] & 0x00FF0000) >> 16;
                int inG = (imageInPixels[i] & 0x0000FF00) >> 8;
                int inB = (imageInPixels[i] & 0x000000FF) >> 0;
            
                if (  conditionChecker_inRinGinB  ){
                    // modify
                } else {
                    // don't modify
                }
            
            }
            imageOut.setRGB(0, 0, width, height, imageOutPixels, 0, width);
            return imageOut;
            }

    }
}