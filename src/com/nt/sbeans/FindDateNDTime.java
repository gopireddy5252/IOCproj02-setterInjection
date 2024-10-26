package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("DndT")
public class FindDateNDTime {
	private LocalDate ld;
	private LocalTime lt;
	
	@Autowired
	public void setLd(LocalDate ld) {
		this.ld = ld;
	}
	@Autowired
	public void setLt(LocalTime lt) {
		this.lt = lt;
	}
	
	public void findTimenddate()
	{
		System.out.println(ld);
		System.out.println(lt);
	}
	
	
}
