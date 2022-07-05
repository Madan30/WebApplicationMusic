package com.musicapp.Utls;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.servlet.http.Part;

@ManagedBean(name = "fileUtls")
@ViewScoped
public class FileUtls implements Serializable {

  

    private static final long serialVersionUID = 1L;

    private Part file;
    private String message;

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

   

    public String uploadFile() throws IOException {
        boolean fileSuccess = false;

        if (file != null && file.getSize() > 0) {
            String fileName = getFileNameFromPart(file);

            /**
             * destination where the file will be uploaded
             */
            File savedFile = new File("/home/mrg1813/Images/", fileName);

            // System.out.println("savedFile.toPath(): " + savedFile.toPath());
            try (InputStream input = file.getInputStream()) {
                Files.copy(input, savedFile.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }

            fileSuccess = true;
        }

        if (fileSuccess) {

            setMessage("File successfully uploaded");
        } else {

            setMessage("Error, select atleast one file!");
        }

        return null;
    }

    public static String getFileNameFromPart(Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : partHeader.split(";")) {
            if (content.trim().startsWith("filename")) {
                String fileName = content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
                return fileName;
            }
        }
        return null;
    }
    
    

}
