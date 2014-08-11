package problems;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadFile {
	public static void downloadFile(String imageUrl, String fileName)
			throws IOException {

		URL image = new URL(imageUrl);
		InputStream in = image.openStream();
		OutputStream out = new FileOutputStream(fileName);
		int size = 2048;
		byte[] myImage = new byte[size];
		for (int i = 0; i < in.read(myImage); i++) {
			out.write(myImage, 0, size);
		}
		in.close();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		DownloadFile.downloadFile(
				"http://d3dsacqprgcsqh.cloudfront.net/photo/aozrdx0_700b.jpg",
				"/home/slavunderkind/tmp/image.jpg");

	}
}
