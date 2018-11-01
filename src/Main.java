import ij.IJ;
import ij.ImagePlus;
import ij.process.ColorProcessor;
import ij.process.ImageProcessor;

import java.awt.image.ImageProducer;

public class Main {


    public static void main(String[] args) {



        String path="C:\\Users\\xmelnik\\Desktop\\aleksandra\\DIC-C2DH-HeLa\\01\\t000.tif";

        ImagePlus image = IJ.openImage(path);
        //ImageProcessor imageP=image.getProcessor();
        ColorProcessor imagePC=  image.getProcessor().convertToColorProcessor();


/*        imageP.set(0,0,255);
        imageP.set(0,1,0);
        imageP.set(1,0,0);
        imageP.putPixelValue(0,1,255);
        imageP.putPixel(0,2,255);
        imageP.set(0,4,255);*/
        int[] a={0,0,255};
        imagePC.putPixel(0,0,a);

        ImagePlus imageC = new ImagePlus("s",imagePC);//(ImagePlus) image.clone();
        //imageC.setProcessor(imagePC);


        IJ.save(imageC,"C:\\Users\\xmelnik\\Desktop\\test\\myt000.tif");

        System.out.println("Hello World!");

        //create the detector
        CannyEdgeDetector detector = new CannyEdgeDetector();

//adjust its parameters as desired
        detector.setLowThreshold(0.5f);
        detector.setHighThreshold(1f);

////apply it to an image
//        detector.setSourceImage(imageC);
//        detector.process();
//        BufferedImage edges = detector.getEdgesImage();



    }


}
