/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wow
 */


  
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormats {
    
    
    
    public static void main(String[] args) {
		SimpleDateFormat date_format=new SimpleDateFormat("dd-MM-yyyy EEEE hh:mm:ss a");
		Date date=new Date();		
		String current_date_time=date_format.format(date);		
		System.out.println(current_date_time);
	}
}
