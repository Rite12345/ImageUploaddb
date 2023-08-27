package in.ashoki.pojo;

import lombok.Data;
@Data
public class ImagePojo {


//@AllArgsConstructor
//@NoArgsConstructor
//@ToString

	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private Long id;
	private String name;
	private String description;
	//@Lob
	private byte[] image;
	
}
