package com.test.simpleretrofit;


import com.google.gson.annotations.SerializedName;

public class PostModel {

	@SerializedName("site")
	private String site;

	@SerializedName("name")
	private String name;

	@SerializedName("link")
	private String link;

	@SerializedName("elementPureHtml")
	private String elementPureHtml;

	@SerializedName("desc")
	private String desc;

	public void setSite(String site){
		this.site = site;
	}

	public String getSite(){
		return site;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setElementPureHtml(String elementPureHtml){
		this.elementPureHtml = elementPureHtml;
	}

	public String getElementPureHtml(){
		return elementPureHtml;
	}

	public void setDesc(String desc){
		this.desc = desc;
	}

	public String getDesc(){
		return desc;
	}

	@Override
 	public String toString(){
		return 
			"PostModel{" +
			"site = '" + site + '\'' + 
			",name = '" + name + '\'' + 
			",link = '" + link + '\'' + 
			",elementPureHtml = '" + elementPureHtml + '\'' + 
			",desc = '" + desc + '\'' + 
			"}";
		}
}