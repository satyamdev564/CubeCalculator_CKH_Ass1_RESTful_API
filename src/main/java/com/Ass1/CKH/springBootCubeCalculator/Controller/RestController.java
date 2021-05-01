package com.Ass1.CKH.springBootCubeCalculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController 
{
	@GetMapping("")
	String hello()
	{
		return "Welcome To CubeCalculator";
	}
	
	//Area of Cube
	@PostMapping("/area")
	Double area(@RequestParam("lengthOfEdge") Double lengthOfEdge)
	{
		Double area = 6*lengthOfEdge;
		return area;
	}
	
	//Volume of Cube
	@PostMapping("/volume")
	Double volume(@RequestParam("lengthOfEdge") Double lengthOfEdge)
	{
		Double volume = Math.pow(lengthOfEdge, 3);
		return volume;
	}
	
	//Perimeter of Cube
	@PostMapping("/perimeter")
	Double perimeter(@RequestParam("lengthOfEdge") Double lengthOfEdge)
	{
		Double perimeter = 6*Math.pow(lengthOfEdge, 2);
		return perimeter;
	}
}
