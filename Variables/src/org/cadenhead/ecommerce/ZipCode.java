package org.cadenhead.ecommerce;

public class ZipCode {
  private String zipCode = "";
  
  public ZipCode(String inZipCode) {
	  setZipCode(inZipCode);
  }
  
  public void  setZipCode(String inZipCode) {//1.Is it a class or an interface?
	  if ((inZipCode.length() == 5) | (inZipCode.length() ==9)) {
		  zipCode = inZipCode;
		  }
	  }
  
  public String getZipCode() {
	  return zipCode;//2.Is it a constructor
  }
  
  public static void main(String[] arguments) {//3.is it a class
      ZipCode zip1 = new ZipCode("75044");//4.What is "75044"
      ZipCode zip2 = new ZipCode("320840");//5.What is it
      if (zip1.getZipCode() != "") {
    	  System.out.println("Zip1: " + zip1.getZipCode());//6.Where the "zip1" in "zip1.getZipCode()"come from ?
      }
      if (zip2.getZipCode() != "") {
    	  System.out.println("Zip2: " + zip2.getZipCode());
      }
  }
}
