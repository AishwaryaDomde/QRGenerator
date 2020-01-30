package com.demo.QRGenerator;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.springframework.stereotype.Component;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
@Component
public class QRCoder {
	/*
	 * void generateQRCodeImage(String text, int width, int height, String filePath)
	 * throws WriterException, IOException { String qcodePath =
	 * "src/main/resources/static/images/" + "DEMO" + "-QRCode.png"; QRCodeWriter
	 * qrCodeWriter = new QRCodeWriter(); BitMatrix bitMatrix = qrCodeWriter.encode(
	 * "231172805474", BarcodeFormat.QR_CODE, 350, 350); Path path =
	 * FileSystems.getDefault().getPath(qcodePath);
	 * MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path); }
	 */

	public void generateQRCodeImage(String text, int width, int height, String filePath) throws WriterException, IOException {
		// TODO Auto-generated method stub
		String qcodePath = "src/main/resources/static/images/" + "DEMO" + "-QRCode.jpg";
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = qrCodeWriter.encode( "231172805474/27AAPCS1419M1ZV/1/16/2020 11:43:00 AM", BarcodeFormat.QR_CODE, 350, 350);
		Path path = FileSystems.getDefault().getPath(qcodePath);
		MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
	}
}
