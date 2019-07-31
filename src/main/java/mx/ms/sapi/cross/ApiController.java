package mx.ms.sapi.cross;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="Api")
public class ApiController {
	
	
	
	@RequestMapping(value="/enc",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Object encrypt(RequestEntity<Map<String,Object>> requestEntity){
		Map<String, Object> jsonR = requestEntity.getBody();
		System.out.println("jsonR"+jsonR);
		return jsonR;
	}
	
	@RequestMapping(value="/desc",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Object decrypt(RequestEntity<Map<String,Object>> requestEntity){
		Map<String, Object> jsonD = requestEntity.getBody();
		return jsonD;
	}

}
