package models;

import java.util.*;
import play.data.*;
import play.data.validation.Constraints.*;

public class Topic {
    
  public Long id;
  public String title;
  public Date date;
  
  public Topic(){
  }
  
  public Topic(long id, String title, Date date){
	  this.id = id;
	  this.title = title;
	  this.date = date;
  }
  
  public static List<Topic> all() {
    //return new ArrayList<Topic>();
	ArrayList<Topic> listTopic = new ArrayList<Topic>();
	listTopic.add( new Topic(1, "topic1", new Date()) );
	listTopic.add( new Topic(2, "topic2", new Date()) );
	listTopic.add( new Topic(3, "topic3", new Date()) );
	listTopic.add( new Topic(4, "topic4", new Date()) );
	listTopic.add( new Topic(5, "topic5", new Date()) );
	
	return listTopic;
  }
  
  public static void create(Topic topic) {
  }
  
  public static void delete(Long id) {
  }
    
}