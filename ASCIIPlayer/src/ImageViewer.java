import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageViewer {
	public static void main(String[] args) throws IOException {
		ImageViewer test = new ImageViewer();
		test.readPixels();
	}

	private final int consoleHeight = 300;
	private final int consoleWidht = 165;
	private BufferedImage img;

	public ImageViewer() throws IOException {
		img = ImageIO.read(new File("/home/slavunderkind/Pictures/chick.jpg"));
	}

	private void getNewScaledImage() {
		double scalePercent = 1;
		if ((img.getHeight() < consoleHeight)
				&& (img.getWidth() < consoleWidht)) {

		} else if ((img.getHeight() > consoleHeight)
				&& img.getWidth() > consoleWidht) {
			if (img.getHeight() > img.getWidth()) {
				scalePercent = img.getHeight() / consoleHeight;

			} else {
				scalePercent = img.getWidth() / consoleWidht;

			}
		} else if (img.getHeight() > consoleHeight) {
			scalePercent = img.getHeight() / consoleHeight;
		} else {
			scalePercent = img.getWidth() / consoleWidht;
		}

		img = new BufferedImage((int) (img.getWidth() * scalePercent),
				(int) (img.getHeight() * scalePercent), 1);
	}

	private int getPixelData(BufferedImage img, int x, int y) {
		int argb = img.getRGB(x, y);

		int rgb[] = new int[] { (argb >> 16) & 0xff, // red
				(argb >> 8) & 0xff, // green
				(argb) & 0xff // blue
		};

		int intensity = (rgb[0] + rgb[1] + rgb[2]) / 3;

		return intensity;
	}

	private void printPixel(int intensity) {

		if (intensity > 240) {
			System.out.print(" ");
		} else if (intensity >= 200 && intensity <= 240) {
			System.out.print(".");
		} else if (intensity >= 160 && intensity < 200) {
			System.out.print("*");
		} else if (intensity >= 80 && intensity < 160) {
			System.out.print("$");
		} else if (intensity >= 40 && intensity < 80) {
			System.out.print("#");
		} else {
			System.out.print("@");
		}
	}

	public void readPixels() {

		int[][] pixelData = new int[img.getWidth()][img.getHeight()];
		int rgbIntensity;

		for (int i = 0; i < img.getHeight(); i++) {
			for (int j = 0; j < img.getWidth(); j++) {
				rgbIntensity = getPixelData(img, j, i);
				printPixel(rgbIntensity);
			}
			System.out.println();
		}
	}
}
