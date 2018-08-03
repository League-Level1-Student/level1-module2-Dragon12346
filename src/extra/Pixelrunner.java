package extra;

import java.util.Random;

public class Pixelrunner {
public static void main(String[] args) {
	PixelParty Pix = new PixelParty();
	Pix.setColor(0, 255, 0);
	Random idk = new Random();
	
	
	for (int i = 0; i < 55; i++) {
		int idc = idk.nextInt(4);
		int idq = idk.nextInt(256);
		int id = idk.nextInt(256);
		int idl = idk.nextInt(256);
		
	if (idc == 0) {
		Pix.setColor(id, idq, idl);
		int ide = idk.nextInt(500);
		int idd = idk.nextInt(500);
		Pix.drawCircle(ide, idd, 100);	
	}
	
	if (idc == 1) {
		Pix.setColor(id, idq, idl);
		int ide = idk.nextInt(500);
		int idd = idk.nextInt(500);
		Pix.drawRectangle(ide, idd, 50, 50);	
	}
	
	if (idc == 2) {
		Pix.setColor(id, idq, idl);
		int ide = idk.nextInt(500);
		int idd = idk.nextInt(500);
		int idw = idk.nextInt(500);
		int idr = idk.nextInt(500);
		Pix.drawLine(ide, idd, idw, idr);
	}
	
	if (idc == 3) {
		Pix.setColor(id, idq, idl);
		int ide = idk.nextInt(500);
		int idd = idk.nextInt(500);
		int idg = idk.nextInt(500);
		int idw = idk.nextInt(500);
		int idr = idk.nextInt(500);
		int idt = idk.nextInt(500);
		Pix.drawTriangle(ide, idd, idg, idw, idr, idt);	
	}
	
	}
	Pix.saveImage();
}
}
