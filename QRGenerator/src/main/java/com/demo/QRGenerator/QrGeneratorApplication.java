package com.demo.QRGenerator;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QrGeneratorApplication {

	public static void main(String[] args) throws WriterException, IOException {
		ConfigurableApplicationContext context =  SpringApplication.run(QrGeneratorApplication.class, args);
		QRCoder Q = context.getBean(QRCoder.class);
		Q.generateQRCodeImage( "231172805474", 2, 350, "350");
		
	}

	private static final String QR_CODE_IMAGE_PATH = "./MyQRCode.png";

   
}
