package com.java.Thread;

public class MyService {

	public MyOneList addServiceMethod(MyOneList list, String data){
		try {
			synchronized(list){
				if(list.getSize()<1){
					Thread.sleep(2000);
					list.add(data);
				}
			}
			
		} catch (Exception e) {
		}
		return list;
	}
}
