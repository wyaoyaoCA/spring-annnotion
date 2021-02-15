package study.wyy.spring.anno.web;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.UUID;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/15 8:22 下午
 */
@Controller
public class FileUploadController {


    @RequestMapping("upload")
    public String updateItemById(MultipartFile file) throws Exception {
        // 图片上传
        // 设置图片名称，不能重复，可以使用uuid
        String picName = UUID.randomUUID().toString();
        // 获取文件名
        String oriName = file.getOriginalFilename();
        // 获取图片后缀
        String extName = oriName.substring(oriName.lastIndexOf("."));
        // 开始上传
        file.transferTo(new File("C:/upload/image/" + picName + extName));
        return "success";
    }


    @RequestMapping("/download")
    public void getImage(HttpServletRequest request, HttpServletResponse response)throws Exception{
        //1.获取ServletContext对象
        ServletContext servletContext = request.getServletContext();
        //2.获取图片的磁盘绝对路径
        String path = servletContext.getRealPath("/images/6.jpg");
        //3.获取spring提供的文件系统资源对象
        Resource resource = new FileSystemResource(path);
        //4.使用spring的工具类把resource中的文件转换成一个字节数组
        byte[] images = FileCopyUtils.copyToByteArray(resource.getFile());
        //5.使用response设置响应消息头
        response.setContentType("application/octet-stream");
        //6.输出字节数组
        response.getOutputStream().write(images,0,images.length);
    }

}
