package com.share1024.utils;

import java.io.*;

/**
 * Created by yesheng on 2017/9/19.
 */
public class FileUtil {

    @Deprecated
    public static String streamToStringOld(InputStream inputStream){

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuffer sb = new StringBuffer();
        String line = null;
        try {
            while((line = bufferedReader.readLine())!=null){
                sb.append(line).append("/n");
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }


    public static String toString(InputStream inputStream,String encoding) throws IOException{
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] bytes = new byte[4096];
        int count = -1;
        while((count = inputStream.read(bytes,0,4096))!=-1){
            outputStream.write(bytes,0,count);
        }
        bytes = null;
        return new String(outputStream.toByteArray(),encoding);
    }


}
