package net.melove.pdf;


public class OfficeToPDF {

	public static void main(String[] args){
		
		OfficeToPDFTools otp = new OfficeToPDFTools();
		
		if(args.length > 2){
			otp.startService(args[0]);
			
			String file1 = args[1];
			String file2 = args[2];
			otp.threadOfficeToPDF(file1, file2);
		}else{
			System.out.println("参数接收错误，请重新输入参数！");
		}
	}
	
}

