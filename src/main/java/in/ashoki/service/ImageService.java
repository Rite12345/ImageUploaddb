package in.ashoki.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import in.ashoki.entity.Image;
import in.ashoki.repository.ImageRepository;

@Service
public class ImageService  {
	
	@Autowired
	private ImageRepository imageRepository;
	
	public String saveImage(MultipartFile file, String name,String description) throws IOException
	{
		Image image=new Image();
		image.setDescription(description);
		image.setImage(file.getBytes());
		image.setName(name);
		imageRepository.save(image);
		 return "image save in ddb";
	}

}
