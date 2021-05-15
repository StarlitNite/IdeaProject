package utils;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

public class FileUploadUtil {

	//上传单一文件
	public static String uploadSingleFile(Part part, HttpServletRequest request){
		String path = null;
		String header = part.getHeader("content-disposition");
		String fileName = getFileName(header);
		if(!fileName.equals("")){
			//得到上传文件的文件扩展名
			String fileExtName = getFileExtName(header);
			String newFileName = System.currentTimeMillis()+fileExtName;
			//得到上传文件的保存路径
			String savePath =  request.getServletContext().getRealPath
					("/images/uploads");
			File f = new File(savePath);
			if(!f.exists()){
				f.mkdirs();
			}
			//文件上传
			try {
				part.write(savePath+File.separator+newFileName);
				path = "images/uploads/"+newFileName;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return path;
	}
	
	 /**
     * 根据请求头解析出文件名
     * 请求头的格式：火狐和google浏览器下：form-data; name="file"; filename="snmp4j--api.zip"
     *  IE浏览器下：form-data; name="file"; filename="E:\snmp4j--api.zip"
     * @param header 请求头
     * @return 文件名
     */
    private static String getFileName(String header) {
    	/**
         * String[] tempArr1 = header.split(";");代码执行完之后，在不同的浏览器下，tempArr1数组里面的内容稍有区别
         * 火狐或者google浏览器下：tempArr1={form-data,name="file",filename="snmp4j--api.zip"}
         * IE浏览器下：tempArr1={form-data,name="file",filename="E:\snmp4j--api.zip"}
         */
        String[] tempArr1 = header.split(";");
        /**
         *火狐或者google浏览器下：tempArr2={filename,"snmp4j--api.zip"}
         *IE浏览器下：tempArr2={filename,"E:\snmp4j--api.zip"}
         */
        String[] tempArr2 = tempArr1[2].split("=");
        //获取文件名，兼容各种浏览器的写法
        String fileName = tempArr2[1].substring(tempArr2[1].lastIndexOf("\\")+1).replaceAll("\"", "");
        return fileName;
    }
    
    private static String getFileExtName(String header) {
    	String fileName = getFileName(header);
        String extName = fileName.substring(fileName.lastIndexOf("."));
        return extName;
    }
}
