package service;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		Date date = new Date();
		Timestamp timeStamep = new Timestamp(date.getTime());
		System.out.println(timeStamep);
	}
}
