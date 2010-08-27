package jBash;

 public class jBashItem{
 	private String itemName;
 	private String valueField;
 	public boolean active;
 	
 	
 	public jBashItem(String itemName, String value){
 	 this.itemName = itemName;
 	 this.valueField = value;
 	 this.active = true;		
 	}
 	
 	
 	public jBashItem(){
 	 this.itemName = "";
 	 this.valueField = "";
 	 this.active = false;		 		
 	}
 	
 	
 	public String getValueField(){
 		if (this.active){
 			return valueField;
 		} else return "";
 	}
 	
 	public void setItemName(String name){
 	  this.itemName = name;	
 	}
 	
 	public void setvalueField(String value){
 	  this.valueField = value;	
 	  
 	}	 	
 	
 	public String toString(){
 		return this.itemName;
 	}
 	
 }