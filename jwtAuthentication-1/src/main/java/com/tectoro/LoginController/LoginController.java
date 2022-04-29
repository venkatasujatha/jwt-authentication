package com.tectoro.LoginController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.dto.RequestEntity;
import com.tectoro.service.LoginService;
@RestController
public class LoginController {
	
	@PostMapping("/signup")
	public ResponseEntity<APIResponse>  SignUp(@RequestBody RequestEntity requestEntity)
	{
		APIResponse apiResponse=LoginService.signUp(requestEntity);
		return ResponseEntity.status(apiResponse. )
	}
	

}
