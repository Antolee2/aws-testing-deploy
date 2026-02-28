package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
@RestController
@Controller
public class CseController {
	public int addcse(int a, int b) {
		return a+b;
	}
}
