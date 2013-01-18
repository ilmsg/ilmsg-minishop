package models;

import java.util.*;
import play.data.*;
import play.data.validation.Constraints.*;

public class Categories {
    
  public Long id;
  
  @Required
  public String title;
  
  @Required
  public String description;
  
  public Categories(){
	  this.title = "title";
	  this.description = "description";
  }
  
  public Categories(String title, String description){
	  this.title = title;
	  this.description = description;
  }
  
  public static List<Categories> all() {
    //return new ArrayList<Categories>();
	
	ArrayList<Categories> categoriesList = new ArrayList<Categories>();
	//categoriesList.add( new Categories() );
	categoriesList.add( new Categories("title1", "Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum") );
	categoriesList.add( new Categories("title2", "Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet fermentum") );
	categoriesList.add( new Categories("title3", "Maecenas sed diam eget risus varius blandit sit amet non magna") );
	categoriesList.add( new Categories("title4", "Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum") );
	categoriesList.add( new Categories("title5", "Maecenas sed diam eget risus varius blandit sit amet non magna") );
	
	return categoriesList;
  }
  
  public static void create(Categories categories) {
  }
  
  public static void delete(Long id) {
  }
    
}